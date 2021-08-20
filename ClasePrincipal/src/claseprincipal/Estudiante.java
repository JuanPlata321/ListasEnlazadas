
package claseprincipal;

//Aqui se definine la clase estudiante con su tipo de dado string en el nombre y en la eadad.
public class Estudiante{
    private String Nombre;
    private int edad;

    //Aqui se define el constructor para los datos que definimos antes.
    public Estudiante(String n, int e) {Nombre=n;edad=e;}

    //Aqui por ultimo se definen los getters los cuales nos serviran despues para el uso de esta clase.
    public String getNombre() {
        return Nombre;
    }
    public int getedad() {
        return edad;
    }
}
    