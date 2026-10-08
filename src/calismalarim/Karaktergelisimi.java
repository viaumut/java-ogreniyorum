package calismalarim;

public class Karaktergelisimi {

      String isim;
      int can;
      int hasar;
      int seviye;


      public void bilgileriGoster(){
          System.out.println("İsim:  " + isim);
          System.out.println("Can:  " + can);
          System.out.println("Hasar:  " + hasar);
          System.out.println("Seviye:  " + seviye);

      }
      public void saldir(){
          System.out.println(isim+ " saldirdi! ");
      }

      public void seviyeAtla(){
          seviye++;
          hasar +=5;

          System.out.println(isim + " seviye atladi! ");

      }
}
