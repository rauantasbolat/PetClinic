package com.rauan.tasbolat.PetClinic.service;

import com.rauan.tasbolat.PetClinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);



}
