package com.example.koinmvvm

import android.content.Context
import android.net.ConnectivityManager
import android.widget.Toast


class Model(var uri: String) : NotInternet {

    private var defaultImageView : String = "https://lh3.googleusercontent.com/proxy/8vVXmUflneAARAkY-nygVh6thK_JzBd1PKQMOEyaiSe7oNeK2rRsHvrO7c50SdnGjQbGVtF-Fs9C3KbLrc9VUBEe4ikBd1hI6NhnXPrlMVPattIeL7E"

    fun defaultValue() {

        if (uri == "") {
            uri = defaultImageView

        }

    }

    override fun notInternet(context: Context) {
        val info =
            (context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager).activeNetworkInfo

        if (info == null) {
            uri = ""
            Toast.makeText(context, "Not Internet", Toast.LENGTH_SHORT).show()
        }
    }


}
