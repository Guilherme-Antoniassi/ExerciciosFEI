
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author unifgaraujo
 */
public class Conexao {
    public Connection getConecction() throws SQLException{
        Connection conexao=DriverManager.getConnection("jdbc:postgresql://localhost:5432/alunos","postgres","fei");
        return conexao;
    }
    
}
