package com.hifive.api.liverequest;


import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.request.HFBaseRequest;
import com.hifive.api.response.HFSheetMusicRemovePostResponse;

import java.util.Map;

/**
 * TOP API: hifive.user.get request
 *
 * @author auto create
 * @since 1.0, 2013-12-08 16:51:41
 */
public class HFSheetMusicRemoveRequest extends HFBaseRequest<HFSheetMusicRemovePostResponse> {

    /**
     * 会员歌单Id
     */
    private Long sheetId;

    /**
     * 音乐Id
     */
    private String musicId;

    public Long getSheetId() {
        return sheetId;
    }

    public void setSheetId(Long sheetId) {
        this.sheetId = sheetId;
    }

    public String getMusicId() {
        return musicId;
    }

    public void setMusicId(String musicId) {
        this.musicId = musicId;
    }

    @Override
    public String getApiMethodName() {
        return "LiveRemoveSheetMusic";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("sheetId", sheetId);
                put("musicId", musicId);
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFSheetMusicRemovePostResponse> getResponseClass() {
        return HFSheetMusicRemovePostResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }

}
