/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Soto
 */
public class SecondProgram implements IConstantes
{
    public Double[][] miMatrizDatos;
    public Double[][] miMatrizCombinaciones;
    public Double[][] miMatrizProductoPunto;
    public Double[][] miMatrizResultado;
    public Double[][] miMatrizCondiciones;
    
    
    public int RowSizeDatos;
    public int ColumnSizeDatos;
    public int RowSizeCombinaciones;
    public int ColumnSizeCombinaciones;
    public int RowSizeResultado;
    public int ColumnSizeResultado;
    
    
    public SecondProgram(int pRowSize, int pColumnSize)
    {
        int i, j = 0;
        
        RowSizeDatos = pRowSize;
        ColumnSizeDatos = pColumnSize;
        miMatrizDatos = new Double[RowSizeDatos][ColumnSizeDatos];
        
       
        RowSizeCombinaciones = (int) Math.pow(2, RowSizeDatos);
        ColumnSizeCombinaciones = RowSizeDatos;        
        
        miMatrizCombinaciones = new Double[RowSizeCombinaciones][ColumnSizeCombinaciones];
        for (j = 0; j < ColumnSizeCombinaciones; j++)
        {
            AuxiliarCombinaciones(j);
        } 
        
        miMatrizCondiciones = new Double[rowSizeCondiciones][columnSizeCondiciones];
    }
    
    private void AuxiliarCombinaciones(int pColumna)
    {
        int intercalar = (RowSizeCombinaciones/ ((int) Math.pow(2, pColumna+1)));        
        int indiceFila = 0;
        int contadorRaro = 0;
        Double dato = 0.0;
        
        for (indiceFila = 0;indiceFila < RowSizeCombinaciones; indiceFila++)
        {
            if (contadorRaro == intercalar)
            {
                contadorRaro = 0;
                if (dato == 0.0)
                {
                    dato = 1.0;
                }
                else
                {
                    dato = 0.0;
                }
            } 
           miMatrizCombinaciones[indiceFila][pColumna] = dato;
           contadorRaro++;
        }
    }

    public void productoPunto()
    {
        int i,j = 0;
        RowSizeResultado = RowSizeCombinaciones;
        ColumnSizeResultado = ColumnSizeDatos;
        miMatrizProductoPunto = new Double[RowSizeResultado][ColumnSizeResultado];
        for(i = 0; i < RowSizeResultado; i++)
        {
            for(j = 0; j < ColumnSizeResultado; j++)
            {
               miMatrizProductoPunto[i][j] = productoPuntoAux(i,j); 
            }
        }
    } 

    private Double productoPuntoAux(int pFila, int pColumna)
    {
        int i = 0;
        Double resultado = 0.0;
        Double numero1, numero2, numero3;
        for(i = 0; i < ColumnSizeCombinaciones; i++)
        {
            numero1 = miMatrizCombinaciones[pFila][i];
            numero2 = miMatrizDatos[i][pColumna];
            numero3 = numero1 * numero2;
            resultado = resultado + numero3;
        }
        return resultado;
    } 
    

}
