package com.example.koinmvvm

import android.content.Context
import android.net.ConnectivityManager
import android.widget.ImageView
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.bumptech.glide.Glide

class MyMyViewModel : ViewModel(), MyView {

    override fun withImage(context: Context, imageView: ImageView, uri: String) {
        Glide.with(context)
            .load(uri)
            .into(imageView)


    }



}