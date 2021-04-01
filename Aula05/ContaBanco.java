package Aula05;

public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Método Construtor
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    // Métodos Especiais
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Métodos Personalizados
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (t.equals("CC")){
            this.setSaldo(50);
        } else if (t.equals("CP")){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso! Saldo atual: R$" + getSaldo());
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Esta conta ainda tem dinheiro!");
        } else if (this.getSaldo() < 0){
            System.out.println("Esta conta está em débito.");
        } else {
            this.setStatus(false);
        }
    }

    public void depositar(float v){
        setSaldo(getSaldo() + v);
    }

    public void sacar(float v){
        setSaldo(getSaldo() - v);
    }

    public void pagarMensal(){
        setSaldo(getSaldo() - 30);
    }

}
