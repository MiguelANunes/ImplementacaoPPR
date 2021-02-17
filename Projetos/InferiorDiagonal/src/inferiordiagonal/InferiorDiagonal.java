package inferiordiagonal;

import java.util.Scanner;

public class InferiorDiagonal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matriz[][] = new int[5][5];
        int soma=0;
        // Leitura da matriz
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.println("Entre com valores para uma matriz 5x5");
                matriz[i][j] = in.nextInt();
            }
        }
        
        for (int i=1; i<5; i++){
            for (int j=0; j<i; j++){
                soma+= matriz[i][j];

            }
        }
        System.out.println("O resultado da soma da área inferior é: " +soma);
        System.out.println("A matriz de entrada é:");
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.print(matriz[i][j] +" ");
            }
            System.out.println("");
        }
    
    }
    
}
