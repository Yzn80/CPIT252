package com.mycompany.loggerdemo;

public class DatabaseLogger extends BaseLogger {
	public DatabaseLogger() {
		label = "Database logger";
	}
 
	public String getLevel() {
		return "critical";
	}
}


