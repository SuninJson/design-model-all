public class DenimJacketWearer extends Wearer implements Wearable {

    private Wearable wearable;

    public DenimJacketWearer(Wearer wearer) {
        super(wearer.name);
        this.wearable = wearer;
    }

    @Override
    public void wear() {
        wearable.wear();
        System.out.println("我穿着一条牛仔上衣");
    }
}
