package practica3;

public class Vehicle {

    private String matricula;
    private int km;
    private int pes;




    public Vehicle (String matricula, int km , int pes){
        this.matricula = matricula;
        this.km = km;
        this.pes = pes;
    }




    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getPes() {
        return pes;
    }

    public double getEmissioPerUs() {
        return 0;
    }

    public void setPes(int pes) {
        this.pes = pes;
    }

}
