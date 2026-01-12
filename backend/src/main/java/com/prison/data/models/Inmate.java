package com.prison.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "inmates")
public class Inmate {
    @Id
    private Long id;

}