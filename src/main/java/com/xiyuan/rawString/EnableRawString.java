package com.xiyuan.rawString;

import java.lang.annotation.*;

/**
 * Created by xiyuan_fengyu on 2019/4/9 16:15.
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE})
public @interface EnableRawString {

    String charset() default "UTF-8";

}
