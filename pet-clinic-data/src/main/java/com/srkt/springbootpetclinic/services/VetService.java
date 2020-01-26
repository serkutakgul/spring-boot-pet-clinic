package com.srkt.springbootpetclinic.services;

import com.srkt.springbootpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(long id);
    Vet save (Vet vet);

    Set<Vet> findAll();
}
