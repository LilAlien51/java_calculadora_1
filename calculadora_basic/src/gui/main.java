package gui;
import java.util.Scanner;

public class main {
    
    // Métodos para las operaciones básicas
    public static double sumar(double a, double b) {
        return a + b;
    }
    
    public static double restar(double a, double b) {
        return a - b;
    }
    
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero.");
            return 0;
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora Básica");
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Elige una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        
        int opcion = scanner.nextInt();
        double resultado = 0;
        
        switch(opcion) {
            case 1:
                resultado = sumar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = restar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                resultado = dividir(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Opción no válida.");
        }
        
        scanner.close();
    }
}
