package com.hifive.api.domain.company;

import com.hifive.api.HifiveObject;
import com.hifive.api.internal.mapping.ApiField;
import com.hifive.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * 音乐播放记录
 *
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2020-10-23 18:10:34
 **/
public class HifiveMusicRecord extends HifiveObject {

    /**
     * 专辑 通过扩展字段查询获取
     */
    @ApiField("album")
    private HifiveAlbum album;

    /**
     * 歌曲ID
     */
    @ApiField("musicId")
    private String musicId;

    /**
     * 歌曲名
     */
    @ApiField("musicName")
    private String musicName;

    /**
     * 封面
     */
    @ApiField("cover")
    private HifiveCover cover;

    /**
     * 艺人 通过扩展字段查询获取
     */
    @ApiListField("artist")
    private List<HifiveParticipant> artist;

    /**
     * 作词 通过扩展字段查询获取
     */
    @ApiListField("author")
    private List<HifiveParticipant> author;

    /**
     * 作曲 通过扩展字段查询获取
     */
    @ApiListField("composer")
    private List<HifiveParticipant> composer;

    /**
     * 制作人 通过扩展字段查询获取
     */
    @ApiListField("mastery")
    private List<HifiveParticipant> mastery;

    /**
     * 编曲 通过扩展字段查询获取
     */
    @ApiListField("arranger")
    private List<HifiveParticipant> arranger;

    /**
     * 编曲 通过扩展字段查询获取
     */
    @ApiListField("maker")
    private List<HifiveParticipant> maker;

    /**
     * 版本名
     */
    @ApiField("versionName")
    private String versionName;

    /**
     * 主版本musicId
     */
    @ApiField("majorVersion")
    private String majorVersion;

    /**
     * 时长，单位秒
     */
    @ApiField("duration")
    private Integer duration;

    /**
     * 试听开始
     */
    @ApiField("auditionBegin")
    private Integer auditionBegin;

    /**
     * 试听结束
     */
    @ApiField("auditionEnd")
    private Integer auditionEnd;

    /**
     * 节拍数
     */
    @ApiField("bpm")
    private Integer bpm;

    /**
     * 标签 通过扩展字段查询获取
     */
    @ApiListField("tag")
    private List<HifiveTag> tag;

    /**
     * 价格
     */
    @ApiField("price")
    private Integer price;

    /**
     * 波形图
     */
    @ApiField("waveUrl")
    private String waveUrl;

    /**
     * 是否销售
     */
    @ApiField("forSale")
    private Integer forSale;

    /**
     * 子版本列表
     */
    @ApiListField("version")
    private List<HifiveSubVersion> version;

    /**
     * 音乐授权类型 0:K歌、1:播放、2:自定义
     */
    @ApiField("authType")
    private Integer authType;


    public HifiveAlbum getAlbum() {
        return album;
    }

    public void setAlbum(HifiveAlbum album) {
        this.album = album;
    }

    public String getMusicId() {
        return musicId;
    }

    public void setMusicId(String musicId) {
        this.musicId = musicId;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public HifiveCover getCover() {
        return cover;
    }

    public void setCover(HifiveCover cover) {
        this.cover = cover;
    }

    public List<HifiveParticipant> getArtist() {
        return artist;
    }

    public void setArtist(List<HifiveParticipant> artist) {
        this.artist = artist;
    }

    public List<HifiveParticipant> getAuthor() {
        return author;
    }

    public void setAuthor(List<HifiveParticipant> author) {
        this.author = author;
    }

    public List<HifiveParticipant> getComposer() {
        return composer;
    }

    public void setComposer(List<HifiveParticipant> composer) {
        this.composer = composer;
    }

    public List<HifiveParticipant> getMastery() {
        return mastery;
    }

    public void setMastery(List<HifiveParticipant> mastery) {
        this.mastery = mastery;
    }

    public List<HifiveParticipant> getArranger() {
        return arranger;
    }

    public void setArranger(List<HifiveParticipant> arranger) {
        this.arranger = arranger;
    }

    public List<HifiveParticipant> getMaker() {
        return maker;
    }

    public void setMaker(List<HifiveParticipant> maker) {
        this.maker = maker;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getMajorVersion() {
        return majorVersion;
    }

    public void setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getAuditionBegin() {
        return auditionBegin;
    }

    public void setAuditionBegin(Integer auditionBegin) {
        this.auditionBegin = auditionBegin;
    }

    public Integer getAuditionEnd() {
        return auditionEnd;
    }

    public void setAuditionEnd(Integer auditionEnd) {
        this.auditionEnd = auditionEnd;
    }

    public Integer getBpm() {
        return bpm;
    }

    public void setBpm(Integer bpm) {
        this.bpm = bpm;
    }

    public List<HifiveTag> getTag() {
        return tag;
    }

    public void setTag(List<HifiveTag> tag) {
        this.tag = tag;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getWaveUrl() {
        return waveUrl;
    }

    public void setWaveUrl(String waveUrl) {
        this.waveUrl = waveUrl;
    }

    public Integer getForSale() {
        return forSale;
    }

    public void setForSale(Integer forSale) {
        this.forSale = forSale;
    }

    public List<HifiveSubVersion> getVersion() {
        return version;
    }

    public void setVersion(List<HifiveSubVersion> version) {
        this.version = version;
    }

    public Integer getAuthType() {
        return authType;
    }

    public void setAuthType(Integer authType) {
        this.authType = authType;
    }
}
