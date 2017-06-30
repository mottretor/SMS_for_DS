/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.File;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JRViewer;

/**
 *
 * @author pasindu
 */
public class Certificates extends javax.swing.JFrame {

    String head[] = new String[50];
    String rd;
    private static Point point = new Point();
    JRViewer viewer;

    public Certificates() {
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
        cb_regno = new javax.swing.JComboBox();
        txt_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cb_grade = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtpic = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_admission = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel30 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        jPanel1.add(cb_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1080, 10));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Genarate Certificates");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        cb_regno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cb_regno.setSelectedIndex(-1);
        cb_regno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_regnoActionPerformed(evt);
            }
        });
        jPanel1.add(cb_regno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 210, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Grade");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        cb_grade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12", "13", "14" }));
        cb_grade.setSelectedIndex(-1);
        cb_grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_gradeActionPerformed(evt);
            }
        });
        jPanel1.add(cb_grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel19.setText("Admission No");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, -1));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1015, 610, 90, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setText("Class");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        txtpic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtpic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 50, 90, 110));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setText("Reg. No");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        txt_admission.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_admissionKeyPressed(evt);
            }
        });
        jPanel1.add(txt_admission, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, 210, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel21.setText("Name with initials");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 940, 420));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel30.setText("© 2012  Cape Weaver Solutions. All rights reserved.");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, -1, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/diagram_v2_26.png"))); // NOI18N
        jButton1.setText("Genarate Certificate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 200, 50));

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

    private void cb_gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_gradeActionPerformed

        try {
            Vector v = new Vector();
            ResultSet rs = DataBase.executequary1("class", "grade", (String) cb_grade.getSelectedItem());
            while (rs.next()) {
                v.add(rs.getString("class"));
            }
            cb_class.setModel(new DefaultComboBoxModel(v));
            cb_class.setSelectedIndex(-1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_cb_gradeActionPerformed

    private void cb_regnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_regnoActionPerformed
        try {
            if (cb_regno.getSelectedIndex() == -1) {
            } else {

                txt_admission.setText("");
                txt_name.setText("");
                txtpic.setIcon(null);

                Blob imageBlob = null;
                Image image;
                ResultSet rs = DataBase.executequary3("student", "class", String.valueOf(cb_class.getSelectedItem()), "regno", String.valueOf(cb_regno.getSelectedItem()));
                System.out.println(String.valueOf(cb_class.getSelectedItem()));
                System.out.println(String.valueOf(cb_regno.getSelectedItem()));
                while (rs.next()) {
//                System.out.println("ela");
                    txt_admission.setText(rs.getString("admissionno"));
                    txt_name.setText(rs.getString("namewithinitials"));
                    rd = rs.getString("3subject");
                    imageBlob = rs.getBlob("photo");
                }
                ResultSet rs1 = DataBase.executequary3("student", "class", String.valueOf(cb_class.getSelectedItem()), "regno", String.valueOf(cb_regno.getSelectedItem()));
                if (rs1.next()) {
                    InputStream binaryStream = imageBlob.getBinaryStream(1, imageBlob.length());
//                System.out.println("elakiri");
                    image = ImageIO.read(binaryStream);
                    image = image.getScaledInstance(txtpic.getWidth(), txtpic.getHeight(), Image.SCALE_SMOOTH);
                    txtpic.setIcon(new ImageIcon(image));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cb_regnoActionPerformed

    private void cb_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_classActionPerformed
        try {
            String a = "";
            Vector v = new Vector();
            int x = 0;
            ResultSet rs = DataBase.executequary1("class", "class", (String) cb_class.getSelectedItem());
            while (rs.next()) {
                x = Integer.parseInt(rs.getString("students"));

            }

            for (int i = 1; i < x + 1; i++) {
                if (i<10) {
                        v.add("0"+String.valueOf(i));
                    } else {
                        v.add(i);
                    }

            }
            cb_regno.setModel(new DefaultComboBoxModel(v));
            cb_regno.setSelectedIndex(-1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_cb_classActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Object[] options = {"Yes", "No"};
        int n = JOptionPane.showOptionDialog(new JFrame(), "Are you sure?", "Student Information System ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (n == JOptionPane.OK_OPTION) { // Afirmative
            Login.mainFrame.setVisible(true);
            cb_regno.setSelectedIndex(-1);
            cb_class.setSelectedIndex(-1);
            cb_grade.setSelectedIndex(-1);
            txt_admission.setText("");
            txt_name.setText("");
            txtpic.setIcon(null);
            if (viewer != null) {
                viewer.setVisible(false);
            }
            
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
            dispose();
            cb_regno.setSelectedIndex(-1);
            cb_class.setSelectedIndex(-1);
            cb_grade.setSelectedIndex(-1);
            txt_admission.setText("");
            txt_name.setText("");
            txtpic.setIcon(null);
            if (viewer != null) {
                viewer.setVisible(false);
            }
            


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
        setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y); // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void txt_admissionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_admissionKeyPressed
        if (evt.getKeyCode() == 10) {
            try {
                ResultSet rs = DataBase.executequary1("student", "admissionno", txt_admission.getText());
                if (rs.next()) {
                    String[] a = rs.getString("class").split("_");
                    cb_grade.setSelectedItem(a[0]);
                    cb_class.setSelectedItem(rs.getString("class"));
                    cb_regno.setSelectedItem(rs.getString("regno"));
                } else {
                    Object[] options = {"Ok"};
                    JOptionPane.showOptionDialog(new JFrame(), "Admission No not exsist!", "Student Information System", JOptionPane.OK_OPTION, JOptionPane.ERROR_MESSAGE, null, options, options[0]);
                    txt_admission.setText("");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }        // TODO add your handling code here:
    }//GEN-LAST:event_txt_admissionKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            progressreport p = new progressreport();
            ResultSet rs = DataBase.executequary1("student", "admissionno", txt_admission.getText());
            Blob imageBlob = null;
            Image image = null;
            if (rs.next()) {

                
                    File ff = new File("Reports/school.png");
                    Image img = ImageIO.read(ff);
                    p.setBack(img);
                    ResultSet rs1 = DataBase.executequary1("student", "admissionno", txt_admission.getText());
                    while (rs1.next()) {
                        p.setAdmission(rs1.getString("admissionno"));
                        System.out.println("ela");
                        p.setName(rs1.getString("namewithinitials"));
                        p.setNic(rs1.getString("nic"));
                        p.setStsubject(rs1.getString("1subject"));
                        p.setNdsubject(rs1.getString("2subject"));
                        p.setRdsubject(rs1.getString("3subject"));
                        p.setBday(rs1.getString("birthday"));
                        p.setEx(rs1.getString("excuricularact"));
                        p.setSp(rs1.getString("specialnotes"));
                        imageBlob = rs1.getBlob("photo");
                        InputStream binaryStream = imageBlob.getBinaryStream(1, imageBlob.length());
                        image = ImageIO.read(binaryStream);

                    }
                    image = image.getScaledInstance(100, 140, Image.SCALE_SMOOTH);
                    p.setPropic(image);

                    ResultSet rs2 = DataBase.executequary1("12_1st_term", "admissionno", txt_admission.getText());
                    while (rs2.next()) {
                        p.setSt1(rs2.getString("1subject"));
                        p.setNd1(rs2.getString("2subject"));
                        p.setRd1(rs2.getString("3subject"));
                        p.setEn1(rs2.getString("english"));
                        p.setTot1(rs2.getString("total"));
                        p.setAvg1(rs2.getString("avg"));
                    }

                    ResultSet rs3 = DataBase.executequary1("12_2nd_term", "admissionno", txt_admission.getText());
                    while (rs3.next()) {
                        p.setSt2(rs3.getString("1subject"));
                        p.setNd2(rs3.getString("2subject"));
                        p.setRd2(rs3.getString("3subject"));
                        p.setEn2(rs3.getString("english"));
                        p.setTot2(rs3.getString("total"));
                        p.setAvg2(rs3.getString("avg"));
                    }

                    ResultSet rs4 = DataBase.executequary1("12_3rd_term", "admissionno", txt_admission.getText());
                    while (rs4.next()) {
                        p.setSt3(rs4.getString("1subject"));
                        p.setNd3(rs4.getString("2subject"));
                        p.setRd3(rs4.getString("3subject"));
                        p.setEn3(rs4.getString("english"));
                        p.setTot3(rs4.getString("total"));
                        p.setAvg3(rs4.getString("avg"));
                    }

                    ResultSet rs32 = DataBase.executequary1("13_1st_term", "admissionno", txt_admission.getText());
                    while (rs32.next()) {
                        p.setSt4(rs32.getString("1subject"));
                        p.setNd4(rs32.getString("2subject"));
                        p.setRd4(rs32.getString("3subject"));
                        p.setEn4(rs32.getString("english"));
                        p.setTot4(rs32.getString("total"));
                        p.setAvg4(rs32.getString("avg"));
                    }

                    ResultSet rs33 = DataBase.executequary1("13_2nd_term", "admissionno", txt_admission.getText());
                    while (rs33.next()) {
                        p.setSt5(rs33.getString("1subject"));
                        p.setNd5(rs33.getString("2subject"));
                        p.setRd5(rs33.getString("3subject"));
                        p.setEn5(rs33.getString("english"));
                        p.setTot5(rs33.getString("total"));
                        p.setAvg5(rs33.getString("avg"));
                    }

                    ResultSet rs34 = DataBase.executequary1("13_3rd_term", "admissionno", txt_admission.getText());
                    while (rs34.next()) {
                        p.setSt6(rs34.getString("1subject"));
                        p.setNd6(rs34.getString("2subject"));
                        p.setRd6(rs34.getString("3subject"));
                        p.setEn6(rs34.getString("english"));
                        p.setTot6(rs34.getString("total"));
                        p.setAvg6(rs34.getString("avg"));
                    }
                    p.setDate(String.format("%1$tY-%1$tm-%1$td", new Date()));

                    Collection reportRow = new ArrayList();
                    reportRow.add(p);



                    JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(reportRow);
                    String reportSource = "Reports/progress.jrxml";
                    Map<String, Object> params = new HashMap<String, Object>();
                    JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
                    JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, datasource);

                    viewer = new JRViewer(jasperPrint);
                    viewer.setOpaque(true);
                    viewer.setVisible(true);
                    jScrollPane1.add(viewer);
                    jScrollPane1.setViewportView(viewer);
                    pack();



                
            } else {
                Object[] options = {"Ok"};
                JOptionPane.showOptionDialog(new JFrame(), "Can't Identify Student", "Student Information System", JOptionPane.OK_OPTION, JOptionPane.ERROR_MESSAGE, null, options, options[0]);
                
            }        // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(Certificates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Certificates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Certificates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Certificates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Certificates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Certificates().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_class;
    private javax.swing.JComboBox cb_grade;
    private javax.swing.JComboBox cb_regno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txt_admission;
    private javax.swing.JTextField txt_name;
    private javax.swing.JLabel txtpic;
    // End of variables declaration//GEN-END:variables
}
