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
public class MusteriKayit extends javax.swing.JFrame {
    public static User yeniUser = null ; 

    /**
     * Creates new form MusteriKayit
     */
    public MusteriKayit() {
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
        jResimLabel = new javax.swing.JLabel();
        jCancelLabel = new javax.swing.JLabel();
        jAdLabel = new javax.swing.JLabel();
        jAdText = new javax.swing.JTextField();
        jAdSeprator = new javax.swing.JSeparator();
        jSoyadLabel = new javax.swing.JLabel();
        jSoyadText = new javax.swing.JTextField();
        jSoyadSeprator = new javax.swing.JSeparator();
        jCinsiyetLabel = new javax.swing.JLabel();
        jCinsiyetCombo = new javax.swing.JComboBox<>();
        jGeriLabel = new javax.swing.JLabel();
        jYılLabel = new javax.swing.JLabel();
        jYearText = new javax.swing.JTextField();
        jYearSeprator = new javax.swing.JSeparator();
        jAyLabel = new javax.swing.JLabel();
        jAyCombo = new javax.swing.JComboBox<>();
        jGunLabel = new javax.swing.JLabel();
        jGünCombo = new javax.swing.JComboBox<>();
        jAyLabel.setVisible(false);
        jAyCombo.setVisible(false);
        jGunLabel.setVisible(false);
        jGünCombo.setVisible(false);
        jYılUyari = new javax.swing.JLabel();
        jTcLabel = new javax.swing.JLabel();
        jTextField = new javax.swing.JTextField();
        jTextSeperator = new javax.swing.JSeparator();
        jSifreLabel = new javax.swing.JLabel();
        jTelText = new javax.swing.JTextField();
        jTelSeperator = new javax.swing.JSeparator();
        jTcUyari = new javax.swing.JLabel();
        jTelUyari = new javax.swing.JLabel();
        jDevamLabel = new javax.swing.JLabel();
        jRigthLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jResimLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bank1.png"))); // NOI18N
        jPanel1.add(jResimLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 13, -1, -1));

        jCancelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        jCancelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCancelLabelMousePressed(evt);
            }
        });
        jPanel1.add(jCancelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, -1, -1));

        jAdLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ad.png"))); // NOI18N
        jAdLabel.setText("AD");
        jPanel1.add(jAdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 199, 73, -1));

        jAdText.setBorder(null);
        jAdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdTextActionPerformed(evt);
            }
        });
        jPanel1.add(jAdText, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 199, 100, -1));

        jAdSeprator.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jAdSeprator, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 222, 100, 10));

        jSoyadLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ad.png"))); // NOI18N
        jSoyadLabel.setText("SOYAD");
        jPanel1.add(jSoyadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jSoyadText.setBorder(null);
        jPanel1.add(jSoyadText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 100, -1));

        jSoyadSeprator.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSoyadSeprator, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 100, 10));

        jCinsiyetLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gender.png"))); // NOI18N
        jCinsiyetLabel.setText("CİNSİYET");
        jPanel1.add(jCinsiyetLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jCinsiyetCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-CİNSİYET-", "KADIN", "ERKEK" }));
        jCinsiyetCombo.setBorder(null);
        jPanel1.add(jCinsiyetCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 100, -1));

        jGeriLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/leftArrow.png"))); // NOI18N
        jGeriLabel.setText("GERİ GİT");
        jGeriLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jGeriLabelMousePressed(evt);
            }
        });
        jPanel1.add(jGeriLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 505, -1, -1));

        jYılLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bhirtday.png"))); // NOI18N
        jYılLabel.setText("DOĞUM YILINIZ");
        jPanel1.add(jYılLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 69, -1, -1));

        jYearText.setBorder(null);
        jYearText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jYearTextKeyReleased(evt);
            }
        });
        jPanel1.add(jYearText, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 76, 57, 13));
        jPanel1.add(jYearSeprator, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 96, 57, 10));

        jAyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ay.png"))); // NOI18N
        jAyLabel.setText("DOĞUM AYINIZ");
        jPanel1.add(jAyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 158, -1, -1));

        jAyCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-AY SEÇ-", "OCAK", "ŞUBAT", "MART", "NİSAN", "MAYIS", "HAZİRAN", "TEMMUZ", "AĞUSTOS", "EYLÜL", "EKİM", "KASIM", "ARALIK" }));
        jAyCombo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jAyComboPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel1.add(jAyCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 163, 101, -1));

        jGunLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gün.png"))); // NOI18N
        jGunLabel.setText("DOĞUM GÜNÜNÜZ");
        jPanel1.add(jGunLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 258, -1, -1));

        jGünCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(jGünCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 263, 101, -1));

        jYılUyari.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(jYılUyari, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 85, 224, 13));

        jTcLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tc.png"))); // NOI18N
        jTcLabel.setText("TC GİRİNİZ");
        jPanel1.add(jTcLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 365, -1, -1));

        jTextField.setBorder(null);
        jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldKeyReleased(evt);
            }
        });
        jPanel1.add(jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 364, 101, -1));

        jTextSeperator.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextSeperator, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 387, 101, 10));

        jSifreLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lock.png"))); // NOI18N
        jSifreLabel.setText("TEL NO GİRİNİZ");
        jPanel1.add(jSifreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 448, -1, -1));

        jTelText.setBorder(null);
        jTelText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTelTextKeyReleased(evt);
            }
        });
        jPanel1.add(jTelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 463, 101, -1));

        jTelSeperator.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTelSeperator, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 486, 101, 10));

        jTcUyari.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jTcUyari, new org.netbeans.lib.awtextra.AbsoluteConstraints(816, 364, -1, -1));

        jTelUyari.setForeground(new java.awt.Color(255, 0, 0));
        jTelUyari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTelUyariKeyReleased(evt);
            }
        });
        jPanel1.add(jTelUyari, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 463, -1, -1));
        jPanel1.add(jDevamLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1032, 258, -1, -1));

        jRigthLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/right.png"))); // NOI18N
        jRigthLabel.setText("DEVAM");
        jRigthLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jRigthLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRigthLabelMousePressed(evt);
            }
        });
        jPanel1.add(jRigthLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 505, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCancelLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCancelLabelMousePressed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_jCancelLabelMousePressed

    private void jAdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAdTextActionPerformed

    private void jGeriLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGeriLabelMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        MusteriLogin.mainMusteriLogin();
    }//GEN-LAST:event_jGeriLabelMousePressed

    private void jYearTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jYearTextKeyReleased
        // TODO add your handling code here:
        try{
        int year = Integer.valueOf(jYearText.getText());
        if((boolean)User.yearCheck(year)){
            jYılUyari.setText("");
            jAyLabel.setVisible(true);
            jAyCombo.setVisible(true);
            if(!(jAyCombo.getSelectedItem().toString().equals("-AY SEÇ-"))){
                jGunLabel.setVisible(true);
                jGünCombo.setVisible(true);
            }
        }
        else{
            jYılUyari.setText("GEÇERSİZ YIL");
            jAyLabel.setVisible(false);
            jAyCombo.setVisible(false);
            jGunLabel.setVisible(false);
            jGünCombo.setVisible(false);
        }
        }catch(NumberFormatException e){
            jYılUyari.setText("LÜTFEN SADECE RAKAM GİRİNİZ!");
            jAyLabel.setVisible(false);
            jAyCombo.setVisible(false);
            jGunLabel.setVisible(false);
            jGünCombo.setVisible(false);
        }
    }//GEN-LAST:event_jYearTextKeyReleased

    private void jAyComboPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jAyComboPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String keeper = jAyCombo.getSelectedItem().toString();
        if(!(keeper.equals("-AY SEÇ-"))){
            if(keeper.equals("OCAK")||keeper.equals("MART")||keeper.equals("MAYIS")||keeper.equals("TEMMUZ")||keeper.equals("AĞUGSTOS")
                    ||keeper.equals("EKİM")||keeper.equals("ARALIK")){
                        jGünCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));               
            }
            else if(keeper.equals("NİSAN")||keeper.equals("HAZİRAN")||keeper.equals("EYLÜL")||keeper.equals("KASIM")){
                         jGünCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
            }
            else{ // SUBAT BU
                int year = Integer.valueOf(jYearText.getText());
                if(User.leapYearCheck(year)){
                        jGünCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29" }));
        
                }
                else{
                        jGünCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28" }));
      
                }
            }
            jGunLabel.setVisible(true);
            jGünCombo.setVisible(true);
        }
        else{
            jGunLabel.setVisible(false);
            jGünCombo.setVisible(false);
        }
    }//GEN-LAST:event_jAyComboPopupMenuWillBecomeInvisible

    private void jTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldKeyReleased
        // TODO add your handling code here:
        String keeper = jTextField.getText();
        int rValue= User.checkUyari(keeper,11);
        if(rValue==1){
            jTcUyari.setText("11 HANE VE RAKAM İCERMELİ");
        }
        else if(rValue==2){
            jTcUyari.setText("11 HANE OLMALI");
  
        }
        else if(rValue==3){
            jTcUyari.setText("RAKAM İÇERMELİ");
     
        }
        else{
            jTcUyari.setText("");
    
        }
    }//GEN-LAST:event_jTextFieldKeyReleased

    private void jTelUyariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTelUyariKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jTelUyariKeyReleased

    private void jTelTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTelTextKeyReleased
        // TODO add your handling code here:
       String keeper = jTelText.getText();
        int rValue= User.checkUyari(keeper,11);
        if(rValue==1){
            jTelUyari.setText("11 HANE VE RAKAM İCERMELİ");
        }
        else if(rValue==2){
            jTelUyari.setText("11 HANE OLMALI");
  
        }
        else if(rValue==3){
            jTelUyari.setText("RAKAM İÇERMELİ");
     
        }
        else{
            jTelUyari.setText("");
    
        }   
    }//GEN-LAST:event_jTelTextKeyReleased

    private void jRigthLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRigthLabelMousePressed
        // TODO add your handling code here:
        Date date = new Date(jGünCombo.getSelectedItem().toString(),jAyCombo.getSelectedItem().toString(),jYearText.getText());
        
        User yeniUser = new Musteri(jAdText.getText(),jSoyadText.getText(),null,jCinsiyetCombo.getSelectedItem().toString(),date,jTextField.getText(),jTelText.getText());
        boolean result = yeniUser.isOkay();
        if(result){
            this.setVisible(false);
            this.dispose();
            MusteriKayit.yeniUser = yeniUser ; 
            SifreOlustur.mainSifreOlustur(yeniUser,1);
        }
        else{
            javax.swing.JOptionPane.showMessageDialog(this, "       HATALI GİRDİLER VAR\nLÜTFEN GİRDİKLERİNİZİ GÖZDEN GEÇİRİN");
        }
    }//GEN-LAST:event_jRigthLabelMousePressed

    /**
     * @param args the command line arguments
     */
    public static void mainMusteriKayit() {
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
            java.util.logging.Logger.getLogger(MusteriKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriKayit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAdLabel;
    private javax.swing.JSeparator jAdSeprator;
    private javax.swing.JTextField jAdText;
    private javax.swing.JComboBox<String> jAyCombo;
    private javax.swing.JLabel jAyLabel;
    private javax.swing.JLabel jCancelLabel;
    private javax.swing.JComboBox<String> jCinsiyetCombo;
    private javax.swing.JLabel jCinsiyetLabel;
    private javax.swing.JLabel jDevamLabel;
    private javax.swing.JLabel jGeriLabel;
    private javax.swing.JLabel jGunLabel;
    private javax.swing.JComboBox<String> jGünCombo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jResimLabel;
    private javax.swing.JLabel jRigthLabel;
    private javax.swing.JLabel jSifreLabel;
    private javax.swing.JLabel jSoyadLabel;
    private javax.swing.JSeparator jSoyadSeprator;
    private javax.swing.JTextField jSoyadText;
    private javax.swing.JLabel jTcLabel;
    private javax.swing.JLabel jTcUyari;
    private javax.swing.JSeparator jTelSeperator;
    private javax.swing.JTextField jTelText;
    private javax.swing.JLabel jTelUyari;
    private javax.swing.JTextField jTextField;
    private javax.swing.JSeparator jTextSeperator;
    private javax.swing.JSeparator jYearSeprator;
    private javax.swing.JTextField jYearText;
    private javax.swing.JLabel jYılLabel;
    private javax.swing.JLabel jYılUyari;
    // End of variables declaration//GEN-END:variables
}
