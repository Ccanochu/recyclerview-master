package info.jeovani.recyclerview.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.jeovani.recyclerview.R
import info.jeovani.recyclerview.clasesdatos.AA
import kotlinx.android.synthetic.main.activity_detalles_aa.*

class DetallesAA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles_aa)

        val aa = intent.getSerializableExtra("AAs") as AA

        amAATvTitulo.text = getString(R.string.titulo, aa.titulo)
        amAATvTutor.text = getString(R.string.tutor, aa.tutor)
        amAATvCategoria.text = getString(R.string.categoria, aa.categoria)
        amAATvEmpieza.text = getString(R.string.empieza, aa.empieza.toString())
        amAATvTermina.text = getString(R.string.termina, aa.termina.toString())
        amAATvNumeroInscritos.text = getString(R.string.numeroInscritos, aa.numeroInscritos.toString())
        amAATvCalificacion.text =  getString(R.string.calificacion, aa.calificacion.toString())

    }
}
