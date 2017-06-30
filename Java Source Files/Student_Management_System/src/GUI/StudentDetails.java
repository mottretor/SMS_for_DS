/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Point;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pasindu
 */
public class StudentDetails extends javax.swing.JFrame {

    String head[] = new String[50];
    String rd;
    private static Point point = new Point();

    public StudentDetails() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage("Reports/logo.png"));







    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cb_class = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/close_box_red.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 30, 30));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/window_2.png"))); // NOI18N
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 30, 30));

        jButton10.setBackground(new java.awt.Color(102, 102, 102));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/minimize_box_blue.png"))); // NOI18N
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.setBorderPainted(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, 30, 30));

        jLabel37.setFont(new java.awt.Font("Segoe Print", 1, 21)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 51));
        jLabel37.setText("Student Information System");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 450, -1));

        jLabel38.setFont(new java.awt.Font("Old English Text MT", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 0));
        jLabel38.setText("D.S. Senanayake College  - Science Section");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 300, 20));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/logo.png"))); // NOI18N
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 60));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cb_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_classActionPerformed(evt);
            }
        });
        jPanel1.add(cb_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1080, 10));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Student Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jButton4.setText("Discard");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 610, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Grade");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12", "13", "14" }));
        jComboBox2.setSelectedIndex(-1);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 610, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setText("Class");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        table.setAutoCreateRowSorter(true);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reg.No", "Admission No", "Name", "Birth Day", "Address", "Contact No"
            }
        ));
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getColumn(2).setMinWidth(200);
        table.getColumnModel().getColumn(2).setPreferredWidth(200);
        table.getColumnModel().getColumn(4).setMinWidth(350);
        table.getColumnModel().getColumn(4).setPreferredWidth(350);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 970, 410));

        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 100, 30));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel30.setText("© 2012  Cape Weaver Solutions. All rights reserved.");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Backgrond.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 640));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 60, 1120, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1130, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setnull();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        try {
            Vector v = new Vector();
            ResultSet rs = DataBase.executequary1("class", "grade", (String) jComboBox2.getSelectedItem());
            while (rs.next()) {
                v.add(rs.getString("class"));
            }
            cb_class.setModel(new DefaultComboBoxModel(v));
            cb_class.setSelectedIndex(-1);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void cb_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_classActionPerformed
        try {
            DefaultTableModel tb = (DefaultTableModel) table.getModel();
           tb.setRowCount(0);
            ResultSet rs = DataBase.executequary1("student", "class", String.valueOf(cb_class.getSelectedItem()));
            while (rs.next()) {
                 Vector v = new Vector();
                v.add(rs.getString("regno"));
                v.add(rs.getString("admissionno"));
                v.add(rs.getString("namewithinitials"));
                v.add(rs.getString("birthday"));
                v.add(rs.getString("address"));
                ResultSet rs1 = DataBase.executequary1("father", "admissionno", rs.getString("admissionno"));
                while (rs1.next()) {
                    v.add(rs1.getString("contactno"));
                }
                tb.addRow(v);
                
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cb_classActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Object[] options = {"Yes", "No"};
        int n = JOptionPane.showOptionDialog(new JFrame(), "Are you sure?", "Student Information System ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (n == JOptionPane.OK_OPTION) { // Afirmative
            Login.mainFrame.setVisible(true);
            setnull();
            dispose();
            System.out.println("ok");
        }
        if (n == JOptionPane.NO_OPTION) { // negative
            System.out.println("no");
        }
        if (n == JOptionPane.CLOSED_OPTION) { // closed the dialog
            System.out.println("close");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Object[] options = {"Yes", "No"};
        int n = JOptionPane.showOptionDialog(new JFrame(), "Are you sure?", "Student Information System ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (n == JOptionPane.OK_OPTION) { // Afirmative
            Login.mainFrame.setVisible(true);
            setnull();
            dispose();
            System.out.println("ok");
        }
        if (n == JOptionPane.NO_OPTION) { // negative
            System.out.println("no");
        }
        if (n == JOptionPane.CLOSED_OPTION) { // closed the dialog
            System.out.println("close");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        setState(ICONIFIED);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        point.x = evt.getX();
        point.y = evt.getY();
        // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point p = getLocation();
        setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);// TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String message = "";
        JFrame frame = new JFrame();
        Object result = JOptionPane.showInputDialog(frame, "Enter Title");
        message = (String) result;

        try {
            MessageFormat header = new MessageFormat(message);
            table.print(JTable.PrintMode.FIT_WIDTH, header, null);

        } catch (Exception e) {
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new StudentDetails().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_class;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
    public void setnull(){
        jComboBox2.setSelectedIndex(-1);
        cb_class.setSelectedIndex(-1);
        DefaultTableModel tb = (DefaultTableModel) table.getModel();
        tb.setRowCount(0);
    }
}
