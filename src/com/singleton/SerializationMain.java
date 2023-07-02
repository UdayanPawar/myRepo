package com.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationMain {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String file="D:\\demo.txt";
		//serialization 
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		CustomerSingleton cs1 = CustomerSingleton.getCustomerSingletonInstance();
		oos.writeObject(cs1);
		oos.close();
		fos.close();
		System.out.println("serialization done..");
		
		//desrialization
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		CustomerSingleton cs2=(CustomerSingleton) ois.readObject();//readResolve
		ois.close();
		fis.close();
		
		System.out.println("cs1.hashcode()"+cs1.hashCode());
		System.out.println("cs2.hashcode()"+cs2.hashCode());

		
		
		 
	}

}
