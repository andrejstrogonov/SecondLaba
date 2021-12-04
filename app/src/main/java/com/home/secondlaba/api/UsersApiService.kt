package com.home.secondlaba.api

import com.home.secondlaba.data.UserListResponse
import retrofit2.http.GET
import io.reactivex.Single
interface UsersApiService {
    @GET("./api/users?page=2")
    fun discoverAllUsers():Single<UserListResponse>
}