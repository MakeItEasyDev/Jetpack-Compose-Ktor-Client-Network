package com.jetpack.ktornetwork.repository

import com.jetpack.ktornetwork.model.Sample
import com.jetpack.ktornetwork.network.KtorClient
import io.ktor.client.request.*

object SampleRepository {

    suspend fun getSampleDetail(): Sample {
        return KtorClient.httpClient.use {
            it.get("https://reqres.in/api/products/") //here is put the method like GET or POST
        }
    }
}