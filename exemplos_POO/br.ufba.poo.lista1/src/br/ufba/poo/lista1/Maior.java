
package br.ufba.poo.lista1;

public class Maior {

    /**
     * Retorna o maior dos elementos de um array.
     *
     * @param elementos array de números inteiros
     * @return o valor do maior elemento, ou <code>Integer.MIN_VALUE</code> caso o
     *         array seja vazio
     */
    public static int maior(int[] elementos) {
        int maior1 = 0;
        if (elementos.length != 0){
            for(int i=0; i<elementos.length; i++){
                if(elementos[i] >= maior1){
                    maior1 = elementos[i];
                }
            }
        return maior1;
        }
        else
        return Integer.MIN_VALUE;
    }
}