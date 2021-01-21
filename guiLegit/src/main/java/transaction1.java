
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;


public class transaction1 extends javax.swing.JFrame {
    
    ArrayList<accounts> IDs;
    accounts newUser;
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    String dateYeeYee = now.format(dtf);
    
    public transaction1(ArrayList<accounts> IDs, accounts newUser) {
        initComponents();
        this.IDs = IDs;
        this.newUser = newUser;
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        balanceText = new javax.swing.JTextField();
        printRec = new javax.swing.JTextField();
        printReceipt = new javax.swing.JButton();
        noReceipt = new javax.swing.JButton();
        displayBal = new javax.swing.JButton();
        dateAndTime = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receipt");

        balanceText.setEditable(false);
        balanceText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        printRec.setEditable(false);
        printRec.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        printRec.setText("         Print Receipt?");

        printReceipt.setText("YES");
        printReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printReceiptActionPerformed(evt);
            }
        });

        noReceipt.setText("NO");
        noReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noReceiptActionPerformed(evt);
            }
        });

        displayBal.setText("Press to Display Balance");
        displayBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBalActionPerformed(evt);
            }
        });

        dateAndTime.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(displayBal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(printRec, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(printReceipt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noReceipt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(balanceText, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                    .addComponent(dateAndTime))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(dateAndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(balanceText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayBal)
                .addGap(70, 70, 70)
                .addComponent(printRec, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printReceipt)
                    .addComponent(noReceipt))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBalActionPerformed
        dateAndTime.setText("Date of Transaction: " +dateYeeYee);
        balanceText.setText("Your current balance is: " + newUser.bal);
    }//GEN-LAST:event_displayBalActionPerformed

    private void noReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noReceiptActionPerformed
        showMessageDialog(this, "Thank You for Banking", "Transaction Finished", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_noReceiptActionPerformed

    private void printReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printReceiptActionPerformed
        receipt resibo = new receipt(IDs, newUser);
        resibo.setVisible(true);
    }//GEN-LAST:event_printReceiptActionPerformed
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField balanceText;
    private javax.swing.JTextField dateAndTime;
    private javax.swing.JButton displayBal;
    private javax.swing.JButton noReceipt;
    private javax.swing.JTextField printRec;
    private javax.swing.JButton printReceipt;
    // End of variables declaration//GEN-END:variables
}
