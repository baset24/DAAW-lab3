package com.car_management.car_owner.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="Car")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter@Getter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carId")
    private Long carId;

    @Column(name = "name")
    private String name;

    @Column(name = "model")
    private String model;

    @Column(name = "year")
    private Integer year;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ownerID", referencedColumnName = "ownerID")
    @JsonIgnoreProperties("Car")
    private Owner owner;


}


