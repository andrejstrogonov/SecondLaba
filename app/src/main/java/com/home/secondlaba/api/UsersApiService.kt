package com.home.secondlaba.api

import com.home.secondlaba.data.UserListResponse
import retrofit2.http.GET
interface UsersApiService {
    @GET("api/users?page=2")
    fun quequeAllUsers(): ArrayList<UserListResponse>
}