package com.ks.test;

public class Student {
int rollNo = 10;
String name = "kapil";

public Student(int rollNo, String name) {
	this.rollNo = rollNo;
	this.name = name;
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" roll number is"+this.rollNo;
	}

}
