package fundamentos.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {

        // Fonte de dados (collection)
        List<String> nomes = Arrays.asList(
                "João",
                "Maria",
                "Pedro",
                "Ana",
                "Joana",
                "Paulo",
                "José"
        );

        List<String> resultado = nomes.stream()          // cria a stream
                .filter(nome -> nome.startsWith("J"))    // filtra
                .map(String::toUpperCase)                // transforma
                .sorted()                                // ordena
                .collect(Collectors.toList());

        System.out.println("Resultado final:");
        resultado.forEach(System.out::println);
    }
}
