
package mathsocket;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.SwingConstants.CENTER;
import static javax.swing.SwingConstants.TOP;

/**
 *Clase que simula e inicia el cliente del juego.
 *Interactua con otro jugador o cliente de forma peer to peer.
 * @author Ludwin Ramos,Alisson Redondo, Greivin Carrillo.
 * @version 1.0
 * @since 25/09/2021
 */
public class Jugador2 extends javax.swing.JFrame {

    static String Jugador1; // nombre del jugador1
    String Jugador2; // nombre del jugador 2
    
    int Respuesta = 0;  // respuesta matemática del reto.
    static boolean botonEnabled = false; // estado del botón del dado.
    static ListCasillas coordenadas = new ListCasillas();
    int recorrido = 0; // progreso de la ficha del jugador en el tablero
    Imagenes imagenes = new Imagenes();
    static int count = 0; //variable asociada al control cuando ambos dados de los jugadores son iguales
    static int valorDado = 0; // número relacionado a la condición del primer turno que decide cual jugador comienza.
    static String mensaje = "";
    
    static Socket socket;
    static DataInputStream datoEntrada;
    static DataOutputStream datoSalida;

    /**
     * Crea el nuevo formulario de la clase Jugador2. 
     * Inicializa los componentes o elementos del formulario Jugador2.
     */
    public Jugador2() {
        initComponents();
        botonRespuesta.setVisible(false);
        TextRespuesta.setVisible(false);
        LabelPregunta.setVisible(false);
        salirFin.setVisible(false);
    }

