package practica3;

public class main {
    public static void main(String[] args) {

        Vehicle[] vehicle = new Vehicle[10];

        vehicle[0] = new Electric("HBO", 100, 2100);
        vehicle[1] = new Combustio("kGB", 100, 1000);
        vehicle[2] = new Electric("CCC", 200, 400);



        impirimr(vehicle); // EXERCICI 1


    ;
      System.out.println(Electric.mes(vehicle)); // VEURE QIN COCHE GASTA MES




    }


    public static void impirimr(Vehicle v[]) {

        for (int i = 0; i < v.length; i++) {

            if (v[i] == null) {

            } else {
                System.out.println("Emisions totals de la circulacio = " + v[i].getEmissioPerUs()+" grams de Co2\n Petjada ecologica = "+PetjadaEco.getPetjada(v[i])+" g");
            }

        }

    }
}
