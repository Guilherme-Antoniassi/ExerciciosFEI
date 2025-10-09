/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author unifgaraujo
 */
public class CadastroController {

    ArrayList<Usuario> u = new ArrayList<>();

    public void addUser(Usuario user) {
        u.add(user);
    }

    public Usuario buscaCpf(String cpf) {
        for (Usuario user : u) {
            if (user.getCpf().equals(cpf)) {
                return user;
            }
        }
        return null;
    }

 
}
