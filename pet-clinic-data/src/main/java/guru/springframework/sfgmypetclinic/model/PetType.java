package guru.springframework.sfgmypetclinic.model;

/**
 * Created by DW 07/29/20
 */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
