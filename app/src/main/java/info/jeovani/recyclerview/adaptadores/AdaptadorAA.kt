package info.jeovani.recyclerview.adaptadores

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import info.jeovani.recyclerview.R
import info.jeovani.recyclerview.actividades.DetallesAA
import info.jeovani.recyclerview.clasesdatos.AA
import info.jeovani.recyclerview.actividades.VisorImagenAA
import kotlinx.android.synthetic.main.elemento_lista_aa.view.*

class AdaptadorAA(private var lista: ArrayList<AA>, private var contexto: Context) : RecyclerView.Adapter<AdaptadorAA.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.elemento_lista_aa,
                parent,
                false
            ), contexto
        )
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(lista[position])
    }



    class ViewHolder(private var vista: View, private var contexto: Context) : RecyclerView.ViewHolder(vista) {
        fun bind(aa: AA) {
            vista.ellAAIvAA.setImageResource(aa.idImagen)
            vista.ellAATvTitulo.text = aa.titulo
            vista.ellAATvCategoria.text = aa.categoria
            vista.ellRbAACalificacion.rating = aa.calificacion.toFloat()

            vista.ellAAIvAA.setOnClickListener {
                contexto.startActivity(Intent(contexto, VisorImagenAA::class.java).putExtra("AAs", aa))
            }

            vista.setOnClickListener {
                contexto.startActivity(Intent(contexto, DetallesAA::class.java).putExtra("AAs", aa))
            }
        }
    }

}