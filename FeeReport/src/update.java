
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Athidhi Group
 */
public class update extends javax.swing.JFrame {
    String t,m,id;
    Connection  con ;
    Statement  stmt ;
    ResultSet  rs;
    int advance1,balance,pay,fees,teen,x;

    /**
     * Creates new form update
     */
    public update() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Student-ID");

        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("amount");

        jButton2.setText("pay");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(97, 97, 97)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51)
                            .addComponent(jTextField2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton2)))
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try
{  
   
 Class.forName("com.mysql.jdbc.Driver");
 con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/feereport","san","san");
  stmt=con.createStatement();  
  
id = jTextField1.getText();
rs=stmt.executeQuery("SELECT * FROM  defaulters WHERE ID = '"+id+"'");

if (!rs.next()) 
    JOptionPane.showMessageDialog(this,"Student  Not Found !!");
else 
{
    t = rs.getString(2);
   fees =Integer.parseInt(rs.getString(5)); 
   advance1=rs.getInt(6); 
   balance=rs.getInt(7);       
   
   m=rs.getString(7);
   jTextField2.setText(m+"");
    
  JOptionPane.showMessageDialog(this,"the student is "+t+" and pending amount is "+m);
    
    
    
   
    
    
}
 
con.close();  
}       catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 try
{  
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/feereport","san","san");
stmt=con.createStatement();  
pay=Integer.parseInt(jTextField2.getText());
advance1=advance1+pay;
balance = balance-pay;
  

if ( balance==0)
{
    teen = stmt.executeUpdate("DELETE FROM  defaulters WHERE ID = '"+id+"'");
   ResultSet  tr;
                int dr = 0 ;
                tr=stmt.executeQuery("SELECT * FROM  accounts");
                if (!tr.next())
                    JOptionPane.showMessageDialog(this,"ERROR !!");
                else
                {
                    do
                    {
                        dr = tr.getInt(1);
                    } while (tr.next());
                }
                dr = pay + dr;
                int p = stmt.executeUpdate("UPDATE accounts SET amount='"+dr+"'");
    
}
else 
{

          x= stmt.executeUpdate("UPDATE defaulters SET advance='"+advance1+"' WHERE ID = '"+id+"' ");
   stmt.executeUpdate("UPDATE defaulters SET balance='"+balance+"' WHERE ID = '"+id+"' ");
    ResultSet  tr;
                int dr = 0 ;
                tr=stmt.executeQuery("SELECT * FROM  accounts");
                if (!tr.next())
                    JOptionPane.showMessageDialog(this,"ERROR !!");
                else
                {
                    do
                    {
                        dr = tr.getInt(1);
                    } while (tr.next());
                }
                dr = pay + dr;
                int p = stmt.executeUpdate("UPDATE accounts SET amount='"+dr+"'");
    
   
   
}
if(0!=teen)
    
    JOptionPane.showMessageDialog(this,"student Successfully paid full amount");
if (x==1)
    JOptionPane.showMessageDialog(this,"student Successfully paid partial amount");

con.close();
 home l = new home();
        l.setVisible(true);
        dispose(); 
}
catch(  HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e)
{ System.out.println(e);}   
    
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 home l = new home();
        l.setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

   
     
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new update().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private int toString(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
