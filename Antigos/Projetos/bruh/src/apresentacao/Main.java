package apresentacao;

import dados.Cidade;
import persistencia.CidadeDAO;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cidade cidade = new Cidade();
        Scanner in = new Scanner(System.in);
        
        cidade.setNome("Joinville");
        cidade.setEstado("SC");
        
        CidadeDAO cidadeDAO = CidadeDAO.getInstance();
        cidadeDAO.insert(cidade);
        
        Cidade cidade2 = cidadeDAO.select(1);
        System.out.println("Cidade: "+cidade.getNome()+" Estado: "+cidade.getEstado());
    }
    
}
