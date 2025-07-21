package com.testshop.webapp.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.testshop.webapp.model.Utenti;

public interface UtentiRepository extends MongoRepository<Utenti, String>
{
    public Utenti findByUserId(String UserId);
}
