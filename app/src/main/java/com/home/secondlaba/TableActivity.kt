package com.home.secondlaba

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.home.secondlaba.databinding.ActivityTableActivityBinding


class TableActivity : AppCompatActivity() {
    lateinit var binding: ActivityTableActivityBinding
    private val adapter=FilmAdapter()
    private val imageIdList=listOf(
        R.drawable.first,
        R.drawable.second,
        R.drawable.third)
    private var index=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTableActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init(){
        binding.apply {
            filmView.layoutManager= GridLayoutManager(this@TableActivity,3)
            filmView.adapter=adapter
            buttonAdd.setOnClickListener {
                if(index>3) index=0
                val movie=Film(imageIdList[index],"Movie $index")
                adapter.addFilm(movie)
                index++
            }
        }
    }
}