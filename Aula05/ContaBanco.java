package Aula05;

import javax.swing.*;

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
    public void estadoAtual(){
        System.out.println("----------------------------------");
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
    }

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
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v){
        if (this.status) {
            this.setSaldo(getSaldo()+v);
            System.out.println("Valor depositado na conta de " + getDono());
        } else{
            System.out.println("Impossivel depositar em uma conta fechada!");
        }
    }

    public void sacar(float v){
        if (this.status) {
            if (getSaldo() >= v) {
                setSaldo(getSaldo() - v);
                System.out.println("Valor de R$" + v + ",00 foi sacado!");
            } else {
                System.out.println("Ops, a conta não possui esse valor para saque!");
            }
        } else {
            System.out.println("Está conta está fechada!");
        }
    }

    public void pagarMensal(){
        int v = 0;
        if (getTipo().equals("CC")) {
            v = 15;
        } else if (getTipo().equals("CP")) {
            v = 20;
        }
        if (getStatus()) {
            setSaldo(getSaldo() - v);
            System.out.println("Mensalidade paga, no valor de R$" + v + ",00");
        } else {
            System.out.println("Está conta está fechada!");
        }
    }

}
