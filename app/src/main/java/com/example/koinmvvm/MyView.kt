package com.example.koinmvvm

import android.content.Context
import android.net.Uri
import android.widget.ImageView

interface MyView {

    fun withImage(context: Context,imageView: ImageView,uri:String)

}