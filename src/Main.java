import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();

        int level, problemType;
        int correctCount = 0;

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

        if (problemType == 5) {
            problemType = secureRandom.nextInt(4) + 1;
        }

        for (int i = 1; i <= 5; i++) {
            int num1, num2, answer, userAnswer;
            String message;
            boolean isCorrect;

            switch (level) {
                case 1:
                    num1 = secureRandom.nextInt(10);
                    num2 = secureRandom.nextInt(10);
                    break;
                case 2:
                    num1 = secureRandom.nextInt(100);
                    num2 = secureRandom.nextInt(100);
                    break;
                case 3:
                    num1 = secureRandom.nextInt(1000);
                    num2 = secureRandom.nextInt(1000);
                    break;
                case 4:
                    num1 = secureRandom.nextInt(10000);
                    num2 = secureRandom.nextInt(10000);
                    break;
                default:
                    num1 = secureRandom.nextInt(10);
                    num2 = secureRandom.nextInt(10);
                    break;
            }

            switch (problemType) {
                case 1:
                    message = num1 + " + " + num2 + " = ";
                    answer = num1 + num2;
                    break;
                case 2:
                    message = num1 + " - " + num2 + " = ";
                    answer = num1 - num2;
                    break;
                case 3:
                    message = num1 + " * " + num2 + " = ";
                    answer = num1 * num2;
                    break;
                case 4:
                    while (num2 == 0) {    // hace que la division no sea para cero
                        
                        num2 = secureRandom.nextInt(num1);
                    }
                       // esto ajusta num1 para uqe coincida con la division y no salga error
                    num1 = num1 * num2;
                    message = num1 + " / " + num2 + " = ";
                    answer = num1 / num2;
                    break;
                default:
                    message = "";
                    answer = 0;
                    break;
            }

            System.out.println("Pregunta " + i + ": " + message);
            userAnswer = scanner.nextInt();
            isCorrect = userAnswer == answer;

            if (isCorrect) {
                String[] positiveResponses = {"¡Muy bien!", "¡Excelente!", "¡Buen trabajo!", "¡Sigue así!"};
                int randomIndex = secureRandom.nextInt(positiveResponses.length);
                System.out.println(positiveResponses[randomIndex]);
                correctCount++;
            } else {
                String[] negativeResponses = {"No. Por favor intenta de nuevo.", "Incorrecto.", "Intenta una vez más.", "¡No te rindas!", "No. Sigue intentando."};
                int randomIndex = secureRandom.nextInt(negativeResponses.length);
                System.out.println(negativeResponses[randomIndex]);
            }
        }

        double percentage = (double) correctCount / 5 * 100;

        if (percentage >= 75) {
            System.out.println("¡Felicidades, estás listo para pasar al siguiente nivel!");
        } else {
            System.out.println("Por favor pide ayuda adicional a tu instructor.");
        }
    }
}
