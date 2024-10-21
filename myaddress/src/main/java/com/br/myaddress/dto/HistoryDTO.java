package com.br.myaddress.dto;

import java.io.Serializable;
import java.time.Instant;

public record HistoryDTO(
        String cep,
        String logradouro,
        String complemento,
        String unidade,
        String bairro,
        String localidade,
        String uf,
        String estado,
        String regiao,
        Instant creationTimeDate
)implements Serializable {
}
