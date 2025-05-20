package com.joseluiz.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseluiz.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
