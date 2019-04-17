package factory.chouxiangfactory;

public class Test {
    public static void main(String[] args) {
        Factory factory = new Factory();
        System.out.println("正在吃"+factory.getFood().getFoodName()+"用"+factory.getCanJu().getCanJuName());
    }
}
