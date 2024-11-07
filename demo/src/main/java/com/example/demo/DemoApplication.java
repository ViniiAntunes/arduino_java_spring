package com.example.demo;

import com.example.demo.program.ArduinoSerialCommunication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		new ArduinoSerialCommunication();
		ArduinoSerialCommunication.main(args);
	}

}
