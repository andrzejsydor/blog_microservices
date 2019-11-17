package com.example._load_balancing_client;

public class LogDto {
	int id;
	String log;
	
	public LogDto() {
	}
	
	public LogDto(int id, String log) {
		this.id = id;
		this.log = log;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log=log;
	}
}
