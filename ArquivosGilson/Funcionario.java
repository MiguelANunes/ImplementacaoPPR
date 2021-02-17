package sistemaempresa;

public class Funcionario {
    private String nome;
    private Endereço endereço;
    private Cargo cargo;
    private float HorasExtras, numFilhos;
    private float ValorPorFilho = 25, ValorPorHoraExtra = 50;

    Funcionario(String nome, Endereço endereço, Cargo cargo, float HorasExtras, float numFilhos) {
        this.nome = nome;
        this.endereço = endereço;
        this.cargo = cargo;
        this.HorasExtras = HorasExtras;
        this.numFilhos = numFilhos;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }

    public void setEndereço(Endereço endereço){
        this.endereço = endereço;
    }
    
    public Endereço getEndereço(){
        return endereço;
    }
    
    public void setCargo(Cargo cargo){
        this.cargo = cargo;
    }
    
    public Cargo setCargo(){
        return cargo;
    }
    
    public void setHorasExtras(float HorasExtras){
        this.HorasExtras = HorasExtras;
    }
    
    public float getHorasExtras(){
        return HorasExtras;
    }
    
    public void setnumFilhos(float numFilhos){
        this.numFilhos = numFilhos;
    }
    
    public float getnumFilhos(){
        return numFilhos;
    }
    // FUNÇÕES!!!!! //
    
    public float getAcrescimos(){
        float acrescimo = (ValorPorFilho*numFilhos) + (ValorPorHoraExtra*HorasExtras);
        return acrescimo;
    }
    
    public float getINSS(){
        float INSS = cargo.getSalarioBase();
        float onzeporcento = (float) (INSS *(0.11));
        INSS = INSS - onzeporcento;
        return INSS;
    }
    
    public float getRI(){
        float base = cargo.getSalarioBase();
        if (base < 1372.81)
            return 0;
        else if(base > 1372.82 && base < 2743.25){ 
            return 15;
        }
        else{
            base = (float) 27.5;
            return base;
        }
    }
    
    public float getDescontos(){
        float INSS = getINSS();
        float RI = getRI();
        float desconto = INSS + RI;
        return desconto;
    }
    
    public float getSalarioBruto(){
        float base = cargo.getSalarioBase();
        float acrescimo = getAcrescimos();
        float SalarioBruto = base + acrescimo;
        return SalarioBruto;
    }
    
    public float getSalarioLiquido(){
        float base = cargo.getSalarioBase(), acrescimo = getAcrescimos(), descontos = getDescontos();
        return base + acrescimo - descontos;
    }
    
    
}
