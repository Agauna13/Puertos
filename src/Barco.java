import java.util.ArrayList;

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

    public static void cargarBarcosEntrantes(ArrayList<Barco> barcosEntrantes){
        for(Barco b :barcosEntrantes){
            Puerto.setBarcosEntrantes(b);
        }
    }

    public boolean encajaTipo(Pantalan pantalan){
        return this.getTipo().equals(pantalan.getTipo());
    }

    public float encajaTamaño(Amarre amarre){
        float tamaño = this.getTamaño() > amarre.getTamañoAmarre() ?
                this.getTamaño() - amarre.getTamañoAmarre() :
                amarre.getTamañoAmarre() - this.getTamaño();

        return tamaño;
    }

    public String getMatricula() {
        return matricula;
    }

    public float getTamaño() {
        return tamaño;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "nombre='" + nombre + '\'' +
                ", matricula='" + matricula + '\'' +
                ", tamaño=" + tamaño +
                '}';
    }

    public abstract void mostrar();

    public abstract Object getTipo();
}
