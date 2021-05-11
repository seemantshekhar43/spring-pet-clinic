package com.seemantshekhar.springpetclinic.services;

import com.seemantshekhar.springpetclinic.models.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
