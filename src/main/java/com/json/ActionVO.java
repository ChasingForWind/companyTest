package com.json;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * action VO
 *
 * @author chenwu.lcw
 * @date 2021/1/23 14:59
 */
@Data
public class ActionVO implements Serializable {
    private static final long serialVersionUID = 237621437788263484L;
    /**
     * 类型
     */
    private String type;

    /**
     * 是否有底部操作按钮
     */
    private Boolean hasFooter;

    /**
     * 参数
     */
    private ActionQuery query;

    /**
     * 内容
     */
    private List<Content> content;

    /**
     * hold提示信息
     */
    private String message;

    @Data
    public static class Content implements Serializable {

        private static final long serialVersionUID = 3164914800845496286L;

        /**
         * 组成类型
         */
        private String component;

        /**
         * 值
         */
        private Object value;

        /**
         * 样式
         */
        private Object style;

        /**
         * 表格数据
         */
        private List<DynamicColumnVO> columns;

        /**
         * 数据
         */
        private List<Map<String, Object>> dataSource;

    }

    @Data
    public static class ActionQuery implements Serializable {

        private static final long serialVersionUID = -1865389279119597778L;

        /**
         * 请求链接
         */
        private String url;

        /**
         * 入参
         */
        private List<String> paramKeys;

        /**
         * 默认参数
         */
        private Map<String, Object> defaultParams;

    }
}
