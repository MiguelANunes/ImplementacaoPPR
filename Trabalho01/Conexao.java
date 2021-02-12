package Bd;

import java.sql.*;

import Dados.Medico;
	
public class Conexao{
	private Connection con;
		  

		public Conexao(){
			try {
				// Step 1: Carrega o driver JDBC.
				Class.forName("org.postgresql.Driver");
				String url = "jdbc:postgresql://localhost:5432/poodnv";
				con = DriverManager.getConnection(url,"postgres","1234");
				System.err.println("Conectado ao bd");
				} catch (ClassNotFoundException c) {
				System.err.println("Driver não encontrado");
				}
				catch (SQLException e) {
				System.err.println("Não foi possível conectar");
				} 
			
		}
		public int executaSQL (String sql) {
			try {
				Statement stm = con.createStatement();
				int res = stm.executeUpdate(sql);
				
				return 1;
			}catch (Exception e) {
				e.printStackTrace();
				return 0;
			}
		}
		public ResultSet busca(String sql) {
			try {
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery(sql);
				return rs;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
}

