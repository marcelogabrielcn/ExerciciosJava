import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média foi: " + m);
        if (m > 7){
            System.out.println("Parábens, continue assim!");
        }
        else if (m > 5){
            System.out.println("Oops, você está de recuperação.");
        }
        else{
            System.out.println("Você está reprovado.");
        }

    }
}
