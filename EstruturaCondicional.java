import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int nasc = teclado.nextInt();
        int idade = 2021 - nasc;
        if (idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
}
