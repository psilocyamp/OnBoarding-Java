package day_4;
import java.util.Scanner;

//Esta clase implementa los métodos de CalculatorMenu y utiliza un objeto Calculator para realizar las operaciones.

public class CalculatorWithMenu implements CalculatorMenu{
    private final Operation calculator; //instancia de CalculatorOperations para realizar operaciones matemáticas.
    private final Scanner scanner; // para leer la entrada del usuario desde la consola.

public CalculatorWithMenu(Operation calculator) {
    this.calculator = calculator;
    this.scanner = new Scanner(System.in);
}

@Override
public void showMenu() {  //muestra un menú de opciones y llama a executeOperation basado en la entrada del usuario.
    while (true) {
        System.out.println("\n=== Calculator Menu ===");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("0. Exit");
        System.out.print("Select an option: ");

        int option = scanner.nextInt();
        if (option == 0) {
            break;
        }
        executeOperation(option);
    }
    }
    @Override
    public void executeOperation(int option) {     //solicita números al usuario, realiza la operación seleccionada y muestra el resultado.
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        double result;
        try {
            switch (option) {
                case 1:
                    result = calculator.add(a, b);
                    break;
                case 2:
                    result = calculator.subtract(a, b);
                    break;
                case 3:
                    result = calculator.multiply(a, b);
                    break;
                case 4:
                    result = calculator.divide(a, b);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    return;
            }
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}