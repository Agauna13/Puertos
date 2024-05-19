public class Amarre {
    //Atributos
    private int id = 0;
    private float tamañoAmarre;
    private boolean ocupado;
    Barco barco;

    public Amarre(float tamañoAmarre){
        this.tamañoAmarre = tamañoAmarre;
        ocupado = false;
        id++;
        Pantalan.añadirAmarre(this);
    }

    public void setOcupado(boolean ocupado){
        this.ocupado = ocupado;
    }



}
