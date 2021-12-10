package com.example.finalproject.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hero(
    var name: String?,
    var year: String?,
    var image: String?,
    var desc: String?,
    var category: String?

) : Parcelable