package com.amdocs;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class MathFactory {
	
	private static HashMap<String, String> classNameMap;
	
	static {
		classNameMap=new HashMap<String,String>();
		FileInputStream file;
		try
		{
          file= new FileInputStream("src/main/resources/config.properties");
          Properties properties=new Properties();
          properties.load(file);        
          properties.forEach((key,value)->{
        	classNameMap.put((String)key, (String)value);
          });
		}catch(Exception e)
		{
		}
		
	}

	public static IMathOperation getObject(String token) {
		
		IMathOperation mathOperation=null;
		String className;		
		className=classNameMap.get(token);
		try
		{
		 mathOperation=(IMathOperation) Class.forName(className).newInstance();
		}catch(Exception e)
		{
			//e.printStackTrace();
		}
		
		return mathOperation;
	}

}
