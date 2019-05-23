package com.feiyang.hessian.bean;

import java.io.Serializable;

/**
 * Created by feiyang on 2019/5/20.
 */
public class User implements Serializable
{

	String	userName	= "feiyang";

	String	password	= "123456";

	public User(String userName, String password)
	{
		this.userName = userName;
		this.password = password;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
}
