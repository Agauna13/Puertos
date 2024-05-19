public class Recreo extends Barco{
    //Atributos
    private String permiso;
    private final String tipo = "Recreo";


    //constructor
    public Recreo(String nombre, String matricula, float tamaño, String permiso){
        super(nombre, matricula, tamaño);
        this.permiso = permiso;
    }


    //metodos
    public String toString(){
        return super.toString() + "\nPermiso: " + permiso + "\nTipo: " + tipo;
    }

    public void mostrar(){
        System.out.println(toString());
    }


    //getters
    public String getPermiso(){
        return permiso;
    }
    public String getTipo(){
        return tipo;
    }

}
