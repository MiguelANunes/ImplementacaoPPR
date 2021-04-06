package dados;

public class Monitor {
    private String nome, cpf;
    private Materia materia;
    private float score; 

    public Monitor(String nome, String cpf, Materia materia, float score) {
        this.nome = nome;
        this.cpf = cpf;
        this.materia = materia;
        this.score = score;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Materia getMateria() {
        return materia;
    }

    public float getScore() {
        return score;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public void login(){
    // void por hora    
    }
    
    public void logout(){
    // void por hora
    }

    @Override
    public String toString() {
        return "Monitor{" + "nome: " + nome + ", cpf: " + cpf + ", materia: " + materia + ", score: " + score + '}';
    }

    
}
