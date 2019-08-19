package org.amdocs;

public class Hello {
	public String sayHello()
	{
		return "Hello World!";
	}
	
	public static void main(String[] args)
	{
		Hello obj=new Hello();
		System.out.println(obj.sayHello());
	}

}
