package info.jeovani.recyclerview.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import info.jeovani.recyclerview.adaptadores.AdaptadorAA
import info.jeovani.recyclerview.clasesdatos.AA
import info.jeovani.recyclerview.R
import kotlinx.android.synthetic.main.activity_main_aa.*

class MainActivityAA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_aa)

        amRvAA.layoutManager = LinearLayoutManager(this)
        amRvAA.adapter = AdaptadorAA(generarDatosPrueba(), this)

    }

    private fun generarDatosPrueba() : ArrayList<AA>{
        val lista = ArrayList<AA>()
        lista.add(AA(R.drawable.ingles, "Taller de Inglés", "Lewis Carroll", "Pendiente", 10, 11, 84, 4.5))
        lista.add(AA(R.drawable.computacion, "Taller de Computación", "Roald Dahl", "Pendiente", 11, 12, 34, 4.0))
        lista.add(AA(R.drawable.estudio, "Taller de técnicas de estudio", "J. K. Rowling", "Pendiente", 11, 12, 131, 4.7))
        lista.add(AA(R.drawable.emocional, "Taller de inteligencia emocional", "Roald Dahl\n", "Pendiente", 11, 12, 66, 4.1))
        lista.add(AA(R.drawable.ajedrez, "Taller de ajedrez", "Carlo Collodi", "Realizado", 9, 10, 48, 3.9))
        lista.add(AA(R.drawable.baile, "Taller de baile", "Antoine de Saint-Exupéry", "Realizado", 9, 10, 165, 4.8))
        lista.add(AA(R.drawable.artisticas, "Taller de artísticas", "Antoine de Saint-Exupéry", "Realizado", 9, 10, 165, 4.8))

        return lista
    }

}
