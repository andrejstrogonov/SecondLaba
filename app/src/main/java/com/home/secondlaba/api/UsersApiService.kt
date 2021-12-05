package com.home.secondlaba.api

import com.home.secondlaba.data.UserListResponse
import io.reactivex.Single
import retrofit2.http.GET
interface UsersApiService {
    @GET("https://reqres.in/api/users?page=2")
    fun discoverAllUsers():Single<UserListResponse>
}