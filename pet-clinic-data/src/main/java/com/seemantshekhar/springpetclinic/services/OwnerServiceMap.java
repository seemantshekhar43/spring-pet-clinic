package com.seemantshekhar.springpetclinic.services;

import com.seemantshekhar.springpetclinic.models.Owner;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void DeleteById(Long id) {
         super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }
}