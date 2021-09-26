
package mathsocket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *Crea el array de los tipos de casilla aleatoriamente.
 * @author Ludwin Ramos,Alisson Redondo, Greivin Carrillo.
 * @version 1.0
 * @since 25/09/2021
 */
public class AsigCasillas {

    private int [] casillas;
    ArrayList <Integer> TipoCasillas = new ArrayList <Integer>();
    
    /**
     * Inicializa un arreylist de los tipos de casilla.
     */
    public AsigCasillas(){
        casillas = new int[14];
        for (int i=1;i<=7;i++){
            TipoCasillas.add(1);
        }for (int i=1;i<=4;i++){
            TipoCasillas.add(2);
        }for (int i=1;i<=3;i++){
            TipoCasillas.add(3); 
        }
     
    }
    /**
     * Toma los elemetos del arreylist "TipoCasillas" y los inserta aleatoriamente
     * en un arrey "casillas".
     * @return devuelve un arrey con los tipos de casilla en orden aleatorio.
     */
    public int[] dequeue() {
        
        int count = 0;
        int LargoLista = 14;
        for (int i=0;i<14;i++){
            Random RandomIndex = new Random();
            int index = RandomIndex.nextInt(LargoLista);
            this.casillas[i] = TipoCasillas.get(index);
            TipoCasillas.remove(index);
            LargoLista--;
        }
        return this.casillas;    
        }
    
    public static void main(String args[]){

        AsigCasillas p = new AsigCasillas();
       
    }
}
