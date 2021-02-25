package sistemaempresa;

public class Endereço {
    private int numero, cep;
    private String rua, bairro, cidade, estado;

    Endereço(int numero, int cep, String rua, String bairro, String cidade, String estado) {
        this.numero = numero;
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    public void setRua(String rua){
        this.rua = rua;
    }
    
    public String getRua(){
        return rua;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public String getBairro(){
        return bairro;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setCep(int cep){
        this.cep = cep;
    }
    
    public int getCep(){
        return cep;
    }
}
