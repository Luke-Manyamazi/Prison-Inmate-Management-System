package com.prison.data.repository;

import com.prison.data.models.Inmate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InmateRepository extends JpaRepository<Inmate, Long> {
}