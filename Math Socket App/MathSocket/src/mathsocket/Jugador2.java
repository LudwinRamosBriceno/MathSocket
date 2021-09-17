/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsocket;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static mathsocket.Jugador1.datoSalida;

/**
 *
 * @author lujor
 */
public class Jugador2 extends javax.swing.JFrame {

    ImageIcon img1 = new ImageIcon("R:\\TEC - II 2021\\Algoritmos y estructura de datos I\\Proyectos\\Proyecto 1\\Aplicación principal"
            + "\\Math Socket App\\MathSocket\\src\\images\\DadoOne.png");
    ImageIcon img2 = new ImageIcon("R:\\TEC - II 2021\\Algoritmos y estructura de datos I\\Proyectos\\Proyecto 1\\Aplicación principal"
            + "\\Math Socket App\\MathSocket\\src\\images\\DadoTwo.png");
    ImageIcon img3 = new ImageIcon("R:\\TEC - II 2021\\Algoritmos y estructura de datos I\\Proyectos\\Proyecto 1\\Aplicación principal"
            + "\\Math Socket App\\MathSocket\\src\\images\\DadoThree.png");
    ImageIcon img4 = new ImageIcon("R:\\TEC - II 2021\\Algoritmos y estructura de datos I\\Proyectos\\Proyecto 1\\Aplicación principal"
            + "\\Math Socket App\\MathSocket\\src\\images\\DadoFour.png");
    ImageIcon CasillaReto = new ImageIcon("R:\\TEC - II 2021\\Algoritmos y estructura de datos I\\Proyectos\\Proyecto 1\\Aplicación principal"
            + "\\Math Socket App\\MathSocket\\src\\images\\Casilla - reto.png");
    ImageIcon CasillaTrampa = new ImageIcon("R:\\TEC - II 2021\\Algoritmos y estructura de datos I\\Proyectos\\Proyecto 1\\Aplicación principal"
            + "\\Math Socket App\\MathSocket\\src\\images\\Casilla - trampa.png");
    ImageIcon CasillaTunel = new ImageIcon("R:\\TEC - II 2021\\Algoritmos y estructura de datos I\\Proyectos\\Proyecto 1\\Aplicación principal"
            + "\\Math Socket App\\MathSocket\\src\\images\\Casilla - túnel.png");

    static int count = 0;
    static int valorDado = 0;
    static String mensaje = "";
    static Socket socket;
    static DataInputStream datoEntrada;
    static DataOutputStream datoSalida;

