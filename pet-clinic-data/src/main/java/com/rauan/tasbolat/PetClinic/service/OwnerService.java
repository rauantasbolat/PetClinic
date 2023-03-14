package com.rauan.tasbolat.PetClinic.service;

import com.rauan.tasbolat.PetClinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();


}
