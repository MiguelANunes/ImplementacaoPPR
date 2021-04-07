package apresentação;

import negocio.*;
import dados.*;
import java.util.*;

public class main {
    static Scanner sc = new Scanner(System.in);
    public static SistemaMonitoria sistema = new SistemaMonitoria();
    
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
                        Materia m = mostraMaterias();
                        editaMateria(m); 
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
    
    
    
    public static void criaMateria(){
        Materia materia = new Materia();
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o ID da materia?");
        materia.setId(sc.nextInt());
        System.out.println("Qual o nome da materia?");
        materia.setNome(sc.nextLine());
        ArrayList<Aluno> lista_alunos = new ArrayList<Aluno>();
        materia.setLista_alunos(lista_alunos);
        ArrayList<Professor> lista_professores = new ArrayList<Professor>();
        materia.setLista_professores(lista_professores);
        ArrayList<Discussao> lista_discussoes = new ArrayList<Discussao>();
        materia.setLista_discussoes(lista_discussoes);
        ArrayList<Monitor> lista_monitores = new ArrayList<Monitor>();
        materia.setLista_monitores(lista_monitores);
        sistema.AdicionaMateria(materia); // criar funcao no sistema
    }
    
    public static void excluiMateria(){
        
    }
    
    public static void editaMateria(Materia m){
        sc.nextLine();
        System.out.println("Qual o novo nome que deseja para a materia?");
        m.setNome(sc.nextLine());
        System.out.println("Alteracao Concluida!");
        
        // mágica pra editar a materia depois de escolher;
    
    }
    
    public static Materia mostraMaterias(){
        int opcao;
        List<Materia> listaMaterias = new ArrayList();
        listaMaterias = sistema.getListaMateria();
        System.out.println("Qual materia gostaria de consultar?");
        for (int i=0; i<listaMaterias.size(); i++){
            System.out.println(+i+": "+ listaMaterias.get(i).getNome()+" ID: "+listaMaterias.get(i).getId());
        }
        opcao = sc.nextInt();
        return listaMaterias.get(opcao);
    }
    
    public static void criaAluno(){
        Aluno a = new Aluno();
        
        System.out.println("Qual o nome do Aluno?");
        a.setNome(sc.nextLine());
        System.out.println("Qual o CPF do aluno?");
        a.setCpf(sc.nextLine());
        System.out.println("Qual a senha desejada para login?");
        a.setSenha(sc.nextLine());
        sistema.AdicionaAluno(a);
    }
    
    public static void criaMonitor(){
        
        Monitor m = new Monitor();
        System.out.println("Qual o nome do Monitor?");
        m.setNome(sc.nextLine());
        System.out.println("Qual o CPF do Monitor?");
        m.setCpf(sc.nextLine());
        System.out.println("Qual a senha desejada para login?");
        m.setSenha(sc.nextLine());
        
        sistema.AdicionaMonitor(m);
    }
    
    public static void criaProfessor(){
        Scanner sc = new Scanner(System.in);
        Professor p = new Professor();
        System.out.println("Qual o nome do Professor?");
        p.setNome(sc.nextLine());
        System.out.println("Qual o CPF do Professor?");
        p.setCpf(sc.nextLine());
        System.out.println("Qual a senha desejada para login?");
        p.setSenha(sc.nextLine());
        
        sistema.AdicionaProfessor(p);
    }
    
    
}
