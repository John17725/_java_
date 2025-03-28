package com.demo.CRUD.Repositories;

import com.demo.CRUD.Models.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByClientIdentifier(String clientIdentifier);
}
