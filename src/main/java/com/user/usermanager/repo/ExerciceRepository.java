package com.user.usermanager.repo;

import com.user.usermanager.model.Exercice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ExerciceRepository extends JpaRepository<Exercice,Integer> {


    Optional<Exercice> findExerciceById(Long id);

}
