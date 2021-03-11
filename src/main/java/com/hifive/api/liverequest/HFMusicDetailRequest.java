package com.hifive.api.liverequest;


import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.request.HFPageRequest;
import com.hifive.api.response.HFMusicDetailPostResponse;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * TOP API: hifive.user.get request
 *
 * @author auto create
 * @since 1.0, 2013-12-08 16:51:41
 */
public class HFMusicDetailRequest extends HFPageRequest<HFMusicDetailPostResponse> {

    /**
     * 歌曲Id
     */
    private String musicId;

    /**
     * 0-中文,1-英文
     */
    private Integer language;

    /**
     * 类型：1-k歌；2-听歌
     */
    private Integer mediaType;

    /**
     * 文件编码,默认mp3 可选(mp3 / aac)
     */
    private String audioFormat;

    /**
     * 音质，音乐播放时的比特率，默认320 可选(320 / 128)
     */
    private String audioRate;

    /**
     * 扩展查询字段，album,musicTag,artist
     */
    private List<String> field;

    public String getMusicId() {
        return musicId;
    }

    public void setMusicId(String musicId) {
        this.musicId = musicId;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public Integer getMediaType() {
        return mediaType;
    }

    public void setMediaType(Integer mediaType) {
        this.mediaType = mediaType;
    }

    public List<String> getField() {
        return field;
    }

    public void setField(List<String> field) {
        this.field = field;
    }

    public String getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
    }

    public String getAudioRate() {
        return audioRate;
    }

    public void setAudioRate(String audioRate) {
        this.audioRate = audioRate;
    }

    @Override
    public String getApiMethodName() {
        return "LiveListen";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("language", language);
                put("musicId", musicId);
                put("mediaType", mediaType);
                put("field", StringUtils.join(field, ","));
                put("audioFormat", audioFormat);
                put("audioRate", audioRate);
                put("page", getPage());
                put("pageSize", getPageSize());
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFMusicDetailPostResponse> getResponseClass() {
        return HFMusicDetailPostResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }

}
