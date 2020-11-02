package com.ruoyi.common.enums;

/**
 * 定义数据权限范围
 */
public enum DataScope {
    ALL("1","所有数据权限"),
    CUSTOM("2","自定义数据权限"),
    CURRENT_DEPART("3", "本部门数据权限"),
    CURRENT_DOWN("4", "本部门数据权限"),
    CURRENT("5", "本部门数据权限");

    private String value ;
    private String label ;

    DataScope(String value,String label) {
        this.value = value ;
        this.label = label ;
    }

    public String getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }
}
