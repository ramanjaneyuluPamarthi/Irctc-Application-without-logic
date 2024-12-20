package com.nit.response;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TicketResponse {

	private String name;
	private String dob;
	private String gender;
	private Integer trainNo;
	private String startingFrom;
	private String destination;
	private String dateOfJourney;
	private String status;
	private Double ticketPrice;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(Integer trainNo) {
		this.trainNo = trainNo;
	}
	public String getStartingFrom() {
		return startingFrom;
	}
	public void setStartingFrom(String startingFrom) {
		this.startingFrom = startingFrom;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(String dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	@Override
	public String toString() {
		return "TicketResponse [name=" + name + ", dob=" + dob + ", gender=" + gender + ", trainNo=" + trainNo
				+ ", startingFrom=" + startingFrom + ", destination=" + destination + ", dateOfJourney=" + dateOfJourney
				+ ", status=" + status + ", ticketPrice=" + ticketPrice + "]";
	}
	
	
}
