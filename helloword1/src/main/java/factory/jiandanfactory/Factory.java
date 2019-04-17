package factory.jiandanfactory;

public class Factory {
    //简单工厂
   public Human get(String key) {
       if (key.equals("male")) {
           return new Hale();
       }
       else if (key.equals("female")) {
           return new FeMale();
       }else{
           return null;
       }

   }
}
