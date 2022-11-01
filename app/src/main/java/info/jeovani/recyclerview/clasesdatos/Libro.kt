package info.jeovani.recyclerview.clasesdatos

import java.io.Serializable

data class Libro (
    var idImagen: Int,
    var autor: String,
    var genero: String,
    var paginas: Int,
    var año: Int,
    var numeroLectores: Int,
    var calificacion: Double
) : Serializable