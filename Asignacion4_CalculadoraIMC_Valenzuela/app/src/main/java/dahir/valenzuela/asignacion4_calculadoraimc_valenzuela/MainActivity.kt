package dahir.valenzuela.asignacion4_calculadoraimc_valenzuela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //variables

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weight: EditText = findViewById<EditText>(R.id.Weight)
        val height: EditText = findViewById<EditText>(R.id.height)
        val button: Button = findViewById<Button>(R.id.button)
        val imc: TextView = findViewById<TextView>(R.id.imc)
        val range: TextView = findViewById<TextView>(R.id.range)

        button.setOnClickListener{
            val rp : Double = weight.text.toString().toDouble()
            val ra : Double = height.text.toString().toDouble()
            val r : Double = rp / (ra*ra)
            if (r < 18.5){
                range.text = "Bajo Peso"
            }
            if(r > 18.5 && r < 24.9){
                range.text = "Normal"
        }
            if(r > 25 && r < 34.9){
                range.text = "Sobre Peso"
        }
            if(r > 30 && r < 34.9){
                imc.text = "si entra"
                range.text = "Obesidad grado 1"
        }
            if(r > 35 && r < 39.9){
                range.text = "Obesidad Grado 2"
        }
            if(r > 40){
                range.text = "Obesidad Grado 3"
        }
            imc.text = r.toString()
        }
    }
}