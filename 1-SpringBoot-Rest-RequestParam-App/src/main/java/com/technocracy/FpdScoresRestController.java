package com.technocracy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fpd")
public class FpdScoresRestController {

	//To read Query Parameter in Resource method we will use @RequestParam annotation
	@GetMapping(value = "/score")
	public String getFpdScores(@RequestParam("ssn") Long ssn) {
		System.out.println("SSN: "+ssn);
		//logic retrive from db
		
		return "FPD scores Is : 75";
	}
	
	@GetMapping(value = "/score1")
	public String getFpdScores1(@RequestParam(value = "ssn", required = false, defaultValue = "7895446045") Long ssn) {
		System.out.println("SSN: "+ssn);
		//logic retrive from db
		
		return "FPD scores Is : 85";
	}
}

//Note: When we are using @RequestParam annotation, Query Parameters are mandatory in URL to access Resource.
// we can make @RequestParam as optional also @RequestParam(value="ssn", required=false)
// Mandatory : http://localhost:8081/fpd/score?ssn=7895184361
// Error : http://localhost:8081/fpd/score