public class Dog extends Animal {
    //DATA super name
    public String favoriteDogFood;

    //func
    public Dog(String name, String favoriteDogFood) {
        super(name);
        this.favoriteDogFood = favoriteDogFood;
    }

    public void Bark(){
        System.out.println("woooooooph");
    }

    @Override
    public void makeSound() {
        Bark();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", favoriteDogFood='" + favoriteDogFood + '\'' +
                '}';
    }
}

