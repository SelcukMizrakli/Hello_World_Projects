package constructorVerdigimOdevler;
public class C03_Mentoring2 {
    String isim = "Fatih" ;
    String soyisim = "Deniz";
    int yas = 43;
    C03_Mentoring2() {
        isim =  "Lucy";
        yas = 30;
    }
    C03_Mentoring2(String isim) {
        this();
        this.isim = isim;
        System.out.println("String Paremetreli Constructor\n");
    }
    C03_Mentoring2(String isim, int yas){
        this.isim = "Saul";
        this.yas = yas;
    }
    C03_Mentoring2(String isim, String soyisim) {
        System.out.println(isim + " " + this.soyisim);
        this.soyisim = soyisim;
    }
    C03_Mentoring2(String isim, String soyisim, int yas) {
        this(isim);
        this.soyisim = soyisim;
        this.yas = yas;
    }
    public static void main(String[] args) {
        C03_Mentoring2 obj1 = new C03_Mentoring2();
        C03_Mentoring2 obj2 = new C03_Mentoring2("Alex");
        C03_Mentoring2 obj3 = new C03_Mentoring2("Selin","Ateş");
        C03_Mentoring2 obj4 = new C03_Mentoring2("Ahmet","Mürsel",49);
        C03_Mentoring2 obj5 = new C03_Mentoring2("Sena", 25);

        System.out.println(obj2.isim + " "+ obj4.yas);

        System.out.println(obj1.isim +" "+ obj3.soyisim);

        System.out.println(obj3.yas +" "+ obj1.yas);

        System.out.println(obj2.soyisim+" "+ obj2.yas);

        System.out.println(obj5.isim + obj5.yas);

        System.out.println(obj4.soyisim + obj4.yas);

        System.out.println(obj4.yas+ obj1.yas);

    }
}