package calismalarim;

public class Kitap {
    String ad;
    String yazar;
    boolean oduncVerildi;

    public void bilgileriGoster(){
        System.out.println("İsim: " + ad);
        System.out.println("Yazar:  " + yazar);
        if (oduncVerildi) {
            System.out.println("Durum: Ödünç Verildi");
        }
        else {
            System.out.println("Durum: Kütüphanede");
        }
    }
    public void oduncVer(){
        oduncVerildi = true;
        System.out.println(ad + "Ödünç verildi.");
    }
    public void geriAl(){
        oduncVerildi = false;
        System.out.println(ad + " Geri alındı.");
    }

}
