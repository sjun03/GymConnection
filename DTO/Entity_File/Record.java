package com.example.Entity;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Record {
    private Long recordId;
    private User member;
    private String mealType;
    private String foodName;
    private int calories;
    private int carbo;
    private int protein;
    private int fat;
    private LocalDateTime recordTime;
}