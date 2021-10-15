package com.example.worldofmovies

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData

class MovieListRepository(context: Application){
    private val movieListDao: MovieListDao = MovieDatabase.getDatabase(context).movieListDao()

    fun getMovies(): LiveData<List<Movie>> {
        return movieListDao.getMovies()
    }
}