
package mathsocket;

/**
 *Crea una lista enlazada que contiene a cada nodo o casilla del tablero.
 * @author Ludwin Ramos,Alisson Redondo, Greivin Carrillo.
 * @version 1.0
 * @since 25/09/2021
 */
public class ListCasillas {

    private NodosCasillas head;
    private NodosCasillas temp;
    
    /**
     * Se incializa una cabeza de la lista enlazada.
     */
    public ListCasillas() {
        this.head = null;
    }
    
    /**
     * Verifica si la cabeza de la lista enlazada está nula o vacías.
     * @return devuelve un valor booleano con respecto al estado de la cabeza de la lista.
     */
    public boolean isEmpty() {
        return this.head == null;
    }
    /**
     * Inserta a cada nodo o casilla de la lista enlazada.
     * Se inserta cada nodo de la naturaleza de las colas FIFO (First In, First Out).
     * @param ejeX coordenada del eje X de la casilla.
     * @param ejeY coordenada del eje Y de la casilla.
     * @param tipo tipo de casilla asociada a un número.
     */
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
    /**
     * Inserta la última casilla del tablero a la lista enlazada.
     * @param ejeX coordenada del eje X de la casilla.
     * @param ejeY coordenada del eje Y de la casilla.
     */
    public void insertFinal(int ejeX, int ejeY){
        NodosCasillas newNode = new NodosCasillas();
        newNode.setcoordenadas(ejeX, ejeY);
        newNode.setTail(temp);
        temp.setNext(newNode);
    }
    
    /**
     * Recorre la lista enlazada de acuerdo al progreso en el tablero de juego.
     * @param numCasilla numero de la casilla asociada al progreso transcurrido en el tablero de juego.
     * @return devuelve un arreglo que contiene las coordenadas de la respectiva casilla y el tipo de esa casilla.
     */
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

