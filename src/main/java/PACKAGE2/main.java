package PACKAGE2;

public class main {

    public static void main(String[] args) {
         Imprimant1 I=new imprimantimpl1();
        Imprimant1 I2=new imprimantimple2();
        Imprimant1 I3=new imprimantimple3();
        Imprimant1 I4=new imprimantimple2();

        Imprimant im=new Imprimant("hello ",I);
        Imprimant im2=new Imprimant("hello ",I2);
        Imprimant im3=new Imprimant("hello ",I3);
        Imprimant im4=new Imprimant("hello ",I4);
        
        im.imprimer();
        im3.imprimer();
    }
}
