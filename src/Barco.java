import java.util.ArrayList;
import java.util.Collections;

public abstract class Barco {
    //Atributos
    private String nombre;
    private String matricula;
    private float tamaño;
    //private static ArrayList<Barco> barcosEntrantes = new ArrayList();


    public Barco(String nombre, String matricula, float tamaño) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.tamaño = tamaño;
    }

    public static String mayorTamaño(ArrayList<Barco> barcosEntrantes) {
        Barco barcoMayor = barcosEntrantes.get(0); // cogemos el primer barco de la lista como punto de partida

        for (Barco barco : barcosEntrantes) { //iteramos el ArrayList comparando y asignando un nuevo barco al barco mayor en caso de que sea de mayor tamaño que nuestro barco inicial.
            if (barco.getTamaño() > barcoMayor.getTamaño()) {
                barcoMayor = barco;
            }
        }

        return barcoMayor.getMatricula(); //finalmente devolvemos la matricula del barco
    }

    /*public boolean encajaTipo(Pantalan pantalan){
        return null;
    }

    public float encajaTamaño(Amarre amarre){

    }

    }*/
    public static void cargarBarcosEntrantes(){
        Barco recreo = new Recreo("Tritón", "2345", 6F, "Permiso Recreativo");
        Barco comercial = new Comercial("Poseidón", "1234", 80F, "Carga Textil");
        Puerto.setBarcosEntrantes(recreo);
        Puerto.setBarcosEntrantes(comercial);
    }

    private String getMatricula() {
        return matricula;
    }

    public float getTamaño() {
        return tamaño;
    }

    public String toString() {
        return null;
    }

    public abstract void mostrar();

    public abstract Object getTipo();
}
