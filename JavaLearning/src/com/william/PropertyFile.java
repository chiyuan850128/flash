package com.william;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		
		OutputStream os = new FileOutputStream("dataConfig.properties");
		p.setProperty("url", "localhost:3306/myDb");
		p.setProperty("uname", "william");
		p.setProperty("pass", "0000");
		p.store(os, null);
		
		InputStream is = new FileInputStream("dataConfig.properties");
		p.load(is);
		System.out.println(p.getProperty("uname"));
		System.out.println(p.getProperty("url"));
	}

}
