package com.spring.demo.customtag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Title: MyNamespaceHandler.java <br>
 * Description:             <br>
 * Copyright: Copyright (c) 2015<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author yinzo 2019-01-13
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
