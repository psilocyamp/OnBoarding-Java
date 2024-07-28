package day_4;

//aca lo que hago es implementar la interfaz Operation para poder usar sus metodos

public class Calculator implements Operation {
    @Override
    public double add(double a, double b) {
        return a + b;
    }
    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

