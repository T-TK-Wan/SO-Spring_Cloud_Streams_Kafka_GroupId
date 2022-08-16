package com.example.demo;

import org.apache.kafka.streams.kstream.KStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("process")
public class Process implements java.util.function.Consumer<KStream<Object, String>> {

  private static final Logger logger = LoggerFactory.getLogger(Process.class);

  @Override
  public void accept(KStream<Object, String> input) {
    input.foreach((key, value) -> logger.info("Key: " + key + " Value: " + value));
  }

}