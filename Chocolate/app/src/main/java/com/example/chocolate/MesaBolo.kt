package com.example.chocolate

import com.example.choco_library.BoloLib

data class MesaBolo(
    val bolo : Bolo,
    val toalha : String,
    val listaDocinhos: MutableList<String>,
    val listaEnfeites: MutableList<String>
)
