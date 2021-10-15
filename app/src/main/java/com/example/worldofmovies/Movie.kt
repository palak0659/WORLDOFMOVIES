package com.example.worldofmovies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.room.ColumnInfo
import java.util.*
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "movie")
data class Movie(
    @PrimaryKey
    val id: Long,

    val title: String,

    @ColumnInfo(name = "poster_path")
    @SerializedName("poster_path")
    val posterPath: String,

    @ColumnInfo(name = "backdrop_path")
    @SerializedName("backdrop_path")
    val backdropPath: String,

    val overview: String,

    @ColumnInfo(name = "release_date")
    @SerializedName("release_date")
    val releaseDate: Date
)