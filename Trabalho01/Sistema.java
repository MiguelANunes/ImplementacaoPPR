package Negocio;
import Dados.*;

import java.util.Scanner;

import Bd.Conexao;

import java.sql.*;
import javax.swing.*;    
public class Sistema{

	static Scanner in = new Scanner(System.in);
            
    public void cadastraMedico(Conexao con){
    	int idade,cod;
    	String nome,cpf,cidade,spec;
        
        nome = JOptionPane.showInputDialog(null, "Digite o nome do médico: ");
        
        idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade do medico"));
        
        cpf = JOptionPane.showInputDialog(null, "Digite o CPF do médico: ");
        
        spec =  JOptionPane.showInputDialog(null, "Digite a especialidade do médico: ");
        
        cidade = JOptionPane.showInputDialog(null, "Digite a cidade do médico: ");
        
        cod = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o codigo do medico"));
    String sql = "INSERT into medico (id, nome, idade, cpf, cidade, especialidade)"+
        "values ("+cod+",'"+nome+"',"+idade+",'"+cpf+"','"+cidade+"','"+spec+"')";
    	int res = con.executaSQL(sql);
    	 
    }   
    public void cadastraPaciente(Conexao con){
    	    	int idade,cod;
    	    	String nome,cpf,cidade,desc;
    	    	 nome = JOptionPane.showInputDialog(null, "Digite o nome do paciente: ");
    	         
    	         idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade do paciente"));
    	         
    	         cpf = JOptionPane.showInputDialog(null, "Digite o CPF do paciente: ");
    	         
    	         desc =  JOptionPane.showInputDialog(null, "Digite a descricao do paciente: ");
    	         
    	         cidade = JOptionPane.showInputDialog(null, "Digite a cidade do paciente: ");
    	         
    	         cod = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o codigo do paciente"));
    	    String sql = "INSERT into paciente (id, nome, idade, cpf, cidade, descricao)"+
    	        "values ("+cod+",'"+nome+"',"+idade+",'"+cpf+"','"+cidade+"','"+desc+"')";
    	    	int res = con.executaSQL(sql);
    	    }  
    
    
    public void cadastraConsulta(Conexao con){
    			@SuppressWarnings("deprecation")
 	    	 double valor;
    		 int ano,dia,mes,codC,codP,codM;
 	    	 String diagnostico,hora;
 	    	 codC = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o codigo da consulta"));
 	    	 codP = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o numero correspondente ao paciente"));
 	    	 codM = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o numero correspondente ao medico"));
 	    	 valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o valor da consulta"));
 	    	 ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o ano da consulta"));
 	    	 mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o mes da consulta"));
 	    	 dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o dia da consulta"));
 	    	 hora = JOptionPane.showInputDialog(null, "Insira o horario da consulta separando min e hora com ':'");
 	    	 diagnostico = JOptionPane.showInputDialog(null, "Insira o diagnostico do medico"); 
			Date date = new Date(ano,mes,dia);
 	    String sql = "INSERT into consulta (id, valor, data, hora, diagnostico, id_medico, id_paciente)"+
 	        "values ("+codC+","+valor+",'"+date+"','"+hora+":00','"+diagnostico+"',"+codM+","+codP+")";
 	    	int res = con.executaSQL(sql);
 	    }     
    
    public static void consultaMedico(Conexao con,int cod) {
    	String sql = ("Select * from medico where id ="+cod);
    	ResultSet rs = con.busca(sql);
    	 try {
      	   while(rs.next()){
      		   String nome = rs.getString("nome");
      		   int idade = rs.getInt("idade");
      		   String cpf = rs.getString("cpf");
      		   String cidade = rs.getString("cidade");
      		   String exp = rs.getString("especialidade");
      		  JOptionPane.showMessageDialog(null, "Nome: "+nome+"\n Idade: "+idade+"\n CPF: "+cpf+"\n Cidade: "+cidade+"\n especialidade: "+exp);
      	   }
         } catch(Exception e) {
      	   e.printStackTrace();
         }
      }
    
    public static void consultaPaciente(Conexao con,int cod) {
     	String sql = ("Select * from paciente where id ="+cod);
     	ResultSet rs = con.busca(sql);
     	 try {
       	   while(rs.next()){
       		   String nome = rs.getString("nome");
       		   int idade = rs.getInt("idade");
       		   String cpf = rs.getString("cpf");
       		   String cidade = rs.getString("cidade");
       		   String desc = rs.getString("descricao");
       		 JOptionPane.showMessageDialog(null, "Nome: "+nome+"\n Idade: "+idade+"\n CPF: "+cpf+"\n Cidade: "+cidade+"\n descricao: "+desc);
       	   }
          } catch(Exception e) {
       	   e.printStackTrace();
          }
       }
    public static void consultaConsulta(Conexao con,int cod) {
      	String sql = ("Select * from consulta where id ="+cod);
      	ResultSet rs = con.busca(sql);
      	 try {
        	   while(rs.next()){
        		   Double valor = rs.getDouble("valor");
        		   int medico = rs.getInt("id_medico");
        		   int paciente = rs.getInt("id_paciente");
        		   String data = rs.getString("data");
        		   String hora = rs.getString("hora");
        		   String diagnostico = rs.getString("diagnostico");
        		   JOptionPane.showMessageDialog(null, "Codigo: "+cod+"\n Medico: "+medico+"\n Paciente: "+paciente+"\n Data: "+data+"\n Hora: "+hora+"\n Diagnostico: "+diagnostico);
        	   }
           } catch(Exception e) {
        	   e.printStackTrace();
           }
        }     
    

