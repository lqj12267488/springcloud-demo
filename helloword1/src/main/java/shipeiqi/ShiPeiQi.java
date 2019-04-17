package shipeiqi;

public class ShiPeiQi implements Guonei{
    //适配器
    private Guowai guowai;

    public ShiPeiQi(Guowai guowai) {
        this.guowai = guowai;
    }



    public void chongdain() {
        guowai.chongdain();
    }
}
