public class Wolf extends Dog{
    //DATA name FAvoriteDogFood
    public int speed ;

    //func


    public Wolf(String name, String favoriteDogFood, int speed) {
        super(name, favoriteDogFood);
        this.speed = speed;
    }

    @Override
    public void Bark() {
        System.out.println("wof wof wof wof wof woooooof ");
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + name + '\'' +
                ", favoriteDogFood='" + favoriteDogFood + '\'' +
                ", speed=" + speed +
                '}';
    }
}
