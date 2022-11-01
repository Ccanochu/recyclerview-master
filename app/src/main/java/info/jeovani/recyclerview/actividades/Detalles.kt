package info.jeovani.recyclerview.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.jeovani.recyclerview.R
import info.jeovani.recyclerview.clasesdatos.Libro
import kotlinx.android.synthetic.main.activity_detalles.*

class Detalles : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles)

        val libro = intent.getSerializableExtra("Peliculas") as Libro

        amTvTitulo.text = getString(R.string.titulo, libro.titulo)
        amTvAutor.text = getString(R.string.autor, libro.autor)
        amTvGenero.text = getString(R.string.genero, libro.genero)
        amTvAnio.text = getString(R.string.año, libro.año.toString())
        amTvPaginas.text = getString(R.string.paginas, libro.paginas.toString())
        amTvNumeroLectores.text = getString(R.string.numeroLectores, libro.numeroLectores.toString())
        amTvCalificacion.text =  getString(R.string.calificacion, libro.calificacion.toString())

    }
}
