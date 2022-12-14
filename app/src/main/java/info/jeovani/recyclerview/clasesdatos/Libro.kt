package info.jeovani.recyclerview.clasesdatos

import java.io.Serializable

data class Libro (
    var idImagen: Int,
    var titulo: String,
    var autor: String,
    var genero: String,
    var año: Int,
    var paginas: Int,
    var numeroLectores: Int,
    var calificacion: Double
) : Serializable