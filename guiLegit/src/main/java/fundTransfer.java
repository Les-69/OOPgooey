
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;


public class fundTransfer extends javax.swing.JFrame {
    ArrayList<accounts> IDs;
    accounts newUser;

    public fundTransfer(ArrayList<accounts> IDs, accounts newUser) {
        initComponents();
        this.IDs = IDs;
        this.newUser = newUser;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        recipientName = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        recipientID = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        amount = new javax.swing.JTextArea();
        SENDO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fund Transfer");

        recipientName.setColumns(20);
        recipientName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        recipientName.setRows(1);
        recipientName.setText("Enter Recipient's Name");
        recipientName.setToolTipText("");
        recipientName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        recipientName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recipientNameMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(recipientName);

        recipientID.setColumns(20);
        recipientID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        recipientID.setRows(1);
        recipientID.setText("Enter Recipient's 4-Digit ID");
        recipientID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recipientIDMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(recipientID);

        amount.setColumns(20);
        amount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        amount.setRows(1);
        amount.setText("Enter Amount to be Transfer");
        amount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amountMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(amount);

        SENDO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SENDO.setText("Send");
        SENDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SENDOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(SENDO)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(SENDO)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SENDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SENDOActionPerformed
        sentName = recipientName.getText();
        sentID = recipientID.getText();
        try{
           getAmt = Double.parseDouble(recipientName.getText());
        }
        catch(Exception e){}
        
        newUser.bal = newUser.bal - getAmt;
        showMessageDialog(this, "Thank You for Banking", "Now Showing Reciept", JOptionPane.INFORMATION_MESSAGE);
        sendMoneyReceipt resiboPadala = new sendMoneyReceipt(IDs, newUser, sentName, sentID, getAmt);
        resiboPadala.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SENDOActionPerformed

    private void recipientNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recipientNameMouseClicked
        recipientName.setText("");
    }//GEN-LAST:event_recipientNameMouseClicked

    private void recipientIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recipientIDMouseClicked
        recipientID.setText("");
    }//GEN-LAST:event_recipientIDMouseClicked

    private void amountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amountMouseClicked
        recipientName.setText("");
    }//GEN-LAST:event_amountMouseClicked

    String sentName;
    String sentID;
    double getAmt = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SENDO;
    private javax.swing.JTextArea amount;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea recipientID;
    private javax.swing.JTextArea recipientName;
    // End of variables declaration//GEN-END:variables
}
