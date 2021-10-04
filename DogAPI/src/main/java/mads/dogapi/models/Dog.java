package mads.dogapi.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="dogs")
@Entity
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long dog_id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String race;

    @Column
    private boolean gender;

}
