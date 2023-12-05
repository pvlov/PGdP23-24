package W07;

public class Dog extends Animal {

    String color;

    public Dog(String name, String color) {
        super(name);
        this.color = color;
    }

    public static void main(String[] args) {

        Animal dog = new Dog("Cora", "black");
        dog.makeSound();
    }

    public void makeSound() {
        System.out.println("woof!");
    }
}


