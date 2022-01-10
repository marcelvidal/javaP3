package javaP3;

public class PetjadaEco extends Vehicle {

    public static final int ECO_PROD_ELEC = 375;
    public static final int ECO_PROD_COMB = 245;



    public PetjadaEco(String matricula, int km, int pes) {
        super(matricula, km, pes);
    }


    public static double getPetjada(Vehicle v) {

        if (v instanceof Electric) {
            double resultatE = (v.getEmissioPerUs() + ECO_PROD_ELEC * (v.getPes()) / 1100);
            return resultatE;
        }

        if (v instanceof Combustio) {

            double resultatC = (v.getEmissioPerUs() + ECO_PROD_COMB * (v.getPes()) / 1000);
            return resultatC;
        }

        return 0;
    }


}
