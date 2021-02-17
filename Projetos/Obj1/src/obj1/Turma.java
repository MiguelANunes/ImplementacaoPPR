package obj1;

public class Turma {
    
    private Estudante estudantes[];
    private int quantAtual=0;
    
    public Turma(int quant){
        estudantes = new Estudante[quant];
    }
    
    public boolean addEstudante(Estudante est){
        if (quantAtual < estudantes.length){
            estudantes[quantAtual] = est;
            quantAtual++;
            return true;
        }
        else
            return false;
    }
    
    public Estudante getEstudante(int pos){
        return estudantes[pos];
    }
    
    public float getMedia(){
        float mediasEstudantes=0;
        for (int i=0; i<quantAtual; i++){
            mediasEstudantes += estudantes[i].getMedia();
        }
        return mediasEstudantes/quantAtual;
    }
    
}

