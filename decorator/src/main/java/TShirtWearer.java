public class TShirtWearer extends Wearer implements Wearable {

    private Wearable wearable;

    public TShirtWearer(Wearer wearer) {
        super(wearer.name);
        this.wearable = wearer;
    }

    @Override
    public void wear() {
        wearable.wear();
        System.out.println("我穿着一条T恤");
    }
}
