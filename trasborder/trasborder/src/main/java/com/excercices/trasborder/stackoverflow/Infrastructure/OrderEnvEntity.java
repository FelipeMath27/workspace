package com.excercices.trasborder.stackoverflow.Infrastructure;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderEnvEntity {
    @Id
    private long id;
    private String description;

    @ManyToOne
    @JoinColumn(name = "clientEntity_id")
    @JsonBackReference
    private ClientEntity clientEntity;
}
