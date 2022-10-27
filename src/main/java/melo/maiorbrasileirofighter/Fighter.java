package melo.maiorbrasileirofighter;

public class Fighter {
    
    private String nome;
    private int posicao;
    private String ataquePrimario;
    private String ataqueSecundario;
    private int dano;
    private int hp;
    private String fraseVitoria;
    private String fraseDerrota;

    public Fighter(String nome, int posicao, String ataquePrimario, String ataqueSecundario, int dano, int hp, String fraseVitoria, String fraseDerrota) {
        this.nome = nome;
        this.posicao = posicao;
        this.ataquePrimario = ataquePrimario;
        this.ataqueSecundario = ataqueSecundario;
        this.dano = dano;
        this.hp = hp;
        this.fraseVitoria = fraseVitoria;
        this.fraseDerrota = fraseDerrota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public String getAtaquePrimario() {
        return ataquePrimario;
    }

    public void setAtaquePrimario(String ataquePrimario) {
        this.ataquePrimario = ataquePrimario;
    }

    public String getAtaqueSecundario() {
        return ataqueSecundario;
    }

    public void setAtaqueSecundario(String ataqueSecundario) {
        this.ataqueSecundario = ataqueSecundario;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getFraseVitoria() {
        return fraseVitoria;
    }

    public void setFraseVitoria(String fraseVitoria) {
        this.fraseVitoria = fraseVitoria;
    }

    public String getFraseDerrota() {
        return fraseDerrota;
    }

    public void setFraseDerrota(String fraseDerrota) {
        this.fraseDerrota = fraseDerrota;
    }
}
