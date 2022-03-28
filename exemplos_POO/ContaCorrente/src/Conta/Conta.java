package Conta;

public class Conta {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(001);
        c1.setDono("Joao");
        c1.setTipo("CP");
        c1.setSaldo(2034.01f);
        c1.getStatus();
        c1.estadoAtual();
    }
}
