/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Model.SecondProgram;
import View.MainWindow;
import java.util.ArrayList;

/**
 *
 * @author Soto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        MainWindow miMainWindow = new MainWindow();
        miMainWindow.showMainWindow();
//        SecondProgram miSecondProgram = new SecondProgram(3, 4);
//        miSecondProgram.miMatrizDatos[0][0] = 22.0;
//        miSecondProgram.miMatrizDatos[0][1] = 32.3;
//        miSecondProgram.miMatrizDatos[0][2] = 4.5;
//        miSecondProgram.miMatrizDatos[0][3] = 15.0;
//        miSecondProgram.miMatrizDatos[1][0] = 62.0;
//        miSecondProgram.miMatrizDatos[1][1] = 53.0;
//        miSecondProgram.miMatrizDatos[1][2] = 7.0;
//        miSecondProgram.miMatrizDatos[1][3] = 122.0;
//        miSecondProgram.miMatrizDatos[2][0] = 73.8;
//        miSecondProgram.miMatrizDatos[2][1] = 68.0;
//        miSecondProgram.miMatrizDatos[2][2] = 8.0;
//        miSecondProgram.miMatrizDatos[2][3] = 143.0;
//        imprimirMatriz(miSecondProgram.RowSizeDatos, miSecondProgram.ColumnSizeDatos, miSecondProgram.miMatrizDatos);
//        System.out.println();
//        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
//        System.out.println();
//        imprimirMatriz(miSecondProgram.RowSizeCombinaciones, miSecondProgram.ColumnSizeCombinaciones, miSecondProgram.miMatrizCombinaciones);
//        System.out.println();
//        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
//        System.out.println();        
//        miSecondProgram.productoPunto();
//        imprimirMatriz(miSecondProgram.RowSizeResultado, miSecondProgram.ColumnSizeResultado, miSecondProgram.miMatrizProductoPunto);
        
        
    }
    
    public static void imprimirMatriz(int pRowSize, int pColumnSize, Double[][] pMatriz)
    {
        int i,j = 0;
        for(i = 0; i < pRowSize; i++)
        {
            j=0;
            System.out.print(pMatriz[i][j].toString());
            System.out.print(" - ");
            for(j = 1;j < pColumnSize - 1; j++)
            {
                System.out.print(pMatriz[i][j].toString());
                System.out.print(" - ");
            }
            System.out.print(pMatriz[i][j].toString());
            System.out.println();
        }
    }
    
    
}
