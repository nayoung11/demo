package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String engiName;
    private String custName;
    private String systemInfo;
    private String manufacture;
    private String model;
    private String serial;
    private String usg;
    private LocalDateTime svcStartDate;
    private LocalDateTime svcEndDate;
    private LocalDateTime regdate;

}
