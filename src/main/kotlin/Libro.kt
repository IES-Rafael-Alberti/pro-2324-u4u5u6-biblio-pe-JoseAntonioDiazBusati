package org.pebiblioteca

class Libro(
    val uuid:Int,
    val titulo:String,
    var autor:String,
    var anioPublicacion:Int,
    var estado:Estado = Estado.DISPONIBLE//(disponible o prestado).
) {
    init {
        uuid
        titulo.isNotBlank()
        autor.isNotBlank()
        anioPublicacion
        estado
    }

    companion object {

    }
}