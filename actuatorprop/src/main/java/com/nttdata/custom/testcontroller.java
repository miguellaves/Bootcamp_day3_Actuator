package com.nttdata.custom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
public class testcontroller {
	private Counter counter;
	
	public testcontroller(MeterRegistry registry) {
		this.counter = Counter.builder("Invocaciones.hello").description("Invocaciones totales").register(registry);
	}
	
	@GetMapping("/helloworld")
	public String helloworld() {
		counter.increment();
		return "hello world";
	}
}
