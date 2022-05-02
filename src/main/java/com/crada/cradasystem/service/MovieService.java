package com.crada.cradasystem.service;

import com.crada.cradasystem.model.Movie;

import java.util.List;

public interface MovieService {
     Movie saveMovie(Movie movie);
     List<Movie> getAllMovies();
     Movie get(Integer id);
     Movie save (Movie movie);
     void delete (Integer id);
    }