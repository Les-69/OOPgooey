
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class loadResibo extends javax.swing.JFrame {
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    String dateYeeYee = now.format(dtf);
    
    ArrayList<accounts> IDs;
    accounts newUser;
    String number;
    double loadAmt;
    
    public loadResibo(ArrayList<accounts> IDs, accounts newUser, String number, double loadAmt) {
        initComponents();
        this.IDs = IDs;
        this.newUser = newUser;
        this.number = number;
        this.loadAmt = loadAmt;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numberField = new javax.swing.JTextField();
        loadField = new javax.swing.JTextField();
        receiptShow = new javax.swing.JButton();
        dateAndTime = new javax.swing.JTextField();
        receiptClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receipt");

        numberField.setEditable(false);

        loadField.setEditable(false);

        receiptShow.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        receiptShow.setText("SHOW RECEIPT");
        receiptShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptShowActionPerformed(evt);
            }
        });

        dateAndTime.setEditable(false);

        receiptClose.setText("Close");
        receiptClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(receiptShow))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(receiptClose))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loadField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(dateAndTime, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(dateAndTime, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loadField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(receiptShow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(receiptClose)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void receiptShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptShowActionPerformed
        dateAndTime.setText("Date of Transaction: " +dateYeeYee);
        loadField.setText("Load sent to number: " +number);
        numberField.setText("Amount Sent: " +loadAmt);
        
        
    }//GEN-LAST:event_receiptShowActionPerformed

    private void receiptCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_receiptCloseActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateAndTime;
    private javax.swing.JTextField loadField;
    private javax.swing.JTextField numberField;
    private javax.swing.JButton receiptClose;
    private javax.swing.JButton receiptShow;
    // End of variables declaration//GEN-END:variables
}
