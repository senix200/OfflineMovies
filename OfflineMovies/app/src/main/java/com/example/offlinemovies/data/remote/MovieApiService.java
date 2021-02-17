package com.example.offlinemovies.data.remote;

import com.example.offlinemovies.data.remote.model.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiService {

    @GET("movie/popular")
    Call<MoviesResponse> loadPopularMovies(@Query("page") int page);
}
