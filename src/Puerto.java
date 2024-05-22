import java.util.ArrayList;

public class Puerto {
    //Atributos
    private static ArrayList<Pantalan> listPantalan;
    private static ArrayList<Barco> barcosEntrantes = new ArrayList<>();


    public Puerto(ArrayList<Pantalan> listPantalan) {
        this.listPantalan = listPantalan;
    }

    public static void setBarcosEntrantes(Barco barco) {
        barcosEntrantes.add(barco);
    }

    public static void buscarAmarre(ArrayList<Pantalan> listPantalan) {

        while (!barcosEntrantes.isEmpty()) {
            Barco barco = null;
            String matricula = Barco.mayorTamaño(barcosEntrantes);
            for (Barco b : barcosEntrantes) {
                if (b.getMatricula().equals(matricula)) {
                    barco = b;
                    System.out.println(barco.getTamaño());
                    break;
                }
            }
            for (Pantalan p : listPantalan) {
                if (barco.encajaTipo(p)) {
                    for (Amarre amarre : p.getListaAmarre()) {
                        if (amarre.getTamañoAmarre() >= barco.getTamaño()) {
                            amarre.setBarco(barco);
                            amarre.setOcupado(true);
                            break;
                        }
                    }
                    break;
                }

            }

            barcosEntrantes.remove(barco);
        }


    }


public static void verAmarre(ArrayList<Pantalan> listPantalan) {
    int id = 1;
    for (Pantalan p : listPantalan) {
        for (Amarre amarre : p.getListaAmarre()) {
            System.out.println("id Amarre: " + id);
            System.out.println(amarre.toString());
            id++;
        }
    }

}


public static void simular(ArrayList<Pantalan> pantalan) {


    Pantalan pantalan1 = new Pantalan("Comercial");
    Pantalan pantalan2 = new Pantalan("Recreo");

    listPantalan.add(pantalan1);
    listPantalan.add(pantalan2);

    Amarre amarre1 = new Amarre(300);
    Amarre amarre2 = new Amarre(200);
    Amarre amarre3 = new Amarre(100);
    Amarre amarre4 = new Amarre(75);
    Amarre amarre5 = new Amarre(50);
    Amarre amarre6 = new Amarre(25);

    pantalan1.añadirAmarre(amarre1);
    pantalan1.añadirAmarre(amarre2);
    pantalan2.añadirAmarre(amarre3);
    pantalan2.añadirAmarre(amarre4);
    pantalan1.añadirAmarre(amarre5);
    pantalan2.añadirAmarre(amarre6);


}


}
