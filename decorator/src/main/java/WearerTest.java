public class WearerTest {
    public static void main(String[] args) {
        Wearer jim = new Wearer("Jim");
        Wearer tom = new Wearer("Tom");

        jim = new JeansWearer(new TShirtWearer(jim));
        tom = new JeansWearer(new DenimJacketWearer(tom));

        jim.wear();
        System.out.println();
        tom.wear();
    }
}
