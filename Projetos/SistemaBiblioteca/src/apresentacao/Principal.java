package apresentacao;
import dados.*;
import logica.*;
import java.util.Scanner;

public class Principal {
    
    private static SistemaBiblioteca sistemaBiblioteca = new SistemaBiblioteca();
    
    public static void main( String[] args){
        Scanner in = new Scanner(System.in);
        int opcao = -1;
        
        while (opcao != 0){
            System.out.println("Sistema de Biblioteca");
            System.out.println("1 - Cadastrar Usuario ");
            System.out.println("2 - Cadastrar Aluno ");
            System.out.println("3 - Cadastrar Professor");
            System.out.println("4 - Listar Alunos");
            System.out.println("5 - Listar Professores");
            System.out.println("6 - Mostrar tempo de emprestimo");
            System.out.println("7 - Mostrar salario dos professores");
            System.out.println("0 - Sair do programa");
            
            opcao = in.nextInt();
            
            switch(opcao){
                
                case 1:
                    cadastraUsuario();
                    System.out.println("\n\n\n *****CADASTRO REALIZADO COM SUCESSO!*****");
                    break;
            
                case 2:
                    cadastraAluno();
                    break;
            
            }
                
        }
        
        
        
        
    }
    
    public static void cadastraUsuario(){
        Scanner in = new Scanner(System.in);       
        Pessoa pessoa = new Pessoa();
        
        System.out.println("Cadastro de Usuario:");
        System.out.println("Qual o nome do usuario? ");
        pessoa.setNome(in.nextLine());
        in.nextLine();
        System.out.println("Qual o CPF do usuario? ");
        pessoa.setCpf(in.nextInt());
        System.out.println("Qual o email do Usuario? ");
        pessoa.setEmail(in.nextLine());
        in.nextLine();
        System.out.println("Quantos dias de emprestimo?");
        pessoa.setTempEmprestimo(in.nextInt());
       
        
        
        sistemaBiblioteca.CadastraPessoa(pessoa);
    }
    
    public static void cadastraAluno(){
        Scanner in = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        System.out.println("Cadastro de Aluno:");
        System.out.println("Qual o nome do Aluno? ");
        aluno.setNome(in.nextLine());
        in.nextLine();
        System.out.println("Qual o CPF do Aluno? ");
        aluno.setCpf(in.nextInt());
        System.out.println("Qual o email do Aluno? ");
        aluno.setEmail(in.nextLine());
        in.nextLine();
        System.out.println("Quantos dias de emprestimo?");
        aluno.setTempEmprestimo(in.nextInt());
        
        
        
    }
    
}
