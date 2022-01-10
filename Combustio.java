package javaP3;

public class Combustio extends Vehicle implements Comparacio {


    private int emissions;


    public Combustio(String matricula, int km, int pes) {
        super(matricula, km, pes);
        this.emissions = 6;
    }


    public static boolean mes(Vehicle v[]) {

        double resultatE = 0;
        double resultatC = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] == null) {
            } else {

                if (v[i] instanceof Electric) {
                    if (v[i + 1] != null) {
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
            return false;

        } else {
            System.out.println("El coche combustio gasta mes");

            return true;
        }


    }


    public double getEmissioPerUs() {
        double resultat = getKm() * getEmissions();
        return resultat;
    }


    // EMISIONS  PER CADA 100 KM RECORREGUT

    public double getEmissions() {
        return (double)this.emissions / 100; // emisions per 1 km

    }

    public void setEmissions(int emissions) {
        this.emissions = emissions;
    }


}
