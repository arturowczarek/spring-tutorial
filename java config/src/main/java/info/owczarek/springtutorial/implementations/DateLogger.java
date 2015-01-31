package info.owczarek.springtutorial.implementations;

import info.owczarek.springtutorial.api.Logger;

import java.util.Date;

public class DateLogger implements Logger {
	public void log(String message) {
		System.out.println(new Date() + ": " + message);
	}
}
