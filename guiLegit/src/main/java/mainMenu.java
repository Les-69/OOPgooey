import java.util.ArrayList;

public class mainMenu extends javax.swing.JFrame {
    ArrayList<accounts> IDs;
    accounts newUser;
    
    
    public mainMenu(ArrayList<accounts> IDs, accounts newUser) {
        initComponents();
        this.IDs = IDs;
        this.newUser = newUser;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        checkBal = new javax.swing.JButton();
        withdraw = new javax.swing.JButton();
        fundTrans = new javax.swing.JButton();
        phoneLoad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextPane1.setText("Please select your transaction");
        jScrollPane1.setViewportView(jTextPane1);

        checkBal.setText("Check Balance");
        checkBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBalActionPerformed(evt);
            }
        });

        withdraw.setText("Withdraw");
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });

        fundTrans.setText("Fund Transfer");
        fundTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundTransActionPerformed(evt);
            }
        });

        phoneLoad.setText("Cellphone Load");
        phoneLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneLoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(checkBal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(withdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneLoad)
                    .addComponent(fundTrans))
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {checkBal, fundTrans, phoneLoad, withdraw});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkBal, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(fundTrans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phoneLoad, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(withdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBalActionPerformed
        transaction1 checkbalance = new transaction1(IDs, newUser);    
        checkbalance.setVisible(true);
    }//GEN-LAST:event_checkBalActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        withdraw getMoney = new withdraw(IDs, newUser);
        getMoney.setVisible(true);
    }//GEN-LAST:event_withdrawActionPerformed

    private void fundTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundTransActionPerformed
        fundTransfer sendMoney = new fundTransfer(IDs, newUser);
        sendMoney.setVisible(true);
    }//GEN-LAST:event_fundTransActionPerformed

    private void phoneLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneLoadActionPerformed
        load loader = new load(IDs, newUser);
        loader.setVisible(true);
    }//GEN-LAST:event_phoneLoadActionPerformed
    
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkBal;
    private javax.swing.JButton fundTrans;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton phoneLoad;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables
}
