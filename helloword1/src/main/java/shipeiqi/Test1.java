package shipeiqi;

public class Test1 {
    public static void main(String[] args) {
        B b = new B();
        ShiPeiQi shiPeiQi = new ShiPeiQi(b);
        Home home = new Home(shiPeiQi);
        home.get();
    }
}
