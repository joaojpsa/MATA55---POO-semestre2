package br.ufba.poo.lista1;

public class ValidaSenha {
    /**
     * Verifica se a senha digitada est� correta.
     *
     * @param senhaCorreta  senha correta
     * @param senhaDigitada senha digitada pelo usu�rio
     * @return <code>true</code> se as duas senhas s�o iguais; <code>false</code>
     *         caso contr�rio
     */
    public static boolean validaSenha(String senhaCorreta, String senhaDigitada) {
        	return senhaCorreta.equals(senhaDigitada);
            }
}

