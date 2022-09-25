package elements.Averagecost;

public class cost3{

    public static void main(String[] args) {
        Cost3 cost3 = new Cost3("675000");
        System.out.println(Cost3.cost);
    }
}
class Cost3{

    static String cost;

    public Cost3(String cost) {
        this.cost = cost;
    }
}