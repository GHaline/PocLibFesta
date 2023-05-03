package com.example.chocolate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.choco_library.BoloLib
import com.example.choco_library.DialogMesaBolo
import com.example.choco_library.Festa
import com.example.choco_library.MesaBoloLib

class MainActivity : AppCompatActivity() {

    private var festa: Festa = Festa()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setViews()

    }

    private fun setViews() {
        festa.cantarParabens(this, "DENIS", 36)
        festa.exibirMesaBolo( this , mockFesta())

    }

    private fun mockFesta(): MesaBoloLib{
        return MesaBoloLib(mockBolo(),"Lilas", mockDocinhos(), mockEnfeites()

        )
    }

    private fun mockBolo(): BoloLib {

        return BoloLib(
            "Napolitano",
            "Mousse Chocolate" + "Mousse de Morango" + "Mousse d leite Ninho",
            "branca",
            "Chantilly"
        )

    }

    private fun mockDocinhos(): MutableList<String>{
        val docinhos: MutableList<String> = mutableListOf()
        docinhos.add("Brigadeiro")
        docinhos.add("Bejinho")
        docinhos.add("Paçoca")
        docinhos.add("Moranguinho")

        return docinhos
    }

    private fun mockEnfeites(): MutableList<String>{
        val enfeites: MutableList<String> = mutableListOf()

        enfeites.add("Balão Azul")
        enfeites.add("Balão Vermelho")
        enfeites.add("Super Herois")

        return enfeites

    }

}