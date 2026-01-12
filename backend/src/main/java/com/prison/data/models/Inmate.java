package com.prison.data.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "inmates")
public class Inmate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String inmateNumber;
    private String firstName;
    private String lastName;
    private String gender;
    private String status;

}