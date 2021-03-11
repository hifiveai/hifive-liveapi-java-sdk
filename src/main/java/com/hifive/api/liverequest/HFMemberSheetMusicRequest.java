package com.hifive.api.liverequest;


import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.request.HFPageRequest;
import com.hifive.api.response.HFMemberSheetMusicPostResponse;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * TOP API: hifive.user.get request
 *
 * @author auto create
 * @since 1.0, 2013-12-08 16:51:41
 */
public class HFMemberSheetMusicRequest extends HFPageRequest<HFMemberSheetMusicPostResponse> {

    /**
     * 歌单Id
     */
    private Long sheetId;

    /**
     * 0-中文,1-英文
     */
    private Integer language;

    /**
     * 扩展查询字段，album,musicTag,artist
     */
    private List<String> field;

    public Long getSheetId() {
        return sheetId;
    }

    public void setSheetId(Long sheetId) {
        this.sheetId = sheetId;
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
        return "LiveMemberSheetMusic";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("sheetId", sheetId);
                put("language", language);
                put("field", StringUtils.join(field, ","));
                put("page", getPage());
                put("pageSize", getPageSize());
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFMemberSheetMusicPostResponse> getResponseClass() {
        return HFMemberSheetMusicPostResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }

}
