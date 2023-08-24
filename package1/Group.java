package com.training.project2.package1;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private List<Student> students;
	private int countOfStudents = 0;
	
	public Group() {
		students = new ArrayList<Student>(10);
	}
	
	public boolean add(Student a) {
	    if (countOfStudents >= 10) {
	    	return false;
	    }
	    countOfStudents++;
	    return students.add(a);
	}
	
	public Student findByMark(Student b, int mark1, int mark2) {
			int[]grade = b.getGrade();
			if ((grade[0] == mark1 || grade[0] == mark2) 
				&& (grade[1] == mark1 || grade[1] == mark2) 
				&& (grade[2] == mark1 || grade[2] == mark2) 
				&& (grade[3] == mark1 || grade[3] == mark2)
				&& (grade[4] == mark1 || grade[4] == mark2)) {
				return b;
			}
		return null;
		
	}
	
	public Student getStudent(int i) {
		return students.get(i);
	}
	
	public int getSizeOfGroup() {
		return students.size();
	}
	
	

}
