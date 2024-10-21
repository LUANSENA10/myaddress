package com.br.myaddress.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class AddressNotFoundException extends ResponseStatusException {
    public AddressNotFoundException(String reason) {
        super(HttpStatus.NOT_FOUND, reason);
    }
}