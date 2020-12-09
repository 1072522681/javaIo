package com.lanyu.work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class XuLiHua {
public static void main(String[] args) throws IOException{
	Student stu=new Student();
	stu.setAge(23);
	stu.setName("余下");
	//对象序列化
	File fi=new File("D:\\hello.txt");
	FileOutputStream out=new FileOutputStream(fi);
	ObjectOutputStream ob=new ObjectOutputStream(out);
	ob.writeObject(stu);
	ob.flush(); ob.close(); out.close();
	//对象反序列化
	//File fil=new File("D:\\hellos.txt");
	FileInputStream input=new FileInputStream(fi);
	ObjectInputStream object=new ObjectInputStream(input);
	Student st;
	try {
		st = (Student)object.readObject();
		System.out.println(st.getAge()+st.getName());
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}finally {
	object.close();input.close();}
	
	
	
	
	
	
	
	
	
	
}
}
