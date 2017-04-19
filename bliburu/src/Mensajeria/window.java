package Mensajeria;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class window extends javax.swing.JFrame {
    
    public static String Username = "";
    public static String PassWord = "";
    String Mensage = "";
    public static String To = "";
    String Subject = "";

    public void SendMail() {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(Username, PassWord);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(Username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(To));
            message.setSubject(Subject);
            message.setText(Mensage);

            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Su mensaje ha sido enviado");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    public window() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelarMensaje = new javax.swing.JButton();
        btnEnviarMensaje = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensaje = new javax.swing.JTextArea();
        labelMensajeMensajeria = new javax.swing.JLabel();
        labelAsuntoMensajeria = new javax.swing.JLabel();
        txtAsunto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCancelarMensaje.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnCancelarMensaje.setText("Cancelar");
        btnCancelarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarMensajeActionPerformed(evt);
            }
        });

        btnEnviarMensaje.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEnviarMensaje.setText("Enviar");
        btnEnviarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarMensajeActionPerformed(evt);
            }
        });

        txtMensaje.setColumns(20);
        txtMensaje.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        txtMensaje.setRows(5);
        jScrollPane1.setViewportView(txtMensaje);

        labelMensajeMensajeria.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        labelMensajeMensajeria.setText("Mensaje");

        labelAsuntoMensajeria.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        labelAsuntoMensajeria.setText("Asunto");

        txtAsunto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelAsuntoMensajeria)
                        .addGap(13, 13, 13)
                        .addComponent(txtAsunto))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelMensajeMensajeria)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnEnviarMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarMensaje)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAsuntoMensajeria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMensajeMensajeria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviarMensaje)
                    .addComponent(btnCancelarMensaje))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarMensajeActionPerformed
        System.exit(0); //Se cierra la ventana
    }//GEN-LAST:event_btnCancelarMensajeActionPerformed

    private void btnEnviarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMensajeActionPerformed
        //Se recoge la información y se envía el email
        Mensage = txtMensaje.getText();
        //To = txtDestinatario.getText();
        Subject = txtAsunto.getText();
        SendMail();
        txtAsunto.setText("");
        txtMensaje.setText("");
        this.dispose();
    }//GEN-LAST:event_btnEnviarMensajeActionPerformed

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
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarMensaje;
    private javax.swing.JButton btnEnviarMensaje;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAsuntoMensajeria;
    private javax.swing.JLabel labelMensajeMensajeria;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextArea txtMensaje;
    // End of variables declaration//GEN-END:variables
}
