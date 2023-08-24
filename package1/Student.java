package com.training.project2.package1;

public class Student {
	
	private String surname;
	private String name;
	private int numberOfGroup;
	private int[] grade;
	private int countOfMarks = 0;
	
	public Student() {}
	
	public Student(String surname, String name, int numberOfGroup) {
			this.surname = surname;
			this.name = name;
			this.numberOfGroup = numberOfGroup;
			this.grade = new int[5];
		
	}
	
	public boolean addMarks(int mark1, int mark2, int mark3, int mark4, int mark5) {
		if (countOfMarks >= grade.length) {
			return false;
		}
		grade[0] = mark1;
		grade[1] = mark2;
		grade[2] = mark3;
		grade[3] = mark4;
		grade[4] = mark5;
		return true;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumberOfGroup(int numberOfGroup) {
		this.numberOfGroup = numberOfGroup;
	}
	
	public void setGrade(int[] grade) {
		this.grade = grade;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumberOfGroup() {
		return numberOfGroup;
	}
	
	public int[] getGrade() {
		return grade;
	}

}
