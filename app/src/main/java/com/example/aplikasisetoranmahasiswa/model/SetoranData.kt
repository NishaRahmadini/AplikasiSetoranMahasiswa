package com.example.aplikasisetoranmahasiswa.model

import com.google.gson.annotations.SerializedName

data class SetoranData(

    @SerializedName("detail") val detail: List<SuratStatus>?
)