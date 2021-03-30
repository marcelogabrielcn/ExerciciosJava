package sala07;

public class Arredondamentos {
    public static void main(String[] args) {
        int n1 = -10;
        int abs = Math.abs(n1);
        System.out.println("Valor absoluto de -10 é: " + abs);

        float n2 = 3.9f;
        float n3 = 4.1f;
        float n4 = 7.5f;
        double floor = Math.floor(n2);
        double ceil = Math.ceil(n3);
        double round = Math.round(n4);
        System.out.println("FLOOR - Arredonda pra baixo: " + n2 + " = " + floor);
        System.out.println("CEIL - Arredonda pra cima: " + n3 + " = " + ceil);
        System.out.println("ROUND - Arredonda aritméticamente: " + n4 + " = " + round);

    }
}
