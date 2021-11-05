public class main {


    public static void main(String[] args) {
        //Animal an = new Animal("mosto");  //error abstract class
            Dog d1 = new Dog("gebor", "dogli");
            Wolf w1 = new Wolf("hetz", "bonzo", 18);
            Poodle p1 = new Poodle("chichi", "tslaot", 2);
            Horse h1 = new Horse("okor jack", true);


            Animal[] animalSong = new Animal[6];
            animalSong[0] = new Poodle("chichi", "tslaot", 2);
            ;
            animalSong[1] = new Horse("okor jack", true);
            ;
            animalSong[2] = new Wolf("hetz", "bonzo", 18);
            ;
            animalSong[3] = new Poodle("sumsum,", "tslaot", 2);
            ;
            animalSong[4] = new Wolf("woosta", "bonzo", 153);
            ;
            animalSong[5] = new Wolf("malik", "bonzo", 888);
            ;

        for(Animal an: animalSong){
            an.makeSound();
         /*  if (an instanceof Dog){
                System.out.println(((Dog) an).favoriteDogFood );
            } //down casting
        nonRascingHorses[0]= new Horse("katzav",false);
        nonRascingHorses[1]= new Horse("dvir",false);
        nonRascingHorses[2]= new Horse("yaron",false);
        nonRascingHorses[3]= new Horse("omer",false);
            */
        }
        Horse[] horses= new Horse[8];
        horses[0]= new Horse("katzav",false);
        horses[1]= new Horse("ameer",true);
        horses[2]= new Horse("shmulik",true);
        horses[3]= new Horse("dvir",true);
        horses[4]= new Horse("raoof",false);
        horses[5]= new Horse("yaron",false);
        horses[6]= new Horse("leah",false);
        horses[7]= new Horse("omer",false);

        System.out.println(GetRacingHorses(horses));
        Horse [] horses1=NotRacingHorses(horses);
        for (Horse hr:horses1){
            System.out.println(hr);
        }
    }
    public static int GetRacingHorses(Horse[] horses) {
        int counter = 0;
      /* for(Horse h : horses){ //foreach
            if(h.isRacingHorse== true) {
                counter++;
            }
        }*/
        for (int i=0;i<horses.length;i++){ // for
            if(horses[i].isRacingHorse == true){
                counter ++;
            }
        }
        return counter;
    }
    public static Horse[] NotRacingHorses(Horse[] horsesarray){
        int size = horsesarray.length-GetRacingHorses(horsesarray);
        Horse[] nonRacingHorses= new Horse[size];
        int c = 0;
        for (int i= 0; i<horsesarray.length;i++){
            if(horsesarray[i].isRacingHorse==false){
                nonRacingHorses[c]=horsesarray[i];
                c++;
            }
        }
        return  nonRacingHorses;
    }
}
