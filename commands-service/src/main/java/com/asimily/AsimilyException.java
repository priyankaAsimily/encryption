package com.asimily;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class AsimilyException extends RuntimeException{

  public AsimilyException(String message, Throwable err) {
    super(message, err);
  }
}
