package info.jeovani.recyclerview.adaptadores

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import info.jeovani.recyclerview.R
import info.jeovani.recyclerview.actividades.Detalles
import info.jeovani.recyclerview.clasesdatos.Libro
import info.jeovani.recyclerview.actividades.VisorImagen
import kotlinx.android.synthetic.main.elemento_lista_libro.view.*

class AdaptadorLibros(private var lista: ArrayList<Libro>, private var contexto: Context) : RecyclerView.Adapter<AdaptadorLibros.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.elemento_lista_libro,
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
        fun bind(libro: Libro) {
            vista.ellIvLibro.setImageResource(libro.idImagen)
            vista.ellTvTitulo.text = libro.titulo
            vista.ellTvGenero.text = libro.genero
            vista.ellRbCalificacion.rating = libro.calificacion.toFloat()

            vista.ellIvLibro.setOnClickListener {
                contexto.startActivity(Intent(contexto, VisorImagen::class.java).putExtra("Peliculas", libro))
            }

            vista.setOnClickListener {
                contexto.startActivity(Intent(contexto, Detalles::class.java).putExtra("Peliculas", libro))
            }
        }
    }

}