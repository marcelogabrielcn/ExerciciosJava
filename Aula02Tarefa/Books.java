package Aula02Tarefa;

public class Books {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.nome = "Quem me dera ser feliz";
        l1.autor = "Júlio Emílio Braz";
        l1.editora = "Editora do Brasil";
        l1.ano = 2011;
        l1.paginas = 110;
        l1.orelha = false;
        l1.leitura = 30;
        l1.status();
        l1.ler();

        Livro l2 = new Livro();
        l2.nome = "CHEFE todo mundo tem";
        l2.autor = "Maria Cristina Von Atzingen";
        l2.editora = "Bertrand Brasil";
        l2.ano = 1998;
        l2.paginas = 92;
        l2.orelha = true;
        l2.leitura = 0;
        l2.status();
        l2.ler();

        Livro l3 = new Livro();
        l3.nome = "A marca de uma lágrima";
        l3.autor = "Pedro Bandeira";
        l3.editora = "Moderna";
        l3.ano = 1985;
        l3.paginas = 183;
        l3.orelha = false;
        l3.leitura = 100;
        l3.status();
        l3.ler();

        Livro l4 = new Livro();
        l4.nome = "Essencial";
        l4.autor = "Valdecir e Creriane Lima";
        l4.editora = "Casa Publicadora do Brasil";
        l4.ano = 2021;
        l4.paginas = 376;
        l4.orelha = true;
        l4.leitura = 55;
        l4.status();
        l4.ler();

        Livro l5 = new Livro();
        l5.nome = "Inegociável";
        l5.autor = "José Venefrides";
        l5.editora = "Casa Publicadora do Brasil";
        l5.ano = 2020;
        l5.paginas = 376;
        l5.orelha = true;
        l5.leitura = 100;
        l5.status();
        l5.ler();
    }
}
