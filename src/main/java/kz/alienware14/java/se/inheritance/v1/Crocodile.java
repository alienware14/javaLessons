package kz.alienware14.java.se.inheritance.v1;

public class Crocodile extends Animal{
    public static String crocodileStaticField = "Crocodile static text";
    int numberOfTeeth;
    String className = "Crocodile class";
    public Crocodile(String family, int age, int numberOfTeeth) {
        super(family, age);

        System.out.println();
        System.out.println("Crocodile static field:" + crocodileStaticField);
        System.out.println("Animal static field:" + Animal.animalStaticField);
        System.out.println("Crocodile field text:" + className);

        System.out.printf(" Crocodile family: %s\n Crocodile age: %s\n Crocodile numberOfTeeth: %s\n",
                this.family, this.age, this.numberOfTeeth);

        System.out.println("Crocodile initialisation from construction");

        this.numberOfTeeth = numberOfTeeth;

        System.out.printf(" Crocodile family: %s\n Crocodile age: %s\n Crocodile numberOfTeeth: %s\n",
                this.family, this.age, this.numberOfTeeth);

        getInfo();
    }

    @Override
    public void getInfo() {
        System.out.println("Info from Crocodile class");
        System.out.printf(" Family: %s, age: %s, numberOfTeeth: %s", family, age, numberOfTeeth);
    }
}
