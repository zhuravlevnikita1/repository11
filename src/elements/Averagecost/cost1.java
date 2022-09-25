package elements.Averagecost;

public class cost1{

    public static void main(String[] args) {
        Cost1 cost1 = new Cost1("2000000");
        System.out.println(Cost1.cost);
    }
}
class Cost1{

    static String cost;

    public Cost1(String cost) {
        this.cost = cost;
    }
}