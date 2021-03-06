package com.hifive.api.internal.parser.json;


import com.hifive.api.ApiException;
import com.hifive.api.HifiveResponse;
import com.hifive.api.internal.mapping.Converter;
import com.hifive.api.internal.mapping.Converters;
import com.hifive.api.internal.mapping.Reader;
import com.hifive.api.internal.util.json.ExceptionErrorListener;
import com.hifive.api.internal.util.json.JSONReader;
import com.hifive.api.internal.util.json.JSONValidatingReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * JSON格式转换器。
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class JsonConverter implements Converter {

    public <T extends HifiveResponse> T toResponse(String rsp, Class<T> clazz) throws ApiException {
        JSONReader reader = new JSONValidatingReader(new ExceptionErrorListener());
        Object rootObj = reader.read(rsp);
        if (rootObj instanceof Map<?, ?>) {
            Map<?, ?> rootJson = (Map<?, ?>) rootObj;
            return fromJson(rootJson, clazz);
        }
        return null;
    }

    /**
     * 把JSON格式的数据转换为对象。
     *
     * @param <T>   泛型领域对象
     * @param json  JSON格式的数据
     * @param clazz 泛型领域类型
     * @return 领域对象
     */
    public <T> T fromJson(final Map<?, ?> json, Class<T> clazz) throws ApiException {
        return Converters.convert(clazz, new Reader() {
            public boolean hasReturnField(Object name) {
                return json.containsKey(name);
            }

            public Object getPrimitiveObject(Object name) {
                return json.get(name);
            }

            public Object getObject(Object name, Class<?> type) throws ApiException {
                Object tmp = json.get(name);
                if (tmp instanceof Map<?, ?>) {
                    Map<?, ?> map = (Map<?, ?>) tmp;
                    return fromJson(map, type);
                } else {
                    return null;
                }
            }

            public List<?> getListObjects(Object listName, Object itemName, Class<?> subType) throws ApiException {
                List<Object> listObjs = null;

                Object listTmp = json.get(listName);
                if (listTmp instanceof Map<?, ?>) {
                    Map<?, ?> jsonMap = (Map<?, ?>) listTmp;
                    Object itemTmp = jsonMap.get(itemName);
                    if (itemTmp == null && listName != null) {
                        String listNameStr = listName.toString();
                        itemTmp = jsonMap.get(listNameStr.substring(0, listNameStr.length() - 1));
                    }
                    if (itemTmp instanceof List<?>) {
                        listObjs = new ArrayList<Object>();
                        List<?> tmpList = (List<?>) itemTmp;
                        for (Object subTmp : tmpList) {
                            if (subTmp instanceof Map<?, ?>) {// object
                                Map<?, ?> subMap = (Map<?, ?>) subTmp;
                                Object subObj = fromJson(subMap, subType);
                                if (subObj != null) {
                                    listObjs.add(subObj);
                                }
                            } else if (subTmp instanceof List<?>) {// array
                                // TODO not support yet
                            } else {// boolean, long, double, string, null
                                listObjs.add(subTmp);
                            }
                        }
                    }
                } else if (listTmp instanceof List<?>) {
                    listObjs = new ArrayList<Object>();
                    List<?> tmpList = (List<?>) listTmp;
                    for (Object subTmp : tmpList) {
                        if (subTmp instanceof Map<?, ?>) {// object
                            Map<?, ?> subMap = (Map<?, ?>) subTmp;
                            Object subObj = fromJson(subMap, subType);
                            if (subObj != null) {
                                listObjs.add(subObj);
                            }
                        } else if (subTmp instanceof List<?>) {// array
                            // TODO not support yet
                        } else {// boolean, long, double, string, null
                            listObjs.add(subTmp);
                        }
                    }
                }

                return listObjs;
            }
        });
    }

}
