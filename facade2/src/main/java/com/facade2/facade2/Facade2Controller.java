package com.facade2.facade2;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.core.core.CoreService;

@RestController
@RequestMapping("facade2")
public class Facade2Controller {

	protected Logger logger = Logger.getLogger(Facade2Controller.class.getName());

	@Autowired
	private CoreService coreService;

	@RequestMapping
	public String test() {
		return coreService.echo("facade2");
	}

}
