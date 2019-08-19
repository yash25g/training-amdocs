package com.amdocs;

public class MobileFactory {

	public static IMobile getMobile(String mobilename) {
       IMobile mobile=null;
       if(mobilename.equals("IPhone"))
    	   mobile=new IPhone();
       else if(mobilename.equals("IPhone5"))
    	   mobile=new IPhone5();
       else if (mobilename.equals("OnePlus5"))
    	   mobile=new OnePlus5();
       else
    	   mobile=new NullMobile();
       
       return mobile;
       
	}

}
