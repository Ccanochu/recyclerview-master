package info.jeovani.recyclerview.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import info.jeovani.recyclerview.adaptadores.AdaptadorLibros
import info.jeovani.recyclerview.clasesdatos.Libro
import info.jeovani.recyclerview.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        amRvLibros.layoutManager = LinearLayoutManager(this)
        amRvLibros.adapter = AdaptadorLibros(generarDatosPrueba(), this)

    }

    private fun generarDatosPrueba() : ArrayList<Libro>{
        val lista = ArrayList<Libro>()
        lista.add(Libro(R.drawable.alicia_aventuras, "Alicia En El Pais De Las Maravillas", "Lewis Carroll", "Literatura infantil", 1865, 143, 84, 4.5))
        lista.add(Libro(R.drawable.fabrica_charlie, "Charlie y la fábrica de chocolate", "Roald Dahl", "Literatura infantil", 1964, 164, 34, 4.0))
        lista.add(Libro(R.drawable.harry_potter, "Harry Potter y la piedra filosofal", "J. K. Rowling", "Literatura infantil", 1997, 320, 131, 4.7))
        lista.add(Libro(R.drawable.matilda, "Matilda", "Roald Dahl\n", "Literatura infantil", 1988, 225, 66, 4.1))
        lista.add(Libro(R.drawable.pinocho, "Las aventuras de Pinocho", "Carlo Collodi", "Literatura infantil", 1883, 156, 48, 3.9))
        lista.add(Libro(R.drawable.principito, "El principito", "Antoine de Saint-Exupéry", "Literatura infantil", 1943, 81, 165, 4.8))

        return lista
    }

}
