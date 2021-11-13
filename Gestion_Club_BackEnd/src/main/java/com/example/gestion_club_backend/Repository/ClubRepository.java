package com.example.gestion_club_backend.Repository;

import com.example.gestion_club_backend.Model.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClubRepository extends JpaRepository<Club, Long> {
    @Override
    Optional<Club> findById(Long aLong);
}