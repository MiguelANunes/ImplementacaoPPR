package Apresentacao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Bd.Conexao;
import Dados.*;
import Negocio.*;
import javax.swing.*;

public class Main {

    public static Sistema sistema = new Sistema();

    static Scanner in = new Scanner(System.in);
   

    
    	 
    
    public static void main(String[] args) {
        int escolha = -1;
        Conexao con = new Conexao();
        while(escolha != 0){
   
            escolha = menu();
        
        switch (escolha){
            
            case 1:{	//cadastra medicos
                sistema.cadastraMedico(con);
                break;
            }
           
            case 2:{	//vizualisa medicos
                consultaMedico(con);
                break;
            }
            case 3:{	//cadastra paciente
            	sistema.cadastraPaciente(con);
            	break;
            }
            case 4:{	//visualiza pacientes
            	consultaPaciente(con);
            	break;
            }
            case 5:{	//cadastra consulta
            	sistema.cadastraConsulta(con);
            	break;
            }
            case 6:{	//visualiza consulta	
            	consultaConsulta(con);
            	break;
            }
            case 7:{	//remove medico
            	removeMedico(con);
            	break;
            }
            case 8:{	//remove paciente
            	removePaciente(con);
            	break;
            }
            case 9:{	//remove consulta
            	removeConsulta(con);
            	break;
            }
            case 10:{	//altera medico
            	alteraMedico(con);
            	break;
            }
            case 11:{	//altera paciente
            	
            	alteraPaciente(con);
            	break;
            }
            case 12:{	//altera consulta
            	
            	alteraConsulta(con);
            	break;
            }
            case 0:{	//Fim
            	JOptionPane.showMessageDialog(null, "Programa finalizado","Aviso",1);
            	break;
            }
            default:{
            	JOptionPane.showMessageDialog(null, "INPUT INVALIDO","Aviso",1);
                break;
            }
        }
    }
 }   
    
    
    public static int menu() {
        
        int escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU:\n\n1. Cadastrar o Médico\n2. Consulta Medico\n3. Cadastrar Paciente" +
                "\n4. consulta paciente \n5. cadastra consulta \n6. consulta consulta\n7. remove medico \n8. remove paciente \n9 remove consulta\n10 altera medico"
                + "\n11 altera paciente\n12 altera consulta \n0 finaliza programa \n\nDigite a opção:"));
        return escolha;
    }
    // Consultas
    public static void consultaMedico(Conexao con) {
    	
    	int codMed = Integer.parseInt(JOptionPane.showInputDialog(null,"CONSULTA MEDICO:\n insira o codigo do medico"));
		    		Sistema.consultaMedico(con,codMed);	
	    	}
    
    
    public static void consultaPaciente(Conexao con) {
    	 
    	int codPa = Integer.parseInt(JOptionPane.showInputDialog(null,"CONSULTA PACIENTE:\n insira o codigo do paciente"));
		    		Sistema.consultaPaciente(con,codPa);	
    }
   
    public static void consultaConsulta(Conexao con) {
    	int codCons = Integer.parseInt(JOptionPane.showInputDialog(null,"CONSULTA CONSULTA:\n insira o codigo da consulta"));
		Sistema.consultaConsulta(con,codCons);	
    }
    //remocoes
    public static void removeMedico(Conexao con){
    	int cod = Integer.parseInt(JOptionPane.showInputDialog(null,"REMOVE MEDICO:\n insira o codigo do medico a ser removido"));
        sistema.removeMedico(con,cod);
    }
    
    public static void removePaciente(Conexao con){
    	int cod = Integer.parseInt(JOptionPane.showInputDialog(null,"REMOVE PACIENTE:\n insira o codigo do paciente a ser removido"));
        sistema.removePaciente(con,cod);
    }
    
    public static void removeConsulta(Conexao con){
    	int cod = Integer.parseInt(JOptionPane.showInputDialog(null,"REMOVE CONSULTA:\n insira o codigo da consulta a ser removida"));
        sistema.removeConsulta(con,cod);
    }
    //alteracoes
    public static void alteraMedico(Conexao con) {
    	int cod = Integer.parseInt(JOptionPane.showInputDialog(null,"ALTERA MEDICO:\n insira o codigo do medico a ser alterado"));
    	sistema.alteraMedico(con, cod);
    	
    }
    
    public static void alteraPaciente(Conexao con) {
    	
    	int cod = Integer.parseInt(JOptionPane.showInputDialog(null,"ALTERA PACIENTE:\n insira o codigo do pacientea ser alterado"));
        	sistema.alteraPaciente(con, cod);
        	
        }
  
    public static void alteraConsulta(Conexao con) {
    	int cod = Integer.parseInt(JOptionPane.showInputDialog(null,"ALTERA CONSULTA:\n insira o codigo da consulta a ser alterada"));
    	sistema.alteraConsulta(con, cod);
    }
    
    
}  
        
    

