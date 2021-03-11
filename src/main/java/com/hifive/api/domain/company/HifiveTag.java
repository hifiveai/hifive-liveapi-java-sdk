package com.hifive.api.domain.company;

import com.hifive.api.HifiveObject;
import com.hifive.api.internal.mapping.ApiField;
import com.hifive.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * 标签
 *
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2020-10-23 15:49:14
 **/
public class HifiveTag extends HifiveObject {

    /**
     * 标签Id
     */
    @ApiField("tagId")
    private Long tagId;

    /**
     * 父标签Id
     */
    @ApiField("pid")
    private Long pid;

    /**
     * 标签名
     */
    @ApiField("tagName")
    private String tagName;

    /**
     * 标签图片，此字段可能返回为""，表示没有图片
     */
    @ApiField("coverUrl")
    private String coverUrl;

    /**
     * 标签
     */
    @ApiListField("child")
    private List<HifiveTag> child;

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public List<HifiveTag> getChild() {
        return child;
    }

    public void setChild(List<HifiveTag> child) {
        this.child = child;
    }
}
