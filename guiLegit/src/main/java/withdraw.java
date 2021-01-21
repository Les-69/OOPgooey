
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;


public class withdraw extends javax.swing.JFrame {
    ArrayList<accounts> IDs;
    accounts newUser;
    
    public withdraw(ArrayList<accounts> IDs, accounts newUser) {
        initComponents();
        this.IDs = IDs;
        this.newUser = newUser;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        withdrawText = new javax.swing.JTextField();
        justSomeLabel = new javax.swing.JLabel();
        legitWithdraw = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Withdraw");

        justSomeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        justSomeLabel.setText("Please Enter Amount to Withdraw");

        legitWithdraw.setText("Withdraw dat money");
        legitWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legitWithdrawActionPerformed(evt);
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
                        .addComponent(withdrawText, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(justSomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(legitWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(justSomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(withdrawText, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(legitWithdraw)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void legitWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legitWithdrawActionPerformed
        String minusMoney = withdrawText.getText();
        double minusMoneyDoub=Double.parseDouble(minusMoney);
        newUser.bal = newUser.bal - minusMoneyDoub;
        showMessageDialog(this, "Thank You for Banking", "Transaction Finished", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_legitWithdrawActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel justSomeLabel;
    private javax.swing.JToggleButton legitWithdraw;
    private javax.swing.JTextField withdrawText;
    // End of variables declaration//GEN-END:variables
}
