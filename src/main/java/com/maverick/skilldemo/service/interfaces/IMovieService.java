package com.maverick.skilldemo.service.interfaces;

import com.maverick.skilldemo.entity.MovieDetailEntity;

import java.util.List;
import java.util.Optional;

public interface IMovieService {

    void getData();

    MovieDetailEntity saveMovie(MovieDetailEntity movie) ;

    List<MovieDetailEntity> getAllMovies();

    Optional<MovieDetailEntity> getMovieById(Long id);

    void deleteMovie(Long id);
}
