package Aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.setModelo("Bic Crystal");
        c1.setPonta(0.5f);
        c1.destampar();
        c1.status();

        Caneta c2 = new Caneta();
        c2.setModelo("Compactor Economic");
        c2.setCor("Vermelho");
        c2.setPonta(0.7f);
        c2.status();

        Caneta c3 = new Caneta();
        c3.status();
    }
}
