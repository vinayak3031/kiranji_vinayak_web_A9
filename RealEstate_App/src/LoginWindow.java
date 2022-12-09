
import com.sun.tools.javac.Main;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author diksharawat
 */
public class LoginWindow extends javax.swing.JFrame {

    /**
     * Creates new form LoginWindow
     */
    public LoginWindow() {
        initComponents();
        
        /*
        
        - Download the Java MySQL Database connextor from this Link: https://dev.mysql.com/downloads/connectors/j/5.1.html
        - Add the connector to the project
        - Open xampp & start apache and mysql
        - create the mysql database using phpmyadmin
        - create a classs for the connection 
        
        */
        
        
        //center the form
        this.setLocationRelativeTo(null);
        
        
        //display image in jlable
        jLabel_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/building.png")));
        jLabel_UsernameIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/username.png")));
        jLabel_PasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password.png")));
        
        //add a border to the jlable title
        Border title_border = BorderFactory.createMatteBorder(0, 0, 3, 0, Color.RED);
        jLabel_title.setBorder(title_border);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_image = new javax.swing.JLabel();
        jLabel_title = new javax.swing.JLabel();
        jLabel_UsernameIcon = new javax.swing.JLabel();
        jLabel_PasswordIcon = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButton_login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_image.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_image.setText("jLabel1");
        jLabel_image.setOpaque(true);

        jLabel_title.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(102, 102, 255));
        jLabel_title.setText("LOGIN");

        jLabel_UsernameIcon.setBackground(new java.awt.Color(255, 204, 204));
        jLabel_UsernameIcon.setOpaque(true);

        jLabel_PasswordIcon.setBackground(new java.awt.Color(255, 204, 204));
        jLabel_PasswordIcon.setOpaque(true);

        jTextField_Username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Username.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_Username.setText("Username");
        jTextField_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusLost(evt);
            }
        });
        jTextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsernameActionPerformed(evt);
            }
        });

        jPasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField.setText("password");
        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusLost(evt);
            }
        });

        jButton_login.setBackground(new java.awt.Color(102, 102, 255));
        jButton_login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_login.setText("Log In");
        jButton_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_image, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_title, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_UsernameIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_Username))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_PasswordIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel_title, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_UsernameIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_Username, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_PasswordIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(363, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsernameActionPerformed

    private void jTextField_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusGained
        
        //remove the text from the text field on focus gained
        //if the text field text = "username"
        
        if(jTextField_Username.getText().trim().toLowerCase().equals("username"))
              
        {
                    jTextField_Username.setText("");
                    // change the text field color to black
                    jTextField_Username.setForeground(Color.black);
        }
        
    }//GEN-LAST:event_jTextField_UsernameFocusGained

    private void jTextField_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusLost
        
        //if the text field is empty -> set it to 'Username'
        if (jTextField_Username.getText().trim().equals("") ||
                jTextField_Username.getText().trim().toLowerCase().equals("username"))
                {
                    jTextField_Username.setText("username");
                    jTextField_Username.setForeground(new Color(155,,153, 153));
                }
        
    }//GEN-LAST:event_jTextField_UsernameFocusLost

    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusGained
        
        //clear the password field on focus if the text = password
        //get the password 
        String password = String.valueOf(jPasswordField.getPassword());
        if(password.trim().toLowerCase().equals("password"))
        {
            jPasswordField.setText("");
            jPasswordField.setForeground(Color.black);
        }       
        
    }//GEN-LAST:event_jPasswordFieldFocusGained

    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusLost
        
        //if the password field is empty -> set it to 'password'
        String password = String.valueOf(jPasswordField.getPassword());
          if (password.trim().equals("") ||
                password.trim().toLowerCase().equals("password"))
                {
                    jPasswordField.setText("password");
                    jPasswordField.setForeground(new Color(155,153, 153));
                }
        
    }//GEN-LAST:event_jPasswordFieldFocusLost

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        
        String username = jTextField_Username.getText();
        String password = String.valueOf(jPasswordField.getPassword());
        
        
        PreparedStatement ps;
        ResultSet rs;
        
        String selectquery = "SELECT * FROM 'users' WHERE 'username' = ? AND password = ?";
        
        //check the fields value
        if(username.trim().toLowerCase().equals("Username") ||
                password.trim().toLowerCase().equals("Password"))
        {
            JOptionPane.showMessageDialog(null, "ENTER YOUR USERNAME AND PASSWORD", "Empty field", 2);
        }
        else{
            try{
                ps = DBconnection.getDBconnection().prepareStatement(selectquery);
                
                 ps.setString(1, username);
                 ps.setString(2, password);
                 
                 rs = ps.executeQuery();
                 
                 if(rs.next())
                 {
                     //show the Main Form
                     
                     MainApp_Window mainform = new MainApp_Window();
                     mainform.setVisible(true);
                     mainform.pack();
                     
                     //close the login window
                     this.dispose();
                     
                     
                 }
                 else{
                     JOptionPane.showMessageDialog(null, "Invalid Username or Password","Wrong Data",2);
                 }
            
            } catch (SQLExecption ex){
                Logger.getLogger(LOGIN_WINDOW.class.getName()).log(System.Logger.Level.SERVERE, null, ex);
            }
            
           
          
        }
        
    }//GEN-LAST:event_jButton_loginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_login;
    private javax.swing.JLabel jLabel_PasswordIcon;
    private javax.swing.JLabel jLabel_UsernameIcon;
    private javax.swing.JLabel jLabel_image;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}