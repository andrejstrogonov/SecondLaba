package com.home.secondlaba.data

import com.home.secondlaba.api.UsersApiService
import io.reactivex.Single

class UsersController:UsersApiService {


    override fun discoverAllUsers(): Single<UserListResponse> {
        TODO()
    }
}