public class Bird extends Animal{
    private double wingSpan;

    public Bird(String name, int age, double wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }

    @Override
    void makeSound() {
        System.out.println("The bird chirps.");
    }

    public void fly() {
        System.out.println("The bird is flying with its " + wingSpan + " meter wingspan");
    }
}
