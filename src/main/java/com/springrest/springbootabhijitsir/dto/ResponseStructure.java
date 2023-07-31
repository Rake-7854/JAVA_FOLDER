package com.springrest.springbootabhijitsir.dto;

import java.time.LocalDateTime;

public class ResponseStructure<T> {

	private Integer statucCode;
	private String message;
	private T data;
	private LocalDateTime timeStamp;
	public Integer getStatucCode() {
		return statucCode;
	}
	public void setStatucCode(Integer statucCode) {
		this.statucCode = statucCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp() {
		this.timeStamp = LocalDateTime.now();
	}
	
}
