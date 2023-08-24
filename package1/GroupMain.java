package com.training.project2.package1;

public class GroupMain {

	public static void main(String[] args) {
		Group students = new Group();
		System.out.println(students.getSizeOfGroup());
		
		students.add(new Student("Иванов","Василий",25));
		addMarksToStudent(students.getStudent(0), 6,8,9,10,5);
		
		students.add(new Student("Петров","Дмитрий",25));
		addMarksToStudent(students.getStudent(1), 5,4,3,3,4);
		
		students.add(new Student("Сидорова","Дарья",24));
		addMarksToStudent(students.getStudent(2), 10,9,10,10,9);
		
		students.add(new Student("Козлов","Михаил",24));
		addMarksToStudent(students.getStudent(3), 9,9,9,9,10);
		
		students.add(new Student("Успенская","Виктория",24));
		addMarksToStudent(students.getStudent(4), 6,7,8,6,6);
		
		students.add(new Student("Морозова","Юлия",25));
		addMarksToStudent(students.getStudent(5), 10,10,10,10,10);
		
		students.add(new Student("Беляев","Александр",25));
		addMarksToStudent(students.getStudent(6), 9,9,10,10,10);
		
		students.add(new Student("Жуков","Павел",24));
		addMarksToStudent(students.getStudent(7), 6,7,7,6,3);
		
		students.add(new Student("Щукина","Оксана",25));
		addMarksToStudent(students.getStudent(8), 8,9,7,8,9);
		
		students.add(new Student("Жижина","Екатерина",24));
		addMarksToStudent(students.getStudent(9), 10,9,9,9,10);
		
		System.out.println(students.getSizeOfGroup());
		
		System.out.println("----------------------Отличники----------------------");
		print(students);
		System.out.println("-----------------------------------------------------");

		
		
		

	}
	
	public static void addMarksToStudent(Student b, int mark1, int mark2, int mark3, int mark4, int mark5) {
		b.addMarks(mark1, mark2, mark3, mark4, mark5);
	}
	
	public static void print(Group students) {
		for (int i = 0; i < students.getSizeOfGroup(); i++) {
			Student b = students.findByMark(students.getStudent(i),9,10);
			if (b != null) {
				System.out.println("Фамилия - " + b.getSurname() + " Номер группы - " + b.getNumberOfGroup());
				}
		}
		
	}

}
