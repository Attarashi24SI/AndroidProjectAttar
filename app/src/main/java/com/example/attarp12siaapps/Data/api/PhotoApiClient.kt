package com.example.attarp12siaapps.Data.api

import com.example.attarp12siaapps.Data.model.PhotoModel
import retrofit2.http.GET

interface PhotoApiService {
    @GET("list")
    suspend fun getPhotos(): List<PhotoModel>
}