package org.yourcompany.yourproject.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class Meal {
    private Long mealId;
    private User member;
    private LocalDate targetDate;
    private int targetCalories;
    private int targetCarbo;
    private int targetProtein;
    private int targetFat;
}