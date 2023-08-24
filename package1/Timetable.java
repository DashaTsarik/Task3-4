package com.training.project2.package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Timetable {
	
	private List<Train> trains;
	private int countOfTrains = 0; 
	
	public Timetable() {
		trains = new ArrayList<Train>();
	}
	
	public boolean addTrain(Train t) {
		countOfTrains++;
		return trains.add(t);
		
	}
	
	public Train getTrain(int i){
		return trains.get(i);
	}
	
	public Train findByNumber(int numberOfTrain) {
		for (int i = 0; i < trains.size(); i++) {
			Train t = trains.get(i);
			int number = t.getNumberOfTrain();
			if (number == numberOfTrain) {
				return t;
			}	
		} 
		return null;
	
	}
	
	public int findPosition(Train train) {
		int index = -1;
		for (int i = 0; i < trains.size(); i++) {
			Train t = trains.get(i);
			if (train.getNumberOfTrain() == t.getNumberOfTrain()){
				index = i;
			}
		}
		return index;
	}
	
	public void sortByNumber() {
		int[] numbersOfTrains = new int[countOfTrains];
		
		for (int i = 0; i < numbersOfTrains.length; i++) {
			Train t = trains.get(i);
			numbersOfTrains[i] = t.getNumberOfTrain();
		}
		Arrays.sort(numbersOfTrains);
		
		for (int i = 0; i < countOfTrains; i++) {
			Train t = trains.get(i);
			Train trainMinNum = findByNumber(numbersOfTrains[i]);
			int indexMin = findPosition(trainMinNum);
			
			trains.add(i,trainMinNum);
			trains.remove(i+1);
			trains.add(indexMin, t);
			trains.remove(indexMin + 1);
			//String destination = t.getDestination();
			//int number = t.getNumberOfTrain();
			//int hour = t.getHour();
			//int min = t.getMin();
			
			//t.setNumberOfTrain(trainMinNum.getNumberOfTrain());
			//t.setDestination(trainMinNum.getDestination());
			//t.setHour(trainMinNum.getHour());
			//t.setMin(trainMinNum.getMin());
			
			//trainMinNum.setDestination(destination);
			//trainMinNum.setHour(hour);
			//trainMinNum.setNumberOfTrain(number);
			//trainMinNum.setMin(min);
			
		}
	}
	
	public void sortByDestination() {
		/*for (int k = 0; k < countOfTrains; k++) {
			Train t1 = trains.get(k);
			for (int i = 1; i < countOfTrains; i++) {
				Train t2 = trains.get(i);
				if (t1.getDestination().compareTo(t2.getDestination()) == 0) {
						trains.add(k,t2);
						trains.remove(i+1);
						k++;
				}
			}
		} */
		
		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < countOfTrains - 1; i++) {
				Train t1 = trains.get(i);
				Train t2 = trains.get(i+1);
				if (t1.getDestination().compareTo(t2.getDestination()) == 0) {
					if (t1.getHour() > t2.getHour()) {
						isSorted = false;
						trains.add(i,t2);
						trains.remove(i+2);
					}
				    else if (t2.getHour() == t1.getHour()) {
				    	if (t1.getMin() > t2.getMin()) {
				    		isSorted = false;
				    		trains.add(i, t2);
				    		trains.remove(i+2);
						} 
					}
		    	}
		    }
		}
	}
	
	public void printByNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите номер поезда > ");
		while(!scanner.hasNextInt()) {
			System.out.println("Вы ввели некорректные данные.");
			System.out.print("Введите номер поезда > ");
		}
		int number = scanner.nextInt();
		Train t = findByNumber(number);
		if (t == null) {
			System.out.println("Такого поезда нет в расписании");
		}else if (t.getMin() < 10) {
			System.out.println("Пункт назначения: " + t.getDestination() + "\nНомер поезда: " + 
		                      t.getNumberOfTrain() + "\nВремя отправления: " + t.getHour() + ":" + 
				              "0" + t.getMin());
		} else {
			 System.out.println("Пункт назначения: " + t.getDestination() + "\nНомер поезда: " + 
		                      t.getNumberOfTrain() + "\nВремя отправления: " + t.getHour() + ":" + 
					          t.getMin());
		}
	}
	
	public void print() {
		for( int i = 0; i<trains.size(); i++) {
			Train t = trains.get(i);
			if (t.getMin() < 10) {
				System.out.println("Поезд " + i + ":" + "\n\tПункт назначения: " + t.getDestination() +
				                  "\n\tНомер поезда: " + t.getNumberOfTrain() + "\n\tВремя отправления: "
						          + t.getHour() + ":" + "0" + t.getMin());
				System.out.println("-----------------------------------------");
			} else {
			    System.out.println("Поезд " + i + ":" + "\n\tПункт назначения: " + t.getDestination() +
			                      "\n\tНомер поезда: " + t.getNumberOfTrain() + "\n\tВремя отправления: "
			    		          + t.getHour() + ":" + t.getMin());
				System.out.println("-----------------------------------------");
			}
		}
	}
}



