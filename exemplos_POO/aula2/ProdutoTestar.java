package aula2;

class ProdutoTestar{
    public static void main(String[] args) {
        //construtor padrao
        Produto p1 = new Produto();
        p1.nome = "Caneta Preta";
        p1.marca = "Faber Castell";
        p1.valor =1.89f;

        //construtor de dois parametros
        Produto p2 = new Produto("caneta vermelha", "Bic");
        p2.valor = 1.40f;

        //construtor de tres parametros
        Produto p3 = new Produto("Borracha", "Mercury", 2.50f);

        //Objeto p1
        System.out.println("Nome: " + p1.nome + " Marca: " + p1.marca + " Valor: " + p1.valor);

        //Objeto p2
        System.out.println("Nome: " + p2.nome + " Marca: " + p2.marca + " Valor: " + p2.valor);

        //Objeto p3
        System.out.println("Nome: " + p3.nome + " Marca: " + p3.marca + " Valor: " + p3.valor);
    }
}