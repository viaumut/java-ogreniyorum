package calismalarim;

public class Telefon2 {
    public static void main(String[] args) {
        Telefon telefon = new Telefon();

        telefon.marka = "Xiaomi";
        telefon.fiyat = 52000;
        telefon.mah = "5000";
        telefon.renk = "Gri";

        telefon.bilgileriGoster();

        telefon.ara();

        telefon.ara("Umut");

    }
}
