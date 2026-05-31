package com.hstn.validdemo;

import jakarta.validation.constraints.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {


    private String firstName;

    @Size(min = 1, message = "must be at least 2 characters")
    @NotNull(message = "is required")
    private String lastName = "";

    @Min(value = 0, message = "must be greater than or equal to 0")
    @Max(value = 10, message = "must be less than or equal to 10")
    private int freePasses;

}
