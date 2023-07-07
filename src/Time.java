import java.util.concurrent.TimeUnit;

public class Time {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // Записываем текущее время в миллисекундах

        // Выполняем некоторую задачу, для примера просто делаем паузу
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis(); // Записываем текущее время в миллисекундах

        long elapsedTime = endTime - startTime; // Вычисляем прошедшее время

        System.out.println("Прошло " + elapsedTime + " миллисекунд.");
    }
}
