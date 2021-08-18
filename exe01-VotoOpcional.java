import java.util.Scanner;

public class VotoOpcional {
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        System.out.println("Qual se ano de nascimento?");
        int nasc = t.nextInt();
        int idade = 2021 - nasc;
        if (idade < 16){
            System.out.println("Com " + idade + " anos, o voto é proibido!");
        } else {
            if ((idade >= 16 && idade < 18) || (idade > 65)){
                System.out.println("Com " + idade + " anos, o voto é opcional.");
            } else {
                System.out.println("Com " + idade + " anos, o voto é obrigatório!");
            }
        }
    }
}
