package com.core;

import org.springframework.stereotype.Service;

@Service
public class CoreServiceImpl implements CoreService {

  @Override
  public String echo(String value) {
    return value;
  }
}
