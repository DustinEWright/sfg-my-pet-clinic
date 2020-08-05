package guru.springframework.sfgmypetclinic.model;

import java.io.Serializable;

/**
 * Created by DW 08/02/20
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
