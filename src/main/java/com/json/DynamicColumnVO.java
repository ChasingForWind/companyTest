package com.json;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 动态列
 *
 * @author chenwu.lcw
 * @date 2021/1/14 4:16 下午
 */
@Data
public class DynamicColumnVO implements Serializable {

    private static final long serialVersionUID = 9173799933033482924L;

    /**
     * 标题
     */
    private String title;

    /**
     * 数据索引
     */
    private String dataIndex;

    /**
     * 是否锁定
     */
    private String lock;

    /**
     * 能否排序
     */
    private Boolean sortable;

    /**
     * 宽
     */
    private Integer width;

    /**
     * 类型
     */
    private String type;

    /**
     * 文字位置
     */
    private String align;

    private List<DynamicColumnVO> children;

    public DynamicColumnVO() {}

    public DynamicColumnVO(String title, String dataIndex) {
        this.title = title;
        this.dataIndex = dataIndex;
    }

    public DynamicColumnVO(String title, String dataIndex, int width) {
        this.title = title;
        this.dataIndex = dataIndex;
        this.width = width;
    }
}
