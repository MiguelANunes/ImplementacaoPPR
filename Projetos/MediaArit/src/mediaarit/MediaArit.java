package mediaarit;

import java.util.Scanner;

public class MediaArit {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vetor[] = new int[50];
        System.out.println("Digite 50 valores para um vetor: ");
        int soma=0;
        float media;
        // lê vetor
        for (int i=0; i<vetor.length; i++){
            vetor[i] = in.nextInt();
            soma+=vetor[i];
        }
        media = soma/50; System.out.println("A media é: " +media);
        for (int i=0; i<50; i++){
            if (vetor[i] < media)
                System.out.format("%d é menor do que a média. Posição: %d\n",vetor[i],i);
        }
    
    
    }
    
}
