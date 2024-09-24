package com.maverick.skilldemo.service.interfaces;

import com.maverick.skilldemo.dto.Movie;
import com.maverick.skilldemo.dto.MovieDetail;
import com.maverick.skilldemo.dto.mavericktypes.MovieDetailResponse;
import com.maverick.skilldemo.dto.mavericktypes.MovieResponse;
import com.maverick.skilldemo.repository.interfaces.IMovieDetailRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class WebClientService implements IWebClientService {

    @Value("${maverick.baseUrl}")
    private String maverickBaseUrl;

    private final WebClient webClient;

    public WebClientService(IMovieDetailRepository movieRepository) {
        this.webClient = WebClient.create(maverickBaseUrl);
    }

    public List<Movie> findByTitle(String title) {
        return this.webClient.get()
                .uri("/title/"+title+"?source=web")
                .retrieve()
                .bodyToMono(MovieResponse.class)
                .block()
                .data();
    }

    public MovieDetail findByImbId(String imbId) {
        return this.webClient.get()
                .uri("/"+imbId+"?source=web")
                .retrieve()
                .bodyToMono(MovieDetailResponse.class)
                .block()
                .data(); //Assuming the response comes inside data property
    }
}


