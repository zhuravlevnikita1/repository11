package elements.Vehicles;

public class Vehicle2{

    public static void main(String[] args) {
        vehicle2 Vehicle2 = new vehicle2("BMW", "M2");
        System.out.println(vehicle2.model);
    }
}
class vehicle2{

    static String name;
    static String model;
    public vehicle2(String name, String model) {
        this.name = name;
        this.model = model;
    }
}