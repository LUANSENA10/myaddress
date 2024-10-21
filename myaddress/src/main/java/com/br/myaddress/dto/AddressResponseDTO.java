package com.br.myaddress.dto;

import java.io.Serializable;

public record AddressResponseDTO(
        String cep,
        String logradouro,
        String complemento,
        String unidade,
        String bairro,
        String localidade,
        String uf,
        String estado,
        String regiao
)implements Serializable {
}
