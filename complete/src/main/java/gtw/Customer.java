package gtw;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="customer")
@Data public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surName;
    private String address;
}
