package com.lucas.dslist.dtos;

import com.lucas.dslist.entities.GameList;

public class GameListDto {

    private Long id;
    private String name;

    public GameListDto() {
    }

    public GameListDto(GameList entity){
        id = entity.getId();
        name = entity.getName();
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
