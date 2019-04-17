package factory.duogefactory;

public class Factory {

    public static Human getMale() {
        return new Male();
    }

    public static Human getFeMale() {
        return new FeMale();
    }
}
