package com.hifive.api.liverequest;


import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.request.HFBaseRequest;
import com.hifive.api.response.HFMusicRecordReportPostResponse;

import java.util.Map;

/**
 * TOP API: hifive.user.get request
 *
 * @author auto create
 * @since 1.0, 2013-12-08 16:51:41
 */
public class HFMusicRecordReportRequest extends HFBaseRequest<HFMusicRecordReportPostResponse> {

    /**
     * 播放记录Id
     */
    private Long recordId;

    /**
     * 播放记录时长
     */
    private Long duration;

    /**
     * 播放记录类型 1-k歌；2-听歌
     */
    private Integer mediaType;


    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Integer getMediaType() {
        return mediaType;
    }

    public void setMediaType(Integer mediaType) {
        this.mediaType = mediaType;
    }

    @Override
    public String getApiMethodName() {
        return "LiveReportMusic";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("recordId", recordId);
                put("duration", duration);
                put("mediaType", mediaType);
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFMusicRecordReportPostResponse> getResponseClass() {
        return HFMusicRecordReportPostResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }

}
