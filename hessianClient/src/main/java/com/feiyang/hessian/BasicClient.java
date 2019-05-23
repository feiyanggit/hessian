package com.feiyang.hessian;

import com.caucho.hessian.client.HessianProxyFactory;
import com.feiyang.hessian.service.BasicAPI;

import java.net.MalformedURLException;

/**
 * Created by feiyang on 2019/5/23.
 */
public class BasicClient {

    public static void main(String[] args) throws MalformedURLException {

        HessianProxyFactory factory = new HessianProxyFactory();
        String url = "http://127.0.0.1:8080/hello";


        BasicAPI basicAPI = (BasicAPI) factory.create(BasicAPI.class, url);

        System.out.println(basicAPI.hello());
        System.out.println(basicAPI.getUser().getUserName());
        System.out.println(basicAPI.getUser().getPassword());

        basicAPI.setGreeting("abc");

        System.out.println(basicAPI.hello());
    }
}
