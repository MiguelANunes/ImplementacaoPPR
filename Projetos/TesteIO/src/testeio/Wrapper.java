package testeio;

public class Wrapper {
    
    
    
    public void print(Object o){
        System.out.println("Imprimindo o objeto: "+ o);
    }

    public void teste(int x){
        print("Teste");
        print(new Integer(x));
        print(new Boolean(x>3));
    }
    
    
    
}
