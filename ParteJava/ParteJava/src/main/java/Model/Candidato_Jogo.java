package Model;

public class Candidato_Jogo {
    private int id_candidato;

    private int id_jogo;

    public int getId_candidato() {
        return id_candidato;
    }

    public int getId_jogo() {
        return id_jogo;
    }

    public Candidato_Jogo(int id_candidato, int id_jogo){
        this.id_candidato = id_candidato;
        this.id_jogo = id_jogo;
    }
}
