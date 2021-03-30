package sala07;

public class NumeroAleatorio {
    public static void main(String[] args) {
        double ale = Math.random();
        System.out.println("RANDOM - Gera um número aleatório entre 0 e 1. " + ale);
        System.out.println("Podemos gerar outro número aleatório, mas precisamos de um macete matemático.");
        int bigale = (int) (0 + Math.random() * (50-0));
        System.out.println("Número aleatório entre 0 e 50: " + bigale);

    }
}