    /**
     * Este metodo es llamado desde dentro del constructor para inicializar el
     * formulario.
     * CUIDADO: no moidficar este código. El contenido de este metodo es siempre
     * regenerado por el editor de formularios automaticamente.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel2 = new javax.swing.JPanel();
        Nombre2 = new javax.swing.JTextField();
        buttonJugar2 = new javax.swing.JButton();
        buttonSalir2 = new javax.swing.JButton();
        AvisoNombre = new javax.swing.JLabel();
        buttonInstru2 = new javax.swing.JButton();
        FondoInicio = new javax.swing.JLabel();
        PanelJuego2 = new javax.swing.JPanel();
        salirFin = new javax.swing.JButton();
        botonRespuesta = new javax.swing.JButton();
        TextRespuesta = new javax.swing.JTextField();
        LabelPregunta = new javax.swing.JLabel();
        fichaJugador2 = new javax.swing.JLabel();
        fichaJugador1 = new javax.swing.JLabel();
        CInicio = new javax.swing.JLabel();
        LabelNombres = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        C8 = new javax.swing.JLabel();
        C9 = new javax.swing.JLabel();
        C7 = new javax.swing.JLabel();
        C6 = new javax.swing.JLabel();
        C4 = new javax.swing.JLabel();
        CFin = new javax.swing.JLabel();
        C10 = new javax.swing.JLabel();
        C11 = new javax.swing.JLabel();
        C5 = new javax.swing.JLabel();
        C15 = new javax.swing.JLabel();
        C13 = new javax.swing.JLabel();
        C12 = new javax.swing.JLabel();
        C14 = new javax.swing.JLabel();
        buttonDado2 = new javax.swing.JLabel();
        Dado2 = new javax.swing.JLabel();
        FondoJuego = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainFrame2");
        setPreferredSize(new java.awt.Dimension(600, 635));
        setResizable(false);

        MainPanel2.setBackground(new java.awt.Color(0, 153, 255));
        MainPanel2.setPreferredSize(new java.awt.Dimension(600, 600));
        MainPanel2.setLayout(null);

        Nombre2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Nombre2.setForeground(new java.awt.Color(153, 153, 153));
        Nombre2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nombre2.setText("Ingresar nombre (max 10 caracteres)");
        Nombre2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Nombre2.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Nombre2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Nombre2MousePressed(evt);
            }
        });
        Nombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nombre2ActionPerformed(evt);
            }
        });
        MainPanel2.add(Nombre2);
        Nombre2.setBounds(129, 104, 314, 38);

        buttonJugar2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonJugar2.setText("Jugar");
        buttonJugar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        buttonJugar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJugar2Action(evt);
            }
        });
        MainPanel2.add(buttonJugar2);
        buttonJugar2.setBounds(176, 209, 198, 49);

        buttonSalir2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonSalir2.setText("Salir");
        buttonSalir2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        buttonSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalir2Action(evt);
            }
        });
        MainPanel2.add(buttonSalir2);
        buttonSalir2.setBounds(177, 381, 197, 47);

        AvisoNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainPanel2.add(AvisoNombre);
        AvisoNombre.setBounds(129, 148, 314, 30);

        buttonInstru2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonInstru2.setText("Intrucciones");
        buttonInstru2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        buttonInstru2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInstru2Action(evt);
            }
        });
        MainPanel2.add(buttonInstru2);
        buttonInstru2.setBounds(177, 295, 197, 47);

        FondoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_inicio2.jpg"))); // NOI18N
        FondoInicio.setPreferredSize(new java.awt.Dimension(600, 600));
        MainPanel2.add(FondoInicio);
        FondoInicio.setBounds(0, 0, 600, 600);

        PanelJuego2.setBackground(new java.awt.Color(102, 102, 255));
        PanelJuego2.setPreferredSize(new java.awt.Dimension(600, 600));
        PanelJuego2.setLayout(null);

        salirFin.setText("Salir");
        salirFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirFinActionPerformed(evt);
            }
        });
        PanelJuego2.add(salirFin);
        salirFin.setBounds(380, 80, 60, 23);

        botonRespuesta.setText("Enviar");
        botonRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRespuestaAction(evt);
            }
        });
        PanelJuego2.add(botonRespuesta);
        botonRespuesta.setBounds(310, 80, 63, 23);

        TextRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextRespuestaActionPerformed(evt);
            }
        });
        PanelJuego2.add(TextRespuesta);
        TextRespuesta.setBounds(250, 40, 170, 30);

        LabelPregunta.setBackground(new java.awt.Color(204, 204, 204));
        LabelPregunta.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        LabelPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPregunta.setText("Pregunta");
        LabelPregunta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        LabelPregunta.setOpaque(true);
        PanelJuego2.add(LabelPregunta);
        LabelPregunta.setBounds(220, 10, 230, 100);

        fichaJugador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jugador 2.png"))); // NOI18N
        fichaJugador2.setText("jLabel1");
        PanelJuego2.add(fichaJugador2);
        fichaJugador2.setBounds(80, 100, 40, 40);

        fichaJugador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jugador 1.png"))); // NOI18N
        fichaJugador1.setText("sdad");
        PanelJuego2.add(fichaJugador1);
        fichaJugador1.setBounds(30, 100, 40, 40);

        CInicio.setBackground(new java.awt.Color(204, 0, 204));
        CInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        CInicio.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego2.add(CInicio);
        CInicio.setBounds(10, 135, 130, 87);

        LabelNombres.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        PanelJuego2.add(LabelNombres);
        LabelNombres.setBounds(460, 10, 130, 100);

        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C2.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego2.add(C2);
        C2.setBounds(158, 135, 130, 87);

        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C3.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego2.add(C3);
        C3.setBounds(294, 135, 130, 87);

        C8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C8.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego2.add(C8);
        C8.setBounds(14, 255, 130, 87);

        C9.setBackground(new java.awt.Color(204, 0, 204));
        C9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C9.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego2.add(C9);
        C9.setBounds(10, 371, 130, 87);

        C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C7.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego2.add(C7);
        C7.setBounds(150, 255, 130, 87);

        C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C6.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego2.add(C6);
        C6.setBounds(298, 255, 130, 87);

        C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C4.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego2.add(C4);
        C4.setBounds(442, 135, 130, 87);

        CFin.setBackground(new java.awt.Color(204, 0, 204));
        CFin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - fin2.png"))); // NOI18N
        CFin.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego2.add(CFin);
        CFin.setBounds(10, 487, 130, 87);

        C10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C10.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego2.add(C10);
        C10.setBounds(160, 371, 130, 87);

        C11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C11.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego2.add(C11);
        C11.setBounds(308, 371, 130, 87);

        C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C5.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego2.add(C5);
        C5.setBounds(446, 255, 130, 87);

        C15.setBackground(new java.awt.Color(204, 0, 204));
        C15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C15.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego2.add(C15);
        C15.setBounds(150, 487, 130, 87);

        C13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C13.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego2.add(C13);
        C13.setBounds(444, 487, 130, 87);

        C12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C12.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego2.add(C12);
        C12.setBounds(444, 371, 130, 87);

        C14.setBackground(new java.awt.Color(204, 0, 204));
        C14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C14.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego2.add(C14);
        C14.setBounds(298, 487, 130, 87);

        buttonDado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/interrogation.png"))); // NOI18N
        buttonDado2.setEnabled(false);
        buttonDado2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDado2MouseClicked(evt);
            }
        });
        PanelJuego2.add(buttonDado2);
        buttonDado2.setBounds(110, 10, 80, 80);

        Dado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DadoZero.png"))); // NOI18N
        PanelJuego2.add(Dado2);
        Dado2.setBounds(10, 10, 83, 83);

        FondoJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/camino_ventana.png"))); // NOI18N
        FondoJuego.setPreferredSize(new java.awt.Dimension(600, 600));
        PanelJuego2.add(FondoJuego);
        FondoJuego.setBounds(0, 0, 570, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelJuego2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PanelJuego2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Nombre2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nombre2MousePressed
        Nombre2.setText("");
        Nombre2.setForeground(Color.black);
    }//GEN-LAST:event_Nombre2MousePressed

    private void Nombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre2ActionPerformed

    private void buttonJugar2Action(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJugar2Action
        // se toma el nombre del jugador 2
        Jugador2 = Nombre2.getText();
        
        // se muestran los nombres de los jugadores en la pantalla de juego
        LabelNombres.setAlignmentX(LEFT_ALIGNMENT);
        LabelNombres.setAlignmentY(CENTER_ALIGNMENT);
        LabelNombres.setText("<html>Tú:<p>" + Jugador2 + "<p>Rival:<p>" + Jugador1 + "<p></html>");
        try {
            datoSalida.writeUTF(Jugador2); //se envía el nombre del jugador 2 al jugador 1
        } catch (IOException ex) {
            Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
        }
        int espacios = 0;
        
        /*condición asociada a si el textField donde se recibe el nombre del jugador
        se encuentra vacío. */ 
        if (Jugador2.contentEquals("") || Jugador2.length() >= 10) {
            AvisoNombre.setText("¡Nombre no válido!");
            return;
        }
        for (int i = 0; i <= Jugador2.length() - 1; i++) {
            String letra = String.valueOf(Jugador2.charAt(i));
            if (!letra.equals(" ")) {
                espacios++;
            }
        }
        if (espacios == 0) {
            AvisoNombre.setText("¡Nombre Vacío!");
            return;
             
        } else {
            // Arreglo de tipo JLabel que contiene cada una de las casilla del tablero
            JLabel[] casillas = new JLabel[]{C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15};
            AsigCasillas listaCasillasRandom = new AsigCasillas();
            int[] casillasRandom;
            casillasRandom = listaCasillasRandom.dequeue();
            try {
                datoSalida.writeUTF("casilla");
            } catch (IOException ex) {
                Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //se asignan el tipo de casilla aleatorio con su imagen respectiva que se envían al jugador 1
            for (int i = 0; i <= casillas.length; i++) {
                if (i != casillas.length) {
                    JLabel casilla = casillas[i];
                    String index = String.valueOf(casillasRandom[i]);
                    try {
                        datoSalida.writeUTF(index);
                    } catch (IOException ex) {
                        Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    switch (casillasRandom[i]) {
                        case 1:
                            coordenadas.insertLast(casilla.getX(), casilla.getY(), casillasRandom[i]);
                            casilla.setIcon(imagenes.CasillaReto);
                            break;
                        case 2:
                            coordenadas.insertLast(casilla.getX(), casilla.getY(), casillasRandom[i]);
                            casilla.setIcon(imagenes.CasillaTrampa);
                            break;
                        case 3:
                            coordenadas.insertLast(casilla.getX(), casilla.getY(), casillasRandom[i]);
                            casilla.setIcon(imagenes.CasillaTunel);
                            break;
                    }
                } else {
                    coordenadas.insertFinal(CFin.getX(), CFin.getY());
                }
            }
            MainPanel2.setVisible(false);
            PanelJuego2.setVisible(true);

            try {
                datoSalida.writeUTF("iniciar");
            } catch (IOException ex) {
                Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
            }
            fichaJugador1.setLocation(CInicio.getX() + 20, CInicio.getY());
            fichaJugador2.setLocation(CInicio.getX(), CInicio.getY());
        }

    }//GEN-LAST:event_buttonJugar2Action

    private void buttonSalir2Action(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalir2Action
        System.exit(0);
    }//GEN-LAST:event_buttonSalir2Action
    
    // Mensaje que aparece al oprimir el botón de instrucciones
    private void buttonInstru2Action(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInstru2Action
        JOptionPane.showMessageDialog(null, "Instrucciones:\n\n1. Ingresa tu nombre.\n2. Se asigna la ficha gris al jugador 1"
                + " y la ficha rosa al jugador 2.\n3. El primer turno se decide al lanzar el dado, si ambos son iguales se"
                + " lanza una vez más.\n4. Gana el primero en llegar a la casilla \"Fin \". ");   
    }//GEN-LAST:event_buttonInstru2Action
    /**
     * Se establece la pregunta matemática del reto de forma aleatoria.
     */
    public void PreguntaReto() {
        
        /* creación de los números y el operador aleatorio que se activa al coincidir
        la ficha del juegador en una casilla de reto.*/
        botonRespuesta.setVisible(true);
        TextRespuesta.setVisible(true);
        LabelPregunta.setVisible(true);
        Random numReto = new Random();
        int num1 = numReto.nextInt(50) + 1; //número uno del reto matemático
        int num2 = numReto.nextInt(50) + 1; //número dos del reto matemático
        int operador = numReto.nextInt(4) + 1; // número aleatorio asociado a un operador matemático
        
        switch (operador) {// operador matemático asociado al número escogido aleatoriamente
            case 1:
                Respuesta = num1 + num2;
                LabelPregunta.setText("¿Cuanto es: " + num1 + " + " + num2 + "?");
                try {
                    datoSalida.writeUTF(LabelPregunta.getText() + "\n" + "pregunta");/* se envía la pregunta al jugador 1
                                                                                         para su visualización */
                } catch (IOException ex) {
                    Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 2:
                Respuesta = num1 - num2;
                LabelPregunta.setText("¿Cuanto es: " + num1 + " - " + num2 + "?");
                try {
                    datoSalida.writeUTF(LabelPregunta.getText() + "\n" + "pregunta");/* se envía la pregunta al jugador 1
                                                                                         para su visualización */
                } catch (IOException ex) {
                    Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 3:
                Respuesta = num1 * num2;
                LabelPregunta.setText("¿Cuanto es: " + num1 + " x " + num2 + "?");
                try {
                    datoSalida.writeUTF(LabelPregunta.getText() + "\n" + "pregunta");/* se envía la pregunta al jugador 1
                                                                                         para su visualización */
                } catch (IOException ex) {
                    Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 4:
                Respuesta = num1 / num2;
                LabelPregunta.setText("¿Cuanto es: " + num1 + " ÷ " + num2 + "?");
                try {
                    datoSalida.writeUTF(LabelPregunta.getText() + "\n" + "pregunta");/* se envía la pregunta al jugador 1
                                                                                         para su visualización */
                } catch (IOException ex) {
                    Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
        // se envía una actualización del progreso del jugador 2 al jugador 1
        buttonDado2.setEnabled(false);
        botonEnabled = false;
        String msjRecorrido = String.valueOf(recorrido);
        try {
            datoSalida.writeUTF("esperando\n" + msjRecorrido);
        } catch (IOException ex) {
            Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
        }

        return;
    }

    private void buttonDado2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDado2MouseClicked
        if (botonEnabled) {
            // se escoje un número aleatorio que simula el número del dado
            LabelPregunta.setVerticalAlignment(TOP);
            LabelPregunta.setVisible(false);
            Random numDado = new Random();
            int num = numDado.nextInt(4) + 1;
            
            // condición para escoger quien es el primer jugador a comenzar el juego.
            // No se cumple cuando ya se sabe quien es el primer jugador que comienza en el juego.
            if (valorDado == 0) {
                valorDado = 1;
                switch (num) {
                    case 1:
                        Dado2.setIcon(imagenes.img1);
                        break;

                    case 2:
                        Dado2.setIcon(imagenes.img2);
                        break;

                    case 3:
                        Dado2.setIcon(imagenes.img3);
                        break;

                    case 4:
                        Dado2.setIcon(imagenes.img4);
                        break;
                }
                int numero = Integer.parseInt(mensaje);
                //se cumple cuando el dado de decisión del primer turno del jugador 1 es mayor que el del jugador 2
                if (numero > num) {
                    buttonDado2.setEnabled(false);
                    botonEnabled = false;
                    valorDado = 1;
                    try {
                        datoSalida.writeUTF("es tu turno");
                    } catch (IOException ex) {
                        Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    mensaje = "";
                    
                    //se cumple cuando el dado de decisión del primer turno del jugador 2 es mayor que el del jugador 1
                } else if (numero < num) {
                    valorDado = 1;
                    mensaje = "";
                    return;
                    
                    //se cumple cuando ambos números del dado de los jugadores son iguales
                } else {
                    buttonDado2.setEnabled(false);
                    botonEnabled = false;
                    Dado2.setIcon(imagenes.CasillaZero);
                    recorrido = 0;
                    try {
                        datoSalida.writeUTF("otra vez"); //se le indica al jugador 1 que los dados fueron iguales
                    } catch (IOException ex) {
                        Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    // se reinician las variables que controlan los turnos, para comenzar de nuevo
                    valorDado = 0; 
                    count = 0;
                    mensaje = "";
                }
            } else {
                switch (num) {
                    case 1:

                        Dado2.setIcon(imagenes.img1);
                        break;

                    case 2:

                        Dado2.setIcon(imagenes.img2);
                        break;

                    case 3:

                        Dado2.setIcon(imagenes.img3);
                        break;

                    case 4:

                        Dado2.setIcon(imagenes.img4);
                        break;
                }
                recorrido += num; //se actualiza el progreso del jugador de acuerdo al número del dado obtenido

                int numTunel = numDado.nextInt(3) + 1; /*se escoge un número aleatorio ha avanzar o ha retroceder si
                                                             la ficha del jugador coincide con una casilla reto o trampa.*/
                int[] coordenadasCasilla;
                coordenadasCasilla = coordenadas.ObtenerCoordenadas(recorrido);/*se obtiene las coordenadas de la
                                                                                      casilla donde se encuantra el jugador*/ 
                
                 // se cumple si el jugador a superado o ha llegado al final del tablero
                if (recorrido >= 15) {
                    recorrido = 16;
                    finalizarJuego();
                    coordenadasCasilla = coordenadas.ObtenerCoordenadas(recorrido);
                    fichaJugador2.setLocation(coordenadasCasilla[0], coordenadasCasilla[1]);

                    return;

                }
                //se cumple si la ficha del jugador se encuentra en una casilla de reto
                if (coordenadasCasilla[2] == 1) {
                    
                    PreguntaReto();
                    coordenadasCasilla = coordenadas.ObtenerCoordenadas(recorrido);
                    fichaJugador2.setLocation(coordenadasCasilla[0], coordenadasCasilla[1]);
                    return;
                    
                    //se cumple si la ficha del jugador se encuentra en una casilla de trampa
                } else if (coordenadasCasilla[2] == 2) {

                    recorrido -= numTunel; //posiciones a retroceder (extra)
                    
                    if (recorrido <= 0) {
                        recorrido = 0;
                        fichaJugador2.setLocation(CInicio.getX(), CInicio.getY());
                    } else {
                        coordenadasCasilla = coordenadas.ObtenerCoordenadas(recorrido);
                        fichaJugador2.setLocation(coordenadasCasilla[0], coordenadasCasilla[1]);
                    }
                    
                    //se cumple si la ficha del jugador se encuentra en una casilla de túnel
                } else {
                    
                    recorrido += numTunel; //posiciones ha avanzar (extra)
                    coordenadasCasilla = coordenadas.ObtenerCoordenadas(recorrido);
                    fichaJugador2.setLocation(coordenadasCasilla[0], coordenadasCasilla[1]);
                }
                // se envía una actualización del progreso del jugador 2 al jugador 1
                String msjRecorrido = String.valueOf(recorrido);

                try {
                    datoSalida.writeUTF("es tu turno\n" + msjRecorrido);
                } catch (IOException ex) {
                    Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
                }

                buttonDado2.setEnabled(false);
                botonEnabled = false;

            }
        }
    }//GEN-LAST:event_buttonDado2MouseClicked
    // Se activa cuando se presiona el botón de enviar la respuesta del reto
    private void botonRespuestaAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRespuestaAction
        int RespuestaJugador = Integer.parseInt(TextRespuesta.getText());
        if ((Character.isDefined(RespuestaJugador) && RespuestaJugador == Respuesta) || (RespuestaJugador < 0 && RespuestaJugador == Respuesta)) {
            //mensaje informátivo acerca del estado de la respuesta (correcto)
            JOptionPane.showMessageDialog(null, "Respuesta Correcta");
            try {
                datoSalida.writeUTF("correcto");
            } catch (IOException ex) {
                Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
            }
            // visibilidad
            botonRespuesta.setVisible(false);
            TextRespuesta.setVisible(false);
            LabelPregunta.setVisible(false);
            TextRespuesta.setText("");

        } else if ((Character.isDefined(RespuestaJugador) && RespuestaJugador != Respuesta) || (RespuestaJugador < 0 && RespuestaJugador != Respuesta)) {
            //mensaje informátivo acerca del estado de la respuesta (Incorrecto)
            JOptionPane.showMessageDialog(null, "Respuesta Incorrecta");
            recorrido -= 1; // redución del progreso al contestar de forma incorrecta la pregunta matemática
            int[] coordenadasCasilla;
            // visibilidad
            botonRespuesta.setVisible(false);
            TextRespuesta.setVisible(false);
            LabelPregunta.setVisible(false);
            
            //si el recorrido se reduce y es menor que cero, este se encontrará al inicio del tablero
            if (recorrido <= 0) {
                recorrido = 0;
                fichaJugador2.setLocation(CInicio.getX(), CInicio.getY());
            } else {
                coordenadasCasilla = coordenadas.ObtenerCoordenadas(recorrido);
                fichaJugador2.setLocation(coordenadasCasilla[0], coordenadasCasilla[1]);
            }
            
             // se envía una actualización del progreso del jugador 2 al jugador 1
            String msjRecorrido = String.valueOf(recorrido);
            try {
                datoSalida.writeUTF("es tu turno\n" + msjRecorrido);
            } catch (IOException ex) {
                Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
            }
            TextRespuesta.setText("");
        } else {
            TextRespuesta.setText("");
        }
    }//GEN-LAST:event_botonRespuestaAction
    /**
     * Se utiliza para cerrar las conexiones entre el jugador dos y el jugador uno e indicar si 
     * el jugador ha ganado.
     */
    public void finalizarJuego() {
        String msjRecorrido = String.valueOf(recorrido);
        try {
            datoSalida.writeUTF("fin del juego\n" + msjRecorrido);
        } catch (IOException ex) {
            Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            datoSalida.close();
        } catch (IOException ex) {
            Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            datoEntrada.close();
        } catch (IOException ex) {
            Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
        }

       
        LabelPregunta.setVisible(true);
        LabelPregunta.setVerticalAlignment(TOP);
        LabelPregunta.setText("");
        LabelPregunta.setText("<html>¡Fin del Juego!<p><p>!Has ganado!<p></html>");
        buttonDado2.setEnabled(false);
        botonEnabled = false;
        salirFin.setVisible(true);
        salirFin.setLocation(botonRespuesta.getX(), botonRespuesta.getY());

        return;
    }

    private void TextRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextRespuestaActionPerformed

    private void salirFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirFinActionPerformed

        System.exit(0);

    }//GEN-LAST:event_salirFinActionPerformed

    /**
     * Ejecuta la clase de Jugador2 e inicia el formulario del Jugador2.
     * Inicializa el socket del cliente y recibe los mensajes enviados por el jugador uno.
     * Se crean las casillas del tablero del juego y las envia como referencia al jugador uno.
     * 
     * 
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jugador2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jugador2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jugador2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jugador2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (java.lang.NullPointerException ex) {

        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jugador2().setVisible(true);
            }
        });
        try {
            socket = new Socket("127.0.0.1", 1201);
            datoEntrada = new DataInputStream(socket.getInputStream());
            datoSalida = new DataOutputStream(socket.getOutputStream());
            int PassNombre = 0; //variable para tomar el nombre del jugador 1 solo una vez
            
            //bucle donde que se encuentra escuchando los mensajes del jugador 1
            while (true) {
                try {
                    mensaje = datoEntrada.readUTF();
                } catch (java.net.SocketException ex) {
                } catch (IOException ex) {
                    Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
                }
                 // se recibe el nombre del jugador 1
                if (PassNombre == 0) {
                    PassNombre = 1;
                    Jugador1 = mensaje;

                }
                    //se cumple cuando ambos jugadores obtenga el mismo número de dado
                else if (valorDado == 0 && !mensaje.equals("") && count == 0) {
                    buttonDado2.setEnabled(true);
                    botonEnabled = true;

                } else {
                     //se obtiene dos mensajes enviados por el jugador 1 y se guardan en un arreglo
                    String[] msjAvance = mensaje.split("\n");
                    if (mensaje.equals("")) {
                        fichaJugador1.setLocation(fichaJugador1.getX() + 20, fichaJugador1.getY());
                        
                        //se cumple cuando el jugador 1 ha contestado bien a su pregunta de reto
                    } else if (mensaje.equals("correcto")) {
                        fichaJugador1.setLocation(fichaJugador1.getX(), fichaJugador1.getY());
                        buttonDado2.setEnabled(true);
                        LabelPregunta.setText("Respuesta correcta");
                        botonEnabled = true;
                        
                        //se muestra la pregunta que se le asignó al jugador 1
                    } else if (msjAvance[1].equals("pregunta")) {
                        LabelPregunta.setVisible(true);
                        LabelPregunta.setVerticalAlignment(CENTER);
                        LabelPregunta.setText("<html>¡Reto para Oponente!<p><p>" + msjAvance[0] + "<p></html>");

                    } else {

                        int AvanceFicha1 = Integer.parseInt(msjAvance[1]);

                        if (AvanceFicha1 <= 0) {
                            fichaJugador1.setLocation(CInicio.getX() + 20, CInicio.getY());
                            buttonDado2.setEnabled(true);
                            botonEnabled = true;
                            
                            // se actualiza el progreso del jugador 1 antes del reto que se le asignó
                        } else if (msjAvance[0].equals("esperando")) {
                            int[] coordenadasCasilla;
                            coordenadasCasilla = coordenadas.ObtenerCoordenadas(AvanceFicha1);
                            fichaJugador1.setLocation(coordenadasCasilla[0] + 20, coordenadasCasilla[1]);
                            
                            //se cumple cuando el jugador 1 ha ganado
                        } else if (msjAvance[0].equals("fin del juego")) {
                            int[] coordenadasCasilla;
                            coordenadasCasilla = coordenadas.ObtenerCoordenadas(AvanceFicha1);
                            fichaJugador1.setLocation(coordenadasCasilla[0] + 20, coordenadasCasilla[1]);
                            LabelPregunta.setVisible(true);
                            LabelPregunta.setVerticalAlignment(TOP);
                            LabelPregunta.setText("<html>¡Fin del Juego!<p><p>!Has perdido!<p></html>");
                            buttonDado2.setEnabled(false);
                            botonEnabled = false;
                            salirFin.setVisible(true);
                            salirFin.setLocation(botonRespuesta.getX(), botonRespuesta.getY());
                            try {
                                socket.close();
                            } catch (IOException ex) {
                            }
                            try {
                                datoSalida.close();
                            } catch (IOException ex) {
                            }
                            try {
                                datoEntrada.close();
                            } catch (IOException ex) {
                            }

                            return;
                            
                            /* se actualiza el progreso del jugador 1 o si el otro jugador responde de forma incorrecta 
                            la pregunta de reto*/
                        } else {
                            LabelPregunta.setText("Respuesta incorrecta");
                            int[] coordenadasCasilla;
                            coordenadasCasilla = coordenadas.ObtenerCoordenadas(AvanceFicha1);
                            fichaJugador1.setLocation(coordenadasCasilla[0] + 20, coordenadasCasilla[1]);
                            buttonDado2.setEnabled(true);
                            botonEnabled = true;
                        }

                    }

                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvisoNombre;
    private javax.swing.JLabel C10;
    private javax.swing.JLabel C11;
    private javax.swing.JLabel C12;
    private javax.swing.JLabel C13;
    private javax.swing.JLabel C14;
    private javax.swing.JLabel C15;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel C4;
    private javax.swing.JLabel C5;
    private javax.swing.JLabel C6;
    private javax.swing.JLabel C7;
    private javax.swing.JLabel C8;
    private javax.swing.JLabel C9;
    private javax.swing.JLabel CFin;
    private static javax.swing.JLabel CInicio;
    private javax.swing.JLabel Dado2;
    private javax.swing.JLabel FondoInicio;
    private javax.swing.JLabel FondoJuego;
    private static javax.swing.JLabel LabelNombres;
    private static javax.swing.JLabel LabelPregunta;
    private static javax.swing.JPanel MainPanel2;
    private javax.swing.JTextField Nombre2;
    private static javax.swing.JPanel PanelJuego2;
    private javax.swing.JTextField TextRespuesta;
    private static javax.swing.JButton botonRespuesta;
    private static javax.swing.JLabel buttonDado2;
    private javax.swing.JButton buttonInstru2;
    private javax.swing.JButton buttonJugar2;
    private javax.swing.JButton buttonSalir2;
    private static javax.swing.JLabel fichaJugador1;
    private static javax.swing.JLabel fichaJugador2;
    private static javax.swing.JButton salirFin;
    // End of variables declaration//GEN-END:variables
}
