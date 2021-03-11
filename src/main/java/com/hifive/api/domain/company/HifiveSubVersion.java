package com.hifive.api.domain.company;

import com.hifive.api.HifiveObject;
import com.hifive.api.internal.mapping.ApiField;

/**
 * 子版本
 *
 * @author meiyang
 * @version 1.0
 **/
public class HifiveSubVersion extends HifiveObject {

    /**
     * 音乐Id
     */
    @ApiField("musicId")
    private String musicId;

    /**
     * 版本名称
     */
    @ApiField("name")
    private String name;

    /**
     * 是否为主版本，1：是 0：否
     */
    @ApiField("majorVersion")
    private Integer majorVersion;

    /**
     * 1：免费0：收费
     */
    @ApiField("free")
    private Integer free;

    /**
     * 音乐价格（分）
     */
    @ApiField("price")
    private Integer price;

    /**
     * 时长（秒）
     */
    @ApiField("duration")
    private Integer duration;

    public String getMusicId() {
        return musicId;
    }

    public void setMusicId(String musicId) {
        this.musicId = musicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMajorVersion() {
        return majorVersion;
    }

    public void setMajorVersion(Integer majorVersion) {
        this.majorVersion = majorVersion;
    }

    public Integer getFree() {
        return free;
    }

    public void setFree(Integer free) {
        this.free = free;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
