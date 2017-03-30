package com.vinu.topic.util;

import java.util.TimeZone;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * A customized objectMapper that has properties set as we want.
 */
public class CustomObjectMapper extends ObjectMapper {
  private static final long serialVersionUID = 2791413333552468387L;

  private TimeZone tz = TimeZone.getTimeZone("UTC");

  public CustomObjectMapper() {
    
    this.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    setTimeZone(tz);
  }
}
