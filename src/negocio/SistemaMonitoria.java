package negocio;

import dados.*;

import java.io.*;
import java.util.List;

import java.util.ArrayList;

public class SistemaMonitoria {
	private List<Aluno> listaAluno = new ArrayList<>();
	private List<Professor> listaProfessor = new ArrayList<>();
	private List<Materia> listaMateria = new ArrayList<>();
	private List<Monitor> listaMonitor = new ArrayList<>();
	private List<Post> listaPost = new ArrayList<>();
	private List<Resposta> listaResposta = new ArrayList<>();
	private int alunoCount=0,professorCount=0,materiaCount=0,monitorCount=0,postCount=0,respostaCount=0;

	
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
        
    public void AdicionaResposta(Resposta r) {
		listaResposta.add(r);
		respostaCount++;
	}
        
    public void AvaliaMonitor(Monitor m, Avaliacao a) {
		m.AdicionaAvaliacao(a);
	} 

        
    public List<Aluno> getListaAluno(){
    	return listaAluno;
    }
    
    public List<Materia> getListaMateria(){
    	return listaMateria;
    }
    
    public List<Professor> getListaProfessor(){
    	return listaProfessor;
    }
    
    public List<Monitor> getListaMonitor(){
    	return listaMonitor;
    }
    
    public List<Post> getListaPost(){
    	return listaPost;
    }
    
