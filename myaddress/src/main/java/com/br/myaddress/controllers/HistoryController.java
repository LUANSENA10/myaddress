package com.br.myaddress.controllers;

import com.br.myaddress.dto.HistoryDTO;
import com.br.myaddress.entities.AccessHistory;
import com.br.myaddress.mappers.EntityMapper;
import com.br.myaddress.repository.AccessHistoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/history")
public class HistoryController {

    @Qualifier("historyDTOMapper")
    private final EntityMapper<AccessHistory, HistoryDTO> dtoEntityMapper;

    private final AccessHistoryRepository repository;

    public HistoryController(EntityMapper<AccessHistory, HistoryDTO> dtoEntityMapper, AccessHistoryRepository repository) {
        this.dtoEntityMapper = dtoEntityMapper;
        this.repository = repository;
    }

    @GetMapping
    public List<HistoryDTO> getHistories() {
        return dtoEntityMapper.convertAll(repository.findAll());
    }
}
