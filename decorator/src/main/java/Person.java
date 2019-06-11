public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void selfIntroduction() {
        System.out.println("大家好，我是" + name);
    }
}
