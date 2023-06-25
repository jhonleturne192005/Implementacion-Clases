data class person(var nombre:String,var apellido:String)

public lateinit var lstNombres:List<person>;

//************
public var lstFutbolista= mutableListOf<Futbolista>();
public var lstMasajista= mutableListOf<Masajista>();
public var lstEntrenador= mutableListOf<Entrenador>();


fun main(args: Array<String>) {
    println("Hello World!")
    obtenerNombres();
    var contador:Int=0
    lstNombres.forEach{
        x->
        contador++;
        creacionFutbolista("Lateral izquierdo",(1..11).random(),{a,b,c,d,e,f->mensajeFutbolista(a,b,c,d,e,f)},
            x.nombre,x.apellido,(20..35).random(),contador);
    }

    creacionMasajista(aniosExperiencia = 10,
                        Titulacion = "Basica",
                        {a,b->mensajeMasajista(a,b)},
                        Apellidos = "Leturne Pluas",
                        Edad = 19,
                        idSeleccion = 1,
                        Nombre = "Jhon");


    creacionEntrenador(idSeleccion = 1, idFederacion = 1, Nombre = "Jhon", Apellidos = "LLkOTLIN", Edad = 45,
                {a,b,c,d,e->mensajeEntrenador(a,b,c,d,e)})


    lstFutbolista.get(1).Futbolista()
    lstFutbolista.get(1).entrenar()
    lstFutbolista.get(1).Concentrarse()
    lstMasajista.get(0).Masajista()
    lstEntrenador.get(0).Entrenador()
}



//metodos para creaccion de objetos

private fun creacionFutbolista(demarcacion: String,dorsal: Int,
                               funcionFutbolista:(String,String,Int,Int,String,Int)->Unit,
                               Nombre: String,Apellidos: String,Edad: Int,idSeleccion: Int):Unit{
    var futbolista=Futbolista(demarcacion,dorsal,funcionFutbolista,Nombre,Apellidos,Edad,idSeleccion);
    lstFutbolista.add(futbolista);
}

private fun creacionMasajista(aniosExperiencia:Int,Titulacion:String,funcionMasajista:(Int,String)->Unit,
                              Apellidos: String,Edad: Int,idSeleccion: Int,Nombre: String):Unit{
    var masajista=Masajista(aniosExperiencia,Titulacion,funcionMasajista,Apellidos,Edad,idSeleccion,Nombre);
    lstMasajista.add(masajista);
}


private fun creacionEntrenador(idSeleccion: Int,idFederacion:Int,Nombre: String,Apellidos: String,Edad: Int,
                               metodoEntrenador:(String,String,Int,Int,Int)->Unit):Unit{
    var entrenador=Entrenador(idFederacion,metodoEntrenador,Nombre,Apellidos,idSeleccion,Edad);
    lstEntrenador.add(entrenador);
}


//metodos utilizado para una funcion lambda

//metodo 1
private fun mensajeMasajista(AniosExp:Int,Titulacion:String):Unit{
    println("La masajista tiene ${AniosExp} de experiencia y con ${Titulacion}");
}

//metodo 2
private fun mensajeEntrenador(Nombre:String,Apellidos:String,Edad:Int,idSeleccion:Int,Idfederacion:Int):Unit{
    println("**************** Datos entrenador ****************");
    println("IdSeleccion: ${idSeleccion} IdFederacion: ${Idfederacion}");
    println("Nombre: ${Nombre}");
    println("Apellidos: ${Apellidos}");
    println("Edad: ${Edad}");
}

//metodo 3
private fun mensajeFutbolista(Nombre:String,Apellidos:String,Edad:Int,
                              idSeleccion:Int,demarcacion:String,dorsal:Int):Unit{
    println("**************** Datos Futbolista ****************");
    println("IdSeleccion: ${idSeleccion}");
    println("Nombre: ${Nombre}");
    println("Apellidos: ${Apellidos}");
    println("Edad: ${Edad}");
    println("Demarcacion: ${demarcacion}");
    println("dorsal: ${dorsal}");
}



//base datos nombres

public fun obtenerNombres():Unit{
    lstNombres= listOf(
        person(nombre = "Pedro", apellido = "Gomez"),
        person(nombre = "Oscar", apellido = "Martinez"),
        person(nombre = "Ricardo", apellido = "Perez"),
        person(nombre = "Oscar", apellido = "Gonzalez"),
        person(nombre = "Horacio ", apellido = "Garcia"),
        person(nombre = "Roberto ", apellido = "Fernandez"),
        person(nombre = "Cesar", apellido = "Alvarez"),
        person(nombre = "Ramón", apellido = "Acosta"),
        person(nombre = "Carlos", apellido = "Garcia"),
        person(nombre = "Roberto", apellido = "Torres")
    )
}


