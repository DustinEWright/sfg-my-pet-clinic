package guru.springframework.sfgmypetclinic.services;

import guru.springframework.sfgmypetclinic.model.Owner;

import java.util.Set;

/**
 * Created by DW 08/05/20
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
