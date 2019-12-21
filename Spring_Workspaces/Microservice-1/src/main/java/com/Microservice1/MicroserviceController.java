package com.Microservice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Microservice-1")
public class MicroserviceController {

	@GetMapping("/Service-1")
	public String FirstService() throws InterruptedException
	{
		Thread.sleep(10000);
		return "Microservice - V3";
	}
	
}
