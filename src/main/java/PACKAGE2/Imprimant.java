package PACKAGE2;

public class Imprimant {

    private String id;
    private Imprimant1 I;


    public Imprimant(String id, Imprimant1 i) {
        this.id = id;
        I = i;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Imprimant1 getI() {
        return I;
    }

    public void setI(Imprimant1 i) {
        I = i;
    }

    public void imprimer(){
        I.imprimant(id);
    }
}
