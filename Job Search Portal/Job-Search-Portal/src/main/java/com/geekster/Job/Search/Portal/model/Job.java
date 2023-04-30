package com.geekster.Job.Search.Portal.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Type;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    @NotNull(message = "location name should not be Null..!!")
    @NotEmpty(message = "location name should not be Empty..!!")
    private String location;
    private Double salary;
    @NotNull(message = "companyName name should not be Null..!!")
    @NotEmpty(message = "companyName name should not be Empty..!!")
    private String companyName;
    @NotNull(message = "employerName name should not be Null..!!")
    @NotEmpty(message = "employerName name should not be Empty..!!")
    private String employerName;
    @Enumerated(EnumType.STRING)
    private EnumJobType jobType;
    private LocalDate appliedDate;
}
