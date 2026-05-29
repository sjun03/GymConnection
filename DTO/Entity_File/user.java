package com.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private String userId;
    private String password;
    private String name;
    private String role; 
    private int ptCount;
    private User trainer;
}