/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class chooseChip extends javax.swing.JDialog {

    /**
     * Creates new form tokenChooser
     */
    public chooseChip(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        craftButton = new javax.swing.JButton();
        integrityButton = new javax.swing.JButton();
        learningButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Select a Reward Chip");
        setModal(true);

        craftButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/CraftChip.png"))); // NOI18N
        craftButton.setText("jButton1");
        craftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                craftButtonActionPerformed(evt);
            }
        });

        integrityButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/IntegrityChip.png"))); // NOI18N
        integrityButton.setText("integrityButton");
        integrityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integrityButtonActionPerformed(evt);
            }
        });

        learningButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/LearningChip.png"))); // NOI18N
        learningButton.setText("learningButton");
        learningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learningButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Craft");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Integrity");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Learning");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(craftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(integrityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(learningButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(104, 104, 104)
                .addComponent(jLabel3)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(craftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(integrityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(learningButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void integrityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_integrityButtonActionPerformed
        selectedAttribute = "INT";
        this.setVisible(false);
    }//GEN-LAST:event_integrityButtonActionPerformed

    private void learningButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learningButtonActionPerformed
        selectedAttribute = "LRN";
        this.setVisible(false);
    }//GEN-LAST:event_learningButtonActionPerformed

    private void craftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_craftButtonActionPerformed
        selectedAttribute = "CFT";
        this.setVisible(false);
    }//GEN-LAST:event_craftButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    String selectedAttribute;
    
    public chooseChip(boolean learning, boolean craft, boolean integrity){
        this.craftButton.setEnabled(craft);
        this.learningButton.setEnabled(learning);
        this.integrityButton.setEnabled(integrity);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton craftButton;
    private javax.swing.JButton integrityButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton learningButton;
    // End of variables declaration//GEN-END:variables
}
