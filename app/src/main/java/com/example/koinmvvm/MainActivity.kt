package com.example.koinmvvm

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RemoteViewsService
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var myViewModel: MyMyViewModel
    lateinit var button: Button
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.ivImage)
        button = findViewById(R.id.addImagee)


        val model =
            Model("")


        myViewModel = ViewModelProvider(this).get(MyMyViewModel::class.java)

        button.setOnClickListener {
            model.defaultValue()
            model.notInternet(this)
            myViewModel.withImage(this, imageView, model.uri)

        }


    }

}