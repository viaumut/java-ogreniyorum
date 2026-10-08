package calismalarim;

public class BankaHesabi {
    String hesapSahibi;
    int bakiye;

    public void paraYatir(int miktar){
        bakiye += miktar;
        System.out.println(miktar + " TL yatırıldı. ");
    }

    public void paraCek(int miktar){
        bakiye -= miktar;
        System.out.println(miktar + " TL çekildi. ");
    }

    public void bakiyeGoster(){
        System.out.println("Bakiye: " + bakiye);
    }
}
