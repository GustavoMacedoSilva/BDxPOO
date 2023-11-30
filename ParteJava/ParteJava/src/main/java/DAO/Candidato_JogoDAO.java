package DAO;

import Model.Candidato_Jogo;
import Model.Cidade;
import Model.Jogo;

import java.sql.SQLException;
import java.util.ArrayList;
public class Candidato_JogoDAO extends ConnectionDAO{

    boolean sucesso = false;

    //INSERT
    public boolean insertCandidato_Jogo(Candidato_Jogo candidato_jogo){
        connectToDB();
        String sql = "Insert INTO candidato_jogo (id_candidato, id_jogo) values (?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, candidato_jogo.getId_candidato());
            pst.setInt(2, candidato_jogo.getId_jogo());
            pst.execute();
            sucesso = true;
        } catch (SQLException exc){
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    //UPDATE
    public boolean updateCidade_Jogo(int id_candidato, Candidato_Jogo candidato_jogo) {
        connectToDB();
        String sql = "UPDATE candidato_jogo SET id_candidato, id_jogo=? where id_candidato=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id_candidato);
            pst.setInt(2, candidato_jogo.getId_jogo());
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    //DELETE
    public boolean deleteJogo(int id_candidato) {
        connectToDB();
        String sql = "DELETE FROM candidato_jogo where id_candidato=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id_candidato);
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    //SELECT
    public ArrayList<Candidato_Jogo> selectCandidato_Jogo() {
        ArrayList<Candidato_Jogo> users = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM candidato_jogo";

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);

            System.out.println("Lista de candidatos e seus jogos: ");

            while (rs.next()) {

                Candidato_Jogo candidato_jogoAux = new Candidato_Jogo(rs.getInt("id_candidato"),rs.getInt("id_jogo"));

                System.out.println("id_candidato = " + candidato_jogoAux.getId_candidato());
                System.out.println("id_jogo = " + candidato_jogoAux.getId_jogo());
                System.out.println("--------------------------------");

                users.add(candidato_jogoAux);
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return users;
    }
}
