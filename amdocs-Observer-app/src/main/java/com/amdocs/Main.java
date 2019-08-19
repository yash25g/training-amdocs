package com.amdocs;

public class Main {

	public static void main(String[] args) {
       PaperWala paperwala=new PaperWala("Pune PaperWala");
       paperwala.addSubscriber(new Subscriber("Ramesh"));       
       paperwala.addSubscriber(new Subscriber("Suresh"));
       
       paperwala.notifyAllSubscribers("Times Of India");
	}

}
