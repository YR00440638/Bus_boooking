package com.Bus.pojo;

import java.util.List;

import javax.validation.constraints.NotNull;

public class UserProfile {
	
	@NotNull
	private String username;
	@NotNull
	private String password;
	private String address;
	@NotNull
	private String Name;
	@NotNull
	private int phoneNumber;
	@NotNull
    private String emailAddress;
    private Long createdAT;
    private Long modifiedAT;
    
    private List<BookingInfo> bookinginfo;
     
    private List<CardInfo>  cardInfo;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Long getCreatedAT() {
		return createdAT;
	}

	public void setCreatedAT(Long createdAT) {
		this.createdAT = createdAT;
	}

	public Long getModifiedAT() {
		return modifiedAT;
	}

	public void setModifiedAT(Long modifiedAT) {
		this.modifiedAT = modifiedAT;
	}

	public List<BookingInfo> getBookinginfo() {
		return bookinginfo;
	}

	public void setBookinginfo(List<BookingInfo> bookinginfo) {
		this.bookinginfo = bookinginfo;
	}

	public List<CardInfo> getCardInfo() {
		return cardInfo;
	}

	public void setCardInfo(List<CardInfo> cardInfo) {
		this.cardInfo = cardInfo;
	}
	
    
}
