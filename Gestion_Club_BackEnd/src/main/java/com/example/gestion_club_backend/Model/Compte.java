package com.example.gestion_club_backend.Model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Compte {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.)
    private Long id_Compte;
    String Nom_Complet;
    String Civilité;
    String Nationalité;
    String Ville_Origine;
    String Telephone;
    String Email;
    String Filiére;
    int Niveau;
    Boolean Resident_Campus;
    List<Evenement> evenements ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Compte compte = (Compte) o;
        return id_Compte != null && Objects.equals(id_Compte, compte.id_Compte);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
