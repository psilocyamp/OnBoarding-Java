package day_4;

//Esta interfaz define los métodos necesarios para mostrar un menú y ejecutar una operación basada en la selección del usuario.

public interface CalculatorMenu {
    void showMenu();
    void executeOperation(int option);
}