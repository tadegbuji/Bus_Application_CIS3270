package entities;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;

import javafx.beans.property.SimpleStringProperty;

//Still working on this


public class CustomerSchedule {

	
	private SimpleStringProperty fromStation, toStation, numberOfPassengers, capacity, scheduleID; 
	private Date arrivalDate, departureDate;
	private Timestamp arrivalTime, departureTime;
	
	
	
	
	public CustomerSchedule(String fromStation, String toStation,
			Date arrivalDate, Date departureDate, Timestamp arrivalTime, Timestamp departureTime
			, String numberOfPassengers, String capacity, String scheduleID) {
	
		this.fromStation = new SimpleStringProperty(fromStation);
		this.toStation = new SimpleStringProperty(toStation);
		this.numberOfPassengers = new SimpleStringProperty(numberOfPassengers);
		this.arrivalDate = arrivalDate;
		this.capacity = new SimpleStringProperty(capacity); 
		this.departureDate = departureDate;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.scheduleID = new SimpleStringProperty(scheduleID);
		
		
	}




	public String getFromStation() {
		return fromStation.get();
	}




	public void setFromStation(SimpleStringProperty fromStation) {
		this.fromStation = fromStation;
	}




	public String getToStation() {
		return toStation.get();
	}




	public void setToStation(SimpleStringProperty toStation) {
		this.toStation = toStation;
	}




	public String getNumberOfPassengers() {
		return numberOfPassengers.get();
	}




	public void setNumberOfPassengers(int passengerNumber) {
		this.numberOfPassengers = numberOfPassengers;
	}




	public Date getArrivalDate() {
		return arrivalDate;
	}




	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}




	public Date getDepartureDate() {
		return departureDate;
	}




	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}




	public Timestamp getArrivalTime() {
		return arrivalTime;
	}




	public void setArrivalTime(Timestamp arrival_time) {
		this.arrivalTime = arrival_time;
	}




	public Timestamp getDepartureTime() {
		return departureTime;
	}




	public void setDepartureTime(Timestamp departure_time) {
		this.departureTime = departure_time;
	}




	public String getCapacity() {
		return capacity.get();
	}




	public void setCapacity(SimpleStringProperty capacity) {
		this.capacity = capacity;
	} 
	
	public String getScheduleID() {
		return scheduleID.get();
	}




	public void setScheduleID(SimpleStringProperty scheduleID) {
		this.scheduleID = scheduleID;
	} 
	
	
		
}