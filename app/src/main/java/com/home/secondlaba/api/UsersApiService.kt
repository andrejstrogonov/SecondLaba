package com.home.secondlaba.api

import com.home.secondlaba.data.UserListResponse
import io.reactivex.Single
import retrofit2.http.GET
interface UsersApiService {
    @GET("api/users?page=2")
    fun discoverAllUsers():Single<UserListResponse>
}