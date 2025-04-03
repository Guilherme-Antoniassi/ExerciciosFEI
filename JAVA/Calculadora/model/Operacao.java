/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author unifgaraujo
 */
public class Operacao {

    public double num1;
    public double num2;
    public String operacao;

    public Operacao(double num1, double num2, String operacao) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacao = operacao;
    }

    public Operacao() {

    }

    public double soma() {
        return num1 + num2;
    }

    public double subtracao() {
        return num1 - num2;
    }

    public double multiplicacao() {
        return num1 * num2;
    }

    public double divisao() {
        return num1 / num2;
    }

    public double calcula() {
        if (this.operacao == "soma") {
            return this.soma();
        } else if (this.operacao == "subtracao") {
            return this.subtracao();
        } else if (this.operacao == "multiplicacao") {
            return this.multiplicacao();
        } else {
            return this.divisao();
        }

    }
}
