package aula3;

public class AlunoTestar {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        //aluno1.nome = "Joao";
        aluno1.SetNome("Joao");
        aluno1.SetIdade(20);

        System.out.println(aluno1.GetNome() + " " + aluno1.GetIdade());
        
    }
}
