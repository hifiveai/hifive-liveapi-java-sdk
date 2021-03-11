package com.hifive.api.liverequest;


import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.request.HFPageRequest;
import com.hifive.api.response.HFMusicPostResponse;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * TOP API: hifive.user.get request
 *
 * @author auto create
 * @since 1.0, 2013-12-08 16:51:41
 */
public class HFMusicRequest extends HFPageRequest<HFMusicPostResponse> {

    /**
     * 搜索类型Id
     */
    private Long searchId = 1L;

    /**
     * 搜索关键字
     */
    private String keyword;

    /**
     * 0-中文,1-英文
     */
    private Integer language;

    /**
     * 扩展查询字段，album,musicTag,artist
     */
    private List<String> field;

    public Long getSearchId() {
        return searchId;
    }

    public void setSearchId(Long searchId) {
        this.searchId = searchId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public List<String> getField() {
        return field;
    }

    public void setField(List<String> field) {
        this.field = field;
    }

    @Override
    public String getApiMethodName() {
        return "LiveSearchMusic";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("searchId", searchId);
                put("keyword", keyword);
                put("language", language);
                put("field", StringUtils.join(field, ","));
                put("page", getPage());
                put("pageSize", getPageSize());
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFMusicPostResponse> getResponseClass() {
        return HFMusicPostResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }

}
