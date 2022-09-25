package elements.Popularity;

public class Popularity1{

    public static void main(String[] args) {
        popularity1 Popularity1 = new popularity1("117");
        System.out.println(popularity1.ads);
    }
}
class popularity1{

    static String ads;

    public popularity1(String ads) {
        this.ads = ads;
    }
}