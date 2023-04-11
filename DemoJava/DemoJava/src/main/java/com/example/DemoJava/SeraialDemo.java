package com.example.DemoJava;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SeraialDemo implements Serializable {

	
	
	private void writeObject(ObjectOutputStream oos) throws IOException{

       oos.defaultWriteObject();
		
	}

	private void readObject(ObjectInputStream in) throws IOException{
		try {
			in.defaultReadObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
