package com.json;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 表格类统一返回前端格式
 *
 * @author chenwu.lcw
 * @date 2021/1/14 4:13 下午
 */
@Data
public class TableDataVO implements Serializable {
    private static final long serialVersionUID = -8542531987710707195L;

    /**
     * 数据
     */
    private List<Map<String, Object>> dataSource;

    /**
     * 结构
     */
    private TableStructureVO structure;

    /**
     * 过滤项
     */
    private List<Map<String, Object>> filters;

    /**
     * 自定义区域
     */
    private List<DataStructureVO<String>> customArea;

    /**
     * 如果一开始就展开的要用到, 用来放需要展开的节点的primaryKey.
     */
    private List<String> expendedRowKeys = new ArrayList<>();

}
