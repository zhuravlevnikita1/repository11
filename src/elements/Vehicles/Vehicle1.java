package elements.Vehicles;

public class Vehicle1{

    public static void main(String[] args) {
    vehicle1 Vehicle1 = new vehicle1("Audi", "A5");
    System.out.println(vehicle1.model);
    }
}
class vehicle1{

    static String name;
    static String model;
        public vehicle1(String name, String model) {
            this.name = name;
            this.model = model;
    }
}
