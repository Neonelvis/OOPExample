public class Dolphin extends Mammal implements Swimmable{
    private double swimSpeed;

    public Dolphin(String name, int age, String furColor, double swimSpeed) {
        super(name, age, furColor);
        this.swimSpeed = swimSpeed;
    }

    @Override
    void makeSound() {
        System.out.println("The Dolphin clicks and whistles.");
    }

    @Override
    public void swim(){
        System.out.println("The dolphin swims at " + swimSpeed + "km/h");
    }
}
