/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author unifgaraujo
 */
public class Aluno {
    private String nome,senha,usuario;

    public Aluno() {
    }

    public Aluno(String nome, String senha, String usuario) {
        this.nome = nome;
        this.senha = senha;
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", senha=" + senha + ", usuario=" + usuario + '}';
    }
  
    
}
