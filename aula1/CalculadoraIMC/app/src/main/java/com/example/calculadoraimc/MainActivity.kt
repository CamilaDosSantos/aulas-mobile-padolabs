package com.example.calculadoramc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textAltura = findViewById<EditText>(R.id.editAltura)
//        val textIdade = findViewById<EditText>(R.id.editIdade)
        val textPeso = findViewById<EditText>(R.id.editPeso)
        val textIMC = findViewById<TextView>(R.id.textIMC)

        val textDescricao = findViewById<TextView>(R.id.textDescricao)
        val textResultado = findViewById<TextView>(R.id.textResultado)

        val ButtonCalcular = findViewById<Button>(R.id.ButtonCalcular)

//        val mulher = findViewById<Button>(R.id.button2)
//        val homem = findViewById<Button>(R.id.button1)

        val peso = textPeso.text.toString().toDouble()
        val altura = textAltura.text.toString().toDouble() // valor em double valor muito grande
//        val idade = textPeso.text.toString().toInt() // valor interio

        ButtonCalcular.setOnClickListener{
            val imc = (peso / (altura * altura));

            if (imc < 19 ) {
                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                textDescricao.setText ("Baixo peso!");
            } else if(imc > 19 && imc < 24) {
                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                textDescricao.setText ("Peso adequedo :)");
            } else if(imc > 24 && imc < 29 ) {
                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                textDescricao.setText ("Sobre peso!");
            } else if(imc > 29 && imc < 39){
                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                textDescricao.setText ("Obesidade");
            } else if(imc > 39){
                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                textDescricao.setText ("Obesidade Grave!!");
            }
        }
    }




}
