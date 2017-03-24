package com.boot.microservices;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;

//@Data
@JsonAutoDetect(fieldVisibility=Visibility.NONE,
getterVisibility=Visibility.NONE, isGetterVisibility=Visibility.NONE)
public class AddResponse {

	private static final long serialVersionUID = 1L;

	@JsonProperty("sum")
	private int sum;

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
}
