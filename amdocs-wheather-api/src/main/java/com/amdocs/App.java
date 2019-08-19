package com.amdocs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.impl.client.DefaultHttpClient;

public class App {

	public static void main(String[] args) {

HttpHost proxy = new HttpHost("10.19.16.165",8080);
		
		HttpClient client = new DefaultHttpClient();
		client.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
		HttpGet request = 
		new HttpGet("https://www.metaweather.com/api/location/search/?lattlong=50.068,-5.316");
		
		HttpResponse response;
		
		try {
			response = client.execute(request);
			BufferedReader reader =  new BufferedReader
					(new InputStreamReader(response.getEntity().getContent()));
			
			String line;
			while((line = reader.readLine()) != null){
				System.out.println(line);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
