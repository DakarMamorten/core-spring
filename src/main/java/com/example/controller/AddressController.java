package com.example.controller;

import com.example.model.Address;
import com.example.repository.AddressRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AddressController {
	private final AddressRepository addressRepository;

	public AddressController(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}
	@GetMapping("/address")
	public List<Address> findAll(){
		return addressRepository.findAll();
	}
}
