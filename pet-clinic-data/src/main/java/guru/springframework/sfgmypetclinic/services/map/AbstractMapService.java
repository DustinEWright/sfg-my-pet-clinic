package guru.springframework.sfgmypetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by DW 08/27/20
 */

public abstract class AbstractMapService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }
}
