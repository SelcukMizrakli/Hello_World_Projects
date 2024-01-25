package constructorVerdigimOdevler;

public class C01_Constructor_OrneklerleConstructor {
    String isim = "Fatih" ;
    String soyisim = "Deniz";
    int yas = 43;

    C01_Constructor_OrneklerleConstructor() {
        System.out.println("Parametresiz Constructor Çalıştı.");
        System.out.println("Isim :" + this.isim);
        System.out.println("Soyisim :" + this.soyisim);
        System.out.println("Yaş :" + this.yas + "\n");
    }

    C01_Constructor_OrneklerleConstructor(String isim) {
        this();
        this.isim = isim;
        System.out.println("String Paremetreli Constructor\n");

    }

    C01_Constructor_OrneklerleConstructor(String isim, String soyisim) {
        System.out.println(isim + " " + this.soyisim);

        this.soyisim = soyisim;

    }

    C01_Constructor_OrneklerleConstructor(String isim, String soyisim, int yas) {
        this(isim);
        this.soyisim = soyisim;
        this.yas = yas;
        System.out.println("Soyisim "+ this.soyisim + "\nYaş " + yas);

    }

    public static void main(String[] args) {

        C01_Constructor_OrneklerleConstructor obj1 = new C01_Constructor_OrneklerleConstructor();
        C01_Constructor_OrneklerleConstructor obj2 = new C01_Constructor_OrneklerleConstructor("Alex");
        C01_Constructor_OrneklerleConstructor obj3 = new C01_Constructor_OrneklerleConstructor("Selin","Ateş");
        C01_Constructor_OrneklerleConstructor obj4 = new C01_Constructor_OrneklerleConstructor("Ahmet","Mürsel",49);

        System.out.println(obj4.isim);

    }
}
