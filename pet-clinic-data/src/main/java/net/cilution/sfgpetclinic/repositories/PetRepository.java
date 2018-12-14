package net.cilution.sfgpetclinic.repositories;

import net.cilution.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
