package com.br.myaddress.controllers;

import com.br.myaddress.dto.AddressResponseDTO;
import com.br.myaddress.integration.services.address.AddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/{cep}")
    public AddressResponseDTO getAddress(
            @PathVariable String cep
    ) {
        return addressService.getAddressByCep(cep);
    }
}
