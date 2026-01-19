package fundamentos.interfaces;

public class MainInterface {

    public static void main(String[] args) {

        Ligavel l1 = new Lampada();
        Ligavel l2 = new Televisao();

        l1.ligar();
        l2.ligar();
    }
}
