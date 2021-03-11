package com.hifive.api.domain.company;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hifive.api.HifiveObject;
import com.hifive.api.internal.mapping.ApiField;

import java.time.LocalDateTime;

/**
 * 会员歌单
 *
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2020-10-23 17:01:28
 **/
public class HifiveMemberSheet extends HifiveObject {

    /**
     * Id
     */
    @ApiField("sheetId")
    private Long sheetId;

    /**
     * 类型
     */
    @ApiField("type")
    private Integer type;

    /**
     * 名称
     */
    @ApiField("sheetName")
    private String sheetName;

    /**
     * 创建时间
     */
    @ApiField("createTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    public Long getSheetId() {
        return sheetId;
    }

    public void setSheetId(Long sheetId) {
        this.sheetId = sheetId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
