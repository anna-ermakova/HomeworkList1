package Multiplication;

import java.util.Objects;

public class Multiplication {
    private final int a;
    private final int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public Multiplication(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Multiplication multiplication = (Multiplication) o;
        return a == multiplication.a && b == multiplication.b || a == multiplication.b && b == multiplication.a;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(a) + Objects.hashCode(b);
    }

    @Override
    public String toString() {
        return a + " * " + b + " = " + a * b;
    }
}