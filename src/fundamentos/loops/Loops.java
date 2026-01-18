package fundamentos.loops;

public class Loops {

    public static void main(String[] args) {

        // 1. WHILE
        System.out.println("=== WHILE ===");

        int contador = 0;

        while (contador < 3) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // 2. DO WHILE
        System.out.println("\n=== DO WHILE ===");

        int numero = 5;

        do {
            System.out.println("Executa pelo menos uma vez");
            numero++;
        } while (numero < 5);

        // 3. FOR
        System.out.println("\n=== FOR ===");

        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }

        // 4. FOREACH
        System.out.println("\n=== FOREACH ===");

        int[] numeros = {10, 20, 30};

        for (int n : numeros) {
            System.out.println("Número: " + n);
        }

        // 5. BREAK
        System.out.println("\n=== BREAK ===");

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("i = " + i);
        }

        // 6. CONTINUE
        System.out.println("\n=== CONTINUE ===");

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
