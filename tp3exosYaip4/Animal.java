package tp3exosYaip4;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal: Animal [name=\"" + name + "\"]";
    }
    
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        System.out.println(animal.toString());
    }
}
