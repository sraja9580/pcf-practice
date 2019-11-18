package com.fmcd.pcf.demo.limits.limits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
	
	@Autowired
	UpperLimitFebinProxyInterface proxy;
	
	
	@Value("${MESSAGE_CONFIG_SERVER:Defaut Message from Limits API}")
	private String message; 
	@GetMapping("limits")
	public Limits getLimits() {
		//String upperLimt = proxy.getUpperLimit();
		String upperLimt = "30000";
		return new Limits("20",upperLimt,this.message);
	}
}
