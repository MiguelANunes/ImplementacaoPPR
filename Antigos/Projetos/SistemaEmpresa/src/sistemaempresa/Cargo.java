package sistemaempresa;

public class Cargo {
    private String descricao;
    private float SalarioBase, ValExtra, ValFilho;

    Cargo(String descricao, float SalarioBase, float ValExtra, float ValFilho) {
        this.descricao = descricao;
        this.SalarioBase = SalarioBase;
        this.ValExtra = ValExtra;
        this.ValFilho = ValFilho;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setSalarioBase(int SalarioBase){
        this.SalarioBase = SalarioBase;
    }
    
    public float getSalarioBase(){
        return SalarioBase;
    }
    
    public void setValExtra(float ValExtra){
        this.ValExtra = ValExtra;
    }
    
    public float getValExtra(){
        return ValExtra;
    }
    
    public void setValFilho(float ValFilho){
        this.ValFilho = ValFilho;
    }
}
