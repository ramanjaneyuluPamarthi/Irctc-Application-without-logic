package com.nit.request;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement              //Here This Annotation is used for JAXB API
public class PAssengerRequest {             //To convert java Object To Xml dataor format

	private String name;
	private String dob;
	private String gender;                      //Normal POJO class
	private String startingFrom;
	private String destination;
	private String dateOfJourney;
	private Integer trainNo;
	
	public Integer getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(Integer trainNo) {
		this.trainNo = trainNo;
	}
	
	
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
	@Override
	public String toString() {
		return "PAssengerRequest [name=" + name + ", dob=" + dob + ", gender=" + gender + ", startingFrom="
				+ startingFrom + ", destination=" + destination + ", dateOfJourney=" + dateOfJourney + ", trainNo="
				+ trainNo + "]";
	}
	
	
	
	
}
