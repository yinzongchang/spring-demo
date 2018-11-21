package com.spring.demo.main;

import com.spring.demo.service.AxeService;
import com.spring.demo.service.impl.StoneAxeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Title: Application.java <br>
 * Description:             <br>
 * Copyright: Copyright (c) 2015<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author yinzo 2018/10/24
 */
public class Application {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-main.xml");

        AxeService p = ctx.getBean("stoneAxeService", StoneAxeServiceImpl.class);
        String result = p.chop();
        System.out.println("=====" + result);
    }

}
