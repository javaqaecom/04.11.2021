public class Poodle extends Dog {
    //data   name, favoriteDogFood
    public int age;

    //func
    public Poodle(String name, String favoriteDogFood, int age) {
        super(name, favoriteDogFood);
        this.age = age;
    }

    @Override
    public void Bark() {
        System.out.println("hooow hoooow hooowww hooow");
    }

    @Override
    public String toString() {
        return "Poodle{" +
                "name='" + name + '\'' +
                ", favoriteDogFood='" + favoriteDogFood + '\'' +
                ", age=" + age +
                '}';
    }

}
