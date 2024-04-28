class Pet {
    private String petName;
    private String owner;

    public Pet(String petName, String owner) {
        this.petName = petName;
        this.owner = owner;
    }

    public String getPetName() {
        return petName;
    }

    public String getOwner() {
        return owner;
    }
}

interface SoundMaker {
    String makeSound();
}

interface Eater {
    String eat();
}

class Dog extends Pet implements SoundMaker, Eater {
    public Dog(String petName, String owner) {
        super(petName, owner);
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }

    @Override
    public String eat() {
        return "Eating dog food...";
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Fido", "John");
        System.out.println("Pet name: " + myDog.getPetName());
        System.out.println("Owner: " + myDog.getOwner());
        System.out.println("Sound: " + myDog.makeSound());
        System.out.println("Eating: " + myDog.eat());
    }
}
