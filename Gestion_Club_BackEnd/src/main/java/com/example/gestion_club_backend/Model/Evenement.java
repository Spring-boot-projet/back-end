package com.example.gestion_club_backend.Model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Evenement  {
    @Id
    @Column(name = "event_id", nullable = false)
    private Long event_id;
    String theme;
    Date date;
    String Desciption;
    Float Estimation_Budget;
    String Etat;

  @ManyToMany(mappedBy = "evenements")
  List<Club> ClubAssociés;

    public Long getEvent_id() {
        return event_id;
    }

    public void setEvent_id(Long event_id) {
        this.event_id = event_id;
    }

}
