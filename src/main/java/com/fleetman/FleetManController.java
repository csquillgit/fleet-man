package com.fleetman;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FleetManController {

	protected Logger logger = Logger.getLogger(FleetManController.class.getName());

	@RequestMapping("/")
	public String test() {
		return "Test";
	}

}
