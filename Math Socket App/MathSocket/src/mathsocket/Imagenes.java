
package mathsocket;

import javax.swing.ImageIcon;

/**
 *Clase que importa las imagenes a utilizar en el juego.
 * @author Ludwin Ramos,Alisson Redondo, Greivin Carrillo.
 * @version 1.0
 * @since 25/09/2021
 */
public class Imagenes {
    ImageIcon img1 = new ImageIcon("DadoOne.png");
    ImageIcon img2 = new ImageIcon("DadoTwo.png");
    ImageIcon img3 = new ImageIcon("DadoThree.png");
    ImageIcon img4 = new ImageIcon("DadoFour.png");
    ImageIcon CasillaReto = new ImageIcon("Casilla - reto.png");
    ImageIcon CasillaTrampa = new ImageIcon("Casilla - trampa.png");
    ImageIcon CasillaTunel = new ImageIcon("Casilla - túnel.png");
    ImageIcon CasillaZero = new ImageIcon("DadoZero.png");
    
    /**
     * Retorna la imagen del dado 1.
     * @return retornar la imagen del dado correspondiente.
     */
    public ImageIcon img1(){
       return  img1;
    }
    /**
     * Retorna la imagen del dado 2.
     * @return retornar la imagen del dado correspondiente.
     */
    public ImageIcon img2(){
       return  img2;
    }
    /**
     * Retorna la imagen del dado 3.
     * @return retornar la imagen del dado correspondiente.
     */
    public ImageIcon img3(){
       return  img3;
    }
    /**
     * Retorna la imagen del dado 4.
     * @return retornar la imagen del dado correspondiente.
     */
    public ImageIcon img4(){
       return  img4;
    }
    /**
     * Retorna la imagen de la casilla reto.
     * @return retornar la imagen del dado correspondiente.
     */
    public ImageIcon CasillaReto(){
       return CasillaReto;
    }
    /**
     * Retorna la imagen de la casilla trampa.
     * @return retornar la imagen del dado correspondiente.
     */
    public ImageIcon CasillaTrampa(){
       return CasillaTrampa;
    }
    /**
     * Retorna la imagen de la casilla túnel.
     * @return retornar la imagen del dado correspondiente.
     */
    public ImageIcon CasillaTunel(){
       return CasillaTunel;
    }
    /**
     * Retorna la imagen de la casilla neutra o cero.
     * @return retornar la imagen del dado correspondiente.
     */
    public ImageIcon CasillaZero(){
       return CasillaZero;
    }
}
