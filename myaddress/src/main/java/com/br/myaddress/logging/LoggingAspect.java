package com.br.myaddress.logging;

import com.br.myaddress.dto.AddressResponseDTO;
import com.br.myaddress.entities.AccessHistory;
import com.br.myaddress.mappers.EntityMapper;
import com.br.myaddress.repository.AccessHistoryRepository;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Qualifier("accessEntityMapper")
    private final EntityMapper<AccessHistory, AddressResponseDTO> historyEntityMapper;

    private final AccessHistoryRepository repository;

    public LoggingAspect(AccessHistoryRepository repository, EntityMapper<AccessHistory, AddressResponseDTO> historyEntityMapper) {
        this.repository = repository;
        this.historyEntityMapper = historyEntityMapper;
    }

    @Pointcut("execution(* com.br.myaddress.integration.services.address.impl.*.*(..))")
    public void anyServiceMethod() {
    }

    @AfterReturning(pointcut = "anyServiceMethod()", returning = "returnValue")
    public void logReturnValue(Object returnValue) {

        if (returnValue instanceof AddressResponseDTO addressResponseDTO) {
            repository.save(historyEntityMapper.toEntity(addressResponseDTO));
        }
    }
}
