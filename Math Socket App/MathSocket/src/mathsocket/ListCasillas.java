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
public class ListCasillas {

    private NodosCasillas head;
    private NodosCasillas temp;

    public ListCasillas() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void insertLast(int ejeX, int ejeY,int tipo) {
        NodosCasillas newNode = new NodosCasillas();
        if (isEmpty()) {
            this.head = newNode;
            newNode.setcoordenadas(ejeX, ejeY);
            newNode.setTipoCasilla(tipo);
        } else {
            if (this.head.getNext()==null) {
                this.head.setNext(newNode);
                newNode.setTail(this.head);
                temp = newNode;
                newNode.setcoordenadas(ejeX, ejeY);
                newNode.setTipoCasilla(tipo);
            } else {
                newNode.setcoordenadas(ejeX, ejeY);
                newNode.setTipoCasilla(tipo);
                temp.setNext(newNode);
                newNode.setTail(temp);
                temp = newNode;
            }

        }

    }
    public void insertFinal(int ejeX, int ejeY){
        NodosCasillas newNode = new NodosCasillas();
        newNode.setcoordenadas(ejeX, ejeY);
        newNode.setTail(temp);
        temp.setNext(newNode);
        
    }
    
    public int[] ObtenerCoordenadas(int numCasilla) {
        NodosCasillas casillaTemp = this.head;
        for(int i=1;i <= numCasilla;i++) {
            if (casillaTemp.getNext()==null){
                int [] coordenadaCasilla = new int []{casillaTemp.getX(),casillaTemp.getY()};
                return coordenadaCasilla;
            }
            else if (i==numCasilla) {
                int [] coordenadaCasilla = new int []{casillaTemp.getX(),casillaTemp.getY(),casillaTemp.getTipoCasilla()}; 
                return coordenadaCasilla;
            } else {
                casillaTemp = casillaTemp.getNext();
            }
        }
        return null;
    }
}

