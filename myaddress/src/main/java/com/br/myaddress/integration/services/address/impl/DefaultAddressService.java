package com.br.myaddress.integration.services.address.impl;

import com.br.myaddress.dto.AddressResponseDTO;
import com.br.myaddress.exceptions.AddressNotFoundException;
import com.br.myaddress.integration.services.address.AddressService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

@Service
public class DefaultAddressService implements AddressService {


    @Value("${integration.service.search.address}")
    private String url;

    @Value("${local.server.port}")
    private int port;

    @Override
    public AddressResponseDTO getAddressByCep(String cep) {
        Mono<AddressResponseDTO> response = getClient()
                .method(HttpMethod.GET)
                .uri(uriBuilder ->
                        uriBuilder
                                .port(port)
                                .path("/address/{cep}")
                                .build(cep)
                )
                .retrieve()
                .bodyToMono(AddressResponseDTO.class)
                .onErrorMap(
                        WebClientResponseException.NotFound.class, ex -> new AddressNotFoundException("Address Not Fund")
                );
        return response.block();
    }

    protected WebClient getClient() {
        return WebClient.create(this.url);
    }
}
