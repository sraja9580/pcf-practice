package com.fmcd.pcf.demo.limits.limits;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="limit-upper",url="${URL_LIMIT_UPPER_SERVICE:http://localhost:8082}")
public interface UpperLimitFebinProxyInterface {
	
	@GetMapping("limit-upper")
	public String getUpperLimit();
}
