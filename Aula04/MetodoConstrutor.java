package Aula04;

public class MetodoConstrutor {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public MetodoConstrutor(String m, String c, float p) {
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
    }
    public void situacao(){
        System.out.println("Situação da caneta: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
    }
}
