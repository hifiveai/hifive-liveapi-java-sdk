package com.hifive.api.domain.company;

import com.hifive.api.HifiveObject;
import com.hifive.api.internal.mapping.ApiField;

/**
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2020-10-23 15:46:22
 **/
public class HifiveParticipant extends HifiveObject {

    /**
     * id
     */
    @ApiField("id")
    private Long id;

    /**
     * 编码
     */
    @ApiField("code")
    private String code;

    /**
     * 名称
     */
    @ApiField("name")
    private String name;

    /**
     * 子文件
     */
    @ApiField("icon")
    private String icon;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
