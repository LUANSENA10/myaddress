package com.br.myaddress.mappers.impl;

import com.br.myaddress.entities.AccessHistory;
import com.br.myaddress.dto.AddressResponseDTO;
import com.br.myaddress.mappers.EntityMapper;
import io.micrometer.common.lang.Nullable;
import org.springframework.stereotype.Component;


@Component("accessEntityMapper")
public class AccessHistoryEntityMapper implements EntityMapper<AccessHistory, AddressResponseDTO> {

    @Override
    public AccessHistory toEntity(AddressResponseDTO dto) {
        return new AccessHistory(
                dto.cep(),
                dto.localidade(),
                dto.complemento(),
                dto.unidade(),
                dto.bairro(),
                dto.localidade(),
                dto.uf(),
                dto.estado(),
                dto.regiao()
        );
    }

    @Override
    public AddressResponseDTO toDTO(@Nullable AccessHistory entity) {
        return new AddressResponseDTO(
                entity.getCep(),
                entity.getLogradouro(),
                entity.getComplemento(),
                entity.getUnidade(),
                entity.getBairro(),
                entity.getLocalidade(),
                entity.getUf(),
                entity.getEstado(),
                entity.getRegiao()
        );
    }
}
