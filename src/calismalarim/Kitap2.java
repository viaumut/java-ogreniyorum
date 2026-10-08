package calismalarim;

public class Kitap2 {
    public static void main(String[] args) {
        Kitap kitap = new Kitap();

        kitap.ad = "Suç ve Ceza";
        kitap.yazar = "Dostoyevski";

        kitap.bilgileriGoster();
        System.out.println("----------------");
        kitap.oduncVer();
        kitap.bilgileriGoster();
        System.out.println("----------------");
        kitap.geriAl();
        kitap.bilgileriGoster();
    }
}
