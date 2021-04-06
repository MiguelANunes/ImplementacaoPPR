package apresentação;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int opcao = 0;
        do{
            opcao = menu();

                switch(opcao){
                    case 1:
                        criaMateria();
                        break;
                    case 2:
                        excluiMateria();
                        break;
                    case 3:
                        editaMateria(); // criar função "mostraMateria();" dentro disso aqui
                        break;
                    case 4:
                        criaAluno();
                        break;
                    case 5:
                        criaMonitor();
                        break;
                    case 6:
                        criaProfessor();
                        break;
                    case 7:
                        AdicionarPost();
                        break;
                    case 8:
                        EditarPost();
                        break;
                    case 9:
                        AdicionarResposta();
                        break;
                    case 10:
                        EditarResposta();
                        break;
                    case 11:
                        AvaliaMonitor();
                        break;
                }
            } while(opcao != -1);
            
        }
   
    
    private static int menu(){ 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Informe o número da opção que desejas executar: ");
        System.out.println("1 - Adicionar Materia");
        System.out.println("2 - Excluir Materia");
        System.out.println("3 - Editar Materia");
        System.out.println("4 - Adicionar Aluno");
        System.out.println("5 - Adicionar Monitor");
        System.out.println("6 - Adicionar Professor");
        System.out.println("7 - Adicionar Post");
        System.out.println("8 - Editar Post");
        System.out.println("9 - Adicionar Resposta");
        System.out.println("10 - Editar Resposta");
        System.out.println("11 - Avaliar Monitor");
        System.out.println("Digite -1 para sair");
        System.out.print("Sua opção: ");
     
        return sc.nextInt();
    }
}
