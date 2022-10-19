
package personalapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Contact_Display extends javax.swing.JFrame {

Connection conn=null;
PreparedStatement stmt=null;
ResultSet rs =null;

    
    public Contact_Display() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        clear1 = new javax.swing.JButton();
        add = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtcity = new javax.swing.JTextField();
        clear2 = new javax.swing.JButton();
        searchbutton = new javax.swing.JButton();
        fname = new javax.swing.JTextField();
        txtmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        sname1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blue Moons, Inc");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Contact Display");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Glia512x512.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        jLabel3.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 13)); // NOI18N
        jLabel3.setText("Surname");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 64, 23));

        jLabel4.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 13)); // NOI18N
        jLabel4.setText("First Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, 23));

        sname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 207, 23));

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_return_20px_1.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 70, 30));

        clear.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 0, 255));
        clear.setText("Delete");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 80, 30));

        clear1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clear1.setForeground(new java.awt.Color(0, 0, 255));
        clear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_call_20px.png"))); // NOI18N
        clear1.setBorder(null);
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });
        jPanel1.add(clear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 30, -1));

        add.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        add.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 207, 50));

        jLabel9.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 13)); // NOI18N
        jLabel9.setText("Address");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 64, 23));

        txtid.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 120, 23));

        jLabel11.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 13)); // NOI18N
        jLabel11.setText("Email");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 64, 23));

        phone.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 170, 23));

        jLabel10.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 13)); // NOI18N
        jLabel10.setText("Telephone");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 80, 23));

        jLabel13.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 13)); // NOI18N
        jLabel13.setText(" ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 20, 23));

        txtcity.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 207, 23));

        clear2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        clear2.setForeground(new java.awt.Color(0, 0, 255));
        clear2.setText("Update");
        clear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear2ActionPerformed(evt);
            }
        });
        jPanel1.add(clear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 80, 30));

        searchbutton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        searchbutton.setForeground(new java.awt.Color(0, 0, 255));
        searchbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personalapp/icons8_search_23px.png"))); // NOI18N
        searchbutton.setBorder(null);
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(searchbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 35, -1));

        fname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 207, 23));

        txtmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 210, 23));

        jLabel15.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 13)); // NOI18N
        jLabel15.setText("City");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 64, 23));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 410));

        sname1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(sname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 207, 23));

        setSize(new java.awt.Dimension(402, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        try{
           Statement stmt = conn.createStatement();
           int id = Integer.parseInt(txtid.getText());
           String sql = "DELETE FROM addcontact WHERE id = '"+id+"' ";
           stmt.executeUpdate(sql);
           
           JOptionPane.showMessageDialog(null,"Data is Successfully Deleted");
            
        }catch(Exception e) {JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_clearActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Contact page = new Contact();
        page.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_backActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clear1ActionPerformed

    private void clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2ActionPerformed
        try{
            Statement stmt = conn.createStatement();
            int id = Integer.parseInt(txtid.getText());
            
            String surname = sname.getText();
            String firstname = fname.getText();
            String address = add.getText();
            String email = txtmail.getText();
            String telephone = phone.getText();
            String city = txtcity.getText();
            
            String sql = "UPDATE addcontact SET surname = '" + surname +"', firstname = '" + firstname +"', address = '" + address +"', email = '" + email +"', telephone ='" + telephone +"',city ='" + city +"' WHERE id = '"+id+"'";
            
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Data is Successfully Updated");
          
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_clear2ActionPerformed

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
       try {
        String url="jdbc:sqlserver://DESKTOP-6OBGKP2; databaseName=PersonalAssistant";
        String username="sa";
        String password="JUdahenoch15";
                
        conn=DriverManager.getConnection(url,username,password);
        Statement stmt = conn.createStatement();
                    
                    int id = Integer.parseInt(txtid.getText());
                    String sql = "SELECT * FROM addcontact WHERE id = '"+id+"' ";
                    
                    rs = stmt.executeQuery(sql);
                    if(rs.next()){
                    
                    sname.setText(rs.getString("surname"));
                    fname.setText(rs.getString("firstname"));
                    add.setText(rs.getString("address"));
                    txtmail.setText(rs.getString("email"));
                    phone.setText(rs.getString("telephone"));
                    txtcity.setText(rs.getString("city"));
                    
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Record Not Found");
                    }
                   
            }catch (SQLException e){JOptionPane.showMessageDialog(null, e);
       }
               
    
    }//GEN-LAST:event_searchbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Contact_Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contact_Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contact_Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contact_Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contact_Display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.JButton back;
    private javax.swing.JButton clear;
    private javax.swing.JButton clear1;
    private javax.swing.JButton clear2;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField phone;
    private javax.swing.JButton searchbutton;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField sname1;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmail;
    // End of variables declaration//GEN-END:variables
}
