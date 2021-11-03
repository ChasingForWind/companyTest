package com.json;

import com.alibaba.fastjson.JSON;
import org.mule.util.IOUtils;

import java.io.IOException;

/**
 * @author: zhiyang
 * @description: 测试序列化
 * @create: 2021-10-20 19:24
 **/


public class Demo3 {
    public static void main(String[] args) throws IOException {
        String resourceAsString = IOUtils.getResourceAsString("result.json", Demo3.class);
        PageResultVO<TableDataVO> pageResultVO = JSON.parseObject(resourceAsString, PageResultVO.class);
        String s = JSON.toJSONString(pageResultVO);
        System.out.println(s);
    }
}
