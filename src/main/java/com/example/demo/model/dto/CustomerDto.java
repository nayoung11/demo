package com.example.demo.model.dto;

import com.example.demo.model.CustomerModel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CustomerDto {
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

    public CustomerModel toEntity() {
        return new CustomerModel(
                null,
                engiName,
                custName,
                systemInfo,
                manufacture,
                model,
                serial,
                usg,
                svcStartDate,
                svcEndDate,
                regdate
                );
    }
}
