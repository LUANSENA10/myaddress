package com.br.myaddress.repository;

import com.br.myaddress.entities.AccessHistory;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessHistoryRepository extends JpaRepository<AccessHistory, UUID> {
}
