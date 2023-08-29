package com.josuejs23.springboot.thymeleafdemo;

import com.josuejs23.springboot.thymeleafdemo.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "Is required!")
    @Size(min = 1, message = "Must be 1 or greater!")
    private String lastName;

    @NotNull(message = "Value is required")
    @Min(value=0, message="Must be equal or greater than zero")
    @Max(value=10, message="Must be equal or less than then")
    private Integer freeTickets;

    @Pattern(regexp = "^[A-Za-z0-9]{5}", message = "Must have five chars/digits")
    private String codePostal;

    @CourseCode(value = "LUV", message = "You silly, the code must start with LUV")
    private String code;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreeTickets() {
        return freeTickets;
    }

    public void setFreeTickets(Integer freeTickets) {
        this.freeTickets = freeTickets;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
