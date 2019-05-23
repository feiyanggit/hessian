package com.feiyang.hessian.service;

import com.feiyang.hessian.bean.User;

/**
 * Created by feiyang on 2019/5/20.
 */
public class BasicService implements BasicAPI
{

	private String _greeting = "Hello world";

	public void setGreeting(String greeting)
	{
		_greeting = greeting;
	}

	public String hello()
	{
		return _greeting;
	}

	public User getUser()
	{
		return new User("yangfei", "654321");
	}
}
