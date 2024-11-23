package entities;

public class Banco {
    //ATRIBUTOS.
    private String nome;
    private double saldo;
    private  int numConta;
    //CONSTRUTORES.

    public Banco(double saldo) {
        this.saldo = saldo;
    }

    public Banco(String nome, double saldo, int numConta) {
        this.nome = nome;
        this.saldo = saldo;
        this.numConta = numConta;
    }
    //GETS
    public String getNome() {
        return nome;
    }
    //SET feito só no nome, pois pode sofrer alteração.
    public void  setNome(String nome) {
        this.nome = nome;
    }
    public double getMunConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }
    //METODOS
    public void deposito (double dep) {
        saldo += dep;
    }
    public  void saque(double saq) {
        saldo -= saq + 5.00;
    }

    //RETORNO CLIENTE.
    public String toString() {
        return "número da conta: "
                + numConta
                + " nome: "
                + nome
                + " saldo da conta: "
                + saldo;
    }
}
