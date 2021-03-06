package com.hifive.api;

/**
 * TOP响应解释器接口。响应格式可以是JSON, XML等等。
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public interface HifiveParser<T extends HifiveResponse> {

    /**
     * 把响应字符串解释成相应的领域对象。
     *
     * @param rsp 响应字符串
     * @return 领域对象
     * @throws ApiException 返回异常
     */
    public T parse(String rsp) throws ApiException;

    /**
     * 获取响应类类型。
     * @throws ApiException 返回异常
     * @return 领域对象
     */
    public Class<T> getResponseClass() throws ApiException;

}
