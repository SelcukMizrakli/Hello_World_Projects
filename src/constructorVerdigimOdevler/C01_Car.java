package constructorVerdigimOdevler;

public class C01_Car {

    String renk;
    int yil;
    String model;

    public void C01_Car(){

        System.out.println("Parametresiz constructor");

    }
    C01_Car(String model, int yil ,String renk){

        this.model = model;
        this.yil = yil;
        this.renk = renk;

        System.out.println("Parametreli constructor");

        System.out.println("Model: "+this.model);
        System.out.println("Yıl: "+this.yil);
        System.out.println("Renk: "+this.renk);
    }

    public static void main(String[] args) {

        C01_Car car = new C01_Car("BMW",2023,"Siyah");
        System.out.println(car.renk);
        System.out.println(car.model);
        System.out.println(car.yil);

        a();
    }

    public static void a(){
        System.out.println("a");
    }
}
