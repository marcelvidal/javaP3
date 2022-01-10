package javaP3;


import java.sql.Array;

public class Electric extends Vehicle implements Comparacio {

    private int bateria;


    public Electric(String matricula, int km, int pes) {
        super(matricula, km, pes);
        this.bateria = 5; //*100km

    }


    @Override
    public double getEmissioPerUs() {

        double resultat = getKm() * getBateria();
        return resultat;


    }


    public double getBateria() {
        double consum1km =0;
        if (getPes() >= 2000) {
           consum1km = ((double)this.bateria * 2) /100; // * 1 km recorregut
            return consum1km;
        } else if (getPes() <= 500) {
            consum1km = ((double)this.bateria * 0.5) / 100;
            return consum1km;
        } else {
            return (double)this.bateria /100;
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
            return true;
        } else {
            System.out.println("El coche combustio gasta mes");
            return false;
        }


    }
}
