package day_4;

public class Main {

    public static void main(String[] args) {
        Operation calculator = new Calculator();
        CalculatorMenu menu = new CalculatorWithMenu(calculator);
        menu.showMenu();
    }
}


//PROCESO ENTERO DE CALCULADORA
//Definir Interfaces: Crear contratos que especifican qué métodos deben implementarse.
//Implementar Clases: Proveer la lógica para los métodos definidos en las interfaces.
//Crear Menús e Interacciones: Usar Scanner para obtener entrada del usuario y realizar operaciones basadas en esa entrada.
//Encapsulación y Abstracción: Proteger y organizar el código usando modificadores de acceso y métodos bien definidos.