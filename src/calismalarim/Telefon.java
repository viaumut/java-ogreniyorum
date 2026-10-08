package calismalarim;

public class Telefon {
    String marka;
    int fiyat;
    String mah;
    String renk;

    public void bilgileriGoster(){
        System.out.println("Marka:  " + marka);
        System.out.println("Fiyat: " + fiyat);
        System.out.println("Mah: " + mah );
        System.out.println("Renk: " + renk);
    }

    public void ara(){
        System.out.println(marka + " ile arama yapılıyor...");
    }
    public void ara(String kisi){
        System.out.println(marka + " ile "  + kisi  + "aranıyor.");

    }
}
