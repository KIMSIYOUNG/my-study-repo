package com.example.coffee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.coffee.domain.Barista;
import com.example.coffee.domain.Customer;
import com.example.coffee.domain.Menu;

public class CoffeeApplication {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.order("아메리카노",new Menu(), new Barista());
	}
}
