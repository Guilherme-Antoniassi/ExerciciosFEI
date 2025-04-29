/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.AlunoDao;
import DAO.Conexao;
import Model.Aluno;
import View.ALTESQFRAME;

import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author unifgaraujo
 */
public class ControllerUsuario {

    private ALTESQFRAME View;
    private Aluno aluno;

    public ControllerUsuario(ALTESQFRAME View, Aluno aluno) {
        this.View = View;
        this.aluno = aluno;
    }

    public void atualizar() {
        String nome = View.getLBL_NOME_ALTESQ1().getText();
        String usuario = View.getLBL_USUARIO_ALTESQ().getText();
        String senha = View.getTXT_SENHA_ALTESQ().getText();
        Aluno aluno = new Aluno(nome, usuario, senha);
        Conexao conexao = new Conexao();
        try {
            Connection conn = conexao.getConecction();
            AlunoDao dao = new AlunoDao(conn);
            dao.atualizar(aluno);
            JOptionPane.showMessageDialog(View, "senha atualizada");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(View, "erro de conexao");
        }
    }

    public void remover() {
        int option = JOptionPane.showConfirmDialog(View, "deseja excluir?");
        if (option != 1) {
            Conexao conexao = new Conexao();
            try {
                Connection conn = conexao.getConecction();
                AlunoDao dao = new AlunoDao(conn);
                dao.inserir(aluno);
                JOptionPane.showMessageDialog(View, "usuario cadastrado");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(View, "erro de conexao");

            }
        }

    }

}


