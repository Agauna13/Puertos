public class Comercial extends Barco {
    //Atributos
    private String carga;
    private final String tipo = "Comercial";

    public Comercial(String nombre, String matricula, float tamaño, String carga) {
        super(nombre, matricula, tamaño);
        this.carga = carga;
    }

    public String getTipo(){
        return tipo;
    }

    public String toString() {
        return super.toString() + "\nCarga: " + carga + "\nTipo: " + tipo;
    }

    public void mostrar() {
        System.out.println(toString());
    }

}
