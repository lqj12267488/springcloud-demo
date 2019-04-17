package shipeiqi;

public class Home {
    private Guonei  guonei;

    public Home(Guonei guonei) {
        this.guonei = guonei;
    }

  /*  public void setGuonei(ShiPeiQi guowai) {
        this.guonei = guowai;
    }*/

    //充电方法
    public void get() {
        guonei.chongdain();
    }
}
