package com.example.demo.controller;

import com.example.demo.model.CustomerModel;
import com.example.demo.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class WebController {

    private final CustomerService customerService;

    @GetMapping("/")
    public String get(Model model){

        List<CustomerModel> customerModelList = customerService.findCustomers();

        model.addAttribute("customers", customerModelList);

        return "index.html";
    }
}
