package practica3;

import org.jetbrains.annotations.NotNull;

import java.sql.Array;

public class Electric extends Vehicle implements Comparacio {

    private int bateria;
    private final int Co2 = 375; // 100km


    public Electric(String matricula, int km, int pes) {
        super(matricula, km, pes);
        this.bateria = getBateria();

    }


    @Override
    public double getEmissioPerUs() {

        int emissions = getBateria();

        int consum1Km = (emissions * 1) / 100; // GRAMS PER UN KM DE CO2

        double emisioKmCotxe = getKm() * consum1Km; // 1km recprregut * GRAMS DE C02 CADA KM

        return emisioKmCotxe;


    }


    public int getBateria() {

        if (getPes() >= 2000) {
            int consum1km = (Co2 * 2) * 1000; // 345 "co2" * doble per pes "2" * 1000 "transformar a grams"
            return consum1km;
        } else if (getPes() <= 500) {
            double consum1km = (Co2 * 0.5) * 1000;
            return (int) consum1km;
        } else {
            int consum1km = Co2 * 1000;
            return consum1km;
        }

    }


    public void setBateria(int bateria) {
        this.bateria = bateria;
    }


    public static boolean mes(Vehicle v[]) {

        double resultatE = 0;
        double resultatC = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] == null) {
            } else {

                if (v[i] instanceof Electric) {
                    if (v[i + 1] != null ) {
                        if (v[i].getEmissioPerUs() > v[i + 1].getEmissioPerUs()) {
                            resultatE = v[i].getEmissioPerUs();
                        } else {
                            resultatC = v[i].getEmissioPerUs();
                        }

                    }

                }
                if (v[i] instanceof Combustio) {
                    if (v[i + 1] != null ) {
                        if (v[i].getEmissioPerUs() > v[i + 1].getEmissioPerUs()) {
                            resultatC = v[i].getEmissioPerUs();
                        } else {
                            resultatC = v[i].getEmissioPerUs();
                        }
                    }
                }
            }
        }
        if (resultatE > resultatC) {

            System.out.println("El coche Electric gasta mes ");
            return true;
        } else {
            System.out.println("El coche combustio gasta mes");
            return false;
        }


    }
}
