package calismalarim;

public class Karakter {
    String isim;
    int can;
    int hasar;

    public void bilgileriGoster() {

        System.out.println("İsim:  " + isim);
        System.out.println("Can:  " + can);
        System.out.println("Hasar: " + hasar);

    }
    public void saldir() {
        System.out.println(isim + " saldırdı! ");
    }

}
