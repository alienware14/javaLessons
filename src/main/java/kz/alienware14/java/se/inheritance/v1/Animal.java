package kz.alienware14.java.se.inheritance.v1;

public class Animal {
    public static String animalStaticField = "Animal static text";
    String family;
    int age;
    String className = "Animal class";

    public Animal(String family, int age){

        System.out.println("Animal static field:" + animalStaticField);
        System.out.println("Crocodile static field text:" + Crocodile.crocodileStaticField);
        System.out.println("Animal field text:" + className);

        System.out.printf(" Animal family: %s\n Animal age: %s\n",
                this.family, this.age);

        System.out.println("Animal initialisation from construction");

        this.family = family;
        this.age = age;

        System.out.printf(" Animal family: %s\n Animal age: %s\n",
                this.family, this.age);

        getInfo();
    }

    public void getInfo(){
        System.out.println("Info from Animal class");
        System.out.printf(" Family: %s, age: %s\n", family, age);
    }
}
