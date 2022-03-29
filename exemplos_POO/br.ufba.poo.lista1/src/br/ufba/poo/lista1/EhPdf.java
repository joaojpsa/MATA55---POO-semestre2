package br.ufba.poo.lista1;

public class EhPdf {
       /**
     * @param nomeDoArquivo nome do arquivo; não pode ser nulo
     * @return Indica se o nomeDoArquivo representa o nome de um arquivo PDF
     */
    public static boolean ehPdf(String nomeDoArquivo) {
        nomeDoArquivo = nomeDoArquivo.toLowerCase();
        if (nomeDoArquivo.length() != 0 && nomeDoArquivo.endsWith(".pdf")){
            return true;
        }else{
            return false;
        }
    }
}
