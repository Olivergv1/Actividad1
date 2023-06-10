import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();

        int level, problemType;

        do {
            System.out.println("Por favor seleccione el nivel de dificultad (1, 2, 3 o 4):");
            System.out.println("1. Números de un dígito.");
            System.out.println("2. Números de dos dígitos máximo.");
            System.out.println("3. Números de tres dígitos máximo.");
            System.out.println("4. Números de cuatro dígitos máximo.");
            level = scanner.nextInt();
        } while (level < 1 || level > 4);

        do {
            System.out.println("Por favor seleccione el tipo de problema aritmético a estudiar (1-5):");
            System.out.println("1. Problemas de suma solamente.");
            System.out.println("2. Problemas de resta solamente.");
            System.out.println("3. Problemas de multiplicación solamente.");
            System.out.println("4. Problemas de división solamente.");
            System.out.println("5. Mezcla aleatoria de problemas de todos los tipos.");
            problemType = scanner.nextInt();
        } while (problemType < 1 || problemType > 5);

        int num1, num2;

        switch (level) {
            case 1:
                num1 = secureRandom.nextInt(10);
                num2 = secureRandom.nextInt(10);
                break;
            case 2:
                num1 = secureRandom.nextInt(90) + 10;
                num2 = secureRandom.nextInt(90) + 10;
                break;
            case 3:
                num1 = secureRandom.nextInt(900) + 100;
                num2 = secureRandom.nextInt(900) + 100;
                break;
            case 4:
                num1 = secureRandom.nextInt(9000) + 1000;
                num2 = secureRandom.nextInt(9000) + 1000;
                break;
            default:
                num1 = 0;
                num2 = 0;
                break;
        }

        System.out.println("Programa terminado.");
    }
}
