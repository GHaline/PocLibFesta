package com.example.choco_library

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.LinearLayout


class DialogMesaBolo(context: Context) : Dialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_mesa_bolo)
    }

    override fun onStart() {
        super.onStart()
        this.window?.setLayout(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
    }

}