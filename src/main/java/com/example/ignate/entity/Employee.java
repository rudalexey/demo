package com.example.ignate.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@Builder
public class Employee implements Serializable {
    private String id;
    private String name;
}
