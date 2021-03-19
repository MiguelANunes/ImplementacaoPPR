package transposta;

import java.util.Scanner;

public class Transposta {
    public static void main(String[] args) {
        int linhas = 3, colunas = 2;
        int matriz[][] = new int[linhas][colunas];
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite valores para uma matriz M(3)(2): ");
        for (int i=0; i<linhas; i++){
            for (int j=0; j<colunas; j++){
                matriz[i][j] = in.nextInt();
            }
        }
        System.out.println("A matriz de entrada é:");
        for (int i=0; i<linhas; i++){
            for (int j=0; j<colunas; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        int matriztrans[][] = new int[colunas][linhas];
        
        for(int i=0; i<linhas; i++){
            for(int j=0; j<colunas; j++){
                matriztrans [j][i] = matriz[i][j];
            }
        }
        System.out.println("A matriz transposta é:");
        for (int i=0; i<=linhas; i++){
            for (int j=0; j<=colunas; j++){
                System.out.print(matriztrans[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
