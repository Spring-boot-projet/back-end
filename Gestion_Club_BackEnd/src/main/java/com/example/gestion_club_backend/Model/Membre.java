package com.example.gestion_club_backend.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Membre {
    @Id
    @Column(name = "code_membre", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code_Membre;


}
