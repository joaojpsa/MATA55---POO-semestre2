package aula4;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Faber", "Preto", 0.7f);
        //metodo acessor
       // c1.setModelo("Bic");
        //c1.modelo = "Bic";

        //c1.setPonta(0.7f);
        //c1.ponta = 0.7f -> ERRO: ponta, acesso privado o acesso é negado
        Caneta c2 = new Caneta("Compactor", "Vermelho", 0.5f);
        c2.destampar();

        c1.status();
        c2.status();
    }
}
