package com.lucas.dslist.services;

import com.lucas.dslist.dtos.GameMinDto;
import com.lucas.dslist.entities.Game;
import com.lucas.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll(){
       List<Game> result = gameRepository.findAll();
       return result.stream().map(x -> new GameMinDto(x)).toList();
    }
}
