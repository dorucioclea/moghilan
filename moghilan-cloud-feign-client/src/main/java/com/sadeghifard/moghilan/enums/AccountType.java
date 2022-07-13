package com.sadeghifard.moghilan.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccountType {
	DEBIT("DEBIT"),
	CREDIT("CREDIT");
	
	private String type;
	
	AccountType(String type) {
		this.type = type;
	}
	
	@JsonValue
	public String getType() {
		return type;
	}
}
