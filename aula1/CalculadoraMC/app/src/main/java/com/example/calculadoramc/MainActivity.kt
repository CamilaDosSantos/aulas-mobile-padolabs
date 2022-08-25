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
        val textIdade = findViewById<EditText>(R.id.editIdade)
        val textPeso = findViewById<EditText>(R.id.editPeso)

        val textDescricao = findViewById<TextView>(R.id.textDescricao)
        val textResultado = findViewById<TextView>(R.id.textResultado)

        val ButtonCalcular = findViewById<Button>(R.id.ButtonCalcular)

        val Mulher = findViewById<Button>(R.id.button2)
        val Homem = findViewById<Button>(R.id.button1)
        var  button = 0;

        Homem.setOnClickListener{
            button = 1;
        }

        Mulher.setOnClickListener{
            button = 2;
        }


        ButtonCalcular.setOnClickListener{
            val peso = textPeso.text.toString().toDouble()
            val altura = textAltura.text.toString().toDouble() // valor em double valor muito grande


            val imc = (peso / (altura * altura));
            if(button == 2){
                  if(imc < 19){
                        textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                        textDescricao.setText ("Peso Normal");

                            if(imc >= 19 && imc <= 24) {
                                textResultado.setText("Seu IMC é: " + imc);// pra acresentar ao texto
                                textDescricao.setText("Baixo peso!!");
                            }
                            else if(imc >= 24 && imc <= 29){
                                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                                textDescricao.setText ("Pré obesidade");
                            }
                            else if(imc >= 30 && imc <= 39){
                                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                                textDescricao.setText ("Obesidade");
                            }
                            else if(imc > 39){
                                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                                textDescricao.setText ("Obesidade grave");
                            }
                    }
                    } else if(imc <= 20){
                            if (imc >= 19 && imc <= 24)  {
                                textResultado.setText("Seu IMC é: " + imc);// pra acresentar ao texto
                                textDescricao.setText("Baixo peso!!");
                            }
                            else if(imc <= 20 && imc >= 25){
                                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                                textDescricao.setText ("Peso Normal");
                            }
                            else if(imc <= 25 && imc >= 30){
                                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                                textDescricao.setText ("Pré obesidade");
                            }
                            else if(imc <= 30 && imc >= 40){
                                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                                textDescricao.setText ("Obesidade");
                            }
                            else if(imc >= 40){
                                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                                textDescricao.setText ("Obesidade grave");
                            }
                    }
                    } else if(imc < 21) {
                            textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                            textDescricao.setText ("Baixo peso!!");

                            if(imc < 21 && imc > 26){
                                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                                textDescricao.setText ("Peso Normal");
                            }
                            else if(imc < 26 && imc > 31){
                                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                                textDescricao.setText ("Pré obesidade");
                            }
                            else if(imc < 31 && imc > 41){
                                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                                textDescricao.setText ("Obesidade");
                            }
                            else if(imc > 41){
                                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                                textDescricao.setText ("Obesidade grave");
                            }
                    }
                    } else if(imc <= 22) {
                            textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                            textDescricao.setText ("Baixo peso!!");
                            if(imc < 22 && imc > 27){
                                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                                textDescricao.setText ("Peso Normal");
                            }
                            else if(imc < 27 && imc > 32){
                                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                                textDescricao.setText ("Pré obesidade");
                            }
                            else if(imc < 32 && imc > 42){
                                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                                textDescricao.setText ("Obesidade");
                            }
                            else if(imc > 42){
                                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                                textDescricao.setText ("Obesidade grave");
                            }
                      }
                      } else if(imc <= 24){
                            textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                            textDescricao.setText ("Baixo peso!!");
                            if(imc < 24 && imc > 29){
                                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                                textDescricao.setText ("Peso Normal");
                            }
                            else if(imc < 29 && imc > 34){
                                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                                textDescricao.setText ("Pré obesidade");
                            }
                            else if(imc < 34 && imc > 44){
                                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                                textDescricao.setText ("Obesidade");
                            }
                            else if(imc > 44){
                                textResultado.setText ("Seu IMC é: " + imc);// pra acresentar ao texto
                                textDescricao.setText ("Obesidade grave");
                            }
                    }
            }
        }
    }
}

