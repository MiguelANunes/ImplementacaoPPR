package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private static Connection conexao = null;
    
    private Conexao(){
        
    }
    
    public static Connection getConexao(){
        if(conexao == null){
            String url = "jdbc:postgresql://localhost:5432/renda";
            String usuario = "postgres";
            String senha = "udesc";
        
            try{
                Class.forName("org.postgresql.Driver");
                conexao = DriverManager.getConnection(url,usuario,senha);
            }
            catch(ClassNotFoundException e){
                System.out.println("Driver de conexao ao BD não encontrado.");
            }
            catch(SQLException e1){
                System.out.println("Erro na conexao com o DB");
            }
        }
        return conexao;
    }
    
}
