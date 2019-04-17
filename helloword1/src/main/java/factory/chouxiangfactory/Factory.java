package factory.chouxiangfactory;

public class Factory implements ChouFactory {
    public Food getFood() {
        return new Apple();
    }

    public CanJu getCanJu() {
        return new Dao();
    }
}
