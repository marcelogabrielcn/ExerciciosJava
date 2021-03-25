package Aula02Tarefa;

public class Livro {
    String nome;
    String autor;
    String editora;
    int ano;
    int paginas;
    boolean orelha;
    int leitura;

    void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Autor: " + this.autor);
        System.out.println("Editora: " + this.editora);
        System.out.println("Ano: " + this.ano);
        System.out.println("Páginas: " + this.paginas);
        System.out.println("Possui orelha? " + this.orelha);
        System.out.println("Leitura está em " + this.leitura + "%\n");
    }

    void ler(){
        if (this.leitura == 100){
            System.out.println("Opa, eu já li esse livro :)\n");
        } else if (this.leitura > 50){
            System.out.println("Opa, já comecei ler, vamos terminar.\n");
        } else {
            System.out.println("Maravilha, vamos começar ler.\n");
        }
    }
}
