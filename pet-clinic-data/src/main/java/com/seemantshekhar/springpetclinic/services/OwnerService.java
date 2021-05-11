package com.seemantshekhar.springpetclinic.services;

import com.seemantshekhar.springpetclinic.models.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
