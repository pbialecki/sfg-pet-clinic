package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by Paweł on 20.11.2018.
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