    public void removeMedico(Conexao con, int cod){
	    	String sql = ("DELETE from medico WHERE id = "+cod);
	     	    	int res = con.executaSQL(sql);
    	if(res == 1) {
    		JOptionPane.showMessageDialog(null, "Medico removido");
    	}else {
    		JOptionPane.showMessageDialog(null, "Medico nao existe ou esta cadastrado em uma consulta, e portanto nao pode ser removido"); 
    	}
    }  
    
    
    public void removePaciente(Conexao con, int cod){
    	String sql = ("DELETE from paciente WHERE id = "+cod);
     	    	int res = con.executaSQL(sql);
	if(res == 1) {
		JOptionPane.showMessageDialog(null, "Paciente removido");
	}else {
		JOptionPane.showMessageDialog(null, "Paciente nao existe ou esta cadastrado em uma consulta, e portanto nao pode ser removido"); 
	}
}  
   

    public void removeConsulta(Conexao con, int cod){
    	String sql = ("DELETE from consulta WHERE id = "+cod);
    	int res = con.executaSQL(sql);
    	if(res==1) {
    		JOptionPane.showMessageDialog(null, "Consulta removida");
    	}else {
    		JOptionPane.showMessageDialog(null, "Consulta nao existe","Aviso",1);
    	}
    }
    
    public void alteraMedico(Conexao con, int id) {
    	int idade,cod;
    	String nome,cpf,cidade,spec;
    	nome = JOptionPane.showInputDialog(null, "Digite o nome do medico: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade do medico"));
        cpf = JOptionPane.showInputDialog(null, "Digite o CPF do medico: ");
        cidade = JOptionPane.showInputDialog(null, "Digite a cidade do medico: ");
        spec = JOptionPane.showInputDialog(null, "Digite a especializacao do medico: ");
        cod = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade do medico"));
        String sql = "update medico set nome = '"+nome+"', idade = '"+idade+"', cpf = '"+cpf+"', cidade = '"+cidade+"', especialidade = '"+spec+"', id = '"+cod+"' where id = "+id;
    	int res = con.executaSQL(sql);
    	if(res ==1 ) {
    		JOptionPane.showMessageDialog(null, "ALTERADO","Aviso",1);
    	}else{
    		JOptionPane.showMessageDialog(null, "FALHA NA ALTERACAO, Nao e possivel aterar medicos cadastrados em consultas","Aviso",1);
    	}
    }
   
    public void alteraPaciente(Conexao con, int id) {
    	int idade,cod;
    	String nome,cpf,cidade,desc;
    	nome = JOptionPane.showInputDialog(null, "Digite o nome do paciente: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade do paciente"));
        cpf = JOptionPane.showInputDialog(null, "Digite o CPF do paciente: ");
        cidade = JOptionPane.showInputDialog(null, "Digite a cidade do paciente: ");
        desc = JOptionPane.showInputDialog(null, "Digite a descricao do paciente: ");
        cod = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade do paciente"));
        String sql = "update paciente set nome = '"+nome+"', idade = '"+idade+"', cpf = '"+cpf+"', cidade = '"+cidade+"', descricao = '"+desc+"', id = '"+cod+"' where id = "+id;
    	int res = con.executaSQL(sql);
    	if(res ==1 ) {
    		JOptionPane.showMessageDialog(null, "ALTERADO","Aviso",1);
    	}else{
    		JOptionPane.showMessageDialog(null, "FALHA NA ALTERACAO Nao e possivel aterar pacientes cadastrados em consultas","Aviso",1);
    	}
    }
   
    public void alteraConsulta(Conexao con, int id) {
    	double valor;
    	int ano,dia,mes,codC,codP,codM;
    	 String diagnostico,hora;
    	 codC = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o novo codigo da consulta"));
	    	 codP = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o numero correspondente ao paciente"));
	    	 codM = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o numero correspondente ao medico"));
	    	 valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o valor da consulta"));
	    	 ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o ano da consulta"));
	    	 mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o mes da consulta"));
	    	 dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o dia da consulta"));
	    	 hora = JOptionPane.showInputDialog(null, "Insira o horario da consulta separando min e hora com ':'");
	    	 diagnostico = JOptionPane.showInputDialog(null, "Insira o diagnostico do medico"); 
	
		String sql = "update consulta set valor = '"+valor+"', id_medico = '"+codM+"', id_paciente = '"+codP+"', diagnostico = '"+diagnostico+"', data = '"+ano+"-"+mes+"-"+dia+"', hora = '"+hora+":00', id = '"+codC+"' where id = "+id;
    	int res = con.executaSQL(sql);
    }
}
