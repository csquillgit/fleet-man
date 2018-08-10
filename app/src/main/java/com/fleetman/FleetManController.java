package com.fleetman;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.core.CoreService;

@RestController
public class FleetManController {

	@Autowired
	CoreService cs;

	protected Logger logger = Logger.getLogger(FleetManController.class.getName());

	@RequestMapping("/")
	public String test() {
		return "Test";
	}

}
