import java.util.ArrayList;

public class Puerto {
    //Atributos
    private static ArrayList<Pantalan> listPantalan;
    private static ArrayList<Barco> barcosEntrantes = new ArrayList<>();


    public Puerto(ArrayList<Pantalan> listPantalan){
        this.listPantalan = listPantalan;
    }

    public static void setBarcosEntrantes(Barco barco) {
        barcosEntrantes.add(barco);
    }

    public static void buscarAmarre(ArrayList<Barco> barcos, ArrayList<Pantalan> pantalan) {
        String matricula;
        Barco barco = null;
        Pantalan pantalan1 = null;
        for (Barco b : barcosEntrantes) {
            matricula = b.mayorTamaño(barcosEntrantes);
            if (b.getMatricula() == matricula) {
                barco = b;
            }
        }

        for (Pantalan p : pantalan) {
            if (barco.getTipo() == p.getTipo()) {
                pantalan1 = p;
                break;
            }
        }

        for (Amarre amarre : pantalan1.getListaAmarre()) {
            if (amarre.getTamañoAmarre() >= barco.getTamaño()) {
                amarre.setBarco(barco);
                amarre.setOcupado(true);
                barcosEntrantes.remove(barco);
            }
        }


    }

    public static void verAmarre(ArrayList<Pantalan> pantalan){
        for(Amarre amarre : pantalan.getLast().getListaAmarre()){
            System.out.println(amarre.toString());
        }
    }


    public static void simular(ArrayList<Pantalan> pantalan){


        Pantalan pantalan1 = new Pantalan("Comercial");
        Pantalan pantalan2 = new Pantalan("Comercial");
        Pantalan pantalan3 = new Pantalan("Recreo");

        listPantalan.add(pantalan1);
        listPantalan.add(pantalan2);
        listPantalan.add(pantalan3);

        Amarre amarre1 = new Amarre(100);
        Amarre amarre2 = new Amarre(100);
        Amarre amarre3 = new Amarre(60);
        Amarre amarre4 = new Amarre(120);
        Amarre amarre5 = new Amarre(10);
        Amarre amarre6 = new Amarre(10);

        pantalan1.añadirAmarre(amarre1);
        pantalan1.añadirAmarre(amarre2);
        pantalan2.añadirAmarre(amarre3);
        pantalan2.añadirAmarre(amarre4);
        pantalan3.añadirAmarre(amarre5);
        pantalan3.añadirAmarre(amarre6);



    }


}
