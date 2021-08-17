import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = t.nextInt();
        if (num%2 == 0){
            System.out.println("O número é Par");
        } else{
            System.out.println("O número é ímpar");
        }
    }
}
