/*public abstract class Pair {
    // Абстрактні методи для арифметичних операцій
    public abstract Pair add(Pair other);
    public abstract Pair subtract(Pair other);
    public abstract Pair multiply(int factor);
    public abstract Pair divide(int divisor);

    // Абстрактний метод toString
    @Override
    public abstract String toString();

    // Абстрактний метод equals
    @Override
    public abstract boolean equals(Object obj);
}
*/

public interface Pair {
    // Методи для арифметичних операцій
    Pair add(Pair other);
    Pair subtract(Pair other);
    Pair multiply(int factor);
    Pair divide(int divisor);

    // Метод для перетворення в строку
    String toString();

    // Метод для порівняння об'єктів
    boolean equals(Object obj);
}
