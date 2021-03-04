import javax.swing.*;

public class EntradaDeDados {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null, "Digite algum texto: ",
                "Teste - Entrada de Dados", JOptionPane.PLAIN_MESSAGE);
    System.out.println("Sua mensagem foi: " + texto);
    }
}
