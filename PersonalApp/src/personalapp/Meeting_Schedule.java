
package personalapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author OLADELE
 */
public class Meeting_Schedule extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement stmt=null;
    /**
     * Creates new form Meeting_Schedule
     */
    public Meeting_Schedule() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxMeetingfor = new javax.swing.JComboBox<>();
        jComboBoxMeetingtype = new javax.swing.JComboBox<>();
        txtVenue = new javax.swing.JTextField();
        txtTopic = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        txtTime = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Meeting");
        setName("Meeting "); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 4, true));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Glia512x512.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Meeting Schedule");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 193, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Schedule for");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Meeting type");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 156, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Meeting Topic");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Meeting Venue");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jComboBoxMeetingfor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "Mysef", "Church", "Office", "Social" }));
        jComboBoxMeetingfor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 3, true));
        jPanel1.add(jComboBoxMeetingfor, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 104, 314, 28));

        jComboBoxMeetingtype.setBackground(new java.awt.Color(204, 204, 204));
        jComboBoxMeetingtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "Webex", "Conference", "Family", "Political", "TownHall" }));
        jComboBoxMeetingtype.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 3, true));
        jPanel1.add(jComboBoxMeetingtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 150, 314, 28));

        txtVenue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 3, true));
        jPanel1.add(txtVenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 230, 320, 29));

        txtTopic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 3, true));
        jPanel1.add(txtTopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 190, 320, 29));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jDateChooser1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 3, true));
        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 140, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 367, -1, 29));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 367, -1, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_return_20px_1.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 367, 57, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Meeting ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, 29));

        txtid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 3, true));
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 109, 29));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 255));
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 367, -1, 29));

        txtTime.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 3, true));
        jPanel1.add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 109, 29));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Time");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, 29));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 530, 420));

        setSize(new java.awt.Dimension(560, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Meeting page = new Meeting();
        page.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

private void Fillcombo(){
    try{
        String sql="select * from Meeting";
        stmt=conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        
    }
}    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        String url="jdbc:sqlserver://DESKTOP-6OBGKP2; databaseName=PersonalAssistant";
        String username="sa";
        String password="JUdahenoch15";
        
        String query="INSERT into meeting values(?,?,?,?,?,?,?)";
        
      conn=DriverManager.getConnection(url,username,password);
      stmt=conn.prepareStatement(query);
      stmt.setString(1,txtid.getText());
      stmt.setString(2,jComboBoxMeetingfor.getSelectedItem().toString());
      stmt.setString(3,jComboBoxMeetingtype.getSelectedItem().toString());
      stmt.setString(4,txtTopic.getText());
      stmt.setString(5,txtVenue.getText());
      stmt.setString(6,((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());
      stmt.setString(7,txtTime.getText());
           
      stmt.executeUpdate();
      JOptionPane.showMessageDialog(null, "Meeting Scheduled is Successfull", "Information", JOptionPane.INFORMATION_MESSAGE);
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
       
        String Id = txtid.getText();
        String Topic = txtTopic.getText();
        String Venue = txtVenue.getText();
        String Time = txtTime.getText();
        
        
        if(Topic.equals("")){
            JOptionPane.showMessageDialog(null,"Id must not be Empty");
        }
        if(Topic.equals("")){
            JOptionPane.showMessageDialog(null,"Topic must not be Empty");
        }
        if(Venue.equals("")){
            JOptionPane.showMessageDialog(null,"Venue can not be Empty");
        }
        if(Time.equals("")){
            JOptionPane.showMessageDialog(null,"Time can not be Empty");
              }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
      String date = sdf.format(jDateChooser1.getDate());
    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        txtid.setText(null);
        txtTopic.setText(null);
        txtVenue.setText(null);
        txtTime.setText(null);
        jDateChooser1.setDate(null);
        
       
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Meeting_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Meeting_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Meeting_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Meeting_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Meeting_Schedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBoxMeetingfor;
    private javax.swing.JComboBox<String> jComboBoxMeetingtype;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtTopic;
    private javax.swing.JTextField txtVenue;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
