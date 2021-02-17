package com.example.offlinemovies.data.remote.model;

import com.example.offlinemovies.data.local.entity.MovieEntity;

import java.util.List;

public class MoviesResponse {
    private List<MovieEntity> results;

    public List<MovieEntity> getResults() {
        return results;
    }

    public void setResults(List<MovieEntity> results) {
        this.results = results;
    }
}
