package fundamentos.condicionais;

public class Condicionais {

    public static void main(String[] args) {

        int idade = 17;

        // 1. IF
        if(idade >= 18) {
            System.out.println("Você é maior de idade.");
        }

        // 2. IF/ELSE
        if(idade >= 18){
            System.out.println("Pode entrar na festa.");
        } else {
            System.out.println("Entrada proibida.");
        }

        // 3. IF/ELSE IF/ELSE
        double nota = 6.5;

        if (nota >= 7) {
            System.out.println("Aprovado!");
        } else if (nota >= 5) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }

        // 4. OPERADORES RELACIONAIS
        int a = 10;
        int b = 5;

        System.out.println(a > b);   // true
        System.out.println(a < b);   // false
        System.out.println(a == b);  // false
        System.out.println(a != b);  // true
        System.out.println(a >= b);  // true
        System.out.println(a <= b);  // false

        // 5. OPERADORES LÓGICOS
        boolean temCarteira = true;
        boolean temCarro = false;

        if (temCarteira && temCarro) {
            System.out.println("Pode dirigir.");
        } else {
            System.out.println("Não pode dirigir.");
        }

        if (temCarteira || temCarro) {
            System.out.println("Tem pelo menos um dos dois.");
        }

        if (!temCarro) {
            System.out.println("Não tem carro.");
        }

        // 6. SWITCH
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
        }
    }
}