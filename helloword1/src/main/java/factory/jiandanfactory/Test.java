package factory.jiandanfactory;

public class Test {
    public static void main(String[] args) {
        Human human = new Factory().get("male");
        human.eat();
    }
}
