/**
 * 着装打扮的人
 */
public class Wearer extends Person implements Wearable {


    public Wearer(String name) {
        super(name);
    }

    public void wear() {
        super.selfIntroduction();
        System.out.println("我正在着装");
    }
}
