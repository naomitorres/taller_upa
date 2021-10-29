package com.example.myapplication.data.model

import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize
import kotlinx.android.parcel.Parcelize

data class Coordenadas (
    val lon : Double,
    var lat : Double
        ) : Parcelable