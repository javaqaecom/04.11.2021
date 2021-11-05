public abstract class Animal {
    //DATA
    public String name;

    //func
    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
