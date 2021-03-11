package com.hifive.api;


import com.hifive.api.internal.mapping.ApiField;

import java.io.Serializable;

/**
 * TOPAPI基础响应信息。
 *
 * @author fengsheng
 */
public abstract class HifiveResponse implements Serializable {

    private static final long serialVersionUID = 5014379068811962022L;

    @ApiField("code")
    private String code;

    @ApiField("msg")
    private String msg;


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return "10200".equals(code) || "200".equals(code);
    }

}
