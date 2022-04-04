package com.example.demo.service;

import com.example.demo.model.CustomerModel;
import com.example.demo.model.dto.CustomerDto;
import com.example.demo.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<CustomerModel> findCustomers() {
        return customerRepository.findAll();
    }

    public void updateCustomerById(Long id, CustomerDto customerDto){

        if(customerDto != null) {

            Optional<CustomerModel> customerOptional = customerRepository.findById(id);
            //Optional은 반복적인 null 체크를 줄임

            if(customerOptional.isPresent()) {
                CustomerModel cst = customerOptional.get();

                if(customerDto.getCustName() != null) {
                    cst.setCustName(customerDto.getCustName());
                }

                if(customerDto.getEngiName() != null) {
                    cst.setEngiName(customerDto.getEngiName());
                }

                if(customerDto.getManufacture() != null) {
                    cst.setManufacture(customerDto.getManufacture());
                }

                if(customerDto.getSerial() != null) {
                    cst.setSerial(customerDto.getSerial());
                }

                if(customerDto.getModel() != null) {
                    cst.setModel(customerDto.getModel());
                }

                if(customerDto.getRegdate() != null) {
                    cst.setRegdate(customerDto.getRegdate());
                }

                if(customerDto.getSvcEndDate() != null) {
                    cst.setSvcEndDate(customerDto.getSvcEndDate());
                }

                if(customerDto.getSvcStartDate() != null) {
                    cst.setSvcStartDate(customerDto.getSvcStartDate());
                }

                if(customerDto.getSystemInfo() != null) {
                    cst.setSystemInfo(customerDto.getSystemInfo());
                }

                if(customerDto.getUsg() != null) {
                    cst.setUsg(customerDto.getUsg());
                }

                customerRepository.save(cst);
            }
        }
    }

    public void insertCustomer(CustomerDto customerDto) {
        CustomerModel customer = customerDto.toEntity();
        customerRepository.save(customer);
    }
}
