open class SeleccionFutbol (var Apellidos:String,var Edad:Int,var id:Int,var Nombre:String){


    open public fun Concentrarse():Unit{
        println("El equipo esta concentrado");
    }

    open public fun getApellido():String{
        return Apellidos;
    }

    open public fun getNombres():String{
        return Nombre;
    }

    open public fun Viajar():Unit{
        println("La seleccion de futbol esta viajando");
    }

    //---*---*---*---*---*---*---*---*---*---*---*---*---*---*

    open public fun getEdadS():Int{
        return Edad;
    }

    open public fun getIdS():Int{
        return id;
    }

}