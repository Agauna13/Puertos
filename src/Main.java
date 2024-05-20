import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pantalan> listPantalan = new ArrayList<Pantalan>();
        ArrayList<Barco> barcosEntrantes = new ArrayList<Barco>();
        Puerto puerto = new Puerto(listPantalan);

        Barco comercial = new Comercial("4567", "Tsunami", 110.0f, "Carga Textil" );
        Barco recreo = new Recreo("1234", "pepelepue", 90.0f, "Recreo" );
        Barco c1 = new Comercial("5678", "joaquin", 55.5f, "Pelucas" );
        barcosEntrantes.add(comercial);
        barcosEntrantes.add(recreo);
        barcosEntrantes.add(c1);
        Barco.cargarBarcosEntrantes(barcosEntrantes);


        Puerto.simular(listPantalan);
        Puerto.buscarAmarre(barcosEntrantes, listPantalan);
        Puerto.verAmarre(listPantalan);

    }
}