package guru.springframework.sfgmypetclinic.services;

import guru.springframework.sfgmypetclinic.model.Pet;

import java.util.Set;

/**
 * Created by DW 08/05/20
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
