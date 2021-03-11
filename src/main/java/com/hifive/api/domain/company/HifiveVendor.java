package com.hifive.api.domain.company;

import com.hifive.api.HifiveObject;
import com.hifive.api.internal.mapping.ApiField;

/**
 * 厂商
 *
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2020-10-23 15:43:03
 **/
public class HifiveVendor extends HifiveObject {

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
}
