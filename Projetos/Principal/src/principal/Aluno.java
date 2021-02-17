package principal;

public class Aluno {

    private float notas[] = new float[4];
    private String nome;
    private float media=0;

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] nota) {
        this.notas = nota;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public float getMedia(){
        for (int i=0; i<4; i++){
            media += notas[i];
        }
        return media;
    }

     
}
