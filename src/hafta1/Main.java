package hafta1;

import hafta1.Employee;

public class Main {
    public static void main(String[] args) {

        Employee ahmet = new Employee();
        ahmet.name = "Ahmet";
        ahmet.socialSecurityNumber = "123456788967";
        ahmet.workingHours = 160;
        ahmet.wage = 27000f; // 27.000f yerine 27000f (veya 27_000f) kullanıldı.

        ahmet.displayInfo();

        System.out.println("Toplam Maas: " + ahmet.displaySalary());

    }
}