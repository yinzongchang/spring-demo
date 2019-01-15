package com.spring.demo.label;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Title: TestMethodReplacer.java <br>
 * Description:             <br>
 * Copyright: Copyright (c) 2015<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author yinzo 2019-01-08
 */
public class TestMethodReplacer implements MethodReplacer {


    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {

        System.out.println("我替换了原有的方法");
        return null;
    }
}
