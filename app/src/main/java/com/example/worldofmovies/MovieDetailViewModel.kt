package com.example.worldofmovies

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class MovieDetailViewModel(id: Long, application: Application): ViewModel(){
    private val repo: MovieDetailRepository =
        MovieDetailRepository(application)

    val movie: LiveData<Movie> =
        repo.getMovie(id)
}