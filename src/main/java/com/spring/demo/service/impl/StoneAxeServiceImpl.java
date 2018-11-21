package com.spring.demo.service.impl;

import com.spring.demo.service.AxeService;

/**
 * Title: StoneAxeServiceImpl.java <br>
 * Description:             <br>
 * Copyright: Copyright (c) 2015<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author yinzo 2018/10/24
 */
public class StoneAxeServiceImpl implements AxeService {

    @Override
    public String chop() {

        return "石斧砍不动石头";
    }
}
