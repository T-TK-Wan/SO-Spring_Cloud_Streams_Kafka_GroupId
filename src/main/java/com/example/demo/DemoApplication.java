package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.binder.kafka.properties.KafkaBinderConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	@Primary
	public KafkaBinderConfigurationProperties kafkaBinderConfigurationProperties(KafkaBinderConfigurationProperties properties) {
		// explicitly defining this bean sets the correct functions and values as set in the application.yaml
		// without this, the functions don't seem to be loaded in ( i think)
		// try running this and then commenting it out.
		return properties;
	}

}
