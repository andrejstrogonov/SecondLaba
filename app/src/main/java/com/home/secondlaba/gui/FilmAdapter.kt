package com.home.secondlaba.gui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.home.secondlaba.R
import com.home.secondlaba.databinding.FilmItemBinding

class FilmAdapter:RecyclerView.Adapter<FilmAdapter.FilmHolder>() {
    val filmList=ArrayList<Film>()
    class FilmHolder(item:View):RecyclerView.ViewHolder(item) {
        val binding=FilmItemBinding.bind(item)
        fun bind(film: Film)= with(binding){
            im.setImageResource(film.imageId)
            filmTitle.text=film.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmHolder {
       val view=LayoutInflater.from(parent.context).inflate(R.layout.film_item,parent,false)
        return FilmHolder(view)
    }

    override fun onBindViewHolder(holder: FilmHolder, position: Int) {
        holder.bind(filmList[position])
    }

    override fun getItemCount(): Int {
       return filmList.size
    }
    fun addFilm(film: Film){
        filmList.add(film)
        notifyDataSetChanged()
    }
}