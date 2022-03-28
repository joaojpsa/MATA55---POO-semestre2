package aula3;

public class Aluno{
    private String nome;
    private int idade;

// public void SetNomeIdade(String nome, int idade){
//     this.nome = nome;
//     if(idade > 0){
//         this.idade = idade;
//         System.out.println("Idade Cadastrada");
//     }
//     else{
//         System.out.println("ERRO ao informar Idade");
//     }
// }

// public String GetNome(){
//     return nome + idade;
// }
// }
public void SetNome(String nome){
    this.nome = nome;
}
public void SetIdade(int idade){
    if(idade > 0){
         this.idade = idade;
        System.out.println("Idade Cadastrada");
    }
    else{
        System.out.println("ERRO ao informar Idade");

    }

     }
 public String GetNome(){
     return nome;
 }
 public int GetIdade(){
     return idade;
 }
 }
