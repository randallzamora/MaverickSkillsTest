package com.maverick.skilldemo.controller;

import com.maverick.skilldemo.dto.Movie;
import com.maverick.skilldemo.dto.MovieDetail;
import com.maverick.skilldemo.service.interfaces.IWebClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    private final IWebClientService webClientService;

    public MovieController(IWebClientService webClientService) {
        this.webClientService = webClientService;
    }

    @GetMapping(value = "/movie/title/{title}")
    @ResponseStatus(HttpStatus.OK)
    public List<Movie> findByTittle(@PathVariable("title") String title) {
        return webClientService.findByTitle(title);
    }

    @GetMapping(value = "/movie/{imbId}")
    @ResponseStatus(HttpStatus.OK)
    public MovieDetail findByImbId(@PathVariable("imbId") String imbId) {
        return webClientService.findByImbId(imbId);
    }


}

