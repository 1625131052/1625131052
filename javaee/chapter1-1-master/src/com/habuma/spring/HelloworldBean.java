package com.habuma.spring;

/**
 * 
 * @author Administrator
 * 普通的Java类-POJO,构成了Java程序的不同对象，相互合作完成共同的功能
 */
public class HelloworldBean {
	public static void main(String[] args) {
		Student stu=new Student();
		stu.setName("张三");
		System.out.println(stu.getName());
	}
}
