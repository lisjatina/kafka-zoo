package com.kafkaZoo.kafkazoo.domain;

import lombok.Data;

@Data
public class UserDto {
    private Long age;
    private String name;
    private Address address;
}
