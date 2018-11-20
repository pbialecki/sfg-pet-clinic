package guru.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Paweł on 20.11.2018.
 */
@Getter
@Setter
public class PetType extends BaseEntity{

    private String name;
}
