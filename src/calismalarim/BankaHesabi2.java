package calismalarim;

public class BankaHesabi2 {
    public static void main(String[] args) {
        BankaHesabi hesap = new BankaHesabi();

        hesap.hesapSahibi = "Umut";
        hesap.bakiye = 4000;

        hesap.bakiyeGoster();
        hesap.paraYatir(500);
        hesap.bakiyeGoster();
        hesap.paraCek(175);
        hesap.bakiyeGoster();

    }

}
