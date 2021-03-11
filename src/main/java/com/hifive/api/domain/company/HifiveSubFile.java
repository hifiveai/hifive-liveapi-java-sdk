package com.hifive.api.domain.company;

import com.hifive.api.HifiveObject;
import com.hifive.api.internal.mapping.ApiField;

/**
 * 子文件
 *
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2020-10-23 15:47:08
 **/
public class HifiveSubFile extends HifiveObject {

    /**
     * id
     */
    @ApiField("id")
    private Long id;

    /**
     * 类型
     */
    @ApiField("type")
    private String type;

    /**
     * 文件地址
     */
    @ApiField("file")
    private String file;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
