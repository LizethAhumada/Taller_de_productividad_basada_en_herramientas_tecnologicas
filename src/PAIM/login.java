
package PAIM;

import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {

  
    public login() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PAIMS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 60, 160, 60);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 200, 130, 50);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USER: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 110, 100, 50);

        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });
        getContentPane().add(User);
        User.setBounds(90, 150, 230, 50);

        Password.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password);
        Password.setBounds(90, 240, 230, 50);

        Login.setText("LOGIN");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(150, 300, 110, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PAIM/logo.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 10, 150, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PAIM/fondo1.png"))); // NOI18N
        jLabel1.setText("LOGIN");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 0, 430, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        
            // Login 
            
   char clave[]= Password.getPassword();


   String clavedef=new String(clave);



  if (User.getText().equals("Braulio") && clavedef.equals("123")){ 
// Contraseña y Usuario " Braulio" y "123"


         this.dispose();

         
         JOptionPane.showMessageDialog(null, "Bienvenido\n Has ingresado "
         + "satisfactoriamente al sistema", "Mensaje de bienvenida",
         JOptionPane.INFORMATION_MESSAGE);

         
         frmPrincipal x = new frmPrincipal();

         
         x.setVisible(true);
  }
  else {

          JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
          + "Por favor ingrese un usuario y/o contraseña correctos",  
          "Acceso denegado", JOptionPane.ERROR_MESSAGE);
      
  }
    }//GEN-LAST:event_LoginActionPerformed

    
    public static void main(String args[]) {
        
       
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
