// Пример рекурсивной функции: вычисление факториала числа
public class Factorial {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1; // базовый случай
        } else {
            return n * factorial(n - 1); // рекурсивный вызов
        }
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Факториал " + number + " равен: " + factorial(number));
    }
}