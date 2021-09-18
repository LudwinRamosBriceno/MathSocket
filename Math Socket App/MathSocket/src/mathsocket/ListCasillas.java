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

    public void insertLast(int ejeX, int ejeY) {
        NodosCasillas newNode = new NodosCasillas();
        if (isEmpty()) {
            this.head = newNode;
            newNode.setcoordenadas(ejeX, ejeY);
        } else {
            if (this.head.getNext().equals(null)) {
                this.head.setNext(newNode);
                newNode.setTail(this.head);
                temp = newNode;
                newNode.setcoordenadas(ejeX, ejeY);
            } else {
                newNode.setcoordenadas(ejeX, ejeY);
                temp.setNext(newNode);
                newNode.setTail(temp);
                temp = newNode;
            }

        }

    }
}
