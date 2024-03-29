
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nghiacubu
 */
public class Restore extends javax.swing.JFrame {
    int index = 0;
    DefaultTableModel dtmNcl, dtmNvien, dtmBenh;
    long millis=System.currentTimeMillis();   
    java.sql.Date date=new java.sql.Date(millis);
    String time = String.valueOf(date) ;
    /**
     * Creates new form Restore
     */
    public Restore() {
        initComponents();
        fillTblRestore();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestoreNcl = new javax.swing.JTable();
        btnRestoreAllNcl = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRestoreBenh = new javax.swing.JTable();
        btnRestoreAllBenh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRestoreNvien = new javax.swing.JTable();
        btnRestoreAllNvien = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(71, 120, 190));

        jTabbedPane1.setBackground(new java.awt.Color(153, 204, 255));
        jTabbedPane1.setVerifyInputWhenFocusTarget(false);

        tblRestoreNcl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tblRestoreNcl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã người cách ly", "Ngày chỉnh sửa", "Người chỉnh sửa"
            }
        ));
        tblRestoreNcl.setRowHeight(30);
        tblRestoreNcl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRestoreNclMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRestoreNcl);

        btnRestoreAllNcl.setText("Restore All");
        btnRestoreAllNcl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRestoreAllNclMouseClicked(evt);
            }
        });
        btnRestoreAllNcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestoreAllNclActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRestoreAllNcl)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRestoreAllNcl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Người cách ly", jPanel1);

        tblRestoreBenh.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tblRestoreBenh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã người cách ly", "Ngày khám", "Ngày chỉnh sửa", "Người chỉnh sửa"
            }
        ));
        tblRestoreBenh.setRowHeight(30);
        tblRestoreBenh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRestoreBenhMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRestoreBenh);

        btnRestoreAllBenh.setText("Restore All");
        btnRestoreAllBenh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRestoreAllBenhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRestoreAllBenh))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRestoreAllBenh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Bệnh", jPanel2);

        tblRestoreNvien.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tblRestoreNvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã nhân viên", "Ngày chỉnh sửa"
            }
        ));
        tblRestoreNvien.setRowHeight(30);
        tblRestoreNvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRestoreNvienMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblRestoreNvien);

        btnRestoreAllNvien.setText("Restore All");
        btnRestoreAllNvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRestoreAllNvienMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRestoreAllNvien)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRestoreAllNvien, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Nhân viên", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblRestoreNclMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRestoreNclMouseClicked
        // TODO add your handling code here:
        index = tblRestoreNcl.getSelectedRow();
        int ret = JOptionPane.showConfirmDialog(this, "Do you want to restore?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (ret != JOptionPane.YES_OPTION) {
            return;
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(main.url, main.user, main.pass);
            String sql = "update nguoicachli set hide = 0, daychanges = ?, userChanges = ? where MaCachLi = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(3, (String) tblRestoreNcl.getModel().getValueAt(index, 0));
            st.setString(1, time);
            st.setString(2, "admin");
            st.execute();
            JOptionPane.showMessageDialog(this, "Restore thành công");
            con.close();
            fillTblRestore();
            index = 0;
        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(this, "Restore thất bại");
        }
    }//GEN-LAST:event_tblRestoreNclMouseClicked

    private void tblRestoreBenhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRestoreBenhMouseClicked
        // TODO add your handling code here:
        index = tblRestoreBenh.getSelectedRow();
        int ret = JOptionPane.showConfirmDialog(this, "Do you want to restore?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (ret != JOptionPane.YES_OPTION) {
            return;
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(main.url, main.user, main.pass);
            String sql = "update benh set hide = 0, daychanges = ?, userChanges = ? where MaCachLi = ? and ngay = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(3, (String) tblRestoreBenh.getModel().getValueAt(index, 0));
            st.setString(4, (String) tblRestoreBenh.getModel().getValueAt(index, 1));
            st.setString(1, time);
            st.setString(2, "admin");
            st.execute();
            JOptionPane.showMessageDialog(this, "Restore thành công");
            con.close();
            fillTblRestore();
            index = 0;
        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(this, "Restore thất bại");
        }
    }//GEN-LAST:event_tblRestoreBenhMouseClicked

    private void tblRestoreNvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRestoreNvienMouseClicked
        // TODO add your handling code here:
        index = tblRestoreNvien.getSelectedRow();
        int ret = JOptionPane.showConfirmDialog(this, "Do you want to restore?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (ret != JOptionPane.YES_OPTION) {
            return;
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(main.url, main.user, main.pass);
            String sql = "update nhanvien set hide = 0, daychanges = ? where MaUser = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(2, (String) tblRestoreNvien.getModel().getValueAt(index, 0));
            st.setString(1, time);
            st.execute();
            JOptionPane.showMessageDialog(this, "Restore thành công");
            con.close();
            fillTblRestore();
            index = 0;
        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(this, "Restore thất bại");
        }
    }//GEN-LAST:event_tblRestoreNvienMouseClicked

    private void btnRestoreAllNclMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestoreAllNclMouseClicked
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(this, "Do you want to restore all?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (ret != JOptionPane.YES_OPTION) {
            return;
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(main.url, main.user, main.pass);
            String sql = "update nguoicachli set hide = 0, daychanges = ?, userChanges = ? where hide = 1";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, time);
            st.setString(2, "admin");
            st.execute();
            JOptionPane.showMessageDialog(this, "Restore thành công");
            con.close();
            fillTblRestore();
        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(this, "Restore thất bại");
        }
    }//GEN-LAST:event_btnRestoreAllNclMouseClicked

    private void btnRestoreAllBenhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestoreAllBenhMouseClicked
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(this, "Do you want to restore all?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (ret != JOptionPane.YES_OPTION) {
            return;
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(main.url, main.user, main.pass);
            String sql = "update benh set hide = 0, daychanges = ?, userChanges = ? where hide =1";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, time);
            st.setString(2, "admin");
            st.execute();
            JOptionPane.showMessageDialog(this, "Restore thành công");
            con.close();
            fillTblRestore();
        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(this, "Restore thất bại");
        }
    }//GEN-LAST:event_btnRestoreAllBenhMouseClicked

    private void btnRestoreAllNvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestoreAllNvienMouseClicked
        // TODO add your handling code here:
       int ret = JOptionPane.showConfirmDialog(this, "Do you want to restore all?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (ret != JOptionPane.YES_OPTION) {
            return;
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(main.url, main.user, main.pass);
            String sql = "update nhanvien set hide = 0, daychanges = ?, userChanges = ? where hide =1";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, time);
            st.setString(2, "admin");
            st.execute();
            JOptionPane.showMessageDialog(this, "Restore thành công");
            con.close();
            fillTblRestore();
        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(this, "Restore thất bại");
        } 
    }//GEN-LAST:event_btnRestoreAllNvienMouseClicked

    private void btnRestoreAllNclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestoreAllNclActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRestoreAllNclActionPerformed

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
            java.util.logging.Logger.getLogger(Restore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRestoreAllBenh;
    private javax.swing.JButton btnRestoreAllNcl;
    private javax.swing.JButton btnRestoreAllNvien;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblRestoreBenh;
    private javax.swing.JTable tblRestoreNcl;
    private javax.swing.JTable tblRestoreNvien;
    // End of variables declaration//GEN-END:variables
    public void fillTblRestore(){
        dtmNcl = (DefaultTableModel) tblRestoreNcl.getModel();
        dtmBenh = (DefaultTableModel) tblRestoreBenh.getModel();
        dtmNvien = (DefaultTableModel) tblRestoreNvien.getModel();
        dtmNcl.setRowCount(0);
        dtmBenh.setRowCount(0);
        dtmNvien.setRowCount(0);
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(main.url, main.user, main.pass);
            String sql = "select * from NguoiCachLi where hide = 1";
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Vector data = new Vector();
                data.add(rs.getString("MaCachLi"));
                data.add(rs.getString("daychanges"));
                data.add(rs.getString("userchanges"));
                dtmNcl.addRow(data);
            }
            tblRestoreNcl.setModel(dtmNcl);
            dtmNcl.fireTableDataChanged();
            
            sql = "select * from benh where hide = 1";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Vector data = new Vector();
                data.add(rs.getString("MaCachLi"));
                data.add(rs.getString("Ngay"));
                data.add(rs.getString("daychanges"));
                data.add(rs.getString("userchanges"));
                dtmBenh.addRow(data);
            }
            tblRestoreBenh.setModel(dtmBenh);
            dtmBenh.fireTableDataChanged();
            
            sql = "select * from Nhanvien where hide = 1";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Vector data = new Vector();
                data.add(rs.getString("MaUser"));
                data.add(rs.getString("daychanges"));
                dtmNvien.addRow(data);
            }
            tblRestoreNvien.setModel(dtmNvien);
            dtmNvien.fireTableDataChanged();
            
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
