package com.example.serviceorder.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class Problem {

    private Integer status;
    private String message;
    private LocalDateTime date;
    private List<Field> fields;
}