    /**
     * Creates new form Jugador2
     */
    public Jugador2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
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
        PanelJuego2 = new javax.swing.JPanel();
        CInicio = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainFrame2");
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);

        MainPanel2.setBackground(new java.awt.Color(0, 153, 255));
        MainPanel2.setPreferredSize(new java.awt.Dimension(600, 600));

        Nombre2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Nombre2.setForeground(new java.awt.Color(153, 153, 153));
        Nombre2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nombre2.setText("Ingresar nombre (max 10 caracteres)");
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

        buttonJugar2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonJugar2.setText("Jugar");
        buttonJugar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJugar2Action(evt);
            }
        });

        buttonSalir2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonSalir2.setText("Salir");
        buttonSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalir2Action(evt);
            }
        });

        AvisoNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        buttonInstru2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonInstru2.setText("Intrucciones");
        buttonInstru2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInstru2Action(evt);
            }
        });

        javax.swing.GroupLayout MainPanel2Layout = new javax.swing.GroupLayout(MainPanel2);
        MainPanel2.setLayout(MainPanel2Layout);
        MainPanel2Layout.setHorizontalGroup(
            MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel2Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonJugar2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonInstru2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSalir2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MainPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Nombre2, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(AvisoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 157, Short.MAX_VALUE))
        );
        MainPanel2Layout.setVerticalGroup(
            MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(Nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AvisoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(buttonJugar2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(buttonInstru2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(buttonSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        PanelJuego2.setBackground(new java.awt.Color(255, 51, 51));
        PanelJuego2.setPreferredSize(new java.awt.Dimension(600, 600));

        CInicio.setBackground(new java.awt.Color(204, 0, 204));
        CInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casilla - inicio2.png"))); // NOI18N
        CInicio.setPreferredSize(new java.awt.Dimension(150, 50));

        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casilla - inicio2.png"))); // NOI18N
        C2.setPreferredSize(new java.awt.Dimension(150, 50));

        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casilla - inicio2.png"))); // NOI18N
        C3.setPreferredSize(new java.awt.Dimension(150, 50));

        C8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casilla - inicio2.png"))); // NOI18N
        C8.setPreferredSize(new java.awt.Dimension(150, 50));

        C9.setBackground(new java.awt.Color(204, 0, 204));
        C9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casilla - inicio2.png"))); // NOI18N
        C9.setPreferredSize(new java.awt.Dimension(150, 50));

        C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casilla - inicio2.png"))); // NOI18N
        C7.setPreferredSize(new java.awt.Dimension(150, 50));

        C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casilla - inicio2.png"))); // NOI18N
        C6.setPreferredSize(new java.awt.Dimension(150, 50));

        C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casilla - inicio2.png"))); // NOI18N
        C4.setPreferredSize(new java.awt.Dimension(150, 50));

        CFin.setBackground(new java.awt.Color(204, 0, 204));
        CFin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casilla - fin2.png"))); // NOI18N
        CFin.setPreferredSize(new java.awt.Dimension(150, 50));

        C10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casilla - inicio2.png"))); // NOI18N
        C10.setPreferredSize(new java.awt.Dimension(150, 50));

        C11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casilla - inicio2.png"))); // NOI18N
        C11.setPreferredSize(new java.awt.Dimension(150, 50));

        C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casilla - inicio2.png"))); // NOI18N
        C5.setPreferredSize(new java.awt.Dimension(150, 50));

        C15.setBackground(new java.awt.Color(204, 0, 204));
        C15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casilla - inicio2.png"))); // NOI18N
        C15.setPreferredSize(new java.awt.Dimension(150, 50));

        C13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casilla - inicio2.png"))); // NOI18N
        C13.setPreferredSize(new java.awt.Dimension(150, 50));

        C12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casilla - inicio2.png"))); // NOI18N
        C12.setPreferredSize(new java.awt.Dimension(150, 50));

        C14.setBackground(new java.awt.Color(204, 0, 204));
        C14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casilla - inicio2.png"))); // NOI18N
        C14.setPreferredSize(new java.awt.Dimension(150, 50));

        buttonDado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/interrogation.png"))); // NOI18N
        buttonDado2.setEnabled(false);
        buttonDado2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDado2MouseClicked(evt);
            }
        });

        Dado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DadoZero.png"))); // NOI18N

        javax.swing.GroupLayout PanelJuego2Layout = new javax.swing.GroupLayout(PanelJuego2);
        PanelJuego2.setLayout(PanelJuego2Layout);
        PanelJuego2Layout.setHorizontalGroup(
            PanelJuego2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJuego2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelJuego2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelJuego2Layout.createSequentialGroup()
                        .addComponent(CInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelJuego2Layout.createSequentialGroup()
                        .addGroup(PanelJuego2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelJuego2Layout.createSequentialGroup()
                                .addGroup(PanelJuego2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CFin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelJuego2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelJuego2Layout.createSequentialGroup()
                                        .addComponent(C15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(C14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelJuego2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(C10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(C11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelJuego2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(C13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelJuego2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(24, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelJuego2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Dado2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonDado2)
                .addGap(50, 50, 50))
        );
        PanelJuego2Layout.setVerticalGroup(
            PanelJuego2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJuego2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelJuego2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PanelJuego2Layout.createSequentialGroup()
                        .addComponent(buttonDado2)
                        .addGap(14, 14, 14)
                        .addGroup(PanelJuego2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelJuego2Layout.createSequentialGroup()
                        .addComponent(Dado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelJuego2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(PanelJuego2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(PanelJuego2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelJuego2Layout.createSequentialGroup()
                        .addComponent(C9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(CFin, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelJuego2Layout.createSequentialGroup()
                        .addGroup(PanelJuego2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(C11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(PanelJuego2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C13, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C15, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );

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

        String Jugador2 = Nombre2.getText();
        int espacios = 0;
        //char[] caracteres = Jugador1.toCharArray();
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
            JLabel[] casillas = new JLabel[]{C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15};
            AsigCasillas b = new AsigCasillas();
            int[] casillasRandom;
            casillasRandom = b.dequeue();
            try {
                datoSalida.writeUTF("casilla");
            } catch (IOException ex) {
                Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
            }
            for (int i = 0; i < casillas.length; i++) {
                JLabel casilla = casillas[i];
                String index = String.valueOf(casillasRandom[i]);
                try {
                    datoSalida.writeUTF(index);
                } catch (IOException ex) {
                    Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
                }
                switch (casillasRandom[i]) {
                    case 1:
                        casilla.setIcon(CasillaReto);
                        break;
                    case 2:
                        casilla.setIcon(CasillaTrampa);
                        break;
                    case 3:
                        casilla.setIcon(CasillaTunel);
                        break;
                }
            }
            MainPanel2.setVisible(false);
            PanelJuego2.setVisible(true);
            try {
                datoSalida.writeUTF("iniciar");
            } catch (IOException ex) {
                Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_buttonJugar2Action

    private void buttonSalir2Action(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalir2Action
        System.exit(0);
    }//GEN-LAST:event_buttonSalir2Action

    private void buttonInstru2Action(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInstru2Action
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonInstru2Action

    private void buttonDado2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDado2MouseClicked

        Random numDado = new Random();
        int num = numDado.nextInt(4) + 1;
        //mensaje = datoEntrada.readUTF();
        if (valorDado == 0) {
            valorDado = num;
            switch (num) {
                case 1:

                    Dado2.setIcon(img1);
                    break;

                case 2:

                    Dado2.setIcon(img2);
                    break;

                case 3:

                    Dado2.setIcon(img3);
                    break;

                case 4:

                    Dado2.setIcon(img4);
                    break;
            }
            int numero = Integer.parseInt(mensaje);
            if (numero > num) {
                buttonDado2.setEnabled(false);
                try {
                    datoSalida.writeUTF("es tu turno");
                } catch (IOException ex) {
                    Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (numero < num ) {
                mensaje="es tu turno";
                valorDado = 1;
                return;
            } else {
                buttonDado2.setEnabled(false);
                try {
                    datoSalida.writeUTF("otra vez");
                } catch (IOException ex) {
                    Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
                }
                valorDado = 0;
                count = 0;
            }
        } else if (mensaje.equals("es tu turno")) {
            buttonDado2.setEnabled(false);
            try {
                datoSalida.writeUTF("es tu turno");
            } catch (IOException ex) {
                Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
            }
            switch (num) {
                case 1:

                    Dado2.setIcon(img1);
                    break;

                case 2:

                    Dado2.setIcon(img2);
                    break;

                case 3:

                    Dado2.setIcon(img3);
                    break;

                case 4:

                    Dado2.setIcon(img4);
                    break;
            }

        }
        System.out.println(num);
    }//GEN-LAST:event_buttonDado2MouseClicked

    /**
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
            while (true) {
                try {
                    mensaje = datoEntrada.readUTF();
                } catch (IOException ex) {
                    Logger.getLogger(Jugador2.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (valorDado == 0 && !mensaje.equals("") && count == 0) {
                    buttonDado2.setEnabled(true);
                    count = 1;
                } else if (mensaje.equals("es tu turno")) {
                    buttonDado2.setEnabled(true);
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
    private javax.swing.JLabel CInicio;
    private javax.swing.JLabel Dado2;
    private static javax.swing.JPanel MainPanel2;
    private javax.swing.JTextField Nombre2;
    private static javax.swing.JPanel PanelJuego2;
    private static javax.swing.JLabel buttonDado2;
    private javax.swing.JButton buttonInstru2;
    private javax.swing.JButton buttonJugar2;
    private javax.swing.JButton buttonSalir2;
    // End of variables declaration//GEN-END:variables
}
