package guru.springframework.sfgmypetclinic.services;

import java.util.Set;

/**
 * Created by DW 08/27/20
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
