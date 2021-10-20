package com.chb.dao;

import com.chb.entities.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    @Query("Select c from Client c where c.prenomClient =:x")
    public Client consulterClientDao(@Param("x") String prenomClient);

    @Query("Select c from Client c")
    Page<Client> listClient(Pageable pageable);

    @Query("Select c from Client c where c.codeClient =:x")
    public Client findClientByCodeClient(@Param("x") Long codeClient);

    @Query("Select c from Client c where c.coach.nomCoach =:x")
    public List<Client> listClientsDuCoach(@Param("x") String nomCoach);

}
