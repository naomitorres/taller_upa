package com.example.myapplication.data.model

import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize

data class Coordenadas (
    val lon : Double,
    var lat : Double
        ) : Parcelable