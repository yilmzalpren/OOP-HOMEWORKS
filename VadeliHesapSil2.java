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
public class VadeliHesapSil2 extends javax.swing.JFrame {
    public static User currentUser = null ; 
    public static VadeliHesap vadeliHesap = null ; 
    /**
     * Creates new form VadeliHesapSil2
     */
    public VadeliHesapSil2() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jVadesizTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jArkaPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/leftArrow.png"))); // NOI18N
        jLabel2.setText("GERİ GİT");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
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
        jVadesizTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jVadesizTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jVadesizTable);
        if (jVadesizTable.getColumnModel().getColumnCount() > 0) {
            jVadesizTable.getColumnModel().getColumn(0).setResizable(false);
            jVadesizTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("VADE SONU TUTARIN AKTARILACAGI HESABI SECINIZ");
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

        javax.swing.GroupLayout jArkaPanelLayout = new javax.swing.GroupLayout(jArkaPanel);
        jArkaPanel.setLayout(jArkaPanelLayout);
        jArkaPanelLayout.setHorizontalGroup(
            jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jArkaPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jArkaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jArkaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(148, 148, 148))))
            .addGroup(jArkaPanelLayout.createSequentialGroup()
                .addGroup(jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jArkaPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jArkaPanelLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 116, Short.MAX_VALUE))
        );
        jArkaPanelLayout.setVerticalGroup(
            jArkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jArkaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel2)
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

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        System.exit(1);
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        VadeliSpesifik.mainVadeliSpesifik(currentUser, vadeliHesap.getHesapNo(), vadeliHesap.getBakiye(), vadeliHesap.getVadeSonuTutar(),
                vadeliHesap.getKalanGün());
    }//GEN-LAST:event_jLabel2MousePressed

    private void jVadesizTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVadesizTableMousePressed
        // TODO add your handling code here:
        int index = jVadesizTable.getSelectedRow();
        if(index!=-1){
           String hesapNo = jVadesizTable.getValueAt(index,0).toString();
           String bakiye = jVadesizTable.getValueAt(index,1).toString();
           this.setVisible(false);
           this.dispose();
           ((Musteri)currentUser).vadesizHesapBakiye(hesapNo, Double.valueOf(vadeliHesap.getVadeSonuTutar()), true);
           ((Musteri)currentUser).vadeliHesapSil(vadeliHesap.getHesapNo());
           VadeliFrame.mainVadeliFrame(currentUser);
        } 
    }//GEN-LAST:event_jVadesizTableMousePressed

    /**
     * @param args the command line arguments
     */
    public static void mainVadeliHesapSil2(User currentUser,VadeliHesap vadeliHesap) {
        VadeliHesapSil2.currentUser = currentUser;
        VadeliHesapSil2.vadeliHesap = vadeliHesap;
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
            java.util.logging.Logger.getLogger(VadeliHesapSil2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VadeliHesapSil2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VadeliHesapSil2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VadeliHesapSil2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VadeliHesapSil2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jArkaPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jVadesizTable;
    // End of variables declaration//GEN-END:variables
}
