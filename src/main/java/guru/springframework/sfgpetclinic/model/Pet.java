package guru.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Created by Paweł on 20.11.2018.
 */
@Getter
@Setter
public class Pet {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

}
