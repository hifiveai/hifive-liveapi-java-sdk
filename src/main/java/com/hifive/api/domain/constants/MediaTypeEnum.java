package com.hifive.api.domain.constants;

/**
 * @author meiyang
 * @version 1.0
 **/
public enum MediaTypeEnum {

    K(1),
    L(2);

    Integer value;


    MediaTypeEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }


}
