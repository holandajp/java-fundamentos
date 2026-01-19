package fundamentos.interfaces;

public class Televisao implements Ligavel {

    @Override
    public void ligar() {
        System.out.println("TV ligada");
    }
}
