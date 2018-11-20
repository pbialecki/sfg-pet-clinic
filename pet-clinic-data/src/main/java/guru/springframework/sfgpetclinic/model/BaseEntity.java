package guru.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by Paweł on 20.11.2018.
 */
@Getter
@Setter
public class BaseEntity implements Serializable{

    private Long id;

}
