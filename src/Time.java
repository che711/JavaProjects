import java.util.concurrent.TimeUnit;


public class Time {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // Добавленная строка

        long startTime = System.currentTimeMillis(); // Записываем текущее время в миллисекундах

        // Выполняем некоторую задачу, для примера просто делаем паузу
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis(); // Записываем текущее время в миллисекундах

        long elapsedTime = endTime - startTime; // Вычисляем прошедшее время

        System.out.println("Прошло " + elapsedTime + " миллисекунд.");
    }
}

