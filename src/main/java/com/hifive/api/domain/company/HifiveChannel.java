package com.hifive.api.domain.company;

import com.hifive.api.HifiveObject;
import com.hifive.api.internal.mapping.ApiField;

/**
 * 电台
 *
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2020-10-26 10:39:38
 **/
public class HifiveChannel extends HifiveObject {

    /**
     * 电台id
     */
    @ApiField("channelId")
    private String channelId;
    /**
     * 电台名称
     */
    @ApiField("channelName")
    private String channelName;
    /**
     * 电台封面
     */
    @ApiField("coverUrl")
    private String coverUrl;

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }
}
