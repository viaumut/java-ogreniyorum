package hafta1;

public class Employee {
    public String name;
    public String socialSecurityNumber;
    public float wage;
    public int workingHours;

    public void displayInfo() {
        System.out.println("Ad: " + name + "\n" + "T.C: " + socialSecurityNumber);
        System.out.println("Maas: " + wage*workingHours);
    }

    public float displaySalary() {
        return wage * workingHours;
    }
}