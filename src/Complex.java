public class Complex /*extends*/ implements Pair {
    private double real;  // Дійсна частина
    private double imaginary;  // Уявна частина

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public Pair add(Pair other) {
        if (other instanceof Complex) {
            Complex c = (Complex) other;
            return new Complex(this.real + c.real, this.imaginary + c.imaginary);
        }
        throw new IllegalArgumentException("Неправильний тип для додавання");
    }

    @Override
    public Pair subtract(Pair other) {
        if (other instanceof Complex) {
            Complex c = (Complex) other;
            return new Complex(this.real - c.real, this.imaginary - c.imaginary);
        }
        throw new IllegalArgumentException("Неправильний тип для віднімання");
    }

    @Override
    public Pair multiply(int factor) {
        return new Complex(real * factor, imaginary * factor);
    }

    @Override
    public Pair divide(int divisor) {
        return new Complex(real / divisor, imaginary / divisor);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Complex complex = (Complex) obj;
        return Double.compare(complex.real, real) == 0 && Double.compare(complex.imaginary, imaginary) == 0;
    }
}
