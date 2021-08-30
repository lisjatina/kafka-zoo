package com.kafkaZoo.kafkazoo;

import com.kafkaZoo.kafkazoo.domain.UserDto;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@EnableKafka
public class KafkaZooApplication {

	@KafkaListener(topics="msg")
	public void orderListener(ConsumerRecord<Long, UserDto> record){
		System.out.println(record.partition());
		System.out.println(record.key());
		System.out.println(record.value());
	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaZooApplication.class, args);
	}

}
