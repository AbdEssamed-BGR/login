/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

/**
 *
 * @author abdessamedbouguerra
 */
public class login2 extends javax.swing.JFrame {

    /**
     * Creates new form login2
     */
    public login2() {
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

        er = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        login_p = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        show = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        user = new javax.swing.JComboBox<>();
        password = new javax.swing.JPasswordField();
        errr = new javax.swing.JPanel();
        project_home = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        er.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/icons8-box-important-48.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(102, 255, 153));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("موافق");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("الرجاء التأكد من صحة المعلومات");

        javax.swing.GroupLayout erLayout = new javax.swing.GroupLayout(er);
        er.setLayout(erLayout);
        erLayout.setHorizontalGroup(
            erLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(erLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(erLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, erLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, erLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, erLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(158, 158, 158))))
        );
        erLayout.setVerticalGroup(
            erLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(erLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        er.setVisible(false);

        login_p.setBackground(new java.awt.Color(255, 255, 255));
        login_p.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setBackground(new java.awt.Color(153, 255, 204));
        login.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/check.png"))); // NOI18N
        login.setText("تسجيل الدخول");
        login.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        login_p.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 504, -1, 54));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/user (2).png"))); // NOI18N
        jLabel1.setText("اسم المستخدم");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        login_p.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/padlock.png"))); // NOI18N
        jLabel2.setText("كلمة المرور");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        login_p.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 100)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/user (1).png"))); // NOI18N
        login_p.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 103, -1, -1));

        show.setText("إضهار كلمة المرور");
        show.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        show.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        login_p.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 458, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/icons8-macos-close-30.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        login_p.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 6, -1, -1));

        user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "محمد", "يونس", "اسلام" }));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        login_p.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 218, 51));
        login_p.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 214, 50));

        errr.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout errrLayout = new javax.swing.GroupLayout(errr);
        errr.setLayout(errrLayout);
        errrLayout.setHorizontalGroup(
            errrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
        );
        errrLayout.setVerticalGroup(
            errrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        errr.setVisible(false);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/icons8-macos-close-30.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout project_homeLayout = new javax.swing.GroupLayout(project_home);
        project_home.setLayout(project_homeLayout);
        project_homeLayout.setHorizontalGroup(
            project_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, project_homeLayout.createSequentialGroup()
                .addContainerGap(484, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        project_homeLayout.setVerticalGroup(
            project_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(project_homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addContainerGap(614, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 101, Short.MAX_VALUE)
                    .addComponent(er, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 101, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_p, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 26, Short.MAX_VALUE)
                    .addComponent(project_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 26, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(95, Short.MAX_VALUE)
                    .addComponent(errr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(260, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 230, Short.MAX_VALUE)
                    .addComponent(er, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 230, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(login_p, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(44, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(project_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(374, Short.MAX_VALUE)
                    .addComponent(errr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(222, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        er.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        if(user.getSelectedIndex()==0){
            if(password.getText().equals("0000")){
                login_p.setVisible(false);
                project_home.setVisible(true);
            }
            else{
            errr.setVisible(true);}

        }
        else
        errr.setVisible(true);

        if( password.getText().isEmpty() ){
            er.setVisible(true);
            errr.setVisible(false);
        }
    }//GEN-LAST:event_loginActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // TODO add your handling code here:
        if(show.isSelected()){
            password.setEchoChar((char)0);

        }else{
            password.setEchoChar('*');

        }
    }//GEN-LAST:event_showActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

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
            java.util.logging.Logger.getLogger(login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel er;
    private javax.swing.JPanel errr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton login;
    private javax.swing.JPanel login_p;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel project_home;
    private javax.swing.JCheckBox show;
    private javax.swing.JComboBox<String> user;
    // End of variables declaration//GEN-END:variables
}