package Aula05;

public class Contas {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setDono("Marcelo");
        c1.setNumConta(471);
        c1.abrirConta("CP");

        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(472);
        c2.setDono("Larissa");
        c2.abrirConta("CC");

        c1.depositar(300);
        c2.depositar(1000);
        c2.sacar(150);
        c1.pagarMensal();
        c2.pagarMensal();
        c1.sacar(430);
        c1.fecharConta();

        c1.estadoAtual();
        c2.estadoAtual();
    }
}
