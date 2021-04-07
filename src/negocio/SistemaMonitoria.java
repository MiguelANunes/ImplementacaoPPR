package negocio;
import dados.*;
import java.util.List;
import java.util.ArrayList;

public class SistemaMonitoria {
	private List<Aluno> listaAluno = new ArrayList();
	private List<Professor> listaProfessor = new ArrayList();
	private List<Materia> listaMateria = new ArrayList();
	private List<Monitor> listaMonitor = new ArrayList();
	private List<Post> listaPost = new ArrayList();
	private List<Resposta> listaResposta = new ArrayList();
	private int alunoCount=0,professorCount=0,materiaCount=0,monitorCount=0,postCount=0,respostaCount=0,avaliacaoCount=0;
	
	
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
}
