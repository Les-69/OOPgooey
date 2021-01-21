
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;


public class sendMoneyReceipt extends javax.swing.JFrame {
    
    ArrayList<accounts> IDs;
    accounts newUser;
    String sentName;
    String sentID;
    double getAmt;
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    String dateYeeYee = now.format(dtf);
    
    public sendMoneyReceipt(ArrayList<accounts> IDs, accounts newUser, String sentName, String sentID, double getAmt) {
        initComponents();
        this.IDs = IDs;
        this.newUser = newUser;
        this.sentName = sentName;
        this.sentID = sentID;
        this.getAmt = getAmt;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recipientName = new javax.swing.JTextField();
        recipientID = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        showReceipt = new javax.swing.JButton();
        receiptClose = new javax.swing.JButton();
        dateAndTime = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receipt");

        recipientName.setEditable(false);

        recipientID.setEditable(false);

        amount.setEditable(false);

        showReceipt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        showReceipt.setText("Show Reciept");
        showReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showReceiptActionPerformed(evt);
            }
        });

        receiptClose.setText("Close");
        receiptClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptCloseActionPerformed(evt);
            }
        });

        dateAndTime.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(amount, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                            .addComponent(recipientName)
                            .addComponent(recipientID)
                            .addComponent(dateAndTime)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(receiptClose))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(showReceipt)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(dateAndTime, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(recipientName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(recipientID, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(showReceipt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(receiptClose)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showReceiptActionPerformed
        dateAndTime.setText("Date of Transaction: " +dateYeeYee);
        recipientName.setText("Recipient Name: " +sentName);
        recipientID.setText("Recipient ID: " +sentID);
        amount.setText("Amount Sent: " +getAmt);
    }//GEN-LAST:event_showReceiptActionPerformed

    private void receiptCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptCloseActionPerformed
        showMessageDialog(this, "Thank You for Banking", "Thank You for Banking With Us", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_receiptCloseActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JTextField dateAndTime;
    private javax.swing.JButton receiptClose;
    private javax.swing.JTextField recipientID;
    private javax.swing.JTextField recipientName;
    private javax.swing.JButton showReceipt;
    // End of variables declaration//GEN-END:variables
}
