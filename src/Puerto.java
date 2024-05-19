import java.util.ArrayList;

public class Puerto {
    //Atributos
    private ArrayList<Pantalan> listPantalan;
    private static ArrayList<Barco> barcosEntrantes = new ArrayList<>();



    public static void setBarcosEntrantes(Barco barco) {
        barcosEntrantes.add(barco);
    }

    public static void buscarAmarre(ArrayList<Barco> barcos, ArrayList<Pantalan> pantalan) {
        for (Barco barco : barcosEntrantes) {
            if(pantalan.contains(barco.getTipo())){
                for (Pantalan pantalan1 : pantalan) {
                    if(pantalan1.getListaAmarre())
                }
            }
        }
    }



}
