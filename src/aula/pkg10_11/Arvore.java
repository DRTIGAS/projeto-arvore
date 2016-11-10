/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg10_11;

/**
 *
 * @author 31322181
 */
public class Arvore {

    private No raiz;

    public void preOrdem(No no) {

        if (no != null) {
            System.out.println(no);
            preOrdem(no.getEsq());
            preOrdem(no.getDir());
        }

    }

    public void preOrdem() {

        preOrdem(raiz);

    }

    public void emOrdem(No no) {
        if (no != null) {
            System.out.println(no);
            preOrdem(no.getDir());
            preOrdem(no.getEsq());

        }

    }

    public void emOrdem() {
        emOrdem(raiz);
    }

    public void inserir(String nome, String telefone) {
        No no = new No(nome, telefone);

        if (raiz == null) {
            raiz = no;
        } else //se não...
        {
            //ponteiros para busca
            No aux, ant;

            aux = raiz; //ponteiro inicia na raiz
            ant = null; //anterior inicial em NULL
            int comp;

            while (aux != null) { //Faz a busca do lugar ao qual deve ser inserido o nó
                ant = aux;

                comp = nome.compareToIgnoreCase(aux.getContato().getNome());

                if (comp == 0) {
                    System.out.println("\nDado inserido já existe!");
                    return;
                }

                if (comp > 0) {
                    aux = aux.getDir();
                } else {
                    aux = aux.getEsq();
                }
            }

            if (nome.compareToIgnoreCase(ant.getContato().getNome()) > 0) {
                ant.setDir(no);
            } else {
                ant.setEsq(no);
            }
        }

    }

}
