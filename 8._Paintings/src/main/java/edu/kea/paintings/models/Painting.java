package edu.kea.paintings.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "paintings")
public class Painting {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long painting_id;

    @Column
    private String artist;

    @Column
    private double price;

    @Column
    private String title;

    @Column
    private String genre;

    @Column
    private int year;

}
