/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa.main;

/**
 *
 * @author unifgaraujo
 */
public class Gerente extends Funcionario {

    private int departamento;
    private Data promocaoGerente;

    public Gerente(String nome, long cpf, Data nascimento, Data admissao,
            double salario, int departamento, Data promocaoGerente) {

        super(nome, cpf, nascimento, admissao, salario);
        this.departamento = departamento;
        this.promocaoGerente = promocaoGerente;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente{\n" + "departamento=" + departamento + "\n promocaoGerente=" + promocaoGerente + '}';
    }

}
