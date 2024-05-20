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

    public float getTamañoAmarre(){
        return tamañoAmarre;
    }


    public void setBarco(Barco barco){
        this.barco = barco;
    }
    public Barco getBarco(){
        return barco;
    }


    public void setOcupado(boolean ocupado){
        this.ocupado = ocupado;
    }


    public boolean getOcupado(){
        return ocupado;
    }

    public String toString(){
        return "tamaño Amarre: " + tamañoAmarre +
                "\n Barco amarrado: " + barco +
                "\n Id Amarre: " + id;
    }


}
