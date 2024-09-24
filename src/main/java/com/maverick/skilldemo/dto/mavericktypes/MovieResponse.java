package com.maverick.skilldemo.dto.mavericktypes;

import com.maverick.skilldemo.dto.Movie;

import java.util.List;

public record MovieResponse(List<Movie> data) {
}
