/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapolitico;

/**
 *
 * @author unifgaraujo
 */
public class Vereador extends Politico {

    private String municipio;

    public Vereador(String nome, String partido, String estado, String funcao, String municipio) {
        super(nome, partido, estado, funcao);
        this.municipio = municipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void apresentacao() {
        System.out.println("meu nome" + getNome());
        System.out.println("meu partido:" + getPartido());
        System.out.println("meu estado:" + getEstado());
        System.out.println("minha funcao" + getFuncao());
        System.out.println("meu municipio:" + getMunicipio());

    }
}
