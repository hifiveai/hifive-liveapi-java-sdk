package com.hifive.api.domain.company;

import com.hifive.api.HifiveObject;
import com.hifive.api.internal.mapping.ApiField;

/**
 * 文件
 *
 * @author meiyang
 * @version 1.0
 **/
public class HifiveFile extends HifiveObject {

    /**
     * url地址
     */
    @ApiField("url")
    private String url;

    /**
     * 扩展名
     */
    @ApiField("ext")
    private String ext;

    /**
     * 过期时间
     */
    @ApiField("expires")
    private Long expires;

    /**
     * 文件大小（字节）
     */
    @ApiField("size")
    private Long size;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public Long getExpires() {
        return expires;
    }

    public void setExpires(Long expires) {
        this.expires = expires;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }
}
