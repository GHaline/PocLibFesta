package com.example.choco_library

data class MesaBoloLib(
    val bolo : BoloLib,
    val toalha : String,
    val listaDocinhos: MutableList<String>,
    val listaEnfeites: MutableList<String>

)
