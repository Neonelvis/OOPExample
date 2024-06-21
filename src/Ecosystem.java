public class Ecosystem {
    public static void main(String[] args) {
        // creating an array of animal objects (demonstrating Polymorphism)
        Animal[] animals = new Animal[3];

        animals[0] = new Mammal("Lion", 5, "Golden");
        animals[1] = new Dolphin("Flipper", 18, "Grey", 40);
        animals[2] = new Bird("Eagle", 3, 2.1);

        // Demonstrating Polymorphism and abstraction
        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();

            // Using instanceOf to check the specific type of animal
            if (animal instanceof Mammal) {
                ((Mammal) animal).displayMammalInfo();
            }

            if (animal instanceof Bird) {
                ((Bird) animal).fly();
            }

            // add a blank line for readability
            System.out.println();
        }
    }
}
