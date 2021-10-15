package com.example.worldofmovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface MovieDetailDao {
    @Query("SELECT * FROM movie WHERE `id` = :id")
    fun getMovie(id: Long): LiveData<Movie>
}