/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
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
public class ViewProgress extends javax.swing.JFrame {

    String head[] = new String[50];
    String rd;
    private static Point point = new Point();
    JRViewer viewer;

    public ViewProgress() {
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
        jLabel20 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cb_regno = new javax.swing.JComboBox();
        txt_name = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cb_grade = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtpic = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_admission = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        cb_report = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jPanel1.add(cb_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel20.setText("Report Type");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1080, 10));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Progress Reports");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        cb_regno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cb_regno.setSelectedIndex(-1);
        cb_regno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_regnoActionPerformed(evt);
            }
        });
        jPanel1.add(cb_regno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 210, -1));

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

        cb_grade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12", "13", "14" }));
        cb_grade.setSelectedIndex(-1);
        cb_grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_gradeActionPerformed(evt);
            }
        });
        jPanel1.add(cb_grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel19.setText("Admission No");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, -1));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 610, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setText("Class");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        txtpic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtpic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 50, 90, 110));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setText("Reg. No");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        txt_admission.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_admissionKeyPressed(evt);
            }
        });
        jPanel1.add(txt_admission, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, 210, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel21.setText("Name with initials");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));

        cb_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_reportActionPerformed(evt);
            }
        });
        jPanel1.add(cb_report, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 150, 20));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel30.setText("© 2012  Cape Weaver Solutions. All rights reserved.");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, -1, 20));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 840, 410));

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
            txt_admission.setText("");
            txt_name.setText("");
            txtpic.setIcon(null);
            Vector v = new Vector();
            Blob imageBlob = null;
            Image image;
            ResultSet rs = DataBase.executequary3("student", "class", String.valueOf(cb_class.getSelectedItem()), "regno", String.valueOf(cb_regno.getSelectedItem()));
            System.out.println(String.valueOf(cb_class.getSelectedItem()));
            System.out.println(String.valueOf(cb_regno.getSelectedItem()));
            while (rs.next()) {
                System.out.println("ela");
                txt_admission.setText(rs.getString("admissionno"));
                txt_name.setText(rs.getString("namewithinitials"));
                v.add(rs.getString("1subject") + " Report");
                v.add(rs.getString("2subject") + " Report");
                v.add(rs.getString("3subject") + " Report");
                v.add("Overroll Report");
                imageBlob = rs.getBlob("photo");
            }
            cb_report.setModel(new DefaultComboBoxModel(v));
            cb_report.setSelectedIndex(-1);

            ResultSet rs1 = DataBase.executequary3("student", "class", String.valueOf(cb_class.getSelectedItem()), "regno", String.valueOf(cb_regno.getSelectedItem()));
            if (rs1.next()) {
                InputStream binaryStream = imageBlob.getBinaryStream(1, imageBlob.length());
                System.out.println("elakiri");
                image = ImageIO.read(binaryStream);
                image = image.getScaledInstance(txtpic.getWidth(), txtpic.getHeight(), Image.SCALE_SMOOTH);
                txtpic.setIcon(new ImageIcon(image));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cb_regnoActionPerformed

    private void cb_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_classActionPerformed
        try {
            String a = "";
            Vector v = new Vector();
            Vector v1 = new Vector();
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
            setnull();
            dispose();
            System.out.println("ok");
        }
        if (n == JOptionPane.NO_OPTION) { // negative
            System.out.println("no");
        }
        if (n == JOptionPane.CLOSED_OPTION) { // closed the dialog
            System.out.println("close");
        }        // TODO add your handling code here:
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

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point p = getLocation();
        setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);// TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        point.x = evt.getX();
        point.y = evt.getY();
        // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void cb_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_reportActionPerformed
        try {
            if (cb_report.getSelectedIndex() == 0) {
                System.out.println("maths");

                graphs p = new graphs();
                p.setTitle(String.valueOf(cb_report.getSelectedItem()).replaceAll("Report", "Marks"));

                p.setCata1("1st term");
                ResultSet rs = DataBase.executequary1("12_1st_term", "admissionno", txt_admission.getText());
                while (rs.next()) {
                    if (rs.getString("1subject").equals(null)) {
                    } else {
                        p.setCata1_1(Integer.valueOf(rs.getString("1subject")));
                    }
                }

                p.setCata2("2nd term");
                ResultSet rs2 = DataBase.executequary1("12_2nd_term", "admissionno", txt_admission.getText());
                while (rs2.next()) {
                    if (rs2.getString("1subject").equals(null)) {
                    } else {
                        p.setCata2_1(Integer.valueOf(rs2.getString("1subject")));
                    }
                }

                p.setCata3("3rd term");
                ResultSet rs3 = DataBase.executequary1("12_3rd_term", "admissionno", txt_admission.getText());
                while (rs3.next()) {
                    if (rs3.getString("1subject").equals(null)) {
                    } else {
                        p.setCata3_1(Integer.valueOf(rs3.getString("1subject")));
                    }
                }

                p.setCata4("4th term");
                ResultSet rs4 = DataBase.executequary1("13_1st_term", "admissionno", txt_admission.getText());
                while (rs4.next()) {
                    if (rs4.getString("1subject").equals(null)) {
                    } else {
                        p.setCata4_1(Integer.valueOf(rs4.getString("1subject")));
                    }
                }

                p.setCata5("5th term");
                ResultSet rs5 = DataBase.executequary1("13_2nd_term", "admissionno", txt_admission.getText());
                while (rs5.next()) {
                    if (rs5.getString("1subject").equals(null)) {
                    } else {
                        p.setCata5_1(Integer.valueOf(rs5.getString("1subject")));
                    }
                }
                p.setCata6("6th term");
                ResultSet rs6 = DataBase.executequary1("13_3rd_term", "admissionno", txt_admission.getText());
                while (rs6.next()) {
                    if (rs6.getString("1subject").equals(null)) {
                    } else {
                        p.setCata6_1(Integer.valueOf(rs6.getString("1subject")));
                    }
                }
                Collection reportRow = new ArrayList();
                reportRow.add(p);



                JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(reportRow);
                String reportSource = "Reports/newpro.jrxml";
                Map<String, Object> params = new HashMap<String, Object>();
                JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, datasource);

                viewer = new JRViewer(jasperPrint);
                viewer.setOpaque(true);
                viewer.setVisible(true);

                jPanel3.add(viewer);
                jPanel3.setViewportView(viewer);
                viewer.setZoomRatio(0.75f);
                pack();

            } else if (cb_report.getSelectedIndex() == 1) {
                System.out.println("2nd");
                graphs p = new graphs();
                p.setTitle(String.valueOf(cb_report.getSelectedItem()).replaceAll("Report", "Marks"));

                p.setCata1("1st term");
                ResultSet rs = DataBase.executequary1("12_1st_term", "admissionno", txt_admission.getText());
                while (rs.next()) {
                    if (rs.getString("2subject").equals(null)) {
                    } else {
                        p.setCata1_1(Integer.valueOf(rs.getString("2subject")));
                    }
                }

                p.setCata2("2nd term");
                ResultSet rs2 = DataBase.executequary1("12_2nd_term", "admissionno", txt_admission.getText());
                while (rs2.next()) {
                    if (rs2.getString("2subject").equals(null)) {
                    } else {
                        p.setCata2_1(Integer.valueOf(rs2.getString("2subject")));
                    }
                }

                p.setCata3("3rd term");
                ResultSet rs3 = DataBase.executequary1("12_3rd_term", "admissionno", txt_admission.getText());
                while (rs3.next()) {
                    if (rs3.getString("2subject").equals(null)) {
                    } else {
                        p.setCata3_1(Integer.valueOf(rs3.getString("2subject")));
                    }
                }

                p.setCata4("4th term");
                ResultSet rs4 = DataBase.executequary1("13_1st_term", "admissionno", txt_admission.getText());
                while (rs4.next()) {
                    if (rs4.getString("2subject").equals(null)) {
                    } else {
                        p.setCata4_1(Integer.valueOf(rs4.getString("2subject")));
                    }
                }

                p.setCata5("5th term");
                ResultSet rs5 = DataBase.executequary1("13_2nd_term", "admissionno", txt_admission.getText());
                while (rs5.next()) {
                    if (rs5.getString("2subject").equals(null)) {
                    } else {
                        p.setCata5_1(Integer.valueOf(rs5.getString("2subject")));
                    }
                }
                p.setCata6("6th term");
                ResultSet rs6 = DataBase.executequary1("13_3rd_term", "admissionno", txt_admission.getText());
                while (rs6.next()) {
                    if (rs6.getString("2subject").equals(null)) {
                    } else {
                        p.setCata6_1(Integer.valueOf(rs6.getString("2subject")));
                    }
                }
                Collection reportRow = new ArrayList();
                reportRow.add(p);



                JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(reportRow);
                String reportSource = "Reports/newpro.jrxml";
                Map<String, Object> params = new HashMap<String, Object>();
                JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, datasource);

                viewer = new JRViewer(jasperPrint);
                viewer.setOpaque(true);
                viewer.setVisible(true);

                jPanel3.add(viewer);
                jPanel3.setViewportView(viewer);
                viewer.setZoomRatio(0.75f);
                pack();
                
            } else if (cb_report.getSelectedIndex() == 2) {
                System.out.println("3rd");
                graphs p = new graphs();
                p.setTitle(String.valueOf(cb_report.getSelectedItem()).replaceAll("Report", "Marks"));

                p.setCata1("1st term");
                ResultSet rs = DataBase.executequary1("12_1st_term", "admissionno", txt_admission.getText());
                while (rs.next()) {
                    if (rs.getString("3subject").equals(null)) {
                    } else {
                        p.setCata1_1(Integer.valueOf(rs.getString("3subject")));
                    }
                }

                p.setCata2("2nd term");
                ResultSet rs2 = DataBase.executequary1("12_2nd_term", "admissionno", txt_admission.getText());
                while (rs2.next()) {
                    if (rs2.getString("3subject").equals(null)) {
                    } else {
                        p.setCata2_1(Integer.valueOf(rs2.getString("3subject")));
                    }
                }

                p.setCata3("3rd term");
                ResultSet rs3 = DataBase.executequary1("12_3rd_term", "admissionno", txt_admission.getText());
                while (rs3.next()) {
                    if (rs3.getString("3subject").equals(null)) {
                    } else {
                        p.setCata3_1(Integer.valueOf(rs3.getString("3subject")));
                    }
                }

                p.setCata4("4th term");
                ResultSet rs4 = DataBase.executequary1("13_1st_term", "admissionno", txt_admission.getText());
                while (rs4.next()) {
                    if (rs4.getString("3subject").equals(null)) {
                    } else {
                        p.setCata4_1(Integer.valueOf(rs4.getString("3subject")));
                    }
                }

                p.setCata5("5th term");
                ResultSet rs5 = DataBase.executequary1("13_2nd_term", "admissionno", txt_admission.getText());
                while (rs5.next()) {
                    if (rs5.getString("3subject").equals(null)) {
                    } else {
                        p.setCata5_1(Integer.valueOf(rs5.getString("3subject")));
                    }
                }
                p.setCata6("6th term");
            ResultSet rs6 = DataBase.executequary1("13_3rd_term", "admissionno", txt_admission.getText());
                while (rs6.next()) {                    
                    if (rs6.getString("3subject").equals(null)) {
                        
                    } else {
                        p.setCata6_1(Integer.valueOf(rs6.getString("3subject")));
                    }
                }
                Collection reportRow = new ArrayList();
                reportRow.add(p);



                JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(reportRow);
                String reportSource = "Reports/newpro.jrxml";
                Map<String, Object> params = new HashMap<String, Object>();
                JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, datasource);

                viewer = new JRViewer(jasperPrint);
                viewer.setOpaque(true);
                viewer.setVisible(true);

                jPanel3.add(viewer);
                jPanel3.setViewportView(viewer);
                viewer.setZoomRatio(0.75f);
                pack();
                
            } else if (cb_report.getSelectedIndex() == 3) {
                System.out.println("4rt");
                overroll p = new overroll();
                p.setTot1(String.valueOf(cb_report.getItemAt(0)).replaceAll("Report", "Marks"));
                p.setTot2(String.valueOf(cb_report.getItemAt(1)).replaceAll("Report", "Marks"));
                p.setTot3(String.valueOf(cb_report.getItemAt(2)).replaceAll("Report", "Marks"));

                
                ResultSet rs = DataBase.executequary1("12_1st_term", "admissionno", txt_admission.getText());
                while (rs.next()) {
                    if (rs.getString("3subject").equals(null)) {
                    } else {
                        p.setCata1(Integer.valueOf(rs.getString("1subject")));
                        p.setCata1_1(Integer.valueOf(rs.getString("2subject")));
                        p.setCata1_2(Integer.valueOf(rs.getString("3subject")));
                    }
                }

                
                ResultSet rs2 = DataBase.executequary1("12_2nd_term", "admissionno", txt_admission.getText());
                while (rs2.next()) {
                    if (rs2.getString("3subject").equals(null)) {
                    } else {
                         p.setCata2(Integer.valueOf(rs2.getString("1subject")));
                        p.setCata2_1(Integer.valueOf(rs2.getString("2subject")));
                        p.setCata2_2(Integer.valueOf(rs2.getString("3subject")));
                    }
                }

                
                ResultSet rs3 = DataBase.executequary1("12_3rd_term", "admissionno", txt_admission.getText());
                while (rs3.next()) {
                    if (rs3.getString("3subject").equals(null)) {
                    } else {
                         p.setCata3(Integer.valueOf(rs3.getString("1subject")));
                        p.setCata3_1(Integer.valueOf(rs3.getString("2subject")));
                        p.setCata3_2(Integer.valueOf(rs3.getString("3subject")));
                    }
                }

                
                ResultSet rs4 = DataBase.executequary1("13_1st_term", "admissionno", txt_admission.getText());
                while (rs4.next()) {
                    if (rs4.getString("3subject").equals(null)) {
                    } else {
                         p.setCata4(Integer.valueOf(rs4.getString("1subject")));
                        p.setCata4_1(Integer.valueOf(rs4.getString("2subject")));
                        p.setCata4_2(Integer.valueOf(rs4.getString("3subject")));
                    }
                }

                
                ResultSet rs5 = DataBase.executequary1("13_2nd_term", "admissionno", txt_admission.getText());
                while (rs5.next()) {
                    if (rs5.getString("3subject").equals(null)) {
                    } else {
                         p.setCata5(Integer.valueOf(rs5.getString("1subject")));
                        p.setCata5_1(Integer.valueOf(rs5.getString("2subject")));
                        p.setCata5_2(Integer.valueOf(rs5.getString("3subject")));
                    }
                }
                
            ResultSet rs6 = DataBase.executequary1("13_3rd_term", "admissionno", txt_admission.getText());
                while (rs6.next()) {                    
                    if (rs6.getString("3subject").equals(null)) {
                        
                    } else {
                         p.setCata6(Integer.valueOf(rs6.getString("1subject")));
                        p.setCata6_1(Integer.valueOf(rs6.getString("2subject")));
                        p.setCata6_2(Integer.valueOf(rs6.getString("3subject")));
                    }
                }
                Collection reportRow = new ArrayList();
                reportRow.add(p);



                JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(reportRow);
                String reportSource = "Reports/overroll.jrxml";
                Map<String, Object> params = new HashMap<String, Object>();
                JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, datasource);

                viewer = new JRViewer(jasperPrint);
                viewer.setOpaque(true);
                viewer.setVisible(true);

                jPanel3.add(viewer);
                jPanel3.setViewportView(viewer);
                viewer.setZoomRatio(0.95f);
                pack();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_reportActionPerformed

    private void txt_admissionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_admissionKeyPressed
if (evt.getKeyCode()==10) {
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
            java.util.logging.Logger.getLogger(ViewProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new ViewProgress().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_class;
    private javax.swing.JComboBox cb_grade;
    private javax.swing.JComboBox cb_regno;
    private javax.swing.JComboBox cb_report;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txt_admission;
    private javax.swing.JTextField txt_name;
    private javax.swing.JLabel txtpic;
    // End of variables declaration//GEN-END:variables
    public void setnull(){
    
             if(viewer!=null){
            viewer.setVisible(false);
            }
            txt_admission.setText("");
            txt_name.setText("");
            txtpic.setIcon(null);
            cb_regno.setSelectedIndex(-1);
            cb_grade.setSelectedIndex(-1);
            cb_class.setSelectedIndex(-1);
    
    }
}
