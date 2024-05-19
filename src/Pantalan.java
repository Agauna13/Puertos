import java.util.ArrayList;

public class Pantalan {
    //Atributos
    private String tipo;
    private int id = 0;
    private static ArrayList<Amarre> listaAmarre;
    /*Importante hacer el arraylist static para que podamos rellenarlo con objetos
    Amarre desde la clase pertinente llamando a la clase Pantalan.añadirAmarre(this);*/


    public Pantalan(String tipo) {
        listaAmarre = new ArrayList<Amarre>();
        this.tipo = tipo;
        id++;
    }


    public static void añadirAmarre(Amarre a) {
        listaAmarre.add(a);
    }

    public String getTipo(){
        return tipo;
    }

    public ArrayList<Amarre> getListaAmarre(){
        return listaAmarre;
    }

}
