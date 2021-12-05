package com.home.secondlaba.data

import com.home.secondlaba.api.UsersApiService
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class UsersController:UsersApiService {
    val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://reqres.in/api/users?page=2")
        .build()

    val usersService = retrofit.create(UsersApiService::class.java)
    override fun discoverAllUsers(): Single<UserListResponse> {
        TODO("Not yet implemented")
    }
}