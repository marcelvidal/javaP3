package practica3;

public class PetjadaEco extends Vehicle {


    public static double ECO_PROD_COMB;
    public static double ECO_PROD_ELEC;

    public PetjadaEco(String matricula, int km, int pes) {
        super(matricula, km, pes);
    }


    public static double getPetjada(Vehicle v) {
        if (v instanceof Electric) {

            ECO_PROD_ELEC = (v.getEmissioPerUs() * v.getPes()) / 1100;
            return ECO_PROD_ELEC;
        }

        if (v instanceof Combustio) {

            ECO_PROD_COMB = (v.getEmissioPerUs() * (v.getPes()) / 1000);
            return ECO_PROD_COMB;
        }

        return 0;
    }


}
