package com.lanyu.work;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

abstract class Iowork {
public static void main(String[] args) throws IOException  {
	//拷贝一个图片文件到另一个目录下。
	/*File fi=new File("D:\\图片.jpg");
	System.out.println(fi.exists());
	FileInputStream input=null;
	BufferedInputStream buff=null;
	
	
	File fil=new File("E:\\图片1.bmp");
	FileOutputStream out=null;
	BufferedOutputStream buffer=null;
	try {
		input=new FileInputStream(fi);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	try {
		out=new FileOutputStream(fil);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	buff=new BufferedInputStream(input);
	buffer=new BufferedOutputStream(out);
	byte b[]=new byte[1024];
	int n;
	try {
		while((n=buff.read(b))!=-1) {
			buffer.write(b);
		}
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		buffer.flush();
		buff.close(); buffer.close();
		input.close();out.close();
	}
	//指定一个java的源文件，将信息原样输出到控制台
	Scanner sc=new Scanner(System.in);
	File f=new File("D:\\hello");
	FileOutputStream in=new FileOutputStream(f);
	System.out.println("请输入内容");
	String str=sc.nextLine();
	in.write(str.getBytes());
	in.close();*/
	//将一个java的源文件中的信息，写入到新创建的一个目标的java源文件中。
	/*File fi=new File("D:\\hello.txt");
	System.out.println(fi.exists());
	FileInputStream input=null;
	BufferedInputStream buff=null;
	File fil=new File("D:\\hellos.txt");
	FileOutputStream out=null;
	BufferedOutputStream buffer=null;
	try {
		input=new FileInputStream(fi);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	buff=new BufferedInputStream(input);
	try {
		out=new FileOutputStream(fil);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	buffer=new BufferedOutputStream(out);
	byte []b=new byte[1024];
	int a;
	try {
		while((a=buff.read(b))!=-1) {
			buffer.write(b);
		}
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			buffer.flush();
			buffer.close(); buff.close();
			input.close();out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
	//如何追加文件
	
	File fi=new File("D:\\hello.txt");
	try {
		String str="xiao";
		FileOutputStream out=new FileOutputStream(fi, true);
		BufferedOutputStream buff=new BufferedOutputStream(out);
		buff.write(str.getBytes());
		buff.flush();
		buff.close();
		out.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	//按行读写文件
	File file1=new File("D:\\hello.txt");
	File file2=new File("D:\\hellos.txt");
	try {
		FileReader fr=new FileReader(file1);
		FileWriter fw=new FileWriter(file2);
		BufferedReader br=new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(fw);
		String s;
		while((s=br.readLine())!=null)
		{				
			bw.write(s+"\r\n");
	        bw.flush();
		}
		bw.close();br.close();
		fr.close();fw.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
