public class Mammal extends Animal {
    private String furColor;

    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    void makeSound() {
        System.out.println("The mammal makes a generic sound");
    }

    public void displayMammalInfo() {
        displayInfo();
        System.out.println("Fur Color: " + furColor);
    }
}
