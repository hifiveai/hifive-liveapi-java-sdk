package com.hifive.api.domain.constants;

/**
 * <p>
 *
 * </p>
 *
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2020-11-03 15:37:25
 **/
public enum LanguageEnum {

    CN(0),
    EN(1);

    Integer value;


    LanguageEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }


}
