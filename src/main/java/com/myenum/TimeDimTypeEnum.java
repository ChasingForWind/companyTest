package com.myenum;



import java.util.Objects;

/**
 * 时间维度类型
 * 这里用于销量预测或计划的存储类型
 */
public enum TimeDimTypeEnum {

    /**
     * 日维度
     */
    DAY(1, "日", 1, "D"),

    /**
     * 周维度
     */
    WEEK(2, "周", 2, "W"),

    /**
     * 月维度
     */
    MONTH(3, "月", 3, "M"),

    /**
     * 年维度
     */
    YEAR(6, "年", 6, "Y"),

    /**
     * 时间段维度
     */
    PERIOD(7, "时间段", -1, "P"),

    /**
     * 默认维度，代表全部时间范围
     */
    ALL(10, "全部", 10, "ALL"),
    ;

    TimeDimTypeEnum(Integer value, String name, Integer scope, String abbr) {
        this.value = value;
        this.name = name;
        this.scope = scope;
        this.abbr = abbr;
    }

    private final Integer value;

    private final String name;

    private final Integer scope;

    private final String abbr;

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public Integer getScope() {
        return scope;
    }

    public String getAbbr() {
        return abbr;
    }

    public static TimeDimTypeEnum getByCode(Integer code) {
        if (Objects.isNull(code)) {
            return null;
        }
        for (TimeDimTypeEnum dimTypeEnum : TimeDimTypeEnum.values()) {
            if (dimTypeEnum.getValue().equals(code)) {
                return dimTypeEnum;
            }
        }
        return null;
    }

}
