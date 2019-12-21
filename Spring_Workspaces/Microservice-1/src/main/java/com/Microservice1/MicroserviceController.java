package com.Microservice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController

@RequestMapping("/Microservice-1")
public class MicroserviceController {

		

	@GetMapping("/Service-1")
	public String FirstService() throws InterruptedException
	{
		Thread.sleep(100000);
		return "Microservice - V3";
	}
	
}
