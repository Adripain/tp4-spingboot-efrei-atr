package com.efrei.tp4_efrei_spring;
import jakarta.persistence.*;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;

    private String name;

    private String phone;

    private String category;
    
}