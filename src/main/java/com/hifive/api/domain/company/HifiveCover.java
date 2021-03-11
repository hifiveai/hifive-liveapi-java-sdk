package com.hifive.api.domain.company;

import com.hifive.api.HifiveObject;
import com.hifive.api.internal.mapping.ApiField;

/**
 * 封面DTO
 *
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2020-10-23 14:57:30
 **/
public class HifiveCover extends HifiveObject {

    /**
     * 封面大小
     */
    @ApiField("size")
    private String size;

    /**
     * url地址
     */
    @ApiField("url")
    private String url;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
