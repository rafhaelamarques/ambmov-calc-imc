package br.com.cotemig.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var altura = findViewById<EditText>(R.id.altura)
        var peso = findViewById<EditText>(R.id.peso)
        var btn = findViewById<Button>(R.id.btncalc)
        var resultado = findViewById<TextView>(R.id.resultado)
        var situacao = findViewById<TextView>(R.id.situacao)

        btn.setOnClickListener {
            var imc: Double
            var p = peso.text.toString().toDouble()
            var a = altura.text.toString().toDouble()

            imc = p / (a * a)
            resultado.text = (Math.round(imc)).toString()

            if (imc <= 17) {
                situacao.text = "Muito abaixo do peso"
            } else if (17 < imc && imc <= 18.49) {
                situacao.text = "Abaixo do peso"
            } else if (18.50 <= imc && imc <= 24.99) {
                situacao.text = "Peso normal"
            } else if (25 <= imc && imc <= 29.99) {
                situacao.text = "Acima do peso"
            } else if (30 <= imc && imc <= 34.99) {
                situacao.text = "Obesidade I"
            } else if (35 <= imc && imc <= 39.99) {
                situacao.text = "Obesidade II (severa)"
            } else {
                situacao.text = "Obesidade III (mórbida)"
            }
        }
    }
}

//Resultado	Situação
//Abaixo de 17	Muito abaixo do peso
//Entre 17 e 18,49	Abaixo do peso
//Entre 18,50 e 24,99	Peso normal
//Entre 25 e 29,99	Acima do peso
//Entre 30 e 34,99	Obesidade I
//Entre 35 e 39,99	Obesidade II (severa)
//Acima de 40	Obesidade III (mórbida)


//when (x) {
//    1 -> print("x == 1")
//    2 -> print("x == 2")
//    else -> {
//        print("x is neither 1 nor 2")
//    }
//}

