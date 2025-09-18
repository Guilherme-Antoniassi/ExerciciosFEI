/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa.main;

/**
 *
 * @author unifgaraujo
 */
public class Funcionario extends Pessoa {

    private Data admissao;
    private double salario;

    public Funcionario(String nome, long cpf, Data nascimento, Data admissao,
            double salario) {

        super(nome, cpf, nascimento);
        this.admissao = admissao;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{\n" + "admissao=" + admissao + "\n salario=" + salario + '}';
    }

}
