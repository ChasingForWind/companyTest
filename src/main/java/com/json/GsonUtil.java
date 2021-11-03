package com.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author: zhiyang
 * @description: 序列化
 * @create: 2021-10-20 19:09
 **/


public class GsonUtil {
    private static final Gson GSON_BUILDER = new GsonBuilder()
            .disableHtmlEscaping().enableComplexMapKeySerialization().create();

    public static String serialize(Object obj) {
        return GSON_BUILDER.toJson(obj);
    }

    public static <T> T unserialize(String s, Class<T> clz) {
        return GSON_BUILDER.fromJson(s, clz);
    }
}
