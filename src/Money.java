public class Money /*extends*/ implements Pair {
    private int hryvnia;  // Гривні
    private int kopiyka;  // Копійки

    public Money(int hryvnia, int kopiyka) {
        this.hryvnia = hryvnia;
        this.kopiyka = kopiyka;
    }

    // Допоміжний метод для нормалізації копійок (перетворення 100 копійок у 1 гривню)
    private void normalize() {
        hryvnia += kopiyka / 100;
        kopiyka %= 100;
    }

    @Override
    public Pair add(Pair other) {
        if (other instanceof Money) {
            Money m = (Money) other;
            int totalKopiyka = this.kopiyka + m.kopiyka;
            int totalHryvnia = this.hryvnia + m.hryvnia;
            return new Money(totalHryvnia, totalKopiyka);
        }
        throw new IllegalArgumentException("Неправильний тип для додавання");
    }

    @Override
    public Pair subtract(Pair other) {
        if (other instanceof Money) {
            Money m = (Money) other;
            int totalKopiyka = this.kopiyka - m.kopiyka;
            int totalHryvnia = this.hryvnia - m.hryvnia;
            return new Money(totalHryvnia, totalKopiyka);
        }
        throw new IllegalArgumentException("Неправильний тип для віднімання");
    }

    @Override
    public Pair multiply(int factor) {
        return new Money(hryvnia * factor, kopiyka * factor);
    }

    @Override
    public Pair divide(int divisor) {
        int totalKopiyka = (hryvnia * 100 + kopiyka) / divisor;
        return new Money(totalKopiyka / 100, totalKopiyka % 100);
    }

    @Override
    public String toString() {
        normalize();
        return hryvnia + " грн " + kopiyka + " коп";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money money = (Money) obj;
        return hryvnia == money.hryvnia && kopiyka == money.kopiyka;
    }
}
