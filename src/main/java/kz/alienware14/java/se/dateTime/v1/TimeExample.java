package kz.alienware14.java.se.dateTime.v1;

public class TimeExample {
    public static void main(String[] args) {
        long time = System.currentTimeMillis(); // wall-clock time
        System.out.println("Число миллисекунд прошедших с 00:00:00 UTC 1 января 1970 года: " + time);

        long nanoTime = System.nanoTime(); // just timer
        System.out.println("Число наносекунд прошедших с какого-то момента X: " + nanoTime);

        System.out.println("Измерение времени работы кода: " + measureTime(() -> {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }));
    }

    private static Long measureTime(Runnable codeToMeasure) {
        Long startTime = System.nanoTime();
        codeToMeasure.run();
        return System.nanoTime() - startTime;
    }
}
