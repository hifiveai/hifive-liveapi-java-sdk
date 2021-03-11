package com.hifive.api.liverequest;


import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.request.HFPageRequest;
import com.hifive.api.response.HFCompanySheetPostResponse;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * TOP API: hifive.user.get request
 *
 * @author auto create
 * @since 1.0, 2013-12-08 16:51:41
 */
public class HFCompanySheetRequest extends HFPageRequest<HFCompanySheetPostResponse> {

    /**
     * 电台id
     */
    private String channelId;

    /**
     * 0-中文,1-英文
     */
    private Integer language;

    /**
     * 推荐音乐数 0～10
     */
    private Integer recoNum;

    /**
     * 歌单类别
     */
    private Integer type;

    /**
     * 标签Id列表
     */
    private List<Long> tagId;

    /**
     * 歌曲信息扩展查询字段，sheetTag,album,musicTag,artist
     */
    private List<String> field;


    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public Integer getRecoNum() {
        return recoNum;
    }

    public void setRecoNum(Integer recoNum) {
        this.recoNum = recoNum;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<Long> getTagId() {
        return tagId;
    }

    public void setTagId(List<Long> tagId) {
        this.tagId = tagId;
    }

    public List<String> getField() {
        return field;
    }

    public void setField(List<String> field) {
        this.field = field;
    }

    @Override
    public String getApiMethodName() {
        return "LiveCompanySheet";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("channelId", channelId);
                put("language", language);
                put("recoNum", recoNum);
                put("type", type);
                put("tagIdList", StringUtils.join(tagId, ","));
                put("field", StringUtils.join(field, ","));
                put("page", getPage());
                put("pageSize", getPageSize());
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFCompanySheetPostResponse> getResponseClass() {
        return HFCompanySheetPostResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }

}
