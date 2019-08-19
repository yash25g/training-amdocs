package com.amdocs;

public class Subscriber implements IObserver {

	String name;
	public Subscriber(String name)
	{
		this.name=name;
	}
	public void update(String message) {
		System.out.println(message);

	}

}
