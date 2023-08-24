package com.training.project2.package1;

public class TimetableMain {

	public static void main(String[] args) {
		
		Timetable trains = new Timetable();
		
		trains.addTrain(new Train("London", 15, 17, 15));
		trains.addTrain(new Train("Paris", 24, 13, 0));
		trains.addTrain(new Train("London", 9, 12, 45));
		trains.addTrain(new Train("Warsaw", 13, 14, 30));
		trains.addTrain(new Train("Paris", 22, 11, 0));
		
		//System.out.println("---------------Расписание----------------");
		
		//trains.sortByNumber();		
		//trains.print();
		
		//trains.printByNumber();
		
		System.out.println("---------------Расписание----------------");
		
		trains.sortByDestination();
		trains.print();
		

	}
	


}
