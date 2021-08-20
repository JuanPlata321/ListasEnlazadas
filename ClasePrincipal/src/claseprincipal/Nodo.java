
package claseprincipal;

//Aqui se define la clase del Nodo con los datos que se nos dio en el diagrama
//dandole al valor el tipo de dato estudiante y al siguiente el tipo de dato Nodo como se pidio en el programa.
 public class Nodo{
    private Estudiante valor;
    private Nodo siguente;

    //Aqui se crea el constructor para el Nodo con un parametro el cual va a ser el valor que va a contener el nodo.
    public Nodo(Estudiante n1) {
        valor=n1;
        siguente=null;
    }

    //Aqui por ultimo creamos un constructor con el cual del nodo vamos a poder obtener los datos de los estudiantes
    //solicitados los cuales serian la Edad y el Nombre de estos para al final retornar el valor de estos.
    public String getinfo() {
        String a="";
        a += "Nombre: " +valor.getNombre()+"\n";
        a+= "Edad: "+valor.getedad();
        return a;
    }
}
