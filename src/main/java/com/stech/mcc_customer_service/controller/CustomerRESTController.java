package com.stech.mcc_customer_service.controller;

import com.stech.mcc_customer_service.dto.CustomerDTO;
import com.stech.mcc_customer_service.service.interfaces.ICustomerServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomerRESTController {

  private ICustomerServices iCustomerServices;

  @GetMapping
  public List<CustomerDTO> getAllCustomer() {
    return this.iCustomerServices.getAll();
  }

  @PostMapping
  public CustomerDTO addCustomer(@RequestBody CustomerDTO customerDTO) {
    return this.iCustomerServices.add(customerDTO);
  }

  @GetMapping("/cu/{cu}")
  public CustomerDTO getCustomerByCu(@PathVariable String cu) {
    return this.iCustomerServices.getByCu(cu);
  }
}
