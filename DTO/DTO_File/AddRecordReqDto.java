package com.example.Dto;

import java.time.LocalDateTime;
import com.example.Entity.User;
import com.example.Entity.Record;
import lombok.Data;

@Data
public class AddRecordReqDto {

    private String mealType;
    private String foodName;
    private int calories;
    private int carbo;
    private int protein;
    private int fat;

    public Record toEntity(User member) {
        return Record.builder()
                .member(member)
                .mealType(this.mealType)
                .foodName(this.foodName)
                .calories(this.calories)
                .carbo(this.carbo)
                .protein(this.protein)
                .fat(this.fat)
                .recordTime(LocalDateTime.now())
                .build();
    }
}