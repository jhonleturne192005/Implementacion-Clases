class Masajista(private val aniosExperiencia:Int=25,
                private val Titulacion:String="Titulacion Mediante tesis",
                public var metodoMasa:(Int,String)->Unit,
                Apellidos: String,
                Edad: Int,
                id: Int,
                Nombre: String):SeleccionFutbol(Apellidos,Edad,id,Nombre){


    public fun darMasaje()
    {
        println("El masajista ${Nombre} ${Apellidos} esta haciendo un masaje");
    }

    public fun Masajista()
    {
        println("**************** Datos masajista ****************");
        println("Id: ${super.getIdS()}");
        println("Nombre: ${super.getNombres()}");
        println("Apellido: ${super.getApellido()}");
        println("Edad: ${super.getEdadS()}");
        metodoMasa(aniosExperiencia,Titulacion);
    }

    override fun Concentrarse() {
        println("El masajista esta concentrado haciendo un masaje");
    }

    override fun Viajar() {
        println("El masajista ${super.getNombres()} ${super.getApellido()} esta viajando con los futbolistas");
    }

}
