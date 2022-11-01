package info.jeovani.recyclerview.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.jeovani.recyclerview.clasesdatos.AA
import info.jeovani.recyclerview.R
import kotlinx.android.synthetic.main.activity_visor_imagen_aa.*

class VisorImagenAA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visor_imagen_aa)

        val aa = intent.getSerializableExtra("AAs") as AA

        aviAAIvAA.setImageResource(aa.idImagen)
    }
}
