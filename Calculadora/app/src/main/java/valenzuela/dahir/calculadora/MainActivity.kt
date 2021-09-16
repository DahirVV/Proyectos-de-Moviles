package valenzuela.dahir.calculadora

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    var num1: Double = 0.0
    var num2: Double = 0.0
    var operacion: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button9: Button = findViewById(R.id.button9)
        val button8: Button = findViewById(R.id.button8)
        val button7: Button = findViewById(R.id.button7)
        val button6: Button = findViewById(R.id.button6)
        val button5: Button = findViewById(R.id.button5)
        val button4: Button = findViewById(R.id.button4)
        val button3: Button = findViewById(R.id.button3)
        val button2: Button = findViewById(R.id.button2)
        val button1: Button = findViewById(R.id.button1)
        val button0: Button = findViewById(R.id.button0)
        val suma: Button = findViewById(R.id.suma)
        val mult: Button = findViewById(R.id.multiplicacion)
        val div: Button = findViewById(R.id.divicion)
        val rest: Button = findViewById(R.id.resta)
        val result: Button = findViewById(R.id.resultado)
        val ellim: Button = findViewById(R.id.eliminar)

        button0.setOnClickListener(){
            numerocadena("0")
        }
        button1.setOnClickListener(){
            numerocadena("1")
        }
        button2.setOnClickListener(){
            numerocadena("2")
        }
        button3.setOnClickListener(){
            numerocadena("3")
        }
        button4.setOnClickListener(){
            numerocadena("4")
        }
        button5.setOnClickListener(){
            numerocadena("5")
        }
        button6.setOnClickListener(){
            numerocadena("6")
        }
        button7.setOnClickListener(){
            numerocadena("7")
        }
        button8.setOnClickListener(){
            numerocadena("8")
        }
        button9.setOnClickListener(){
            numerocadena("9")
        }
        suma.setOnClickListener(){
            operaciones(SUMA)
        }
        rest.setOnClickListener(){
            operaciones(RESTA)
        }
        div.setOnClickListener(){
            operaciones(DIVIVION)
        }
        mult.setOnClickListener(){
            operaciones(MULTIPLICACION)
        }
        result.setOnClickListener(){
            operaciones(RESULTADO)
        }
        ellim.setOnClickListener(){

        }
    }

    fun numerocadena(numero:String){
        val calculo1: TextView = findViewById(R.id.calculo1)
        calculo1.text = "${calculo1.text}$numero"
    }
    fun operaciones(operacion: Int){
        val calculo1: TextView = findViewById(R.id.calculo1)
        val calculo2: TextView = findViewById(R.id.calculo2)
        if (num1 == 0.0){
            num1 = calculo1.text.toString().toDouble()
            if (operacion == 1){
                calculo2.text = "${calculo1.text} +"
                calculo1.text = "0"
            }
            if (operacion == 2){
                num1 = calculo1.toString().toDouble()
                calculo2.text = "${calculo1.text} -"
                calculo1.text = "0"
            }
            if (operacion == 3){
                num1 = calculo1.toString().toDouble()
                calculo2.text = "${calculo1.text} *"
                calculo1.text = "0"
            }
            if (operacion == 4){
                num1 = calculo1.toString().toDouble()
                calculo2.text = "${calculo1.text} /"
                calculo1.text = "0"
            }
        }
        if (num1 != 0.0 && operacion != 5){
            num2 = calculo1.text.toString().toDouble()
            if (operacion == 1){
                num1 += num2
                calculo2.text = "$num1 +"
                calculo1.text = "0"
            }
            if (operacion == 2){
                num1 -= num2
                calculo2.text = "$num1 -"
                calculo1.text = "0"
            }
            if (operacion == 3){
                num1 *= num2
                calculo2.text = "$num1 *"
                calculo1.text = "0"
            }
            if (operacion == 4){
                num1 /= num2
                calculo2.text = "$num1 /"
                calculo1.text = "0"
            }
        }
        if (num1 != 0.0 && operacion == 5){
            calculo1.text = "$num1"
            calculo2.text = "Resultado"
        }

    }
    companion object{
        const val SUMA = 1
        const val RESTA = 2
        const val MULTIPLICACION = 3
        const val DIVIVION = 4
        const val RESULTADO = 5
    }
}