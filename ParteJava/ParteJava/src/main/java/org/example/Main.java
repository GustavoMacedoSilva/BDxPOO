package org.example;
import DAO.*;
import Model.*;

public class Main {
    public static void main(String[] args) {
        CandidatoDAO candidatoDAO = new CandidatoDAO();
        CidadeDAO cidadeDAO = new CidadeDAO();
        ConvencaoDAO convencaoDAO = new ConvencaoDAO();
        JogoDAO jogoDAO = new JogoDAO();
        Candidato_JogoDAO candidato_jogoDAO= new Candidato_JogoDAO();

        //Convencao convencao = new Convencao("Convencao de Jogos", "Rua sla oq", "35999945");

        //Cidade cidade = new Cidade("Carlinhos", "Convencao de Jogos");

        //Candidato candidato1 = new Candidato("Xi Jinping", "emaildocandidato1@bruh.com", "Convencao de Jogos");
        //Candidato candidato2 = new Candidato("Platao", "emaildocanditado2@sla.com", "Convencao de Jogos");

        //Jogo jogo1 = new Jogo("Red Sun in The Sky", "Simulacao", "Playstation e PC");
        //Jogo jogo2 = new Jogo("Jogo dele", "FPS", "Super Nintendo");

        //Candidato_Jogo candidato_jogo1 = new Candidato_Jogo(1,1);
        //Candidato_Jogo candidato_jogo2 = new Candidato_Jogo(2,2);

        //inserindo a convencao
        //convencaoDAO.insertConvencao(convencao);

        //inserindo a cidade
        //cidadeDAO.insertCidade(cidade);

        //inserindo os candidatos
        //candidatoDAO.insertCandidato(candidato1);
        //candidatoDAO.insertCandidato(candidato2);

        //inserindo os jogos
        //jogoDAO.insertJogo(jogo1);
        //jogoDAO.insertJogo(jogo2);

        //inserindo candidato_jogo
        //candidato_jogoDAO.insertCandidato_Jogo(candidato_jogo1);
        //candidato_jogoDAO.insertCandidato_Jogo(candidato_jogo2);

        //update jogo
        //jogoDAO.updateJogo(1, jogo1);

        //select
        //candidatoDAO.selectCandidato();
        //convencaoDAO.selectConvencao();

        //delete
        jogoDAO.deleteJogo(2);
        //convencaoDAO.deleteConvencao("Convencao de Jogos");

        //select
        //candidatoDAO.selectCandidato();
    }

}