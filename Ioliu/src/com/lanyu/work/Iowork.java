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
	//����һ��ͼƬ�ļ�����һ��Ŀ¼�¡�
	/*File fi=new File("D:\\ͼƬ.jpg");
	System.out.println(fi.exists());
	FileInputStream input=null;
	BufferedInputStream buff=null;
	
	
	File fil=new File("E:\\ͼƬ1.bmp");
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
	//ָ��һ��java��Դ�ļ�������Ϣԭ�����������̨
	Scanner sc=new Scanner(System.in);
	File f=new File("D:\\hello");
	FileOutputStream in=new FileOutputStream(f);
	System.out.println("����������");
	String str=sc.nextLine();
	in.write(str.getBytes());
	in.close();*/
	//��һ��java��Դ�ļ��е���Ϣ��д�뵽�´�����һ��Ŀ���javaԴ�ļ��С�
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
	//���׷���ļ�
	
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
	//���ж�д�ļ�
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
