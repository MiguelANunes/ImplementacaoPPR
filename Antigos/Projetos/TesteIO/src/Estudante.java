import java.io.Serializable;

public class Estudante implements Serializable {
	private String nome;
	private float[] notas = new float[4];
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float[] getNotas() {
		return notas;
	}
	
	public void setNota(int pos, float n) {
		notas[pos] = n;
	}
	
	public float getMedia() {
		float soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		return soma/notas.length;
	}

}
