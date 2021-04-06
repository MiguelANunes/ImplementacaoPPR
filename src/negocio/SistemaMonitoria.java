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
    
    
    
}

    