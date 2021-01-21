
import java.util.ArrayList;


public class load extends javax.swing.JFrame {
    ArrayList<accounts> IDs;
    accounts newUser;
   
    public load(ArrayList<accounts> IDs, accounts newUser) {
        initComponents();
        this.IDs = IDs;
        this.newUser = newUser;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cellphoneNumber = new javax.swing.JTextField();
        cellphoneLoad = new javax.swing.JTextField();
        LOAD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cellphone Load");

        cellphoneNumber.setText("Enter Cellphone Number");
        cellphoneNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cellphoneNumberMouseClicked(evt);
            }
        });

        cellphoneLoad.setText("Enter Amount");
        cellphoneLoad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cellphoneLoadMouseClicked(evt);
            }
        });

        LOAD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LOAD.setText("Load");
        LOAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOADActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cellphoneLoad)
                            .addComponent(cellphoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(LOAD)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(cellphoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cellphoneLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LOAD)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LOADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOADActionPerformed
        number = cellphoneNumber.getText();
        try{
            loadAmt = Double.parseDouble(cellphoneLoad.getText());
        }catch(Exception e){}
        newUser.bal = newUser.bal - loadAmt;
        loadResibo loadres = new loadResibo(IDs, newUser, number, loadAmt);
        loadres.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LOADActionPerformed

    private void cellphoneNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cellphoneNumberMouseClicked
        cellphoneNumber.setText("");
    }//GEN-LAST:event_cellphoneNumberMouseClicked

    private void cellphoneLoadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cellphoneLoadMouseClicked
        cellphoneLoad.setText("");
    }//GEN-LAST:event_cellphoneLoadMouseClicked
        
    
    String number;
    double loadAmt;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOAD;
    private javax.swing.JTextField cellphoneLoad;
    private javax.swing.JTextField cellphoneNumber;
    // End of variables declaration//GEN-END:variables
}
