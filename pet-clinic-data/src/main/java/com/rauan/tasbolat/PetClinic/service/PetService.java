package com.rauan.tasbolat.PetClinic.service;


import com.rauan.tasbolat.PetClinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();

}
