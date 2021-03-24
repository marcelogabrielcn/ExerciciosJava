package sala06;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        //Para utilizar entrada de dados pelo teclado temos que importar uma biblioteca
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();
        System.out.printf("Olá %s, você tem %d anos \n", nome, idade);
    }
}
