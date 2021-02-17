package persistencia;

import dados.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CidadeDAO {

    private static PreparedStatement sqlInsert; 
    private static PreparedStatement sqlDelete; 
    private static PreparedStatement sqlSelect; 
    private static CidadeDAO cidadeDAO = new CidadeDAO();
    
    private CidadeDAO(){
        Connection conexao = Conexao.getConexao();
        try{
            String stringInsert = "insert into cidade (nome, estado) values (?,?)";
            sqlInsert = conexao.prepareStatement(stringInsert);
            String stringDelete = "delete from cidade where id = ?";
            sqlDelete = conexao.prepareStatement(stringDelete);
            String stringSelect = "select * from cidade where id = ?";
            sqlSelect = conexao.prepareStatement(stringSelect);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public static CidadeDAO getInstance(){
        if(cidadeDAO == null){
            cidadeDAO = new CidadeDAO();
        }
        return cidadeDAO;
    }
    
    public void insert(Cidade cidade){
        try{
            sqlInsert.setString(1,cidade.getNome());
            sqlInsert.setString(2,cidade.getEstado());
            sqlInsert.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public Cidade select(int id){
        Cidade cidade = null;
        try{
            sqlSelect.setInt(1,id);
            ResultSet rs = sqlSelect.executeQuery();
            if(rs.next()){
                cidade = new Cidade();
                cidade.setId(rs.getInt("id"));
                cidade.setNome(rs.getString("nome"));
                cidade.setEstado(rs.getString("estado"));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return cidade;
    }
    
    
    
    
    
}