
package aula.pkg10_11;


public class Contato {
    
    private String nome, tel;
    
    public Contato (String nome, String tel){
        this.nome = nome;
        this.tel = tel;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public String toString(){
        return "Nome: " + nome + "Tel: "+ tel;
    }
    
}
