package practica3;

public class Combustio extends Vehicle implements Comparacio{

    private final int C02 = 245; // 100km
    private int emissions;


    public Combustio(String matricula, int km, int pes) {
        super(matricula, km, pes);
        this.emissions = getEmissions();
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
                    if (v[i + 1] != null) {
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


    public double getEmissioPerUs() {

        int emissions = getEmissions();

        int consum1Km = (emissions * 1) / 100; // GRAMS PER UN KM DE CO2

        double emisioKmCotxe = getKm() * consum1Km; // 1km recprregut * GRAMS DE C02 CADA KM

        return emisioKmCotxe;

    }


    // EMISIONS  PER CADA 100 KM RECORREGUT

    public int getEmissions() {

        this.emissions = C02 * 1000; // GRAMS PER CADA 100 KM
        return this.emissions;

    }

    public void setEmissions(int emissions) {
        this.emissions = emissions;
    }


}
