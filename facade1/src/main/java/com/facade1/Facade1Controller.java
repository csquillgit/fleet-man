package com.facade1;

import com.core.CoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("facade1")
public class Facade1Controller {

  protected Logger logger = Logger.getLogger(Facade1Controller.class.getName());

  @Autowired private CoreService coreService;

  @RequestMapping
  public String test() {
    return coreService.echo("facade1");
  }
}
