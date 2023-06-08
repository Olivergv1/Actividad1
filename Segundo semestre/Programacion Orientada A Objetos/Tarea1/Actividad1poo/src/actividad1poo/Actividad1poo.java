import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();

        boolean keepPlaying = true;

        while (keepPlaying) {
            int level, problemType, correctCount = 0;

            do {
                System.out.println("Por favor seleccione el nivel de dificultad (1, 2, 3 o 4):");
                System.out.println("1. Números de un dígito.");
                System.out.println("2. Números de dos dígitos .");
                System.out.println("3. Números de tres dígitos .");
                System.out.println("4. Números de cuatro dígitos .");
                level = scanner.nextInt();
            } while (level < 1 || level > 4);