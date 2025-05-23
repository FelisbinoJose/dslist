package com.joseluiz.dslist.dto;

import com.joseluiz.dslist.entities.GameList;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO() {

    }

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getname();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}