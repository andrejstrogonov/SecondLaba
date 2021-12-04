package com.home.secondlaba.data

import com.google.gson.annotations.SerializedName

data class UserListResponse(val data:List<UsersListItem>) {
    data class UsersListItem(
        @SerializedName("id")
        val id:Int,
        @SerializedName("email")
        val mail:String,
        @SerializedName("first_name")
        val name:String,
        @SerializedName("last_name")
        val surname:String
    )

}
