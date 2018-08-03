package com.sysint.sysint;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysIntController {

	protected Logger logger = Logger.getLogger(SysIntController.class.getName());

	@RequestMapping("/")
	public String test() {
		return "Test";
	}

}
