package com.example.mahadi.frgmtandrcycle.network

import io.reactivex.Observable
import retrofit2.http.GET

interface ApiNetwork {

    @GET("article")
    fun getArtikel(): Observable<ApiResponseArticle>
}