package guru.springframework.sfgmypetclinic.services;

import guru.springframework.sfgmypetclinic.model.Vet;

import java.util.Set;

/**
 * Created by DW 08/05/20
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
