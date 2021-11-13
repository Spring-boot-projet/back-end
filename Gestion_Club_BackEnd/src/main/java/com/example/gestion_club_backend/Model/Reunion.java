package com.example.gestion_club_backend.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Reunion {
    @Id
    @Column(name = "reunion_id", nullable = false)
    private Long reunion_id;

    @ManyToOne()
    Club club;
}
