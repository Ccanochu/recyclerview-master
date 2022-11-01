package info.jeovani.recyclerview.clasesdatos

import java.io.Serializable

data class AA (
    var idImagen: Int,
    var titulo: String,
    var tutor: String,
    var categoria: String,
    var empieza: Int,
    var termina: Int,
    var numeroInscritos: Int,
    var calificacion: Double
) : Serializable