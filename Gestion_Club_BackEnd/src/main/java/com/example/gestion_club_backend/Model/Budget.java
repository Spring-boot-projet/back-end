package com.example.gestion_club_backend.Model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Budget {
    @Id
    @Column(name = "budget_id", nullable = false)
    private Long budget_id;
    @ManyToOne
    @JoinColumn(name="club_id", nullable=false)
    Club club;
    float budget;


}
