package com.benni.getyourrecipe.network.responses

import com.benni.getyourrecipe.network.model.RecipeNetworkEntity
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface RecipeService {

    @GET("search")
    suspend fun search ( //suspend -- coroutine function
        @Header("Authorization") token: String,
        @Query("page") page: Int,
        @Query("query") query: String
    ): RecipeSeachResponse

    @GET("get")
    suspend fun get(
        @Header("Authorization") token: String,
        @Query("id") id: Int
    ): RecipeNetworkEntity
}