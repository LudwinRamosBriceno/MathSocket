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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lujor
 */
public class Jugador1 extends javax.swing.JFrame {
    
    static ServerSocket serverSocket;
    static Socket socket;
    static DataInputStream datoEntrada;
    static DataOutputStream datoSalida;

    /**
     * Creates new form Jugador1
     */
    public Jugador1() {
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

        MainPanel = new javax.swing.JPanel();
        Nombre1 = new javax.swing.JTextField();
        buttonJugar = new javax.swing.JButton();
        buttonSalir = new javax.swing.JButton();
        AvisoNombre = new javax.swing.JLabel();
        buttonInstru = new javax.swing.JButton();
        EsperarJugador = new javax.swing.JLabel();
        PanelJuego = new javax.swing.JPanel();
        CInicio = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        C8 = new javax.swing.JLabel();
        C9 = new javax.swing.JLabel();
        C7 = new javax.swing.JLabel();
        C6 = new javax.swing.JLabel();
        C4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        C10 = new javax.swing.JLabel();
        C11 = new javax.swing.JLabel();
        C5 = new javax.swing.JLabel();
        C15 = new javax.swing.JLabel();
        C13 = new javax.swing.JLabel();
        C12 = new javax.swing.JLabel();
        C14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainFrame");
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(0, 51, 255));
        MainPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MainPanel.setFocusable(false);
        MainPanel.setName(""); // NOI18N
        MainPanel.setPreferredSize(new java.awt.Dimension(600, 600));

        Nombre1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Nombre1.setForeground(new java.awt.Color(153, 153, 153));
        Nombre1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nombre1.setText("Ingresar nombre (max 10 caracteres)");
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

        buttonJugar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonJugar.setText("Jugar");
        buttonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJugarAction(evt);
            }
        });

        buttonSalir.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonSalir.setText("Salir");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirAction(evt);
            }
        });

        AvisoNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        buttonInstru.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        buttonInstru.setText("Intrucciones");
        buttonInstru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInstruAction(evt);
            }
        });

        EsperarJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonInstru, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Nombre1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addComponent(EsperarJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AvisoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 137, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AvisoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(EsperarJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(buttonJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(buttonInstru, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(buttonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        PanelJuego.setBackground(new java.awt.Color(0, 153, 153));
        PanelJuego.setPreferredSize(new java.awt.Dimension(600, 600));

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

        jLabel9.setBackground(new java.awt.Color(204, 0, 204));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casilla - fin2.png"))); // NOI18N
        jLabel9.setPreferredSize(new java.awt.Dimension(150, 50));

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

        javax.swing.GroupLayout PanelJuegoLayout = new javax.swing.GroupLayout(PanelJuego);
        PanelJuego.setLayout(PanelJuegoLayout);
        PanelJuegoLayout.setHorizontalGroup(
            PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelJuegoLayout.createSequentialGroup()
                        .addComponent(CInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelJuegoLayout.createSequentialGroup()
                        .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelJuegoLayout.createSequentialGroup()
                                .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelJuegoLayout.createSequentialGroup()
                                        .addComponent(C15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(C14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelJuegoLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(C10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(C11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(C13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelJuegoLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        PanelJuegoLayout.setVerticalGroup(
            PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJuegoLayout.createSequentialGroup()
                .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelJuegoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelJuegoLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(C2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33)
                .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelJuegoLayout.createSequentialGroup()
                        .addComponent(C9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelJuegoLayout.createSequentialGroup()
                        .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(C11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre1ActionPerformed

    private void buttonJugarAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJugarAction
        
        String Jugador1 = Nombre1.getText();
        int espacios = 0;
        //char[] caracteres = Jugador1.toCharArray();
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
        } else {
            int exp = 0;
            EsperarJugador.setText("Esperando Jugador...");

        }
            
        
    }//GEN-LAST:event_buttonJugarAction

    private void buttonSalirAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirAction
        System.exit(0);
    }//GEN-LAST:event_buttonSalirAction

    private void buttonInstruAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInstruAction
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonInstruAction

    private void Nombre1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nombre1MousePressed
        Nombre1.setText("");
        Nombre1.setForeground(Color.black);
    }//GEN-LAST:event_Nombre1MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
        } catch (java.lang.NullPointerException ex){
            
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jugador1().setVisible(true);
            }
        });
        
        try {
            String mensaje = "";
            serverSocket = new ServerSocket(1201);
            socket = serverSocket.accept();
            datoEntrada = new DataInputStream(socket.getInputStream());
            datoSalida = new DataOutputStream(socket.getOutputStream());
            while (true) {
                mensaje = datoEntrada.readUTF();
                if (mensaje.equals("iniciar")){
                    MainPanel.setVisible(false);
                    PanelJuego.setVisible(true);
                    
                }
                
            }
        } catch (IOException e) {
            //se maneja la excepción aquí
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
    private javax.swing.JLabel CInicio;
    private static javax.swing.JLabel EsperarJugador;
    private static javax.swing.JPanel MainPanel;
    private javax.swing.JTextField Nombre1;
    private static javax.swing.JPanel PanelJuego;
    private javax.swing.JButton buttonInstru;
    private javax.swing.JButton buttonJugar;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}