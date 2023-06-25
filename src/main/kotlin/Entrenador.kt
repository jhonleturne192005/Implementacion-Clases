class Entrenador(var idFederacion:Int=0,
                 var metodoEntrenador:(String,String,Int,Int,Int)->Unit,
                 var name:String,
                 Apellidos:String,
                 id:Int,
                 Edad:Int):SeleccionFutbol(Apellidos, Edad, id, name)
{


    public fun dirigirEntreno():Unit{
        println("El entrenador ${super.getNombres()} ${getApellido()} esta dirigiendo el entrenamiendo");
    }

    public fun dirigirPartido():Unit{
        println("El entrenador ${super.getNombres()} ${getApellido()} esta dirigiendo el partido");
    }

    public fun Entrenador():Unit{
        metodoEntrenador(super.getNombres(),super.getApellido(),super.getEdadS(),super.getIdS(),idFederacion);
    }

    override fun Concentrarse() {
        println("El entrenador esta concentrado entrenando a su seleccion de futbol");
    }

    override fun Viajar() {
        println("El entrenador esta viajando con su seleccion de futbol");
    }


}