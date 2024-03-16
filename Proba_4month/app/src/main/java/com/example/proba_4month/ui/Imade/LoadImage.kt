package com.example.proba_4month.ui.Imade

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.proba_4month.R

fun ImageView.loadImage(url:String?){
    Glide.with(this).load(url).placeholder(R.drawable.ic_dollar).into(this)
}