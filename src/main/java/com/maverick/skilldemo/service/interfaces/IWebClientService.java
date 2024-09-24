package com.maverick.skilldemo.service.interfaces;

import com.maverick.skilldemo.dto.Movie;
import com.maverick.skilldemo.dto.MovieDetail;

import java.util.List;

public interface IWebClientService {

    List<Movie> findByTitle(String title);

    MovieDetail findByImbId(String imbId);
}
