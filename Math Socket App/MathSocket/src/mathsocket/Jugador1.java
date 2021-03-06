
package mathsocket;

import java.awt.Color;
import java.awt.Image;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.ServerSocket;
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
 *Clase que simula e inicia el servidor del juego.
 * Interactua con otro jugador o cliente de forma peer to peer.
 * @author Ludwin Ramos,Alisson Redondo, Greivin Carrillo.
 * @version 1.0
 * @since 25/09/2021
 */
public class Jugador1 extends javax.swing.JFrame {
  
    static String Jugador1; // nombre del jugador1
    static String Jugador2; // nombre del jugador 2
    
    static int close = 1;   // variable asociada al bucle donde se reciben los mensajes del jugador 2.
    int Respuesta = 0;      // respuesta matemática del reto.
    static boolean botonEnabled = true; // estado del botón del dado.
    static ListCasillas coordenadas = new ListCasillas();
    static int recorrido = 0; // progreso de la ficha del jugador en el tablero
    static Imagenes imagenes = new Imagenes();
    static int valorDado = 0; // número relacionado a la condición del primer turno que decide cual jugador comienza.
    static String mensaje = "";
    
    static ServerSocket serverSocket;
    static Socket socket;
    static DataInputStream datoEntrada;
    static DataOutputStream datoSalida;

    /**
     * Crea el nuevo formulario de la clase Jugador1.
     * Inicializa los componentes o elementos del formulario Jugador1.
     */
    public Jugador1() {
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

        MainPanel = new javax.swing.JPanel();
        Nombre1 = new javax.swing.JTextField();
        buttonJugar = new javax.swing.JButton();
        buttonSalir = new javax.swing.JButton();
        AvisoNombre = new javax.swing.JLabel();
        buttonInstru = new javax.swing.JButton();
        EsperarJugador = new javax.swing.JLabel();
        FondoInicio = new javax.swing.JLabel();
        PanelJuego = new javax.swing.JPanel();
        salirFin = new javax.swing.JButton();
        botonRespuesta = new javax.swing.JButton();
        TextRespuesta = new javax.swing.JTextField();
        LabelPregunta = new javax.swing.JLabel();
        fichaJugador1 = new javax.swing.JLabel();
        fichaJugador2 = new javax.swing.JLabel();
        CInicio = new javax.swing.JLabel();
        LabelNombres = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        C8 = new javax.swing.JLabel();
        C9 = new javax.swing.JLabel();
        C7 = new javax.swing.JLabel();
        C6 = new javax.swing.JLabel();
        C4 = new javax.swing.JLabel();
        CFinal = new javax.swing.JLabel();
        C10 = new javax.swing.JLabel();
        C11 = new javax.swing.JLabel();
        C5 = new javax.swing.JLabel();
        C15 = new javax.swing.JLabel();
        C13 = new javax.swing.JLabel();
        C12 = new javax.swing.JLabel();
        C14 = new javax.swing.JLabel();
        buttonDado = new javax.swing.JLabel();
        Dado = new javax.swing.JLabel();
        FondoJuego = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainFrame");
        setPreferredSize(new java.awt.Dimension(600, 635));
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(0, 51, 255));
        MainPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MainPanel.setFocusable(false);
        MainPanel.setName(""); // NOI18N
        MainPanel.setPreferredSize(new java.awt.Dimension(600, 600));
        MainPanel.setLayout(null);

