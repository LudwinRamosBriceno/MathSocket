/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsocket;

/**
 *
 * @author lujor
 */
public class NodosCasillas {
    
    private int X;
    private int Y;
    public NodosCasillas next;
    private NodosCasillas tail;
    private int tipoCasilla;
    
    public NodosCasillas() {
        this.X = 0;
        this.Y = 0;
        this.next = null;
        this.tail = null;
        this.tipoCasilla=0;
    }
    public void setcoordenadas(int ejeX,int ejeY) {
        this.X = ejeX;
        this.Y = ejeY;
    }
    public void setTipoCasilla(int tipo){
        this.tipoCasilla=tipo;
    }
    public int getTipoCasilla(){
        return this.tipoCasilla;
    }
    
    public int getX() {   
        return this.X;
    }
    public int getY() {   
        return this.Y;
    }
    public void setNext(NodosCasillas Node) {
        this.next = Node;
    }
    public NodosCasillas getNext() {
        return this.next;
    }
    public void setTail(NodosCasillas Node) {
        this.tail = Node;
    }
    public NodosCasillas getTail(NodosCasillas Node) {
        return this.tail;
    }
}
