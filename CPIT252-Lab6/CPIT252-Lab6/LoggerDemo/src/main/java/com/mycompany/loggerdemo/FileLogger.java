package com.mycompany.loggerdemo;

public class FileLogger extends BaseLogger {
	public FileLogger() {
		label = "File logger";
	}
 
	public String getLevel() {
		return "debug";
	}
}

