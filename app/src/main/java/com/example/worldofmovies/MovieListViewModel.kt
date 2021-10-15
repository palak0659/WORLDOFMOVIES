package com.example.worldofmovies

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class MovieListViewModel(application: Application): AndroidViewModel(application){
    private val repo: MovieListRepository =
        MovieListRepository(application)

    val movies: LiveData<List<Movie>> = repo.getMovies()
}