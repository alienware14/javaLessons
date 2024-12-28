package kz.alienware14.java.se.switchExpression;

public class Example1 {

    public static void main(String[] args) {
        // Expression switch java +14
        expressionSwitchJava14(Day.FRIDAY);
        System.out.println(expressionSwitchJava14(Day.FRIDAY));
        // Expression switch
        System.out.println(expressionSwitch(Day.FRIDAY));
        // Statement(Good Old C-style Switch)
        System.out.println(oldSwitch(Day.FRIDAY));

    }

    private static int expressionSwitchJava14(Day day){
        // Expression switch java +14
        return switch (day){
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY -> 8;
            default-> 9;
        };
    }

    private static int expressionSwitch(Day day){
        // Expression switch
        return switch (day){
            case MONDAY, FRIDAY, SUNDAY:
                yield 6;
            case TUESDAY:
                System.out.println("Tuesday");
                yield 7;
            case THURSDAY:
                System.out.println("Thursday");
                yield 8;
            default: yield 9;
        };
    }
    private static int oldSwitch(Day day){
        int numLetters = 0;
        // Statement(Good Old C-style Switch)
        switch(day){
            case MONDAY, FRIDAY, SUNDAY:
                numLetters = 6;
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                numLetters = 7;
                break;
            case THURSDAY:
                System.out.println("Thursday");
                numLetters = 8;
                break;
            default: numLetters = 9;
        }
        return numLetters;
    }
}

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
