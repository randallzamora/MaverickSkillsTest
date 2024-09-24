package com.maverick.skilldemo.repository.interfaces;

import com.maverick.skilldemo.entity.MovieDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMovieDetailRepository extends JpaRepository<MovieDetailEntity, Long> {
}