    public List<Resposta> getListaResposta(){
    	return listaResposta;
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
    
    public int getQuantResposta() {
        return respostaCount;
    }

    public List<Aluno> consultaAluno(){
        List<Aluno> listaRetorno = new ArrayList(listaAluno);
        return listaRetorno;
    }

    public List<Professor> consultaProfessor(){
        List<Professor> listaRetorno = new ArrayList(listaProfessor);
        return listaRetorno;
    }

    public List<Materia> consultaMateria(){
        List<Materia> listaRetorno = new ArrayList(listaMateria);
        return listaRetorno;
    }
    public List<Monitor> consultaMonitor(){
        List<Monitor> listaRetorno = new ArrayList(listaMonitor);
        return listaRetorno;
    }
    public List<Post> consultaPost(){
        List<Post> listaRetorno = new ArrayList(listaPost);
        return listaRetorno;
    }
    public List<Resposta> consultaResposta(){
        List<Resposta> listaRetorno = new ArrayList(listaResposta);
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

    public void inicializarDados(){ // ler dos arquivos ao iniciar o programa

        try{

            InputStream arquivoMateria        = new FileInputStream(".//armazenamento//Materia.txt");
            ObjectInputStream leitorMateria   = new ObjectInputStream (arquivoMateria);

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

            InputStream arquivoAluno          = new FileInputStream(".//armazenamento//Aluno.txt");
            ObjectInputStream leitorAluno     = new ObjectInputStream (arquivoAluno);

            try {
                while(true){
                    Aluno a = new Aluno();
                    a = (Aluno) leitorAluno.readObject();

                    if(a.getNome() != null && !(a.getNome().isEmpty())){
                        AdicionaAluno(a);
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

            InputStream arquivoProfessor      = new FileInputStream(".//armazenamento//Professor.txt");
            ObjectInputStream leitorProfessor = new ObjectInputStream (arquivoProfessor);

            try {
                while(true){
                    Professor p = new Professor();
                    p = (Professor) leitorProfessor.readObject();

                    if(p.getNome() != null && !(p.getNome().isEmpty())){
                        AdicionaProfessor(p);
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

            InputStream arquivoMonitor        = new FileInputStream(".//armazenamento//Monitor.txt");
            ObjectInputStream leitorMonitor   = new ObjectInputStream (arquivoMonitor);

            try {
                while(true){
                    Monitor m = new Monitor();
                    m = (Monitor) leitorMonitor.readObject();

                    if(m.getNome() != null && !(m.getNome().isEmpty())){
                        AdicionaMonitor(m);
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

            // InputStream arquivoResposta       = new FileInputStream(".//armazenamento//Resposta.txt");
            // ObjectInputStream leitorResposta  = new ObjectInputStream (arquivoResposta);

            // try {
            //     while(true){
            //         Resposta r = new Resposta();
            //         r = (Resposta) leitorResposta.readObject();

            //         if(r.getResposta() != null && !(r.getResposta().isEmpty())){
            //             AdicionaResposta(r);
            //         }else{
            //             continue;
            //         }
            //     }                
            // } catch (EOFException e) {
                
            // }catch (IOException e) {
            //     System.out.println("Problema ao Ler dados");
            //     e.printStackTrace();
            // } catch (ClassNotFoundException e1) {
            //     System.out.println("Problema ao Ler dados");
            //     e1.printStackTrace();
            // }finally{
            //     leitorResposta.close();
            // }

            // InputStream arquivoPost      = new FileInputStream(".//armazenamento//Post.txt");
            // ObjectInputStream leitorPost = new ObjectInputStream (arquivoPost);

            // try {
            //     while(true){
            //         Post p = new Post();
            //         p = (Post) leitorPost.readObject();

            //         if(p.getPergunta() != null && !(p.getPergunta().isEmpty())){
            //             AdicionaPost(p);
            //         }else{
            //             continue;
            //         }
            //     }                
            // } catch (EOFException e) {
                
            // }catch (IOException e) {
            //     System.out.println("Problema ao Ler dados");
            //     e.printStackTrace();
            // } catch (ClassNotFoundException e1) {
            //     System.out.println("Problema ao Ler dados");
            //     e1.printStackTrace();
            // }finally{
            //     leitorPost.close();
            // }

            
        }catch (IOException e){ // deixar IOException dava erro de compilação aqui, mas isso foi antes de fazer escrita
            System.out.println("Erro ao salvar dados !"); // mudar de volta para isso para testar
            e.printStackTrace();
        }

    }

    public void salvarDados(){ // salvar nos arquivos ao terminar o programa

        try{
            // ver /home/miguel/Documentos/Udesc/Matérias/PPR/Implementação/Antigos/Projetos/TesteIO/src/Principal.java

            // verificar se os arquivos já existem é completamente inútil, ele sempre existirão
            OutputStream arquivoMateria          = new FileOutputStream(".//armazenamento//Materia.txt");
            ObjectOutputStream escritorMateria   = new ObjectOutputStream (arquivoMateria);

            for (Materia M: listaMateria)
                escritorMateria.writeObject(M);
            
            escritorMateria.close();

            OutputStream arquivoAluno            = new FileOutputStream(".//armazenamento//Aluno.txt");
            ObjectOutputStream escritorAluno     = new ObjectOutputStream (arquivoAluno);

            for(Aluno A: listaAluno)
                escritorAluno.writeObject(A);
            
            escritorAluno.close();

            OutputStream arquivoProfessor        = new FileOutputStream(".//armazenamento//Professor.txt");
            ObjectOutputStream escritorProfessor = new ObjectOutputStream (arquivoProfessor);

            for(Professor P: listaProfessor)
                escritorProfessor.writeObject(P);
            
                escritorProfessor.close();

            OutputStream arquivoMonitor          = new FileOutputStream(".//armazenamento//Monitor.txt");
            ObjectOutputStream escritorMonitor   = new ObjectOutputStream (arquivoMonitor);

            for(Monitor M: listaMonitor)
                escritorMonitor.writeObject(M);
            
                escritorMonitor.close();

            // OutputStream arquivoAvaliacao        = new FileOutputStream(".//armazenamento//Avaliacao.txt");
            // ObjectOutputStream escritorAvaliacao = new ObjectOutputStream (arquivoAvaliacao);

            // for(Avaliacao A: lista)

            // OutputStream arquivoDiscussao        = new FileOutputStream(".//armazenamento//Discussão.txt");
            // ObjectOutputStream escritorDiscussao = new ObjectOutputStream (arquivoDiscussao);

            // OutputStream arquivoResposta         = new FileOutputStream(".//armazenamento//Resposta.txt");
            // ObjectOutputStream escritorResposta  = new ObjectOutputStream (arquivoResposta);

            // for(Resposta R: listaResposta)
            //     escritorResposta.writeObject(R);
            
            //     escritorResposta.close();

            // OutputStream arquivoPost             = new FileOutputStream(".//armazenamento//Post.txt");
            // ObjectOutputStream escritorPost      = new ObjectOutputStream (arquivoPost);

            // for(Post P: listaPost)
            //     escritorPost.writeObject(P);
            
            // escritorPost.close();

            
        }catch (IOException e){ // deixar IOException dava erro de compilação aqui, mas isso foi antes de fazer escrita
            System.out.println("Erro ao salvar dados !"); // mudar de volta para isso para testar
            e.printStackTrace();
        }
    }

}
