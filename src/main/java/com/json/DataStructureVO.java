package com.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 数据结构
 *
 * @author chenwu.lcw
 * @date 2021/1/19 20:03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataStructureVO<T> implements Serializable {

    private static final long serialVersionUID = -797832804854305054L;
    /**
     * 类型
     */
    private String type;

    /**
     * 名称对应的值
     */
    private T value;

    /**
     * 值对应的名称
     */
    private String label;

    /**
     * 帮助
     */
    private String help;

    /**
     * 单位
     */
    private String unit;

    /**
     * 是否阴影
     */
    private Boolean shadow;

    /**
     * 数据格式
     */
    private Object style;

    /**
     * 动作
     */
    private ActionVO action;


    public DataStructureVO(String type, String label, T value) {
        this.type = type;
        this.label = label;
        this.value = value;
    }

}
