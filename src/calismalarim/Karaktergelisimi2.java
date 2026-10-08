package calismalarim;

public class Karaktergelisimi2 {
    public static void main(String[] args) {
        Karaktergelisimi oyuncu = new Karaktergelisimi();

        oyuncu.isim = "Umut";
        oyuncu.can = 2000;
        oyuncu.hasar = 100;
        oyuncu.seviye = 1;

        oyuncu.bilgileriGoster();
        System.out.println("-----------------");
        oyuncu.saldir();
        oyuncu.seviyeAtla();
        System.out.println("-----------------");
        oyuncu.bilgileriGoster();

    }
}
