package net.cilution.sfgpetclinic.services;

import net.cilution.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
