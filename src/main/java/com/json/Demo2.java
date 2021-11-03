package com.json;

import com.alibaba.fastjson.JSON;
import org.mule.util.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author: zhiyang
 * @description: 测试解析
 * @create: 2021-10-14 20:20
 **/


public class Demo2 {
    public static void main(String[] args) throws IOException {
        String s = FileUtils.readFileToString(new File("result.json"));
        PageResultVO user = JSON.parseObject(s,PageResultVO.class);
        System.out.println(user);
    }
}
