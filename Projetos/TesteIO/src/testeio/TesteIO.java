package testeio;
import java.io.*;
import java.util.Scanner;

public class TesteIO {

    public static void main(String[] args) throws IOException {
        String s = "PenisPenisPenis";
        Scanner in = new Scanner(System.in);
        String f;
        
        
        
        File file = new File("putaquepariu.txt");
        System.out.println("O path do arquivo e:" +file.createNewFile());
        
         OutputStream os = new FileOutputStream("putaquepariu.txt");   
         OutputStreamWriter w = new OutputStreamWriter(os);
         BufferedWriter bw = new BufferedWriter(w);
         for (int i=0; i<50; i++){
             bw.write(s+"\n");
         }
         
         bw.close();
         
         InputStream is = new FileInputStream("Teste.txt");
         InputStreamReader isr = new InputStreamReader(is);
         BufferedReader br = new BufferedReader(isr);
         f = br.readLine();

         while(f != null){
             f = br.readLine();
             
         }
    }
    
}
