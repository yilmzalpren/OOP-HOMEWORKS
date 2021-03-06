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
public class VadesizFrame extends javax.swing.JFrame {
    public static User currentUser = null  ; 
    /**
     * Creates new form VadesizFrame
     */
    public VadesizFrame() {
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
        jGeriLabel = new javax.swing.JLabel();
        jCancelLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jVadesizTable = new javax.swing.JTable();
        jYeniHesapLabel = new javax.swing.JLabel();
        jVadesizLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jGeriLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/leftArrow.png"))); // NOI18N
        jGeriLabel.setText("GERİ GİT");
        jGeriLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jGeriLabelMousePressed(evt);
            }
        });

        jCancelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        jCancelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCancelLabelMousePressed(evt);
            }
        });

        jVadesizTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HESAP NO", "BAKİYE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jVadesizTable.getTableHeader().setReorderingAllowed(false);
        jVadesizTable.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jVadesizTableMouseMoved(evt);
            }
        });
        jVadesizTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jVadesizTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jVadesizTable);
        if (jVadesizTable.getColumnModel().getColumnCount() > 0) {
            jVadesizTable.getColumnModel().getColumn(0).setResizable(false);
            jVadesizTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jYeniHesapLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jYeniHesapLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/yeniHesap.png"))); // NOI18N
        jYeniHesapLabel.setText("YENİ HESAP OLUSTUR");
        jYeniHesapLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ((Musteri)currentUser).hesapFieldAta(1);
        javax.swing.table.DefaultTableModel table = (javax.swing.table.DefaultTableModel)jVadesizTable.getModel();
        if(((Musteri)currentUser).hesapNull(1)){

        }

        else{
            int size = ((Musteri)currentUser).sizeOfHesap(1);
            if(size==0){

            }
            else{
                String[] dataRow = null ; 
                for(int i = 0 ; i < size ; ++i){
                    dataRow = ((Musteri)currentUser).getHesapAtIndex(1,i);
                    table.addRow(dataRow);
                }
            }
        }
        jYeniHesapLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jYeniHesapLabelMousePressed(evt);
            }
        });

        jVadesizLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jVadesizLabel.setText("VADESİZ HESAPLARIM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jCancelLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jGeriLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jYeniHesapLabel))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 91, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jVadesizLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCancelLabel)
                .addGap(32, 32, 32)
                .addComponent(jVadesizLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGeriLabel)
                    .addComponent(jYeniHesapLabel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jGeriLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGeriLabelMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        BireyselHesaplarFrame.mainBireyselHesaplarFrame(currentUser);
    }//GEN-LAST:event_jGeriLabelMousePressed

    private void jCancelLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCancelLabelMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        System.exit(1);
    }//GEN-LAST:event_jCancelLabelMousePressed

    private void jYeniHesapLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jYeniHesapLabelMousePressed
        // TODO add your handling code here:
        //((Musteri)currentUser).vadesizHesapAta();
        this.setVisible(false);
        this.dispose();
        int onayKodu = User.createOnayKodu();
        VadesizOnayKodGir.mainVadesizOnayKodGir(onayKodu, currentUser);
        
        TelefonOnay.mainTelefonOnay(onayKodu, currentUser);
    }//GEN-LAST:event_jYeniHesapLabelMousePressed

    private void jVadesizTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVadesizTableMousePressed
        // TODO add your handling code here:
        int index = jVadesizTable.getSelectedRow();
        if(index!=-1){
           String hesapNo = jVadesizTable.getValueAt(index,0).toString();
           String bakiye = jVadesizTable.getValueAt(index,1).toString();
           this.setVisible(false);
           this.dispose();
           VadesizSpesifik.mainVadesizSpesifik(VadesizFrame.currentUser, hesapNo, bakiye);
        }
    }//GEN-LAST:event_jVadesizTableMousePressed

    private void jVadesizTableMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVadesizTableMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jVadesizTableMouseMoved

    /**
     * @param args the command line arguments
     */
    public static void mainVadesizFrame(User currentUser) {
        VadesizFrame.currentUser = currentUser ;
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
            java.util.logging.Logger.getLogger(VadesizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VadesizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VadesizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VadesizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VadesizFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCancelLabel;
    private javax.swing.JLabel jGeriLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jVadesizLabel;
    private javax.swing.JTable jVadesizTable;
    private javax.swing.JLabel jYeniHesapLabel;
    // End of variables declaration//GEN-END:variables
}
