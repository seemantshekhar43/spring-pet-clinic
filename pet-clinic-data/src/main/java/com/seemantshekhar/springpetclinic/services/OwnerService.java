package com.seemantshekhar.springpetclinic.services;

import com.seemantshekhar.springpetclinic.models.Owner;



public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
