package com.xiyuan.rawString;


/**
 * Created by xiyuan_fengyu on 2019/4/9 16:06.
 */
@EnableRawString(charset = "utf-8")
public class RawStringTest0 {

    public static void main(String[] args) {
        String rawStr = new RawString("just test", "中文测试", true).$(/*
        const str = 123;
        console.log("/*123中文*\/");
        console.log(${_0} + "${_1}");
        console.log(${_2 ? string("true", "false")});

        */);
        System.out.println(rawStr);
    }

}