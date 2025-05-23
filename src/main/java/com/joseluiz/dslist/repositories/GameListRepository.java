package com.joseluiz.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseluiz.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
