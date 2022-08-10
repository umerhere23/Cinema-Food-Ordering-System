/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cinema.food.ordering;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class OrderList extends javax.swing.JFrame {
 public static int c=0;
    /**
     * Creates new form Cart
     */
    public OrderList() {
        
        initComponents();
         this.setLocationRelativeTo(null);
       
           String filePath ="C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Cinema Food Ordering\\src\\cinema\\food\\ordering\\Confectinery.txt" ; // TODO add your handling code here:
       String filePaths ="C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Cinema Food Ordering\\src\\cinema\\food\\ordering\\Drinks.txt" ;
           String filePaths1 ="C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Cinema Food Ordering\\src\\cinema\\food\\ordering\\Snacks.txt" ; // TODO add your handling code here:
       
       File file= new File(filePath);
           File files= new File(filePaths);
            File files1= new File(filePaths1);
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            BufferedReader br1 = new BufferedReader(new FileReader(files));
            BufferedReader br2 = new BufferedReader(new FileReader(files1));
        
             String firstLine= br.readLine().trim();
            
             String[] columName= firstLine.split("      ,    ");
             DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
             model.setColumnIdentifiers(columName);
           Object[]tableLines=br.lines().toArray();
//            String firstLine1= br1.readLine().trim();
           Object[]tableLines1=br1.lines().toArray();
             Object[]tableLines2=br2.lines().toArray();
           for(int i=0;i<tableLines.length;i++){
               
             String line= tableLines[i].toString().trim();
             String[] dataRow= line.split("/");
                              

              if(tableLines[i].equals("Toffee Popcorn        0.0")){
               String array=(String) tableLines[i]; 
                tableLines[i]=""; 
               


            }
             
              else if(tableLines[i].equals("Candy Floss           0.0")){
                                 tableLines[i]="";  

             }
             else{   
                  model.addRow(dataRow);
               
             }
           }
            for(int i=0;i<tableLines1.length;i++){
             String line= tableLines1[i].toString().trim();
             String[] dataRow= line.split("/");
           if(tableLines1[i].equals("softdrink Regular    0.0")){
                                 tableLines1[i]="";  

             }
                    else        if(tableLines1[i].equals("SoftDrink Junoir     0.0")){
                
                tableLines1[i]="";  
            }
             
                    else if(tableLines1[i].equals("Water 750 ml         0.0")){
                      tableLines1[i]="";  
                    }
                    
                    else if(tableLines1[i].equals("Hotdrink Large       0.0")){
                      tableLines1[i]="";  
                    }
                     else if(tableLines1[i].equals("HotDrink Regular     0.0")){
                      tableLines1[i]="";  
                    }
             else{
                  model.addRow(dataRow);
                  
             }
           }
            
//                    JOptionPane.showMessageDialog(this,tableLines1[5]);

             for(int i=0;i<tableLines2.length;i++){
             String line= tableLines2[i].toString().trim();
             String[] dataRow= line.split("/");
             if(tableLines2[i].equals("Popcorn Larger      0.0")){
                                   tableLines2[i]=""; 
                              }
             else if(tableLines2[i].equals("Popcorn Regular    0.0")){
                      tableLines2[i]="";  
                    }
              else if(tableLines2[i].equals("Nachos Large        0.0")){
                      tableLines2[i]="";  
                    }
                else if(tableLines2[i].equals("Nachos Regular    0.0")){
                      tableLines2[i]="";  
                    }
                  else if(tableLines2[i].equals("Hotdog Large        0.0")){
                      tableLines2[i]="";  
                    }
                   else if(tableLines2[i].equals("Hotdog Regular     0.0")){
                      tableLines2[i]="";  
                    } else if(tableLines2[i].equals("Kids Combo           0.0")){
                      tableLines2[i]="";  
                    }
                   
             else{
                  model.addRow(dataRow);
                  
             }
             
           }
        } catch (Exception ex) {
            Logger.getLogger(OrderList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
//         String filePaths ="C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Cinema Food Ordering\\src\\cinema\\food\\ordering\\Drinks.txt" ; // TODO add your handling code here:
//        File files= new File(filePaths);
//        try{
//            BufferedReader br = new BufferedReader(new FileReader(files));
//             String firstLine= br.readLine().trim();
//             String[] columName= firstLine.split("      ,    ");
//             DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
//             model.setColumnIdentifiers(columName);
//           Object[]tableLines=br.lines().toArray();
//           for(int i=0;i<tableLines.length;i++){
//             String line= tableLines[i].toString().trim();
//             String[] dataRow= line.split("/");
//             model.addRow(dataRow);
//           }
//        } catch (Exception ex) {
//            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        String filePaths1 ="C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Cinema Food Ordering\\src\\cinema\\food\\ordering\\Snacks.txt" ; // TODO add your handling code here:
//        File files1= new File(filePaths1);
//        try{
//            BufferedReader br = new BufferedReader(new FileReader(files1));
//             String firstLine= br.readLine().trim();
//             String[] columName= firstLine.split("      ,    ");
//             DefaultTableModel model = (DefaultTableModel)jTable3.getModel();
//             model.setColumnIdentifiers(columName);
//           Object[]tableLines=br.lines().toArray();
//           for(int i=0;i<tableLines.length;i++){
//             String line= tableLines[i].toString().trim();
//             String[] dataRow= line.split("/");
//             model.addRow(dataRow);
//           }
//        } catch (Exception ex) {
//            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 51, 255));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Order List");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(284, 284, 284))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel13))
                .addGap(40, 40, 40))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jButton1.setText("Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(427, 427, 427))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 if(c>=3){
     JOptionPane.showMessageDialog(this,"Your Order Is Placed \nYou got Discount of £3 ");

 }   
 else{
       JOptionPane.showMessageDialog(this,"Your Order Is Placed");
   
 }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Start open = new Start();
open.setVisible(true);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
jTable1.getTableHeader().setUI(null);
dtm.setRowCount(0);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(OrderList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
