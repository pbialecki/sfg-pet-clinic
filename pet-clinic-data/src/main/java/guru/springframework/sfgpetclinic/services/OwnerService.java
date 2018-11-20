package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * Created by Paweł on 20.11.2018.
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
