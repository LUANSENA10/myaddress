package com.br.myaddress.mappers.impl;

import com.br.myaddress.dto.HistoryDTO;
import com.br.myaddress.entities.AccessHistory;
import com.br.myaddress.mappers.EntityMapper;
import org.springframework.stereotype.Component;

@Component("historyDTOMapper")
public class HistoryDTOMapper implements EntityMapper<AccessHistory, HistoryDTO> {

    @Override
    public HistoryDTO toDTO(AccessHistory entity) {
        return new HistoryDTO(
                entity.getCep(),
                entity.getLogradouro(),
                entity.getComplemento(),
                entity.getUnidade(),
                entity.getBairro(),
                entity.getLocalidade(),
                entity.getUf(),
                entity.getEstado(),
                entity.getRegiao(),
                entity.getCreationTimeDate()
        );
    }

    @Override
    public AccessHistory toEntity(HistoryDTO dto) {
        return null;
    }
}
