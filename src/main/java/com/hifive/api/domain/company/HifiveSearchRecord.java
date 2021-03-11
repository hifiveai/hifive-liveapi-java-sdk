package com.hifive.api.domain.company;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hifive.api.HifiveObject;
import com.hifive.api.internal.mapping.ApiField;

import java.time.LocalDateTime;

/**
 * 搜索记录
 *
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2020-10-23 16:41:37
 **/
public class HifiveSearchRecord extends HifiveObject {

    /**
     * 搜索Id
     */
    @ApiField("searchId")
    private Long searchId;

    /**
     * 搜索关键字
     */
    @ApiField("keyword")
    private String keyword;

    /**
     * 搜索时间
     */
    @ApiField("createTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    public Long getSearchId() {
        return searchId;
    }

    public void setSearchId(Long searchId) {
        this.searchId = searchId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
