package info.jeovani.recyclerview.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.jeovani.recyclerview.clasesdatos.Libro
import info.jeovani.recyclerview.R
import kotlinx.android.synthetic.main.activity_visor_imagen.*

class VisorImagen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visor_imagen)

        val libro = intent.getSerializableExtra("Peliculas") as Libro

        aviIvLibro.setImageResource(libro.idImagen)
    }
}
