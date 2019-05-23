package com.feiyang.hessian.service;

import com.feiyang.hessian.bean.User;

/**
 * Created by feiyang on 2019/5/20.
 */
public interface BasicAPI {

    public void setGreeting(String greeting);

    public String hello();

    public User getUser();


}
