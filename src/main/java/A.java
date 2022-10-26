public class A {
   Interface_Strategie is;

    public A(Interface_Strategie is) {
        this.is = is;
    }

    public Interface_Strategie getIs() {
        return is;
    }

    public void setIs(Interface_Strategie is) {
        this.is = is;
    }

    public void choisirStrategie(Interface_Strategie I){
       is=I;
   }

   public void appliquerStrategie_de_f() {
       is.f();
   }


    public static void main(String[] args) {


        Interface_Strategie I=new       implementtationImplement1();
        Interface_Strategie I2=new       implementtationImplement2();

        A a=new A(I2);
        a.appliquerStrategie_de_f();
    }
}
