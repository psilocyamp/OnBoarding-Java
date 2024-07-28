package day_4;

public interface Operation {
    double add (double a, double b);
    double subtract (double a, double b);
    double multiply (double a, double b);
    double divide (double a, double b) throws ArithmeticException;
}
//contrato que define qué métodos deben implementarse en cualquier clase que "implemente" esa interfaz.