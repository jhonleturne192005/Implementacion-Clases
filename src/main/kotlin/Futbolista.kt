class Futbolista (
    private var desmarcacion:String="Lateral derecho",
    private var dorsal:Int=10,
    var metodoEntrenador:(String,String,Int,Int,String,Int)->Unit,
    eNombre:String,
    eApellidos:String,
    eEdad:Int,
    eid:Int):SeleccionFutbol(eApellidos,eEdad,eid,eNombre) {


    fun entrenar():Unit{
        println("El futbolista $Nombre $Apellidos esta entrenando");
    }

    public fun jugarPartido():Unit
    {
        println("El futbolista $Nombre $Apellidos esta jugado el partido");
    }

    override fun Viajar() {
        println("El futbolista $Nombre $Apellidos esta viajando para el evento");
    }

    override fun Concentrarse() {
        println("El futbolista ${super.getNombres()} esta concentrado para el evento");
    }

    public fun Futbolista(){
        metodoEntrenador(super.getNombres(),super.getApellido(),super.getEdadS(),super.getIdS(),desmarcacion,dorsal);
    }


}