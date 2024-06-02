package Dal;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {
    
    public static Connection conectar(){
        Connection conexao = null;
        
        String driver = "com.mysql.jdbc.Driver";
        String database = "jdbc:mysql://localhost/pousada";
        String user = "root";
        String senha = "ssj3gogeta1";
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(database, user, senha);
            return conexao;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na conexão com o banco.\n" + e.getMessage());
            return null;
        }
    }
    
}
