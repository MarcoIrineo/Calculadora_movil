package mx.edu.potros.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var operacion: TextView = findViewById(R.id.operacion)
        var resultado: TextView = findViewById(R.id.resultado)

        var num1: Double=0.0
        var num2: Double=0.0
        var op: Int = 5

        fun numeroPresionado(digito:String){
            operacion.text = "${operacion.text}$digito"
        }



        val n1: Button = findViewById(R.id.nUno)
        val n2: Button = findViewById(R.id.nDos)
        val n3: Button = findViewById(R.id.nTres)
        val n4: Button = findViewById(R.id.nCuatro)
        val n5: Button = findViewById(R.id.nCinco)
        val n6: Button = findViewById(R.id.nSeis)
        val n7: Button = findViewById(R.id.nSiete)
        val n8: Button = findViewById(R.id.nOcho)
        val n9: Button = findViewById(R.id.nNueve)
        val n0: Button = findViewById(R.id.nCero)
        val suma: Button = findViewById(R.id.mas)
        val resta: Button = findViewById(R.id.menos)
        val multi: Button = findViewById(R.id.multiplicacion)
        val division: Button = findViewById(R.id.dividir)
        val borrar: Button = findViewById(R.id.borrar)
        val result: Button = findViewById(R.id.result)

        n1.setOnClickListener{ numeroPresionado("1")}
        n2.setOnClickListener{ numeroPresionado("2")}
        n3.setOnClickListener{ numeroPresionado("3")}
        n4.setOnClickListener{ numeroPresionado("4")}
        n5.setOnClickListener{ numeroPresionado("5")}
        n6.setOnClickListener{ numeroPresionado("6")}
        n7.setOnClickListener{ numeroPresionado("7")}
        n8.setOnClickListener{ numeroPresionado("8")}
        n9.setOnClickListener{ numeroPresionado("9")}
        n0.setOnClickListener{ numeroPresionado("0")}

        suma.setOnClickListener{
            if(num1!=0.0){
                op = 0
            }
            else{
                num1 = operacion.text.toString().toDouble()
                resultado.setText(num1.toString())
                operacion.setText("")
                op = 0
            }

        }
        resta.setOnClickListener{
            if(num1!=0.0){
                op = 1
            }
            else{
                num1 = operacion.text.toString().toDouble()
                resultado.setText(num1.toString())
                operacion.setText("")
                op = 1
            }
        }
        multi.setOnClickListener{
            if(num1!=0.0){
                op = 2
            }
            else{
                num1 = operacion.text.toString().toDouble()
                resultado.setText(num1.toString())
                operacion.setText("")
                op = 2
            }

        }
        division.setOnClickListener{
            if(num1!=0.0){
                op = 3
            }
            else{
                num1 = operacion.text.toString().toDouble()
                resultado.setText(num1.toString())
                operacion.setText("")
                op = 3
            }

        }
        borrar.setOnClickListener{
            num1 = 0.0
            num2 = 0.0
            resultado.setText("")
            operacion.setText("")
            op = 5
        }


        result.setOnClickListener{

            num2 = operacion.text.toString().toDouble()

            when(op){
                0 -> resultado.setText((num1+num2).toString())
                1 -> resultado.setText((num1-num2).toString())
                2 -> resultado.setText((num1*num2).toString())
                3 -> resultado.setText((num1/num2).toString())
            }

            num1 = resultado.text.toString().toDouble()
            num2 = 0.0
            operacion.setText("")
        }
    }
}

