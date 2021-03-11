package com.hifive.api.domain.company;

import com.hifive.api.HifiveObject;
import com.hifive.api.internal.mapping.ApiField;
import com.hifive.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * 公司歌单
 *
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2020-10-23 14:55:52
 **/
public class HifiveCompanySheet extends HifiveObject {


    /**
     * ID值
     */
    @ApiField("sheetId")
    private Long sheetId;

    /**
     * 歌单名称
     */
    @ApiField("sheetName")
    private String sheetName;

    /**
     * 音乐总数
     */
    @ApiField("musicTotal")
    private Integer musicTotal;

    /**
     * 歌单描述
     */
    @ApiField("describe")
    private String describe;

    /**
     * 是否免费 1：免费 0：收费
     */
    @ApiField("free")
    private Integer free;

    /**
     * 歌单价格（分）
     */
    @ApiField("price")
    private Integer price;

    /**
     * 封面
     */
    @ApiField("cover")
    private HifiveCover cover;

    /**
     * 歌单类型， 1：自定义歌单，0：系统歌单
     */
    @ApiField("type")
    private Integer type;

    /**
     * 标签列表 通过扩展字段查询获取
     */
    @ApiListField("tag")
    private List<HifiveTag> tag;

    /**
     * 音乐列表
     */
    @ApiListField("music")
    private List<HifiveMusic> music;


    public Long getSheetId() {
        return sheetId;
    }

    public void setSheetId(Long sheetId) {
        this.sheetId = sheetId;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public Integer getMusicTotal() {
        return musicTotal;
    }

    public void setMusicTotal(Integer musicTotal) {
        this.musicTotal = musicTotal;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
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

    public HifiveCover getCover() {
        return cover;
    }

    public void setCover(HifiveCover cover) {
        this.cover = cover;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<HifiveTag> getTag() {
        return tag;
    }

    public void setTag(List<HifiveTag> tag) {
        this.tag = tag;
    }

    public List<HifiveMusic> getMusic() {
        return music;
    }

    public void setMusic(List<HifiveMusic> music) {
        this.music = music;
    }
}
