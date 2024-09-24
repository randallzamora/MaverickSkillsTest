package com.maverick.skilldemo.service.interfaces;

import com.maverick.skilldemo.dto.Movie;
import com.maverick.skilldemo.entity.MovieDetailEntity;
import com.maverick.skilldemo.repository.interfaces.IMovieDetailRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService implements IMovieService {

    private IMovieDetailRepository movieDetailRepository;
    private IWebClientService webClientService;

    public MovieService(IMovieDetailRepository movieDetailRepository, IWebClientService webClientService) {
        this.movieDetailRepository = movieDetailRepository;
        this.webClientService = webClientService;
    }

    public void getData(){

        String[] movies = {"Movie1", "Movie3", "Movie3", "Movie4", "Movie5"};

        for (String title : movies) {
            var moviesResponse = webClientService.findByTitle(title);
            for(Movie movie : moviesResponse){
                var movieDetailResponse = webClientService.findByImbId(movie.getImbId());
                //saveMovie(movieDetailResponse);
            }
        }

    }

    public MovieDetailEntity saveMovie(MovieDetailEntity movie) {
        return movieDetailRepository.save(movie);
    }

    public List<MovieDetailEntity> getAllMovies() {
        return movieDetailRepository.findAll();
    }

    public Optional<MovieDetailEntity> getMovieById(Long id) {
        return movieDetailRepository.findById(id);
    }

    public void deleteMovie(Long id) {
        movieDetailRepository.deleteById(id);
    }
}


