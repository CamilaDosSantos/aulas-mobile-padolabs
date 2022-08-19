package com.example.helloword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editNome = findViewById<EditText>(R.id.editNome)
        val txtMensagem = findViewById<TextView>(R.id.txtMensagem)
        val btnOk = findViewById<Button>(R.id.btnOk)

        btnOk.setOnClickListener {    // quando meu botao for clicado vai verificar

            if(editNome.text.isEmpty()){ // quando apertar no botão sem escrever na barra
                txtMensagem.text = "Por favor informe seu nome!!!"
            }else{// quando apertar no botão depois que escrever na barra
                txtMensagem.text = "Olá" + editNome.text.trim() + ", seja bem vindo ao mundo mobile"
            }
        }
    }
}