package apresentação;

import negocio.*;
import dados.*;
import java.util.*;

import java.io.*;

public class main {
    static Scanner sc = new Scanner(System.in);
    public static SistemaMonitoria sistema = new SistemaMonitoria();
    
    public static void main(String[] args) {
        int opcao = 0;
        sistema.inicializarDados();

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
                        Materia m = mostraMaterias("Qual materia gostaria de editar?");
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
                        sc.nextLine();
                        adicionarDiscussao();
                        break;

                    case 8:
                        adicionarPost();
                        break;

                    case 9:
                        adicionarResposta();
                        break;

                    case 10:
                        insereAlunoMateria();
                        break;
                        
                    case 11:
                        insereProfessorMateria();
                        break;

                    case 12:
                        insereMonitorMateria();
                        break;
                        
                    case 13:
                        sc.nextLine();
                        System.out.println("Consulta de Alunos");
                        List<Aluno> listaConsulta1 = sistema.consultaAluno();
                        for (Aluno a: listaConsulta1){
                            System.out.println("Nome  do Aluno: "+a.getNome());
                            System.out.println("CPF   do Aluno: "+a.getCpf());
                            System.out.println("Senha do Aluno: "+a.getSenha());
                        }
                        break;

                    case 14:
                        sc.nextLine();
                        System.out.println("Consulta de Professores");
                        List<Professor> listaConsulta2 = sistema.consultaProfessor();
                        for (Professor a: listaConsulta2){
                            System.out.println("Nome  do Professor: "+a.getNome());
                            System.out.println("CPF   do Professor: "+a.getCpf());
                            System.out.println("Senha do Professor: "+a.getSenha());
                        }
                        break;

                    case 15:
                        sc.nextLine();
                        System.out.println("Consulta de Monitores");
                        List<Monitor> listaConsulta3 = sistema.consultaMonitor();
                        for (Monitor a: listaConsulta3){
                            System.out.println("Nome  do Monitor: "+a.getNome());
                            System.out.println("CPF   do Monitor: "+a.getCpf());
                            System.out.println("Senha do Monitor: "+a.getSenha());
                        }
                        break;
                    
                    case 16:
                        sc.nextLine();
                        System.out.println("Consulta de Materias");
                        List<Materia> listaConsulta4 = sistema.consultaMateria();
                        for (Materia a: listaConsulta4){
                            System.out.println("Nome  da Materia: "+a.getNome());
                            System.out.println("ID    da Materia: "+a.getId());
                            System.out.println("Quatidade de Discussões: "+a.getDiscCount());
                            System.out.println("Alunos na Matéria: ");
                            for(Aluno a1: a.getLista_alunos())
                                System.out.println(a1.toString());
                            System.out.println("Professores na Matéria: ");
                            for(Professor a1: a.getLista_professores())
                                System.out.println(a1.toString());
                            System.out.println("Monitores na Matéria: ");
                            for(Monitor a1: a.getLista_monitores())
                                System.out.println(a1.toString());

                        }
                        break;
                        
                }
            } while(opcao != -1);
            sistema.salvarDados();
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
        System.out.println("7 - Adicionar Discussao");
        System.out.println("8 - Adicionar Post");
        System.out.println("9 - Adicionar Resposta");
        System.out.println("10 - Inserir Aluno numa Materia");
        System.out.println("11 - Inserir Professor numa Materia");
        System.out.println("12 - Inserir Monitor numa Materia");
        System.out.println("13 - Consultar Alunos");
        System.out.println("14 - Consultar Professores");
        System.out.println("15 - Consultar Monitores");
        System.out.println("16 - Consultar Materias");
        System.out.println("Digite -1 para sair");
        System.out.print("Sua opção: ");
     
        return sc.nextInt();
    }
    
    /*
    IMPORTANTE: Falta as funções de login e logout
                Falta arrumar os bugs na discussão
    */

    public static void criaMateria(){
        Materia materia = new Materia();
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o ID da materia?");
        materia.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Qual o nome da materia?");
        materia.setNome(sc.nextLine());
        sc.nextLine();
        ArrayList<Aluno> lista_alunos = new ArrayList<Aluno>();
        materia.setLista_alunos(lista_alunos);
        ArrayList<Professor> lista_professores = new ArrayList<Professor>();
        materia.setLista_professores(lista_professores);
        ArrayList<Discussao> lista_discussoes = new ArrayList<Discussao>();
        materia.setLista_discussoes(lista_discussoes);
        ArrayList<Monitor> lista_monitores = new ArrayList<Monitor>();
        materia.setLista_monitores(lista_monitores);
        sistema.AdicionaMateria(materia); 
    }
    
    public static void excluiMateria(){
        int escolhaRemocao;
        List<Materia> listaMaterias = sistema.consultaMateria();
        sc.nextLine();
        System.out.println("Qual Materia você gostaria de remover?");
        for (int i=0; i<listaMaterias.size(); i++){
            System.out.println(+i+ ": ID: "+listaMaterias.get(i).getId()+" Nome: "+listaMaterias.get(i).getNome());
        }
        escolhaRemocao = Integer.parseInt(sc.nextLine());
        sistema.removeMateria(listaMaterias.get(escolhaRemocao));
        System.out.println("Remocao Concluida!");
    }
    
    public static void editaMateria(Materia m){
        sc.nextLine();
        System.out.println("Qual o novo nome que deseja para a materia?");
        m.setNome(sc.nextLine());
        System.out.println("Alteracao Concluida!");    
    }
    
    public static void criaAluno(){
        Aluno a = new Aluno();
        sc.nextLine();
        System.out.println("Qual o nome do Aluno?");
        a.setNome(sc.nextLine());
        sc.nextLine();
        System.out.println("Qual o CPF do aluno?");
        a.setCpf(sc.nextLine());
        sc.nextLine();
        System.out.println("Qual a senha desejada para login?");
        a.setSenha(sc.nextLine());
        sc.nextLine();
        sistema.AdicionaAluno(a);
        sistema.AdicionarPessoa(a);
        System.out.println("Aluno Adicionado!");
    }
    
    public static void criaMonitor(){
        
        Monitor m = new Monitor();
        System.out.println("Qual o nome do Monitor?");
        m.setNome(sc.nextLine());
        sc.nextLine();
        System.out.println("Qual o CPF do Monitor?");
        m.setCpf(sc.nextLine());
        sc.nextLine();
        System.out.println("Qual a senha desejada para login?");
        m.setSenha(sc.nextLine());
        sc.nextLine();
        
        sistema.AdicionaMonitor(m);
        sistema.AdicionarPessoa(m);
        System.out.println("Monitor Adicionado!");
    }

    public static void criaProfessor(){
        Scanner sc = new Scanner(System.in);
        Professor p = new Professor();
        System.out.println("Qual o nome do Professor?");
        p.setNome(sc.nextLine());
        sc.nextLine();
        System.out.println("Qual o CPF do Professor?");
        p.setCpf(sc.nextLine());
        sc.nextLine();
        System.out.println("Qual a senha desejada para login?");
        p.setSenha(sc.nextLine());
        sc.nextLine();
        
        sistema.AdicionaProfessor(p);
        sistema.AdicionarPessoa(p);
        System.out.println("Professor Adicionado!");
    }

    public static void adicionarDiscussao(){

        sc.nextLine();
        System.out.println("Para adicionar uma discussao, precisa primeiro escolher uma materia:");
        Materia m = mostraMaterias("Qual materia gostaria de consultar?");
        Discussao d = new Discussao();

        // List<Post> listaPostsVazia = new ArrayList();
        System.out.println("Qual o ID da discussao?");
        d.setID(sc.nextInt());
        sc.nextLine();

        System.out.println("Qual o Titulo da discussao?");
        d.setTitulo(sc.nextLine());
        sc.nextLine();

        System.out.println("Qual o Conteudo da discussao?");
        d.setConteudo(sc.nextLine());
        d.setListaPosts(new ArrayList<Post>());
        sc.nextLine();

        System.out.println("Discussao criada!");
        m.AdicionaDiscussao(d);
        System.out.println("Discussao adicionada a materia "+m.getNome());
        
    }
    
    public static void adicionarPost(){

        System.out.println("Para adicionar um post, precisa primeiro escolher uma materia");
        Materia m = mostraMaterias("Qual materia gostaria de consultar?"); // Lógica: Materia -> ListaDiscussão -> Discussao -> ListaPosts -> Post
        List<Discussao> listaDiscussao = m.getLista_discussoes();

        Discussao D = mostraDiscussoes(listaDiscussao, "Em qual discussao gostaria de adicionar um post?");
        List<Post> listaPosts = D.getListaPosts();
        Post P = new Post();
        
        sc.nextLine();
        System.out.println("Qual e a sua pergunta?");
        P.setPergunta(sc.nextLine()); 
        System.out.println(P.getPergunta());
        sc.nextLine();
        listaPosts.add(P); // E aqui a lógica tem que "voltar". 
        
        D.setListaPosts(listaPosts); // Post -> ListaPosts -> Discussao -> ListaDiscussao -> Materia  
        listaDiscussao.add(D);
        m.setLista_discussoes(listaDiscussao);
        m.adicionarPost(P,D);

        System.out.println("Pergunta adicionada!");
        
    }
    
    public static void adicionarResposta(){
        // Processo análogo de criação de post. Matéria -> ... -> Resposta
        System.out.println("Para adicionar uma resposta, precisa primeiro escolher uma materia");
        Materia m = mostraMaterias("Qual materia gostaria de consultar?"); // Lógica: Materia -> ListaDiscussão -> Discussao -> ListaPosts -> Post
        List<Discussao> listaDiscussao = m.getLista_discussoes(); 

        for(Discussao D : listaDiscussao)
            System.out.println(D.toString());

        // por algum motivo, na linha abaixo aparecem 3 copias da discussao
        Discussao D = mostraDiscussoes(listaDiscussao, "Em qual discussao gostaria de adicionar uma resposta?");
        List<Post> listaPosts = D.getListaPosts(); // lista de posts da discussão selecionada
        Post P = mostraPosts(listaPosts); // prompt pro usuário escolher o post que ele quer responder
        System.out.println("Qual a sua resposta?");
        Resposta R = new Resposta();
        R.setResposta(sc.nextLine());
        sc.nextLine();
        P.AdicionaResposta(R);
        listaPosts.add(P);
        D.setListaPosts(listaPosts);
        listaDiscussao.add(D);
        m.AdicionaDiscussao(D);
        System.out.println("Resposta adicionada!");
    }

    public static void insereAlunoMateria(){
        sc.nextLine();
        Materia m = mostraMaterias("Escolha uma materia:");
        Aluno a = mostraAluno("Escolha o Aluno:");
        m.adicionarAluno(a);
        System.out.println("Aluno "+a.getNome()+" adicionado na materia "+m.getNome());
    }

    public static void insereProfessorMateria(){
        sc.nextLine();
        Materia m = mostraMaterias("Escolha uma materia:");
        Professor p = mostraProfessor("Escolha o Professor:");
        m.adicionarProfessor(p);
        System.out.println("Professor "+p.getNome()+" adicionado na materia "+m.getNome());
    }

    public static void insereMonitorMateria(){
        sc.nextLine();
        Materia m = mostraMaterias("Escolha uma materia:");
        Monitor m1 = mostraMonitor("Escolha o Monitor:");
        m.adicionarMonitor(m1);
        System.out.println("Monitor "+m1.getNome()+" adicionado na materia "+m.getNome());
    }

    public static Materia mostraMaterias(String pergunta){
        int opcao;
        List<Materia> listaMaterias = new ArrayList();
        listaMaterias = sistema.getListaMateria();
        System.out.println(pergunta);
        for (int i=0; i<listaMaterias.size(); i++){
            System.out.println(+i+": "+ listaMaterias.get(i).getNome()+" ID: "+listaMaterias.get(i).getId());
        }
        opcao = sc.nextInt();
        return listaMaterias.get(opcao);
    }

    public static Professor mostraProfessor(String pergunta){
        int opcao;
        List<Professor> professores = new ArrayList();
        professores = sistema.getListaProfessor();
        System.out.println(pergunta);
        for (int i=0; i<professores.size(); i++){
            System.out.println(+i+": "+ professores.get(i).getNome()+" CPF: "+professores.get(i).getCPF());
        }
        opcao = sc.nextInt();
        return professores.get(opcao);
    }

    public static Aluno mostraAluno(String pergunta){
        int opcao;
        List<Aluno> alunos = new ArrayList();
        alunos = sistema.getListaAluno();
        System.out.println(pergunta);
        for (int i=0; i<alunos.size(); i++){
            System.out.println(+i+": "+ alunos.get(i).getNome()+" CPF: "+alunos.get(i).getCpf());
        }
        opcao = sc.nextInt();
        return alunos.get(opcao);
    }

    public static Monitor mostraMonitor(String pergunta){
        int opcao;
        List<Monitor> monitores = new ArrayList();
        monitores = sistema.getListaMonitor();
        System.out.println(pergunta);
        for (int i=0; i<monitores.size(); i++){
            System.out.println(+i+": "+ monitores.get(i).getNome()+" CPF: "+monitores.get(i).getCpf());
        }
        opcao = sc.nextInt();
        return monitores.get(opcao);
    }
    
    public static Discussao mostraDiscussoes(List<Discussao> listaDiscussao, String pergunta){
        int opcao;
        // Materia m = new Materia();
        System.out.println(pergunta);
        for (int i=0; i<listaDiscussao.size(); i++){
            System.out.println(+i+ ": Titulo: "+listaDiscussao.get(i).getTitulo());
        }
        opcao = sc.nextInt();
        return listaDiscussao.get(opcao);
    }
    
    public static Post mostraPosts(List<Post> listaPosts){
        int opcao;
        System.out.println("Qual Post gostaria de responder ?");
        for (int i=0; i<listaPosts.size(); i++){
            System.out.println(+i+ ": Pergunta:"+listaPosts.get(i).getPergunta());
        }
        opcao = sc.nextInt();
        return listaPosts.get(opcao);
    }
    
    public static void login(){

        ArrayList<Pessoa> listaPessoas = sistema.getListaPessoa();
        String cpf = null;
        String senha = null;

        while(true){
            System.out.println("Digite o CPF do Usuário: ");
            sc.nextLine();
            cpf = sc.nextLine();
            sc.nextLine();
    
            System.out.prinln("Digite a Senha do Usuário: ");
            sc.nextLine();
            senha = sc.nextLine();
            sc.nextLine();

            for(Pessoa P: listaPessoas){
                if(P.login(cpf, senha)){
                    if(P instanceof Aluno){

                    }
                    if(P instanceof Monitor){

                    }
                    if(P instanceof Professor){
                        
                    }
                }
            }

            System.out.println("Erro no login !");
            System.out.println("Digite 1 para voltar, 2 para tentar novamente");

            if(sc.nextInt() == 1)
                break;

        }



    }
    
}
