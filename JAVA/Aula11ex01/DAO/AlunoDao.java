package DAO;

import Model.Aluno;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author unifgaraujo
 */
public class AlunoDao {

    private Connection conn;

    public AlunoDao(Connection conn) {
        this.conn = conn;
    }

    public ResultSet consultar(Aluno aluno) throws SQLException {
//        String sql = "select*from aluno where usuario = ' " + aluno.getUsuario() + "' AND senha= ' "
//                + aluno.getSenha() + " ' ";

        String sql = "Select * from  aluno where usuario=? and senha=?";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, aluno.getUsuario());
        statement.setString(2, aluno.getSenha());
        statement.execute();

        ResultSet resultado = statement.getResultSet();
        return resultado;
    }

    public void inserir(Aluno aluno) throws SQLException {
        String sql = "insert into aluno(nome,usuario,senha)value(' " + aluno.getNome() + " ',' " + aluno.getUsuario() + " ',' " 
                                                                                                                                                          + aluno.getSenha() + "')";
    }

}
