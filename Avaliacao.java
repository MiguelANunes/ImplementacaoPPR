package dados;


public class Avaliacao {
    private int id;
    public float ranking;
    public String descricao;

    public Avaliacao(int id, float ranking, String descricao) {
        this.id = id;
        this.ranking = ranking;
        this.descricao = descricao;
    }

    public int getID(){
        return id;
    }
    
    public float getRanking() {
        return ranking;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setID(int id){
        this.id = id;
    }
    
    public void setRanking(float ranking) {
        this.ranking = ranking;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Avaliacao {" + "ID = " + this.id + "ranking: " + this.ranking + ", descricao: " + this.descricao + "}";
    }
 
}