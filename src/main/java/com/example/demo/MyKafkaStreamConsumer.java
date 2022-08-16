package com.example.demo;

import org.apache.kafka.streams.kstream.KStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.util.function.Consumer;

@Component
public class MyKafkaStreamConsumer {

  private static final Logger logger = LoggerFactory.getLogger(MyKafkaStreamConsumer.class);

  @Bean("processThree")
  public static Consumer<KStream<String, String>> process() {
    return input ->
        input.foreach((key, value) -> {
          logger.info("from STREAM: Key= {} , value = {}", key, value);
          // ...
          // my message handling business logic
          // ...
        });
  }
}
