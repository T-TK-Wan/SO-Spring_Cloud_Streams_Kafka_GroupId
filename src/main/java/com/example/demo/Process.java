package com.example.demo;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.stereotype.Component;

@Component("process")
public class Process implements java.util.function.Consumer<KStream<Object, String>> {

  @Override
  public void accept(KStream<Object, String> input) {
    input.foreach((key, value) -> System.out.println("Key: " + key + " Value: " + value));
  }
}


