package com.applicationcontext;

public class Hello
{
	private String message;

	public String getMessage() 
	{
		System.out.println("Yur Message is:" +message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
