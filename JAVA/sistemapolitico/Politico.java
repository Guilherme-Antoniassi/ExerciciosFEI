/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapolitico;

/**
 *
 * @author unifgaraujo
 */
public class Politico {

    private String nome, partido, estado, funcao;

    public Politico() {
    }

    public Politico(String nome, String partido, String estado, String funcao) {
        this.nome = nome;
        this.partido = partido;
        this.estado = estado;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void apresentacao() {
        System.out.println("apresentacao do politico-------------------");
        System.out.println("meu nome" + nome);
        System.out.println("meu partido:" + partido);
        System.out.println("meu estado:" + estado);
        System.out.println("minha funcao" + funcao);
    }
}
