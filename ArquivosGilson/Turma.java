package principal;

public class Turma {

    private int quantAlunos=0;
    private Aluno alunos[];
    
    public Turma(int quant){
        Aluno alunos[] = new Aluno[quant];
    }
    
    
    public boolean AddAluno(Aluno a){
        if(quantAlunos < alunos.length){
            alunos[quantAlunos] = a;
            quantAlunos++;
            return true;
        }
        else
            return false;
    }
    
    
    public float getMediaAlunos(){
        float mediaAlunos=0;
        for (int i=0; i<quantAlunos; i++){
            mediaAlunos += alunos[i].getMedia();
        }
        
        return mediaAlunos/quantAlunos;
        
    }
}
