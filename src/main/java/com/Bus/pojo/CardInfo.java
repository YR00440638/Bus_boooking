package com.Bus.pojo;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;

public class CardInfo {
	
	private String cardType;
	private String cardNumber;
	
	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Boolean getLastChooseOption() {
		return lastChooseOption;
	}

	public void setLastChooseOption(Boolean lastChooseOption) {
		this.lastChooseOption = lastChooseOption;
	}

	@Value("false")
	private Boolean lastChooseOption;
	

}
