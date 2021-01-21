
import java.util.*;
import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class guiIDMenu extends javax.swing.JFrame {

    public static ArrayList<accounts> IDs = new ArrayList();

       
       accounts Ram_Butan = new accounts("Ram Butan", 123456, "9162");
       accounts Chi_Charon = new accounts("Chi Charon", 100000, "5779");
       accounts Deo_Dorant = new accounts("Deo Dorant", 999999, "1300");
       accounts newUser = new accounts("", 0, "");

       
    
   
    public guiIDMenu() {
       initComponents();
       IDs.add(Ram_Butan);
       IDs.add(Chi_Charon);
       IDs.add(Deo_Dorant);
       IDs.add(newUser);

    }
    
        
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        idArea = new javax.swing.JTextArea();
        proceedButton = new javax.swing.JButton();
        pass1 = new javax.swing.JPasswordField();
        RESETBUTTON = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        HeeHee = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BANK PROJECT");

        idArea.setEditable(false);
        idArea.setColumns(1);
        idArea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idArea.setRows(1);
        idArea.setText(" Please enter your account ID");
        idArea.setToolTipText("Nice");
        idArea.setWrapStyleWord(true);
        idArea.setAutoscrolls(false);
        idArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        idArea.setName("Hello"); // NOI18N
        jScrollPane1.setViewportView(idArea);

        proceedButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        proceedButton.setText("PROCEED");
        proceedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedButtonActionPerformed(evt);
            }
        });

        RESETBUTTON.setText("RESET");
        RESETBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETBUTTONActionPerformed(evt);
            }
        });

        HeeHee.setEditable(false);
        HeeHee.setColumns(20);
        HeeHee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        HeeHee.setRows(3);
        HeeHee.setText("  THIS IS A SUBSTITUTE FOR ATM CARDS\n              #SOCIALDISTANCING");
        jScrollPane2.setViewportView(HeeHee);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(proceedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(RESETBUTTON))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(proceedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RESETBUTTON)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void proceedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedButtonActionPerformed
        
        for(accounts acc: IDs){
            if(pass1.getText().equals(acc.id)){
                newUser = acc;
                counter1 = 1;
            }
        }
        if(counter1 == 1){          
            showMessageDialog(this, "Welcome to Tromet Bank", "Welcome", JOptionPane.INFORMATION_MESSAGE);
            mainMenu MainMenu = new mainMenu(IDs, newUser);
            this.dispose();
            MainMenu.setVisible(true);
            }
            
        if(counter1 != 1){
            showMessageDialog(this, "Please enter your proper Account ID", "ERROR", JOptionPane.ERROR_MESSAGE);
            pass1.setText("");
        }
    }//GEN-LAST:event_proceedButtonActionPerformed

    private void RESETBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETBUTTONActionPerformed
        pass1.setText("");
    }//GEN-LAST:event_RESETBUTTONActionPerformed
    
    
    
    public String userID1;
    public int counter1;
    public String idFin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea HeeHee;
    private javax.swing.JButton RESETBUTTON;
    private javax.swing.JTextArea idArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JPasswordField pass1;
    private javax.swing.JButton proceedButton;
    // End of variables declaration//GEN-END:variables
}
