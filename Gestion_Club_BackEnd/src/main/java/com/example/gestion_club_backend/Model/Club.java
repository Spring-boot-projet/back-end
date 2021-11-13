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
public class Club {
    @Id
    @Column(name = "Club_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String Club_Name;
    String Mission;
    String Signature;
    @ManyToMany
    @JoinTable(
            name = "Evenements",
            joinColumns = @JoinColumn(name = "Club_id"),
            inverseJoinColumns = @JoinColumn(name = "Evenement_id"))
    List<Evenement> evenements;

    @OneToMany(mappedBy="club")
    List<Budget> budget;

    @OneToMany(mappedBy = "club")
    List<Reunion> reunion;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Club club = (Club) o;
        return id != null && Objects.equals(id, club.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }


}
