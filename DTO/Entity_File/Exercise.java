package com.example.Entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Exercise {
    private Long exerciseId;
    private User member;
    private LocalDate targetDate;
    private String exerciseName;
    private int targetCalories;
}