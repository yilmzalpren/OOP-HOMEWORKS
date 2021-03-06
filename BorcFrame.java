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
public class BorcFrame extends javax.swing.JFrame {
    public static User currentUser ; 
    /**
     * Creates new form BorcFrame
     */
    public BorcFrame() {
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

        jArkaPanel = new javax.swing.JPanel();
        jCancelLabel = new javax.swing.JLabel();
        jGeriGitLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jArkaPanel.setBackground(new java.awt.Color(255, 255, 255));

        jCancelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        jCancelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCancelLabelMousePressed(evt);
            }
        });

        jGeriGitLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/leftArrow.png"))); // NOI18N
        jGeriGitLabel.setText("GERİ GİT");
        jGeriGitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jGeriGitLabelMousePressed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BORCUNUZ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("KREDİ BORCLARINIZ");
        javax.swing.table.DefaultTableModel table1 = (javax.swing.table.DefaultTableModel)jTable1.getModel();
        table1.setRowCount(0);
        java.util.ArrayList<String[]>rObj = ((Musteri)currentUser).krediBorcuListele();
        if(rObj == null) return ;

        for(int i  = 0 ; i < rObj.size();++i){
            table1.addRow(rObj.get(i));
        }

        javax.swing.GroupLayout jArkaPanelLayout = new javax.swing.GroupLayout(jArkaPanel);
        jArkaPanel.setLayout(jArkaPanelLayout);
        jArkaPanelLayout.setHorizontalGroup(
            jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jArkaPanelLayout.createSequentialGroup()
                .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jArkaPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCancelLabel))
                    .addGroup(jArkaPanelLayout.createSequentialGroup()
                        .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jArkaPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jGeriGitLabel))
                            .addGroup(jArkaPanelLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jArkaPanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jArkaPanelLayout.setVerticalGroup(
            jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jArkaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCancelLabel)
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jGeriGitLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jArkaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jArkaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCancelLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCancelLabelMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        System.exit(1);
    }//GEN-LAST:event_jCancelLabelMousePressed

    private void jGeriGitLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGeriGitLabelMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        KrediSecim.mainKrediSecim(currentUser);
    }//GEN-LAST:event_jGeriGitLabelMousePressed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
        if(!((Musteri)currentUser).vadesizHesapVarMi()){
            javax.swing.JOptionPane.showMessageDialog(null,"BORCUNUZU ODEMEK ICIN LUTFEN ONCE VADESIZ HESAP OLUSTURUN");
            this.setVisible(false);
            this.dispose();
            VadesizFrame.mainVadesizFrame(currentUser);
        }
        else{
        int index = jTable1.getSelectedRow();
        if(index!=-1){
           String borc = jTable1.getValueAt(index,0).toString();
           this.setVisible(false);
           this.dispose();
           BorcVadesizFrame.mainBorcVadesizFrame(currentUser, Double.valueOf(borc));
        }
        }
    }//GEN-LAST:event_jTable1MousePressed

    /**
     * @param args the command line arguments
     */
    public static void mainBorcFrame(User currentUser) {
        BorcFrame.currentUser = currentUser ; 
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
            java.util.logging.Logger.getLogger(BorcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorcFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jArkaPanel;
    private javax.swing.JLabel jCancelLabel;
    private javax.swing.JLabel jGeriGitLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
