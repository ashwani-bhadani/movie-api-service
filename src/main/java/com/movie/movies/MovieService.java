package com.movie.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> findByImdbId(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
    public Optional<Movie> findByObjectId(ObjectId id) {
        return movieRepository.findById(id);
    }

}
