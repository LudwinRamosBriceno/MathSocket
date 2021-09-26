
package mathsocket;

/**
 *Crea los nodos de una lista enlazada.
 * Se crean los nodos que representan a cada una de las casillas del tablero y guardan la información
 * asociada a cada una de ellas.
 * @author Ludwin Ramos,Alisson Redondo, Greivin Carrillo.
 * @version 1.0
 * @since 25/09/2021
 */
public class NodosCasillas {
    
    private int X;
    private int Y;
    public NodosCasillas next;
    private NodosCasillas tail;
    private int tipoCasilla;
    
    /**
     * Se inicializan las coordenadas, el siguiente nodo o casilla, el nodo o casilla anterior
     * y el tipo de casilla que corresponde.
     */
    public NodosCasillas() {
        this.X = 0;
        this.Y = 0;
        this.next = null;
        this.tail = null;
        this.tipoCasilla=0;
    }
    /**
     * Se establecen las coordenadas de cada casilla en el eje X y en el eje Y.
     * @param ejeX coordenada de la casilla en el eje X.
     * @param ejeY coordenada de la casilla en el eje Y.
     */
    public void setcoordenadas(int ejeX,int ejeY) {
        this.X = ejeX;
        this.Y = ejeY;
    }
    /**
     * Se establece el tipo de cada casilla del tablero.
     * @param tipo tipo de casilla identificada con un número.
     */
    public void setTipoCasilla(int tipo){
        this.tipoCasilla=tipo;
    }
    /**
     * Retorna el tipo de la casilla.
     * @return devuelve el número asociado al nodo o casilla.
     */
    public int getTipoCasilla(){
        return this.tipoCasilla;
    }
    /**
     * Retorna la coordenada de la casilla en el eje X.
     * @return devuelve la coordenada en el eje X.
     */
    public int getX() {   
        return this.X;
    }
    /**
     * Retorna la coordenada de la casilla en el eje Y.
     * @return devuelve la coordenada en el eje Y.
     */
    public int getY() {   
        return this.Y;
    }
    /**
     * Establece el siguiente nodo o casilla según la lista enlazada.
     * @param Node siguiente nodo o casilla asociado a otro de la lista enlazada.
     */
    public void setNext(NodosCasillas Node) {
        this.next = Node;
    }
    /**
     * Retorna el siguiente nodo o casilla según la lista enlazada.
     * @return devuelve el siguiente nodo o casilla asociado a otro de la lista enlazada.
     */
    public NodosCasillas getNext() {
        return this.next;
    }
    /**
     * Establece el nodo o casilla anterior según la lista enlazada.
     * @param Node  nodo o casilla anterior asociado a otro de la lista enlazada.
     */
    public void setTail(NodosCasillas Node) {
        this.tail = Node;
    }
    /**
     * Retorna el nodo o casilla anterior según la lista enlazada.
     * @return devuelve el nodo o casilla anterior asociado a otro de la lista enlazada.
     */
    public NodosCasillas getTail() {
        return this.tail;
    }
}
