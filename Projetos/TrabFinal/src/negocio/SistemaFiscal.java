package negocio;
import dados.*;
import java.util.List;
import java.util.ArrayList;
    
public class SistemaFiscal {
    private List<Contribuinte> listaFisica= new ArrayList();
    private List<PessoaJuridica> listaJuridica = new ArrayList();
    private int quantCont = 0, quantJur = 0;
        
        
    public void cadastraContribuinte(Contribuinte c){
        listaFisica.add(c);
        quantCont++;
    }
        
        
    public void cadastraJuridica(PessoaJuridica j){
        listaJuridica.add(j);
        quantJur++;
    }
        
    public void removePessoaJuridica(PessoaJuridica j){
        listaJuridica.remove(j);
    }
        
        
    public List<Contribuinte> consultaContribuinte(){
        List<Contribuinte> listaRetorno = new ArrayList(listaFisica);
        return listaRetorno;
    }
    
    public List<PessoaJuridica> consultaJuridica(){
        List<PessoaJuridica> listaRetorno2 = new ArrayList(listaJuridica);
        return listaRetorno2;
    }
    
    public List<Contribuinte> getListaFisica() {
        return listaFisica;
    }
    
    public void setListaFisica(List<Contribuinte> listaFisica) {
        this.listaFisica = listaFisica;
    }
    
    public List<PessoaJuridica> getListaJuridica() {
        return listaJuridica;
    }
    
    public void setListaJuridica(List<PessoaJuridica> listaJuridica) {
        this.listaJuridica = listaJuridica;
    }
    
    public int getQuantCont() {
        return quantCont;
    }
    
    public void setQuantCont(int quantCont) {
        this.quantCont = quantCont;
    }
    
    public int getQuantJur() {
        return quantJur;
    }
    
    public void setQuantJur(int quantJur) {
        this.quantJur = quantJur;
    }
    
    
    
}