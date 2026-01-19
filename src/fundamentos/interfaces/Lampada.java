package fundamentos.interfaces;

public class Lampada implements Ligavel {

    @Override
    public void ligar() {
        System.out.println("Lâmpada acessa");
    }
}
