package com.br.myaddress.integration.services.address;

import com.br.myaddress.dto.AddressResponseDTO;

public interface AddressService {

    AddressResponseDTO getAddressByCep(String cep);
}
