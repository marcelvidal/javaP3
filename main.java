package javaP3;

public class main {
    public static void main(String[] args) {

        Vehicle[] v = new Vehicle[10];

        v[0] = new Electric("HBO", 100, 2100);
        v[1] = new Combustio("kGB", 100, 1900);
        v[2] = new Electric("CCC", 200, 400);



        impirimr(v); // EXERCICI 1


    ;
      System.out.println(Electric.mes(v)); // VEURE QIN COCHE GASTA MES




    }


    public static void impirimr(Vehicle v[]) {

        for (int i = 0; i < v.length; i++) {

            if (v[i] == null) {

            } else {
                System.out.println("Emisions totals de la circulacio = " + v[i].getEmissioPerUs() +" grams de Co2\n Petjada ecologica = "+PetjadaEco.getPetjada(v[i])+" g");
            }

        }

    }
}
