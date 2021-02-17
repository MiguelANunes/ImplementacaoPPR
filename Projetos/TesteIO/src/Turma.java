import java.lang.reflect.Array;
import java.util.Arrays;

public class Turma {
	private Estudante estudantes[] = new Estudante[50];
	private int quantEstudantes = 0;

	
	public void cadastraEstudante(Estudante e) {
		estudantes[quantEstudantes] = e;
		quantEstudantes++;
	}
	
	public float getMedia() {
		float soma = 0;
		for (int i = 0; i < quantEstudantes; i++) {
			soma += estudantes[i].getMedia();
		}
		return soma/quantEstudantes;
	}
	
	public int getQuantEstudantes() {
		return quantEstudantes;
	}
	
	public Estudante getEstudante(int pos) {
		return estudantes[pos];
	}
}
