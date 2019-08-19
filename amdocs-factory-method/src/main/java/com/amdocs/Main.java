package com.amdocs;

public class Main {

	public static void main(String[] args) {
       IMobile mobile=MobileFactory.getMobile("");
       mobile.call();
	}

}
