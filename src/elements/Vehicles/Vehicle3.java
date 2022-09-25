package elements.Vehicles;

public class Vehicle3{

    public static void main(String[] args) {
        vehicle3 Vehicle3 = new vehicle3("Mercedes", "C280");
        System.out.println(vehicle3.model);
    }
}
class vehicle3{

    String name;
    static String model;
    public vehicle3(String name, String model) {
        this.name = name;
        this.model = model;
    }
}