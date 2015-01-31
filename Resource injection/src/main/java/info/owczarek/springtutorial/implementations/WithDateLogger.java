package info.owczarek.springtutorial.implementations;

import info.owczarek.springtutorial.api.Logger;

import java.util.Date;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service//("withDateLogger")
public class WithDateLogger implements Logger {
	public void log(String message) {
		System.out.println(new Date() + ": " + message);
	}
}
