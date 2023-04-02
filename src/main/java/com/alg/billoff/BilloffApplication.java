package com.alg.billoff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BilloffApplication {

	public static void main(String[] args) {
		SpringApplication.run(BilloffApplication.class, args);
		System.out.println("SUCCESS: BILL_OF_MATERIAL dependency added!!!");
	}

}
