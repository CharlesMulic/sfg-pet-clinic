package net.cilution.sfgpetclinic.model;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass // base class for jpa, don't need this class mapped to database
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
