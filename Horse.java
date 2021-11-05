public class Horse extends Animal{
    //DATA name
    public boolean isRacingHorse;

    //func
    public Horse(String name, boolean isRacingHorse) {
        super(name);
        this.isRacingHorse = isRacingHorse;
    }

    public void Neigh(){
        System.out.println("neeeeeiighghghgh");
    }

    @Override
    public void makeSound() {
        this.Neigh();
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", isRacingHorse=" + isRacingHorse +
                '}';
    }
}
