package com.excercices.trasborder.stackoverflow.Infrastructure;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class ClientEntity {
    @Id
    private Long id;
    private String name;

    @OneToMany(mappedBy = "clientEntity", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<OrderEnvEntity> orderEnvEntities;
}
