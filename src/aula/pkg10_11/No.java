/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg10_11;


public class No {
    
    private Contato contato;
    private No esq, dir;
    public No(String nome, String tel){
        contato = new Contato (nome, tel);
        dir = null;
        esq = null;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public No getEsq() {
        return esq;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public No getDir() {
        return dir;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }
    
    public String toString(){
        return contato.toString();
    }
    
}
