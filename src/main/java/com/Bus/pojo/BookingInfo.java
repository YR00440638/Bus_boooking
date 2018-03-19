package com.Bus.pojo;

import org.springframework.beans.factory.annotation.Value;

public class BookingInfo {
	// unique UUiD
	private String bookingID;
    
	private String destination;
	private String bording;
	private Long bookingDate;
	
	@Value("false")
	private Boolean draftBooking;
	
	private String payment;

	public String getBookingID() {
		return bookingID;
	}

	public void setBookingID(String bookingID) {
		this.bookingID = bookingID;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getBording() {
		return bording;
	}

	public void setBording(String bording) {
		this.bording = bording;
	}

	public Long getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Long bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Boolean getDraftBooking() {
		return draftBooking;
	}

	public void setDraftBooking(Boolean draftBooking) {
		this.draftBooking = draftBooking;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

}
