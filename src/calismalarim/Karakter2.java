package calismalarim;

public class Karakter2 {
    public static void main(String[] args) {

        Karakter oyuncu = new Karakter();

        oyuncu.isim = "Umut";
        oyuncu.can = 2400;
        oyuncu.hasar = 120;

        oyuncu.bilgileriGoster();

        oyuncu.saldir();
    }
}
