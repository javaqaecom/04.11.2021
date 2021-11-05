public class PetWolf extends Wolf{

    public PetWolf(String name, String favoriteDogFood, int speed) {
        super(name, favoriteDogFood, speed);
    }

    @Override
    public void Bark() {
        System.out.println("oooo ooo oooo");
    }
}
