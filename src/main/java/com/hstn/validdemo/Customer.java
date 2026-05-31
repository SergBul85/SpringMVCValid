package com.hstn.validdemo;

import com.hstn.validdemo.validation.CourseCode;
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

    @NotNull(message = "is required")
    @Min(value = 0, message = "must be greater than or equal to 0")
    @Max(value = 10, message = "must be less than or equal to 10")
    private Integer freePasses;

    //@NotNull(message = "is required")
    @Pattern(regexp = "^[A-Za-z0-9]{5}", message = "only 5 chars")
    private String postalCode;

    @CourseCode //(value = "LUV", message = "must starts with LUV")
    private String courseCode;

}
