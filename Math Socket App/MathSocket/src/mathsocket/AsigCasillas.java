/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsocket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author lujor
 */
public class AsigCasillas {

    private int [] casillas;
    ArrayList <Integer> TipoCasillas = new ArrayList <Integer>();
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

    public int[] dequeue() {
        
        int count = 0;
        int LargoLista = 14;
        for (int i=0;i<14;i++){
            Random RandomIndex = new Random();
            int index = RandomIndex.nextInt(LargoLista);
            this.casillas[i] = TipoCasillas.get(index);
            //System.out.println(casillas[i]);
            TipoCasillas.remove(index);
            LargoLista--;
        }
        return this.casillas;    
        }
    
    public static void main(String args[]){

        //System.out.println(TipoCasillas);  
        AsigCasillas p = new AsigCasillas();
        //System.out.println(Arrays.toString(p.dequeue()));  
    }
}
