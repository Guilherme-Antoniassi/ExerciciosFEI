/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.AlunoDao;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import Model.Aluno;
import View.Cadastro_Frame;
import javax.swing.JOptionPane;

/**
 *
 * @author unifgaraujo
 */
public class ControllerCadastro {
    private Cadastro_Frame View;

    public ControllerCadastro(Cadastro_Frame View) {
        this.View = View;
    }
    
   public void salvarAluno(){
       String nome=View.getTXT_NOME_CADASTRO().getText();
       String usuario=View.getTXT_USUARIO_CADASTRO().getText();
       String senha=View.getTXT_SENHA_CADASTRO().getText();
       Aluno aluno=new Aluno(nome,usuario,senha);
       Conexao conexao=new Conexao();
       try{
           Connection conn=conexao.getConecction();
           AlunoDao dao=new AlunoDao(conn);
           dao.inserir(aluno);
           JOptionPane.showMessageDialog(View, "usuario cadastrado");
   
       }catch(SQLException e){
           JOptionPane.showMessageDialog(View, "erro de conexao");
           
       }
   }
    
}
