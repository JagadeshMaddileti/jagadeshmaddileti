package com.springdemo.mvc;



import javax.validation.constraints.*;
import java.util.LinkedHashMap;

public class Student {
    @NotNull(message="is required")
    @Size(min=2,message="is required")
    @Pattern(regexp = "^[a-zA-Z]+$",message="Not a valid first name")
    private String firstName;
    @Pattern(regexp = "^[a-zA-Z]+$",message="Not a valid last name")
    private String lastName;
    @Max(value=24,message="Age should be less than or equal to 24")
    @Min(value=18,message="Age should be greater than or equal to 18")
    @NotNull(message="is required")
    private Integer age;
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$",message = "Enter valid email")
    private String email;
    private LinkedHashMap<String, String> countryOptions;
    private String country;
    private String gender;
    private String[] language;
    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    @CourseCode
    private String courseCode;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Student() {
     countryOptions = new LinkedHashMap<>();
     countryOptions.put("IND","India");
     countryOptions.put("DNK","Denmark");
     countryOptions.put("LKA","Sri Lanka");
     countryOptions.put("AFG","Afghanistan");
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getLanguage() {
        return language;
    }

    public void setLanguage(String[] language) {
        this.language = language;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
