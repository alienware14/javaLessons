package kz.alienware14.java.se.new2025.Tasks;

import java.util.Scanner;

/*Тапсырма
Алғашқы бағдарламаны іске қосып көріңіз.
    Төмендегі сұрақтарды шешетін бағдарлама жазыңыз:
        Атыңызды және жасыңызды консольге шығарыңыз.*/
public class OutputYourNameAndAge01 {
    public static void main(String... args){
        String name = "Elaman";
        int age = 27;
        System.out.printf("Name: %s, Age: %s", name, age);
    }
}

// 1) Функция арқылы есім мен жасты консольге шығаратын бағдарлама жаса:
// 2) Бағдарламаны төмендегі параметрлермен шақыр:
//      Есім: Айдана, Жас: 22
//      Есім: Ержан, Жас: 30
class PrintNameAndAgeToConsoleUsingFunction{
    public static void main(String[] args) {
        printNameAndAge("Айдана", 22);
        printNameAndAge("Ержан", 30);
    }
    static void printNameAndAge(String name, int age){
        System.out.printf("Есім: %s, Жас: %d\n", name, age);
    }
}


/*
1) Деректерді пайдаланушыдан енгізу:
    Scanner класы арқылы қолданушыдан есім мен жасын сұра:
2)Цикл арқылы бірнеше адамның деректерін енгізу:
    Бірнеше адамның есімі мен жасын енгізіп, оларды көрсететін бағдарлама жаса.*/
class DataInputFromTheUser{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do{
            dataInputFromTheUser(scanner);

            System.out.print("Бағдарламаны тоқтату үшін 'exit' деп жазыңыз, жалғастыру үшін Enter басыңыз: ");
            choice = scanner.nextLine();

        }while (!choice.equalsIgnoreCase("exit"));

        System.out.println("\nБағдарлама аяқталды.");
    }
    public static void printNameAndAge(String name, int age){
        System.out.printf("Name: %s, Age: %d\n", name, age);
    }

    public static void dataInputFromTheUser(Scanner scanner){

        System.out.print("Есіміңізді енгізіңіз: ");
        String name = scanner.nextLine();

        System.out.print("Жасыңызды енгізіңіз: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        printNameAndAge(name, age);
    }
}

/**
 * /Жаңа тапсырма:
 * Мақсат: Бағдарлама арқылы қолданушыдан екі есім мен жасты енгізіп,
 * олардың арасында ең үлкен адамды анықтау.
 * Тапсырма:
 * Қолданушыдан екі адамның есімдері мен жастарын енгізуді сұраңыз.
 * Екі адамның арасынан кімнің жасы үлкен екенін анықтаңыз және нәтижені көрсетіңіз.
 */
class CompareNamesAndAges{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            dataInputFromTheUser(scanner);

            System.out.print("Бағдарламаны тоқтату үшін 'exit' деп жазыңыз, жалғастыру үшін Enter басыңыз: ");
            choice = scanner.nextLine();

        }while (!choice.equalsIgnoreCase("exit"));

        System.out.println("\nБағдарлама аяқталды.");
    }
    static void dataInputFromTheUser(Scanner scanner){
        System.out.print("Бірінші адамның есімін енгізіңіз: ");
        String name1 = scanner.nextLine();
        System.out.print("Бірінші адамның жасын енгізіңіз: ");
        int age1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Екінші адамның есімін енгізіңіз: ");
        String name2 = scanner.nextLine();
        System.out.print("Екінші адамның жасын енгізіңіз: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();

        printNameAndAge(name1, age1, name2, age2);
    }

    static void printNameAndAge(String name1, int age1, String name2, int age2){
        String result;
        if(age1 == age2) result = "екеуі жасты";
        else if(age1 > age2) result = name1+" үлкен";
        else result = name2 + " үлкен";
        System.out.printf("Name1: %s , Age1: %d --- \n" +
                            "Name2: %s, Age2: %d --- \n%s\n",
                            name1, age1, name2, age2, result);
    }
}
