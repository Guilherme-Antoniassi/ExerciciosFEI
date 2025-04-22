package Controller;

import DAO.AlunoDao;
import DAO.Conexao;
import Model.Aluno;
import View.Loggin_Frame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author unifgaraujo
 */
public class ControllerLogin {

    private Loggin_Frame View;

    public ControllerLogin(Loggin_Frame View) {
        this.View = View;
    }

    public void LoginAluno() {
        Aluno aluno = new Aluno(null, View.getTXT_USER_LOGIN().getText(), View.getTXT_SENHA_LOGIN().getText());

        Conexao conexao = new Conexao();
        try {
            Connection conn = conexao.getConecction();
            AlunoDao dao = new AlunoDao(conn);
            ResultSet res = dao.consultar(aluno);
            if (res.next()) {
                JOptionPane.showMessageDialog(View, "Login efetuado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(View, "Login nao efetuado", "Aviso", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {

        }
    }

}
