package com.rauan.tasbolat.PetClinic.service;

import com.rauan.tasbolat.PetClinic.model.Owner;
import com.rauan.tasbolat.PetClinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();

}
