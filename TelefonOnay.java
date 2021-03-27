/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaotomasyonu;

/**
 *
 * @author YILMAZ
 */
public class TelefonOnay extends javax.swing.JFrame {
    public static User yeniUser;
    public static int onayKodu ; 
    /**
     * Creates new form TelefonOnay
     */
    public TelefonOnay() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMesajLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jOnayKoduText = new javax.swing.JTextField();
        jOnayKoduText.setText(String.valueOf(TelefonOnay.onayKodu));

        String tel = TelefonOnay.yeniUser.getTelNo();
        jLabel2.setText(""+tel.charAt(0)+tel.charAt(1)+tel.charAt(2)+tel.charAt(3)+" "+tel.charAt(4)+tel.charAt(5)+tel.charAt(6)+" "+
            tel.charAt(7)+tel.charAt(8)+" "+tel.charAt(9)+tel.charAt(10));

        jPhoneLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        jLabel3.setText("TELEFONU KAPAT");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 488, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 134, 20));

        jMesajLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/message.png"))); // NOI18N
        jPanel1.add(jMesajLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ONAY KODUNUZ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jOnayKoduText.setEditable(false);
        jOnayKoduText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jOnayKoduText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jOnayKoduText, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 320, 90, -1));

        jPhoneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phone.png"))); // NOI18N
        jPanel1.add(jPhoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jLabel3MousePressed

    /**
     * @param args the command line arguments
     */
    public static void mainTelefonOnay(int onayKodu,User yeniUser) {
         
        TelefonOnay.onayKodu = onayKodu;
        TelefonOnay.yeniUser = yeniUser;
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
            java.util.logging.Logger.getLogger(TelefonOnay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelefonOnay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelefonOnay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelefonOnay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelefonOnay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jMesajLabel;
    private javax.swing.JTextField jOnayKoduText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPhoneLabel;
    // End of variables declaration//GEN-END:variables
}