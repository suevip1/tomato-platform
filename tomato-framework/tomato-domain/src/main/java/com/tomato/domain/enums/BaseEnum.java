package com.tomato.domain.enums;

import java.util.Objects;

/**
 * 枚举类
 * @author lizhifu
 */
public interface BaseEnum<T> extends EnumValue<T>, EnumDesc {
    /**
     * 比较参数是否与枚举类的value相同
     * @param value
     * @return boolean
     */
    default boolean equalsValue(Object value) {
        return Objects.equals(getValue(), value);
    }

    /**
     * 比较枚举类是否相同
     *
     * @param baseEnum
     * @return boolean
     */
    default boolean equals(BaseEnum<T> baseEnum) {
        return Objects.equals(getValue(), baseEnum.getValue()) && Objects.equals(getDesc(), baseEnum.getDesc());
    }
}
