package aula2;

public class Produto{
    //atributos
    String nome;
    String marca;
    float valor;

    //consrutores
    Produto(){

    }//<-construtor padrão

    Produto(String nome){
        this.nome = nome;
    }
    Produto(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }
    Produto(String nome, String marca, float valor){
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;

    }

}
