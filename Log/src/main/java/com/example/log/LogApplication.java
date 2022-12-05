package com.example.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogApplication {
  private static final Logger LOGGER = LoggerFactory.getLogger(LogApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(LogApplication.class, args);

    doStuff("Luong");
  }


  public static void doStuff(final String value) {
    LOGGER.trace("doStuff needed more information - {}", value);
    LOGGER.debug("doStuff needed to debug - {}", value);
    LOGGER.info("doStuff took input - {}", value);
    LOGGER.warn("doStuff needed to warn - {}", value);
    LOGGER.error("doStuff encountered an error with value - {}", value);
  }
}
