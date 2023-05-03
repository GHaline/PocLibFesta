package com.example.choco_library

import android.content.Context
import android.widget.Toast

class Festa {


    fun cantarParabens(context: Context, nome: String, idade: Int) {

        Toast.makeText(
            context,
            "FELIZ ANIVERSARIO $nome PELO SEUS $idade ANOS DE VIDA!!",
            Toast.LENGTH_LONG
        ).show()
    }

    fun exibirMesaBolo(context: Context, mesa: MesaBoloLib) {

        val dialogMesaBolo = DialogMesaBolo(context)
        dialogMesaBolo.show()
    }
}