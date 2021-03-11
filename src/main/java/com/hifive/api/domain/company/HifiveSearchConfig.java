package com.hifive.api.domain.company;

import com.hifive.api.HifiveObject;
import com.hifive.api.internal.mapping.ApiField;

/**
 * 搜索配置
 *
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2020-10-23 16:25:49
 **/
public class HifiveSearchConfig extends HifiveObject {

    /**
     * id
     */
    @ApiField("id")
    private Long id;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
