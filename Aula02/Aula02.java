package Aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.status();
        c1.tampar();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Compactor Mocroline";
        c2.cor = "Vermelho";
        c2.ponta = 0.4f;
        c2.carga = 75;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
