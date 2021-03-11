package com.hifive.api.domain.company;

import com.hifive.api.HifiveObject;
import com.hifive.api.internal.mapping.ApiField;

/**
 * 歌词
 *
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2020-10-23 15:54:00
 **/
public class HifiveLyric extends HifiveObject {

    /**
     * 动听歌词
     */
    @ApiField("dynamicUrl")
    private String dynamicUrl;

    /**
     * 静态歌词
     */
    @ApiField("staticUrl")
    private String staticUrl;

    public String getDynamicUrl() {
        return dynamicUrl;
    }

    public void setDynamicUrl(String dynamicUrl) {
        this.dynamicUrl = dynamicUrl;
    }

    public String getStaticUrl() {
        return staticUrl;
    }

    public void setStaticUrl(String staticUrl) {
        this.staticUrl = staticUrl;
    }
}