        Nombre1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Nombre1.setForeground(new java.awt.Color(153, 153, 153));
        Nombre1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nombre1.setText("Ingresar nombre (max 10 caracteres)");
        Nombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Nombre1.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Nombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Nombre1MousePressed(evt);
            }
        });
        Nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nombre1ActionPerformed(evt);
            }
        });
        MainPanel.add(Nombre1);
        Nombre1.setBounds(129, 104, 328, 38);

        buttonJugar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonJugar.setText("Jugar");
        buttonJugar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        buttonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJugarAction(evt);
            }
        });
        MainPanel.add(buttonJugar);
        buttonJugar.setBounds(176, 213, 198, 49);

        buttonSalir.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonSalir.setText("Salir");
        buttonSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirAction(evt);
            }
        });
        MainPanel.add(buttonSalir);
        buttonSalir.setBounds(177, 385, 197, 47);

        AvisoNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainPanel.add(AvisoNombre);
        AvisoNombre.setBounds(128, 150, 330, 28);

        buttonInstru.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonInstru.setText("Intrucciones");
        buttonInstru.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        buttonInstru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInstruAction(evt);
            }
        });
        MainPanel.add(buttonInstru);
        buttonInstru.setBounds(177, 299, 197, 47);

        EsperarJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainPanel.add(EsperarJugador);
        EsperarJugador.setBounds(129, 153, 328, 28);

        FondoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_inicio2.jpg"))); // NOI18N
        FondoInicio.setPreferredSize(new java.awt.Dimension(600, 600));
        MainPanel.add(FondoInicio);
        FondoInicio.setBounds(0, 0, 600, 600);

        PanelJuego.setBackground(new java.awt.Color(255, 102, 0));
        PanelJuego.setPreferredSize(new java.awt.Dimension(600, 600));
        PanelJuego.setLayout(null);

        salirFin.setText("Salir");
        salirFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirFinActionPerformed(evt);
            }
        });
        PanelJuego.add(salirFin);
        salirFin.setBounds(370, 80, 60, 23);

        botonRespuesta.setText("Enviar");
        botonRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRespuestaAction(evt);
            }
        });
        PanelJuego.add(botonRespuesta);
        botonRespuesta.setBounds(300, 80, 63, 23);

        TextRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextRespuestaActionPerformed(evt);
            }
        });
        PanelJuego.add(TextRespuesta);
        TextRespuesta.setBounds(240, 40, 170, 30);

        LabelPregunta.setBackground(new java.awt.Color(204, 204, 204));
        LabelPregunta.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        LabelPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPregunta.setText("Pregunta");
        LabelPregunta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        LabelPregunta.setOpaque(true);
        PanelJuego.add(LabelPregunta);
        LabelPregunta.setBounds(210, 10, 230, 100);

        fichaJugador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jugador 1.png"))); // NOI18N
        fichaJugador1.setText("sdad");
        PanelJuego.add(fichaJugador1);
        fichaJugador1.setBounds(10, 100, 40, 40);

        fichaJugador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jugador 2.png"))); // NOI18N
        fichaJugador2.setText("jLabel1");
        PanelJuego.add(fichaJugador2);
        fichaJugador2.setBounds(60, 100, 40, 40);

        CInicio.setBackground(new java.awt.Color(204, 0, 204));
        CInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        CInicio.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego.add(CInicio);
        CInicio.setBounds(10, 135, 130, 87);

        LabelNombres.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        PanelJuego.add(LabelNombres);
        LabelNombres.setBounds(450, 10, 140, 100);

        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C2.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego.add(C2);
        C2.setBounds(158, 135, 130, 87);

        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C3.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego.add(C3);
        C3.setBounds(302, 135, 130, 87);

        C8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C8.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego.add(C8);
        C8.setBounds(14, 255, 130, 87);

        C9.setBackground(new java.awt.Color(204, 0, 204));
        C9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C9.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego.add(C9);
        C9.setBounds(10, 371, 130, 87);

        C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C7.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego.add(C7);
        C7.setBounds(162, 255, 130, 87);

        C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C6.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego.add(C6);
        C6.setBounds(306, 255, 130, 87);

        C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C4.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego.add(C4);
        C4.setBounds(442, 135, 130, 87);

        CFinal.setBackground(new java.awt.Color(204, 0, 204));
        CFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - fin2.png"))); // NOI18N
        CFinal.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego.add(CFinal);
        CFinal.setBounds(10, 487, 130, 87);

        C10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C10.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego.add(C10);
        C10.setBounds(160, 370, 130, 87);

        C11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C11.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego.add(C11);
        C11.setBounds(310, 370, 130, 87);

        C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C5.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego.add(C5);
        C5.setBounds(446, 255, 130, 87);

        C15.setBackground(new java.awt.Color(204, 0, 204));
        C15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C15.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego.add(C15);
        C15.setBounds(160, 490, 130, 87);

        C13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C13.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego.add(C13);
        C13.setBounds(450, 490, 130, 87);

        C12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C12.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego.add(C12);
        C12.setBounds(450, 370, 130, 87);

        C14.setBackground(new java.awt.Color(204, 0, 204));
        C14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casilla - inicio2.png"))); // NOI18N
        C14.setPreferredSize(new java.awt.Dimension(150, 50));
        PanelJuego.add(C14);
        C14.setBounds(310, 490, 130, 87);

        buttonDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/interrogation.png"))); // NOI18N
        buttonDado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDadoMouseClicked(evt);
            }
        });
        PanelJuego.add(buttonDado);
        buttonDado.setBounds(110, 10, 80, 80);

        Dado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DadoZero.png"))); // NOI18N
        PanelJuego.add(Dado);
        Dado.setBounds(10, 10, 83, 83);

        FondoJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/camino_ventana.png"))); // NOI18N
        FondoJuego.setPreferredSize(new java.awt.Dimension(600, 600));
        PanelJuego.add(FondoJuego);
        FondoJuego.setBounds(0, 0, 570, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre1ActionPerformed

    private void buttonJugarAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJugarAction
        // se toma el nombre del jugador 1
        Jugador1 = Nombre1.getText();
        int espacios = 0;
        
        /*condición asociada a si el textField donde se recibe el nombre del jugador
        se encuentra vacío. */ 
        if (Jugador1.contentEquals("") || Jugador1.length() >= 10) {
            AvisoNombre.setText("¡Nombre no válido!");
            return;
        }
        for (int i = 0; i <= Jugador1.length() - 1; i++) {
            String letra = String.valueOf(Jugador1.charAt(i));
            if (!letra.equals(" ")) {
                espacios++;
            }
        }
        if (espacios == 0) {
            AvisoNombre.setText("¡Nombre Vacío!");
            return;
           
            // se envía el nombre del jugador 1 al jugador 2
        } else {
            try {
                datoSalida.writeUTF(Jugador1);
            } catch (IOException ex) {
                Logger.getLogger(Jugador1.class.getName()).log(Level.SEVERE, null, ex);
            }
            Nombre1.setEditable(false);
            AvisoNombre.setText("");
            fichaJugador1.setLocation(CInicio.getX(), CInicio.getY());
            fichaJugador2.setLocation(CInicio.getX() + 20, CInicio.getY());
            EsperarJugador.setText("Esperando Jugador...");

        }
    }//GEN-LAST:event_buttonJugarAction

    private void buttonSalirAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirAction
        System.exit(0);
    }//GEN-LAST:event_buttonSalirAction
    
    // Mensaje que aparece al oprimir el botón de instrucciones
    private void buttonInstruAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInstruAction
        JOptionPane.showMessageDialog(null, "Instrucciones:\n\n1. Ingresa tu nombre.\n2. Se asigna la ficha gris al jugador 1"
                + " y la ficha rosa al jugador 2.\n3. El primer turno se decide al lanzar el dado, si ambos son iguales se"
                + " lanza una vez más.\n4. Gana el primero en llegar a la casilla \"Fin \". ");
    }//GEN-LAST:event_buttonInstruAction

    private void Nombre1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nombre1MousePressed
        Nombre1.setText("");
        Nombre1.setForeground(Color.black);
    }//GEN-LAST:event_Nombre1MousePressed
    
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
        
        switch (operador) { // operador matemático asociado al número escogido aleatoriamente
            case 1:
                Respuesta = num1 + num2;
                LabelPregunta.setText("¿Cuanto es: " + num1 + " + " + num2 + "?");
                try {
                    datoSalida.writeUTF(LabelPregunta.getText() + "\n" + "pregunta"); /* se envía la pregunta al jugador 2
                                                                                         para su visualización */
                } catch (IOException ex) {
                    Logger.getLogger(Jugador1.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 2:
                Respuesta = num1 - num2;
                LabelPregunta.setText("¿Cuanto es: " + num1 + " - " + num2 + "?");
                try {
                    datoSalida.writeUTF(LabelPregunta.getText() + "\n" + "pregunta");/* se envía la pregunta al jugador 2
                                                                                         para su visualización */  
                } catch (IOException ex) {
                    Logger.getLogger(Jugador1.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 3:
                Respuesta = num1 * num2;
                LabelPregunta.setText("¿Cuanto es: " + num1 + " x " + num2 + "?");
                try {
                    datoSalida.writeUTF(LabelPregunta.getText() + "\n" + "pregunta");/* se envía la pregunta al jugador 2
                                                                                         para su visualización */
                } catch (IOException ex) {
                    Logger.getLogger(Jugador1.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 4:
                Respuesta = num1 / num2;
                LabelPregunta.setText("¿Cuanto es: " + num1 + " ÷ " + num2 + "?");
                try {
                    datoSalida.writeUTF(LabelPregunta.getText() + "\n" + "pregunta");/* se envía la pregunta al jugador 2
                                                                                         para su visualización */
                } catch (IOException ex) {
                    Logger.getLogger(Jugador1.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
        // se envía una actualización del progreso del jugador 1 al jugador 2
        buttonDado.setEnabled(false);
        botonEnabled = false;
        String msjRecorrido = String.valueOf(recorrido);
        try {
            datoSalida.writeUTF("esperando\n" + msjRecorrido);
        } catch (IOException ex) {
            Logger.getLogger(Jugador1.class.getName()).log(Level.SEVERE, null, ex);
        }

        return;
    }

    private void buttonDadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDadoMouseClicked
        if (botonEnabled) {
            try {
                // se escoje un número aleatorio que simula el número del dado
                LabelPregunta.setVerticalAlignment(TOP);
                LabelPregunta.setVisible(false);
                Random numDado = new Random();
                int num = numDado.nextInt(4) + 1;
                
                // condición para escoger quien es el primer jugador a comenzar el juego.
                // No se cumple cuando ya se sabe quien es el primer jugador que comienza en el juego.
                if (valorDado == 0) {
                    String digito = String.valueOf(num);
                    datoSalida.writeUTF(digito);
                    buttonDado.setEnabled(false);
                    botonEnabled = false;
                    valorDado = 1;
                    switch (num) {
                        case 1:

                            Dado.setIcon(imagenes.img1);
                            break;

                        case 2:

                            Dado.setIcon(imagenes.img2);
                            break;

                        case 3:

                            Dado.setIcon(imagenes.img3);
                            break;

                        case 4:

                            Dado.setIcon(imagenes.img4);
                            break;
                    }
                    
                } else {
                    switch (num) {
                        case 1:

                            Dado.setIcon(imagenes.img1);
                            break;

                        case 2:

                            Dado.setIcon(imagenes.img2);
                            break;

                        case 3:

                            Dado.setIcon(imagenes.img3);
                            break;

                        case 4:

                            Dado.setIcon(imagenes.img4);
                            break;
                    }
                    recorrido += num; //se actualiza el progreso del jugador de acuerdo al número del dado obtenido

                    int numTunel = numDado.nextInt(3) + 1; /*se escoge un número aleatorio ha avanzar o ha retroceder si
                                                             la ficha del jugador coincide con una casilla reto o trampa.*/
                    int[] coordenadasCasilla;
                    coordenadasCasilla = coordenadas.ObtenerCoordenadas(recorrido); /*se obtiene las coordenadas de la
                                                                                      casilla donde se encuantra el jugador*/ 
                    
                    // se cumple si el jugador a superado o ha llegado al final del tablero
                    if (recorrido >= 15) {
                        recorrido = 16;
                        finalizarJuego();
                        coordenadasCasilla = coordenadas.ObtenerCoordenadas(recorrido);
                        fichaJugador1.setLocation(coordenadasCasilla[0], coordenadasCasilla[1]);

                        return;
                    }
                    
                    //se cumple si la ficha del jugador se encuentra en una casilla de reto
                    if (coordenadasCasilla[2] == 1) {    
                        PreguntaReto();
                        coordenadasCasilla = coordenadas.ObtenerCoordenadas(recorrido);
                        fichaJugador1.setLocation(coordenadasCasilla[0], coordenadasCasilla[1]);
                        return;
                        
                        //se cumple si la ficha del jugador se encuentra en una casilla de trampa
                    } else if (coordenadasCasilla[2] == 2) {
                        
                        recorrido -= numTunel; //posiciones a retroceder (extra)
                        if (recorrido <= 0) {
                            recorrido = 0;
                            fichaJugador1.setLocation(CInicio.getX(), CInicio.getY());
                        } else {
                            coordenadasCasilla = coordenadas.ObtenerCoordenadas(recorrido);
                            fichaJugador1.setLocation(coordenadasCasilla[0], coordenadasCasilla[1]);
                        }
                        
                        //se cumple si la ficha del jugador se encuentra en una casilla de túnel
                    } else {

                        recorrido += numTunel; //posiciones ha avanzar (extra)
                        coordenadasCasilla = coordenadas.ObtenerCoordenadas(recorrido);
                        fichaJugador1.setLocation(coordenadasCasilla[0], coordenadasCasilla[1]);
                    }
                    // se envía una actualización del progreso del jugador 1 al jugador 2
                    String msjRecorrido = String.valueOf(recorrido);
                    datoSalida.writeUTF("es tu turno\n" + msjRecorrido);

                    buttonDado.setEnabled(false);
                    botonEnabled = false;

                }

            } catch (IOException ex) {
                Logger.getLogger(Jugador1.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_buttonDadoMouseClicked
    // Se activa cuando se presiona el botón de enviar la respuesta del reto
    private void botonRespuestaAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRespuestaAction
        int RespuestaJugador = Integer.parseInt(TextRespuesta.getText());
        if ((Character.isDefined(RespuestaJugador) && RespuestaJugador == Respuesta) || (RespuestaJugador < 0 && RespuestaJugador == Respuesta)) {
            //mensaje informátivo acerca del estado de la respuesta (correcto)
            JOptionPane.showMessageDialog(null, "Respuesta Correcta"); 
            try {
                datoSalida.writeUTF("correcto");
            } catch (IOException ex) {
                Logger.getLogger(Jugador1.class.getName()).log(Level.SEVERE, null, ex);
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
                fichaJugador1.setLocation(CInicio.getX(), CInicio.getY());
            } else {
                coordenadasCasilla = coordenadas.ObtenerCoordenadas(recorrido);
                fichaJugador1.setLocation(coordenadasCasilla[0], coordenadasCasilla[1]);
            }
            // se envía una actualización del progreso del jugador 1 al jugador 2
            String msjRecorrido = String.valueOf(recorrido);
            try {
                datoSalida.writeUTF("es tu turno\n" + msjRecorrido);
            } catch (IOException ex) {
                Logger.getLogger(Jugador1.class.getName()).log(Level.SEVERE, null, ex);
            }
            TextRespuesta.setText("");
        } else {
            TextRespuesta.setText("");
        }

    }//GEN-LAST:event_botonRespuestaAction
    /**
     * Utilizado para cerrar las conexiones entre el jugador uno y el jugador dos e indicar si 
     * el jugador ha ganado.
     */
    public void finalizarJuego() {
        String msjRecorrido = String.valueOf(recorrido);
        close = 0;
        try {
            datoSalida.writeUTF("fin del juego\n" + msjRecorrido);
        } catch (IOException ex) {
            Logger.getLogger(Jugador1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Jugador1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            datoEntrada.close();
        } catch (IOException ex) {
            Logger.getLogger(Jugador1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            datoSalida.close();

        } catch (IOException ex) {
            Logger.getLogger(Jugador1.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            serverSocket.close();
        } catch (IOException ex) {
            Logger.getLogger(Jugador1.class.getName()).log(Level.SEVERE, null, ex);
        }

        LabelPregunta.setVisible(true);
        LabelPregunta.setVerticalAlignment(TOP);
        LabelPregunta.setText("");
        LabelPregunta.setText("<html>¡Fin del Juego!<p><p>!Has ganado!<p></html>");
        buttonDado.setEnabled(false);
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
     * Ejecuta la clase de Jugador1 e inicia el formulario del Jugador1.
     * Inicializa el socket del servidor y recibe los mensajes enviados por el jugador dos.
     * Se crean las casillas del tablero del juego de acuerdo a las recibidas por 
     * el jugador dos.
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
            java.util.logging.Logger.getLogger(Jugador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jugador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jugador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jugador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (java.lang.NullPointerException ex) {

        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jugador1().setVisible(true);
            }
        });
        
        //se inicia el servidor en un puerto respectivo
        try {
            serverSocket = new ServerSocket(1201);
            socket = serverSocket.accept();
            datoEntrada = new DataInputStream(socket.getInputStream());
            datoSalida = new DataOutputStream(socket.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(Jugador1.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Arreglo de tipo JLabel que contiene cada una de las casilla del tablero
        JLabel[] casillas = new JLabel[]{C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15};
        int PassNombre=0;
        
        //bucle donde que se encuentra escuchando los mensajes del jugador 2
        while (close == 1) {
            try {
                mensaje = datoEntrada.readUTF();
            } catch (java.net.SocketException ex) {
            } catch (IOException ex) {
                Logger.getLogger(Jugador1.class.getName()).log(Level.SEVERE, null, ex);
                
                // se muestran los nombres de los jugadores en la pantalla de juego
            }if (PassNombre==0){
                PassNombre=1;
                Jugador2=mensaje;
                LabelNombres.setAlignmentY(CENTER_ALIGNMENT);
                LabelNombres.setAlignmentX(LEFT_ALIGNMENT);
                LabelNombres.setText("<html>Tú:<p>"+Jugador1+"<p>Rival:<p>"+Jugador2+"<p></html>");
            }
            //se asignan el tipo de casilla aleatorio con su imagen respectiva recibidas del jugador 2
            else if (mensaje.equals("casilla")) {

                for (int i = 0; i <= casillas.length; i++) {
                    if (i != casillas.length) {
                        try {
                            mensaje = datoEntrada.readUTF();
                        } catch (java.io.EOFException ex) {
                            Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException e) {

                        }
                        
                        int index = Integer.parseInt(mensaje);
                        JLabel casilla = casillas[i];

                        switch (index) {
                            case 1:
                                coordenadas.insertLast(casilla.getX(), casilla.getY(), index);
                                casilla.setIcon(imagenes.CasillaReto);
                                break;
                            case 2:
                                coordenadas.insertLast(casilla.getX(), casilla.getY(), index);
                                casilla.setIcon(imagenes.CasillaTrampa);
                                break;
                            case 3:
                                coordenadas.insertLast(casilla.getX(), casilla.getY(), index);
                                casilla.setIcon(imagenes.CasillaTunel);
                                break;
                        }
                    } else {
                        coordenadas.insertFinal(CFinal.getX(), CFinal.getY());
                    }
                }
            } else {
               // condición que se cumple cuando ya se sabe quien es el jugador que comienza a jugar
                if (mensaje.equals("iniciar")) {
                   
                    MainPanel.setVisible(false);
                    PanelJuego.setVisible(true);     
                    mensaje = "";
                    
                    /*condición que se cumple si ambos jugadores obtienen el mismo número del dado al asignar quien comienza
                    a jugar de primero. */
                } else if (mensaje.equals("otra vez")) {
                    buttonDado.setEnabled(true);
                    botonEnabled = true;
                    Dado.setIcon(imagenes.CasillaZero);
                    recorrido = 0;
                    valorDado = 0;
                    
                    // se cumple cuando el jugador 2 ya ha tirado su turno del dado
                } else if (mensaje.equals("es tu turno")) {
                    buttonDado.setEnabled(true);
                    botonEnabled = true;
                    valorDado = 1;
                    
                } else {
                    //se obtiene dos mensajes enviados por el jugador 2 y se guardan en un arreglo
                    String[] msjAvance = mensaje.split("\n");
                    if (mensaje.equals("")) {
                        fichaJugador2.setLocation(fichaJugador2.getX() + 20, fichaJugador2.getY());
                        
                        //se cumple cuando el jugador 2 ha contestado bien a su pregunta de reto
                    } else if (mensaje.equals("correcto")) {
                        fichaJugador2.setLocation(fichaJugador2.getX(), fichaJugador2.getY());
                        buttonDado.setEnabled(true);
                        LabelPregunta.setText("Respuesta correcta");
                        botonEnabled = true;
                        
                        //se muestra la pregunta que se le asignó al jugador 2
                    } else if (msjAvance[1].equals("pregunta")) {
                        LabelPregunta.setVisible(true);
                        LabelPregunta.setVerticalAlignment(CENTER);
                        LabelPregunta.setText("<html>¡Reto para Oponente!<p><p>" + msjAvance[0] + "<p></html>");

                    } else {
                        
                        int AvanceFicha2 = Integer.parseInt(msjAvance[1]);

                        if (AvanceFicha2 <= 0) {
                            fichaJugador2.setLocation(CInicio.getX() + 20, CInicio.getY());
                            buttonDado.setEnabled(true);
                            botonEnabled = true;
                            
                            // se actualiza el progreso del jugador 2 antes del reto que se le asignó
                        } else if (msjAvance[0].equals("esperando")) {
                            int[] coordenadasCasilla;
                            coordenadasCasilla = coordenadas.ObtenerCoordenadas(AvanceFicha2);
                            fichaJugador2.setLocation(coordenadasCasilla[0] + 20, coordenadasCasilla[1]);
                            
                            //se cumple cuando el jugador 2 ha ganado
                        } else if (msjAvance[0].equals("fin del juego")) {
                            int[] coordenadasCasilla;
                            coordenadasCasilla = coordenadas.ObtenerCoordenadas(AvanceFicha2);
                            fichaJugador2.setLocation(coordenadasCasilla[0] + 20, coordenadasCasilla[1]);
                            LabelPregunta.setVisible(true);
                            LabelPregunta.setVerticalAlignment(TOP);
                            LabelPregunta.setText("<html>¡Fin del Juego!<p><p>!Has perdido!<p></html>");
                            buttonDado.setEnabled(false);
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
                            try {
                                serverSocket.close();
                            } catch (IOException e) {

                            }
                            return;
                            
                            /* se actualiza el progreso del jugador 2 o si el otro jugador responde de forma incorrecta 
                            la pregunta de reto*/
                        } else {
                            LabelPregunta.setText("Respuesta incorrecta");
                            int[] coordenadasCasilla;
                            coordenadasCasilla = coordenadas.ObtenerCoordenadas(AvanceFicha2);
                            fichaJugador2.setLocation(coordenadasCasilla[0] + 20, coordenadasCasilla[1]);
                            buttonDado.setEnabled(true);
                            botonEnabled = true;
                        }

                    }

                }
            }

        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvisoNombre;
    private static javax.swing.JLabel C10;
    private static javax.swing.JLabel C11;
    private static javax.swing.JLabel C12;
    private static javax.swing.JLabel C13;
    private static javax.swing.JLabel C14;
    private static javax.swing.JLabel C15;
    private static javax.swing.JLabel C2;
    private static javax.swing.JLabel C3;
    private static javax.swing.JLabel C4;
    private static javax.swing.JLabel C5;
    private static javax.swing.JLabel C6;
    private static javax.swing.JLabel C7;
    private static javax.swing.JLabel C8;
    private static javax.swing.JLabel C9;
    private static javax.swing.JLabel CFinal;
    private static javax.swing.JLabel CInicio;
    private static javax.swing.JLabel Dado;
    private static javax.swing.JLabel EsperarJugador;
    private javax.swing.JLabel FondoInicio;
    private javax.swing.JLabel FondoJuego;
    private static javax.swing.JLabel LabelNombres;
    private static javax.swing.JLabel LabelPregunta;
    private static javax.swing.JPanel MainPanel;
    private javax.swing.JTextField Nombre1;
    private static javax.swing.JPanel PanelJuego;
    private javax.swing.JTextField TextRespuesta;
    private static javax.swing.JButton botonRespuesta;
    private static javax.swing.JLabel buttonDado;
    private javax.swing.JButton buttonInstru;
    private javax.swing.JButton buttonJugar;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JLabel fichaJugador1;
    private static javax.swing.JLabel fichaJugador2;
    private static javax.swing.JButton salirFin;
    // End of variables declaration//GEN-END:variables
}
