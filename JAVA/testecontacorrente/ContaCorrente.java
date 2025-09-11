/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testecontacorrente;

/**
 *
 * @author unifgaraujo
 */
public class ContaCorrente {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {

        if (valor > saldo) {
            saldo = 0;
        } else {
            this.saldo = this.saldo - valor;
        }

    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    @Override
    public String toString() {
        return "saldo:" + saldo;
    }

}
