package com.stech.mcc_customer_service.service.impl;

import com.stech.mcc_customer_service.dto.CustomerDTO;
import com.stech.mcc_customer_service.entity.CustomerEntity;
import com.stech.mcc_customer_service.repository.ICustomerRepository;
import com.stech.mcc_customer_service.service.interfaces.ICustomerServices;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class CustomerServiceImp implements ICustomerServices {

  private ICustomerRepository customerRepository;

  @Override
  public CustomerDTO getByCu(String cu) {
    return null;
  }

  @Override
  public List<CustomerDTO> getAll() {
    return this.customerRepository.findAll().stream().map(CustomerEntity::getDTO).toList();
  }

  @Override
  public CustomerDTO add(CustomerDTO customerDTO) {
    log.info("Add customer {}", customerDTO);
    return null;
  }

  @Override
  public CustomerDTO update(CustomerDTO customerDTO) {
    return null;
  }

  @Override
  public CustomerDTO delete(CustomerDTO customerDTO) {
    return null;
  }

  @Override
  public CustomerDTO getById(String id) {
    return null;
  }
}
