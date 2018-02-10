package com.frank.demo.center.content;

/**
 * Created by yangxb on 2018/2/10.
 */
public enum EnumRespCode {

    SUCCESS("0", "操作成功"),
    FAIL("1", "操作失败"),
    PARAMS_ERROR("2", "参数错误"),
    INFO_ERROR("3", "信息错误"),
    BUSY("4", "系统繁忙");


    private String value;
    private String desc;

    private EnumRespCode(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
