package jogo;

/**
 *
 * @author jonasdhein
 */
public class Inimigo {
    
    private String nome;
    private int vida;
    private int ataque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    public String toString(){
        return getNome();
    }
    
}
