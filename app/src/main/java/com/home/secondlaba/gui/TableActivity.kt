package com.home.secondlaba.gui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.home.secondlaba.R
import com.home.secondlaba.api.UsersApiService
import com.home.secondlaba.databinding.ActivityTableActivityBinding
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class TableActivity : AppCompatActivity() {
   lateinit var usersApiService: UsersApiService
    lateinit var binding: ActivityTableActivityBinding
    private val adapter= FilmAdapter()
    private val imageIdList=listOf(
        R.drawable.first,
        R.drawable.second,
        R.drawable.third
    )
    private var index=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTableActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
        configureRetrofit()
    }

    private fun configureRetrofit() {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://reqres.in/api/users?page=2")
            .build()

        val usersService = retrofit.create(UsersApiService::class.java)
        usersApiService=retrofit.create(UsersApiService::class.java)
    }


    private fun init(){
        binding.apply {
            filmView.layoutManager= GridLayoutManager(this@TableActivity,3)
            filmView.adapter=adapter
            buttonAdd.setOnClickListener {

                /*if(index>3) index=0
                val movie=Film(imageIdList[index],"Movie $index")
                adapter.addFilm(movie)
                index++*/


            }
        }
    }
}