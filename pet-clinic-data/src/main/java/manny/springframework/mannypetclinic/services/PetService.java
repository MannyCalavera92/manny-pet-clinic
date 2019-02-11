package manny.springframework.mannypetclinic.services;

import manny.springframework.mannypetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
