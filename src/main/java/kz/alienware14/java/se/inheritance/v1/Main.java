package kz.alienware14.java.se.inheritance.v1;

public class Main {
    public static void main(String[] args) {
//        Crocodile crocodile1 = new Crocodile("Caiman", 5, 75);
//        crocodile1.getInfo(); Info from Crocodile class

        // Қай class шықырылады? Animal әлде Crocodile
          //Animal crocodile2 = new Crocodile("Gavial", 6, 100);
          //crocodile2.getInfo(); // Info from Crocodile class шақырады

        // getInfo әдісін constructor ішіннең шақыру нәтижесі қалай болар екен
        // Animal class constructor ішіндегі getInfo әдісі шақырады: Info from Crocodile class
        // себебі new Crocodile() құрамыз
            //Crocodile crocodile1 = new Crocodile("Caiman", 5, 75);
            Animal crocodile2 = new Crocodile("Gavial", 6, 100);

            //Animal animal = new Animal("Cat", 5); // Info from Animal class шақырады

    }
}
