package com.date;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * 通用label
 *
 * @author chenwu.lcw
 * @date 2021/1/14 11:52 上午
 */
@Data
public class LabelVO implements Serializable {

    private static final long serialVersionUID = -686141931000543424L;

    private String label;

    private Object value;

    private List<LabelVO> children;

    /**
     * 默认选择
     */
    private Boolean defaultSelected;

    /**
     * 是否有子节点
     */
    private Boolean hasChildren;

    public LabelVO(String label, Object value) {
        this.label = label;
        this.value = value;
    }

    public LabelVO(String label, Object value, List<LabelVO> children) {
        this.label = label;
        this.value = value;
        this.children = children;
    }

    @Override
    public String toString() {
        return "LabelVO{" +
                "label='" + label + '\'' +
                ", value=" + value +
                ", children=" + children +
                ", defaultSelected=" + defaultSelected +
                ", hasChildren=" + hasChildren +
                '}';
    }
}
