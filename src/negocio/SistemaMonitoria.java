package negocio;

import dados.*;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class SistemaMonitoria {
	private ArrayList<Aluno> listaAluno = new ArrayList<>();
	private ArrayList<Professor> listaProfessor = new ArrayList<>();
	private ArrayList<Materia> listaMateria = new ArrayList<>();
	private ArrayList<Monitor> listaMonitor = new ArrayList<>();
	private ArrayList<Post> listaPost = new ArrayList<>();
    private ArrayList<Resposta> listaResposta = new ArrayList<>();
    private ArrayList<Pessoa> listaPessoa = new ArrayList<>(); // usado apenas para o login
    
	private int alunoCount=0,professorCount=0,materiaCount=0,monitorCount=0,postCount=0,respostaCount=0,pessoaCount=0;

	
    public void AdicionaAluno(Aluno a) {
		listaAluno.add(a);
		alunoCount++;
	}
	
    public void AdicionaProfessor(Professor p) {
		listaProfessor.add(p);
		professorCount++;
	}
	
    public void AdicionaMateria(Materia m) {
		listaMateria.add(m);
		materiaCount++;
	}
    public void AdicionaMonitor(Monitor m) {
		listaMonitor.add(m);
		monitorCount++;
	}
    public void AdicionaPost(Post p) {
		listaPost.add(p);
		postCount++;
    }
    
    public void AdicionarPessoa(Pessoa p){
        listaPessoa.add(p);
        pessoaCount++;
    }
        
    public void AdicionaResposta(Resposta r) {
		listaResposta.add(r);
		respostaCount++;
	}
        
    public void AvaliaMonitor(Monitor m, Avaliacao a) {
		m.AdicionaAvaliacao(a);
	} 

        
    public ArrayList<Aluno> getListaAluno(){
    	return listaAluno;
    }
    
    public ArrayList<Materia> getListaMateria(){
    	return listaMateria;
    }
    
    public ArrayList<Professor> getListaProfessor(){
    	return listaProfessor;
    }
    
    public ArrayList<Monitor> getListaMonitor(){
    	return listaMonitor;
    }
    
    public ArrayList<Post> getListaPost(){
    	return listaPost;
    }
    
    public ArrayList<Resposta> getListaResposta(){
    	return listaResposta;
    }

    public ArrayList<Pessoa> getListaPessoa(){
    	return listaPessoa;
    }
    
    public int getQuantAluno() {
        return alunoCount;
    }
    
    public int getQuantProfessor() {
        return professorCount;
    }
    
    public int getQuantMateria() {
        return materiaCount;
    }
    
    public int getQuantMonitor() {
        return monitorCount;
    }
    
    public int getQuantPost() {
        return postCount;
    }

    public int getQuantPessoa() {
        return pessoaCount;
    }
    
    public int getQuantResposta() {
        return respostaCount;
    }

    public ArrayList<Aluno> consultaAluno(){
        ArrayList<Aluno> listaRetorno = new ArrayList(listaAluno);
        return listaRetorno;
    }

    public ArrayList<Professor> consultaProfessor(){
        ArrayList<Professor> listaRetorno = new ArrayList(listaProfessor);
        return listaRetorno;
    }

    public ArrayList<Materia> consultaMateria(){
        ArrayList<Materia> listaRetorno = new ArrayList(listaMateria);
        return listaRetorno;
    }

    public ArrayList<Monitor> consultaMonitor(){
        ArrayList<Monitor> listaRetorno = new ArrayList(listaMonitor);
        return listaRetorno;
    }

    public ArrayList<Post> consultaPost(){
        ArrayList<Post> listaRetorno = new ArrayList(listaPost);
        return listaRetorno;
    }
    public ArrayList<Resposta> consultaResposta(){
        ArrayList<Resposta> listaRetorno = new ArrayList(listaResposta);
        return listaRetorno;
    }
    public ArrayList<Resposta> consultaPessoa(){
        ArrayList<Resposta> listaRetorno = new ArrayList(listaPessoa);
        return listaRetorno;
    }

    public void removeAluno(Aluno a){
        listaAluno.remove(a);
        alunoCount--;
    }
    public void removeProfessor(Professor p){
        listaProfessor.remove(p);
        professorCount--;
    }
    public void removeMonitor(Monitor m){
        listaMonitor.remove(m);
        monitorCount--;
    }
    public void removeMateria(Materia m){
        listaMateria.remove(m);
        materiaCount--;
    }
    public void removePost(Post p){
        listaPost.remove(p);
        postCount--;
    }
    public void removeResposta(Resposta r){
        listaResposta.remove(r);
        respostaCount--;
    }
    public void removePessoa(Pessoa p){
        listaPessoa.remove(p);
        pessoaCount--;
    }

    public void inicializarDados(){
        try{
            String currentpath = System.getProperty("user.dir");

            if(currentpath.endsWith("src")){ // caso "src" esteja no fim path do projeto, é removido, pois isso já está no
                currentpath = currentpath.substring(0, currentpath.length()-3);// path do arquivo a ser aberto
            }

            InputStream arquivoMateria      = new FileInputStream(currentpath + "/src/armazenamento/Materia.txt");
            ObjectInputStream leitorMateria = new ObjectInputStream (arquivoMateria);
            try {
                while(true){
                    Materia m = new Materia();
                    m = (Materia) leitorMateria.readObject();
                    if(m.getNome() != null && !(m.getNome().isEmpty())){
                        AdicionaMateria(m);
                    }else{
                        continue;
                    }
                }                
            } catch (EOFException e) {
                
            }catch (IOException e) {
                System.out.println("Problema ao Ler dados");
                e.printStackTrace();
            } catch (ClassNotFoundException e1) {
                System.out.println("Problema ao Ler dados");
                e1.printStackTrace();
            }
            finally{
                leitorMateria.close();
            }

            InputStream arquivoAluno      = new FileInputStream(currentpath + "/src/armazenamento/Aluno.txt");
            ObjectInputStream leitorAluno = new ObjectInputStream (arquivoAluno);

            try {
                while(true){
                    Aluno a = new Aluno();
                    a = (Aluno) leitorAluno.readObject();

                    if(a.getNome() != null && !(a.getNome().isEmpty())){
                        AdicionaAluno(a);
                        AdicionarPessoa(a);
                    }else{
                        continue;
                    }
                }                
            } catch (EOFException e) {
                
            }catch (IOException e) {
                System.out.println("Problema ao Ler dados");
                e.printStackTrace();
            } catch (ClassNotFoundException e1) {
                System.out.println("Problema ao Ler dados");
                e1.printStackTrace();
            }finally{
                leitorAluno.close();
            }

            InputStream arquivoProfessor      = new FileInputStream(currentpath + "/src/armazenamento/Professor.txt");
            ObjectInputStream leitorProfessor = new ObjectInputStream (arquivoProfessor);

            try {
                while(true){
                    Professor p = new Professor();
                    p = (Professor) leitorProfessor.readObject();

                    if(p.getNome() != null && !(p.getNome().isEmpty())){
                        AdicionaProfessor(p);
                        AdicionarPessoa(p);
                    }else{
                        continue;
                    }
                }                
            } catch (EOFException e) {
                
            }catch (IOException e) {
                System.out.println("Problema ao Ler dados");
                e.printStackTrace();
            } catch (ClassNotFoundException e1) {
                System.out.println("Problema ao Ler dados");
                e1.printStackTrace();
            }finally{
                leitorProfessor.close();
            }

            InputStream arquivoMonitor      = new FileInputStream(currentpath + "/src/armazenamento/Monitor.txt");
            ObjectInputStream leitorMonitor = new ObjectInputStream (arquivoMonitor);

            try {
                while(true){
                    Monitor m = new Monitor();
                    m = (Monitor) leitorMonitor.readObject();

                    if(m.getNome() != null && !(m.getNome().isEmpty())){
                        AdicionaMonitor(m);
                        AdicionarPessoa(m);
                    }else{
                        continue;
                    }
                }                
            } catch (EOFException e) {
                
            }catch (IOException e) {
                System.out.println("Problema ao Ler dados");
                e.printStackTrace();
            } catch (ClassNotFoundException e1) {
                System.out.println("Problema ao Ler dados");
                e1.printStackTrace();
            }finally{
                leitorMonitor.close();
            }
 
        }catch(EOFException ex){
            System.out.println("Alguns arquivos não tem nada salvo !");
            // se der excessão de EOF não faz nada pois significa que os arquivos de dados estão vazios
        }catch (IOException e){
            System.out.println("Erro ao ler dados !");
            e.printStackTrace();
        }

    }

    public void salvarDados(){ // salvar nos arquivos ao terminar o programa

        try{

            String currentpath = System.getProperty("user.dir");

            if(currentpath.endsWith("src")){ // caso "src" esteja no fim path do projeto, é removido, pois isso já está no
                currentpath = currentpath.substring(0, currentpath.length()-3);// path do arquivo a ser aberto
            }

            OutputStream arquivoMateria        = new FileOutputStream(currentpath + "/src/armazenamento/Materia.txt");
            ObjectOutputStream escritorMateria = new ObjectOutputStream (arquivoMateria);

            for (Materia M: listaMateria)
                escritorMateria.writeObject(M);
            
            escritorMateria.close();

            OutputStream arquivoAluno        = new FileOutputStream(currentpath + "/src/armazenamento/Aluno.txt");
            ObjectOutputStream escritorAluno = new ObjectOutputStream (arquivoAluno);

            for(Aluno A: listaAluno)
                escritorAluno.writeObject(A);
            
            escritorAluno.close();

            OutputStream arquivoProfessor        = new FileOutputStream(currentpath + "/src/armazenamento/Professor.txt");
            ObjectOutputStream escritorProfessor = new ObjectOutputStream (arquivoProfessor);

            for(Professor P: listaProfessor)
                escritorProfessor.writeObject(P);
            
                escritorProfessor.close();

            OutputStream arquivoMonitor        = new FileOutputStream(currentpath + "/src/armazenamento/Monitor.txt");
            ObjectOutputStream escritorMonitor = new ObjectOutputStream (arquivoMonitor);

            for(Monitor M: listaMonitor)
                escritorMonitor.writeObject(M);
            
                escritorMonitor.close();
            
        }catch (IOException e){ 
            System.out.println("Erro ao salvar dados !");
            e.printStackTrace();
        }
    }

}
