package guru.springframework.sfgmypetclinic.services;

import guru.springframework.sfgmypetclinic.model.Owner;


/**
 * Created by DW 08/05/20
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
