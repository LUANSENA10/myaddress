package com.br.myaddress.mappers;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public interface EntityMapper <E, D>{

    E toEntity(D dto);

    D toDTO(E entity);

    default List<D> convertAll(List<E> entityList) {
        return Optional.ofNullable(entityList)
                .orElse(Collections.emptyList())
                .stream()
                .map(this::toDTO)
                .toList();
    }
}
