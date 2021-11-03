package com.json;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author chenwu.lcw
 * @date 2021/1/14 4:05 下午
 */
@Data
public class TableStructureVO implements Serializable {

    private static final long serialVersionUID = -8499075020223444076L;

    /**
     * 主键
     */
    private String primaryKey;

    /**
     * 标题
     */
    private String title;

    /**
     * 动态列
     */
    private List<DynamicColumnVO> dynamicColumns;

    /**
     * 行列合并公式 2.0后废弃, 用mergeColumnIndex, 1.0还用
     */
    private Map<String, List<Integer>> cellMerge;

    /**
     * 行列合并需要, 需要合并哪几列
     */
    private List<Integer> mergeColumnIndex;
}
