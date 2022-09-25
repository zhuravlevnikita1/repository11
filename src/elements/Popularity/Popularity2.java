package elements.Popularity;

public class Popularity2{

    public static void main(String[] args) {
        popularity2 Popularity2 = new popularity2("455");
        System.out.println(popularity2.ads);
    }
}
class popularity2{

    static String ads;

    public popularity2(String ads) {
        this.ads = ads;
    }
}