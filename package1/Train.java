package com.training.project2.package1;

public class Train {
	
	private String destination;
	private int numberOfTrain;
	private int hour;
	private int min;
	
	public Train() {}
	
	public Train(String destination, int numberOfTrain, int hour, int min) {
		
		this.destination = destination;
		this.numberOfTrain = numberOfTrain;
		this.hour = hour;
		this.min = min;
	}
	
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNumberOfTrain() {
		return numberOfTrain;
	}
	public void setNumberOfTrain(int numberOfTrain) {
		this.numberOfTrain = numberOfTrain;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	
	

}
