package com.car_management.car_owner.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "owner")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ownerId")
    private Long ownerId;

    @Column(name = "fname")
    private String f_name;

    @Column(name = "lname")
    private String l_name;

    @Column(name = "address")
    private String address;

    @OneToOne(mappedBy = "owner")
    private Car car;

}
