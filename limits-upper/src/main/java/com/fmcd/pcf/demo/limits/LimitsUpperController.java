package com.fmcd.pcf.demo.limits;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsUpperController {
	
	@GetMapping("limit-upper")
	public String upperLimit() {
		return "1000000";
	}
}
