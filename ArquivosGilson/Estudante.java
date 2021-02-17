package obj1;

public class Estudante {
    
    private String nome;
    private float notas[];
    
    public Estudante(int quant){
        notas = new float[quant];
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public boolean setNota(int pos, float nota){
        if (pos >= 0 && pos<notas.length){
            notas[pos] = nota;
            return true;
        }
        else
            return false;
    }
    
    public float getNota(int pos){
        if (pos >= 0 && pos<notas.length){
            return notas[pos];
        }
        else
            return -1;
    }
    
    public float getMedia(){
        float soma = 0;
        for (int i=0; i<notas.length; i++){
            soma+= notas[i];
        }
        return soma/notas.length;
    }
}
