/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Component;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author pasindu
 */
public class AddTermTestMarks extends javax.swing.JFrame {

    String head[] = new String[50];
    String rd;
    private static Point point = new Point();

    public AddTermTestMarks() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage("Reports/logo.png"));

        Vector v1 = new Vector();
        v1.add("12_1st_term");
        v1.add("12_2nd_term");
        v1.add("12_3rd_term");
        v1.add("13_1st_term");
        v1.add("13_2nd_term");
        v1.add("13_3rd_term");
        cb_term.setModel(new DefaultComboBoxModel(v1));



        for (int i = 1; i < 50; i++) {
            String a = String.valueOf(i);
            head[i - 1] = a;


        }

        ListModel lm = new AbstractListModel() {
            String headers[] = (String[]) head;

            public int getSize() {
                return headers.length;
            }

            public Object getElementAt(int index) {
                return headers[index];
            }
        };






        JList rowHeader = new JList(lm);
        rowHeader.setFixedCellWidth(50);

        rowHeader.setFixedCellHeight(table.getRowHeight()
                + table.getRowMargin());
//                                   + table.getIntercellSpacing().height);
        rowHeader.setCellRenderer(new RowHeaderRenderer(table));

//        JScrollPane scroll = new JScrollPane(table);
//        scroll.setRowHeaderView(rowHeader);
        jScrollPane1.setRowHeaderView(rowHeader);
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
        jLabel7 = new javax.swing.JLabel();
        cb_class = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        cb_3rd = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cb_regno = new javax.swing.JComboBox();
        txt_name = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        cb_grade = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txt_2nd = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtpic = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_maths = new javax.swing.JLabel();
        lblphy = new javax.swing.JLabel();
        lblchem = new javax.swing.JLabel();
        txt_admission = new javax.swing.JTextField();
        txt_1st = new javax.swing.JTextField();
        txt_3rd = new javax.swing.JTextField();
        txt_english = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        cb_term = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setText("English");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        cb_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_classActionPerformed(evt);
            }
        });
        jPanel1.add(cb_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel20.setText("Name with initials");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));

        cb_3rd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chemistry", "IT" }));
        cb_3rd.setFocusable(false);
        cb_3rd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_3rdActionPerformed(evt);
            }
        });
        jPanel1.add(cb_3rd, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1080, 10));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Add Term Test Marks");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel17.setText("3rd Subject");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        cb_regno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cb_regno.setSelectedIndex(-1);
        cb_regno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_regnoActionPerformed(evt);
            }
        });
        jPanel1.add(cb_regno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));
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

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 610, -1, -1));

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

        txt_2nd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_2ndKeyTyped(evt);
            }
        });
        jPanel1.add(txt_2nd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 80, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setText("Class");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        txtpic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtpic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 50, 90, 110));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setText("Reg. No");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        lbl_maths.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbl_maths.setText("Mathematics");
        jPanel1.add(lbl_maths, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        lblphy.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblphy.setText("Physics");
        jPanel1.add(lblphy, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        lblchem.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblchem.setText("Chemistry");
        jPanel1.add(lblchem, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        txt_admission.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_admissionKeyPressed(evt);
            }
        });
        jPanel1.add(txt_admission, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, 210, -1));

        txt_1st.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_1stKeyTyped(evt);
            }
        });
        jPanel1.add(txt_1st, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 80, -1));

        txt_3rd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_3rdKeyTyped(evt);
            }
        });
        jPanel1.add(txt_3rd, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 80, -1));

        txt_english.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_englishKeyTyped(evt);
            }
        });
        jPanel1.add(txt_english, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 80, -1));

        jButton1.setText("Add to Table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        table.setAutoCreateRowSorter(true);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reg.No", "Admission No", "Name", "Mathematics", "Physics", "Chemistry", "IT", "English", "Total", "Avarage"
            }
        ));
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getColumn(2).setMinWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(150);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 970, 310));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Term");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        cb_term.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12_1st_term", "12_2nd_term", "12_3rd_term" }));
        jPanel1.add(cb_term, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 100, 30));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            DefaultTableModel tbm = (DefaultTableModel) table.getModel();
            Vector v1 = new Vector();
            v1.add(cb_regno.getSelectedItem());
            v1.add(txt_admission.getText());
            v1.add(txt_name.getText());
            v1.add(txt_1st.getText());
            v1.add(txt_2nd.getText());

            if (cb_3rd.getSelectedIndex() == 0) {
                v1.add(txt_3rd.getText());
                v1.add(null);
            } else {
                v1.add(null);
                v1.add(txt_3rd.getText());
            }
            v1.add(txt_english.getText());
            v1.add(Math.round(Double.parseDouble(txt_1st.getText()) + Double.parseDouble(txt_2nd.getText()) + Double.parseDouble(txt_3rd.getText())));
            v1.add((Math.round((Double.parseDouble(txt_1st.getText()) + Double.parseDouble(txt_2nd.getText()) + Double.parseDouble(txt_3rd.getText())) / 3 * 100)) / (100d));

            tbm.addRow(v1);
            cb_regno.setSelectedIndex(cb_regno.getSelectedIndex() + 1);
            txt_1st.setText("");
            txt_2nd.setText("");
            txt_3rd.setText("");
            txt_english.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_1stKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_1stKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt_1st.getText().length() > 1) {

            if (evt.getKeyChar() == '0') {

                if (txt_1st.getText().equals("10")) {
                } else {
                    evt.consume();
                }

            } else {
                evt.consume();
            }

        }
    }//GEN-LAST:event_txt_1stKeyTyped

    private void txt_3rdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_3rdKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt_3rd.getText().length() > 1) {

            if (evt.getKeyChar() == '0') {

                if (txt_3rd.getText().equals("10")) {
                } else {
                    evt.consume();
                }

            } else {
                evt.consume();
            }

        }        // TODO add your handling code here:
    }//GEN-LAST:event_txt_3rdKeyTyped

    private void txt_2ndKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_2ndKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt_2nd.getText().length() > 1) {

            if (evt.getKeyChar() == '0') {

                if (txt_2nd.getText().equals("10")) {
                } else {
                    evt.consume();
                }

            } else {
                evt.consume();
            }

        }        // TODO add your handling code here:
    }//GEN-LAST:event_txt_2ndKeyTyped

    private void txt_englishKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_englishKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt_english.getText().length() > 1) {

            if (evt.getKeyChar() == '0') {

                if (txt_english.getText().equals("10")) {
                } else {
                    evt.consume();
                }

            } else {
                evt.consume();
            }

        }        // TODO add your handling code here:
    }//GEN-LAST:event_txt_englishKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            DefaultTableModel dt1 = (DefaultTableModel) table.getModel();
            int fe = dt1.getRowCount();
            for (int i = 0; i < fe; i++) {
                String admission = dt1.getValueAt(i, 1).toString();
                String name = dt1.getValueAt(i, 2).toString();
                String maths = dt1.getValueAt(i, 3).toString();
                String physics = dt1.getValueAt(i, 4).toString();
                String english = dt1.getValueAt(i, 7).toString();
                String total = dt1.getValueAt(i, 8).toString();
                String avg = dt1.getValueAt(i, 9).toString();
                String chemestry = "";
                if (dt1.getValueAt(i, 5).equals(null)) {
                    chemestry = dt1.getValueAt(i, 6).toString();
                } else {
                    chemestry = dt1.getValueAt(i, 5).toString();
                }
                DataBase.executeupdate("insert into " + String.valueOf(cb_term.getSelectedItem()) + " values('" + admission + "','" + maths + "','" + physics + "','" + chemestry + "','" + english + "','" + total + "','" + avg + "') ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setnull();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cb_3rdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_3rdActionPerformed
        if (cb_3rd.getSelectedIndex() == 1) {
            cb_3rd.setSelectedItem(rd);
            lblchem.setText(rd);
        } else {
            cb_3rd.setSelectedItem(rd);
            lblchem.setText(rd);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_3rdActionPerformed

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
            if (cb_regno.getSelectedIndex() == -1) {
            } else {


                Blob imageBlob = null;
                Image image;
                ResultSet rs2 = DataBase.executequary3("student", "class", String.valueOf(cb_class.getSelectedItem()), "regno", String.valueOf(cb_regno.getSelectedItem()));
                if (rs2.next()) {


                    ResultSet rs = DataBase.executequary3("student", "class", String.valueOf(cb_class.getSelectedItem()), "regno", String.valueOf(cb_regno.getSelectedItem()));
                    System.out.println(String.valueOf(cb_class.getSelectedItem()));
                    System.out.println(String.valueOf(cb_regno.getSelectedItem()));
                    while (rs.next()) {
                        System.out.println("ela");
                        txt_admission.setText(rs.getString("admissionno"));
                        txt_name.setText(rs.getString("namewithinitials"));
                        rd = rs.getString("3subject");
                        cb_3rd.setSelectedItem(rs.getString("3subject"));
                        imageBlob = rs.getBlob("photo");
                    }
                    ResultSet rs1 = DataBase.executequary3("student", "class", String.valueOf(cb_class.getSelectedItem()), "regno", String.valueOf(cb_regno.getSelectedItem()));
                    if (rs1.next()) {
                        InputStream binaryStream = imageBlob.getBinaryStream(1, imageBlob.length());
                        System.out.println("elakiri");
                        image = ImageIO.read(binaryStream);
                        image = image.getScaledInstance(txtpic.getWidth(), txtpic.getHeight(), Image.SCALE_SMOOTH);
                        txtpic.setIcon(new ImageIcon(image));
                    }
                } else {
                    Object[] options = {"Ok"};
                    JOptionPane.showOptionDialog(new JFrame(), "Register Number not exsist!", "Student Information System", JOptionPane.OK_OPTION, JOptionPane.ERROR_MESSAGE, null, options, options[0]);
                    cb_regno.setSelectedIndex(-1);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cb_regnoActionPerformed

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
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        point.x = evt.getX();
        point.y = evt.getY();
        // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point p = getLocation();
        setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);// TODO add your handling code here:
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

        }
        System.out.println(evt.getKeyCode());        // TODO add your handling code here:
    }//GEN-LAST:event_txt_admissionKeyPressed

    private void cb_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_classActionPerformed
        try {
            if (cb_class.getSelectedIndex()==-1) {

            } else {

                String a = "";
                Vector v = new Vector();
                int x = 0;
                ResultSet rs = DataBase.executequary1("class", "class", (String) cb_class.getSelectedItem());
                while (rs.next()) {
                    x = Integer.parseInt(rs.getString("students"));
                    a = rs.getString("subject");
                }
                if (a.equals("Mathematics")) {
                    mathsClases();
                } else {
                    ScienceClases();
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
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cb_classActionPerformed

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
            java.util.logging.Logger.getLogger(AddTermTestMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTermTestMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTermTestMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTermTestMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new AddTermTestMarks().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_3rd;
    private javax.swing.JComboBox cb_class;
    private javax.swing.JComboBox cb_grade;
    private javax.swing.JComboBox cb_regno;
    private javax.swing.JComboBox cb_term;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_maths;
    private javax.swing.JLabel lblchem;
    private javax.swing.JLabel lblphy;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt_1st;
    private javax.swing.JTextField txt_2nd;
    private javax.swing.JTextField txt_3rd;
    private javax.swing.JTextField txt_admission;
    private javax.swing.JTextField txt_english;
    private javax.swing.JTextField txt_name;
    private javax.swing.JLabel txtpic;
    // End of variables declaration//GEN-END:variables

    public void mathsClases() {
        try {
            table.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "Reg.No", "Admission No", "Name", "Mathematics", "Physics", "Chemistry", "IT", "English", "Total", "Avarage"
                    }));
            Vector v = new Vector();
            v.add("Chemistry");
            v.add("IT");
            cb_3rd.setModel(new DefaultComboBoxModel(v));
            lbl_maths.setText("Mathematics");
            lblphy.setText("Physics");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void ScienceClases() {
        try {
            table.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "Reg.No", "Admission No", "Name", "Bio-Science", "Chemistry", "Physics", "Agriculture", "English", "Total", "Avarage"
                    }));
            Vector v = new Vector();
            v.add("Physics");
            v.add("Agriculture");
            cb_3rd.setModel(new DefaultComboBoxModel(v));
            lbl_maths.setText("Bio-Science");
            lblphy.setText("Chemistry");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void setnull() {
        DefaultTableModel dt1 = (DefaultTableModel) table.getModel();
        dt1.setRowCount(0);
        txt_1st.setText("");
        txt_2nd.setText("");
        txt_3rd.setText("");
        txt_english.setText("");
        txt_admission.setText("");
        txt_name.setText("");
        txtpic.setIcon(null);
        cb_regno.setSelectedIndex(-1);
        cb_grade.setSelectedIndex(-1);
        cb_class.setSelectedIndex(-1);
    }
}

class RowHeaderRenderer extends JLabel implements ListCellRenderer {

    RowHeaderRenderer(JTable table) {
        JTableHeader header = table.getTableHeader();
        setOpaque(true);
        setBorder(UIManager.getBorder("TableHeader.cellBorder"));
        setHorizontalAlignment(CENTER);
        setForeground(header.getForeground());
        setBackground(header.getBackground());
        setFont(header.getFont());
    }

    public Component getListCellRendererComponent(JList list, Object value,
            int index, boolean isSelected, boolean cellHasFocus) {
        setText((value == null) ? "" : value.toString());
        return this;
    }
}
