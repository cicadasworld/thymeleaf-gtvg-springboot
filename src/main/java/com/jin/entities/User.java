package com.jin.entities;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class User {

    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String nationality;
    @NonNull
    private int age;

    public String getName() {
        return firstName + " " + lastName;
    }
}
