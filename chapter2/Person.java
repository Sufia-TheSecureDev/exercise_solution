//package com.swafia.java;

public class Person{
	private String name;
	private int age;
	private String phone;

	public Person(){

	}
	public Person(String name, int age, String phone){
		this.name = name; 
		this.age = age;
		this.phone = phone;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getPhone(){
		return phone;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}

	public void printAllField(){
		System.out.println(name +','+age+','+phone);
	} 

	public static void  main(String[] args){
		Person person1 =new Person();
		Person person2 = new Person("swafia",25,"018546465");

		person1.setName("sania");
		person1.setAge(24);
		person1.setPhone("015464646");
		person1.printAllField();

		person2.printAllField(); 
	}

}


