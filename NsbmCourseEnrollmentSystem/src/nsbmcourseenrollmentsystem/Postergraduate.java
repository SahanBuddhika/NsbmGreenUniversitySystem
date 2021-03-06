/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbmcourseenrollmentsystem;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sahan Buddhika
 */
public class Postergraduate extends javax.swing.JFrame {

    /**
     * Creates new form Postergraduate
     */
    ArrayList<PostergraduateStudentDetails> stList;
    DBOperation DBop = new DBOperation();

    public Postergraduate() {
        initComponents();
        loadPostergraduateStudents();
    }

    void loadPostergraduateStudents() {
        stList = DBop.getPostergraduateStudentDetails();
        PostergraduateStudentChooseDetails chooseDetails = new PostergraduateStudentChooseDetails(stList);
        tblpostergraduatestudentsdetails.setModel(chooseDetails);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnaddstudent = new javax.swing.JButton();
        btnviewstudents = new javax.swing.JButton();
        btnupdatestdents = new javax.swing.JButton();
        btndeletestudents = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpostergraduatestudentsdetails = new javax.swing.JTable();
        btnback = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnaddstudent.setText("Add Students");
        btnaddstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddstudentActionPerformed(evt);
            }
        });

        btnviewstudents.setText("View Students");
        btnviewstudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewstudentsActionPerformed(evt);
            }
        });

        btnupdatestdents.setText("Update Students");
        btnupdatestdents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatestdentsActionPerformed(evt);
            }
        });

        btndeletestudents.setText("Delete Students");
        btndeletestudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletestudentsActionPerformed(evt);
            }
        });

        tblpostergraduatestudentsdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblpostergraduatestudentsdetails);

        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 255));
        jTextField1.setText("POSTERGRADUATE STUDENTS");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbmcourseenrollmentsystem/Student_Registration1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnaddstudent)
                .addGap(74, 74, 74)
                .addComponent(btnviewstudents)
                .addGap(67, 67, 67)
                .addComponent(btnupdatestdents)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btndeletestudents)
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaddstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnviewstudents, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdatestdents, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndeletestudents, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddstudentActionPerformed
        PostergraduateStudents pos = new PostergraduateStudents();
        pos.setVisible(true);
        pos.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnaddstudentActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        Operation o = new Operation();
        o.setVisible(true);
        o.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnviewstudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewstudentsActionPerformed
        PostergraduateStudentDetailsView unp = new PostergraduateStudentDetailsView();
        try {
            unp.setVisible(true);
            //this.dispose();
            unp.setLocationRelativeTo(null);
            unp.setFields(stList.get(tblpostergraduatestudentsdetails.getSelectedRow()));
        } catch (Exception e) {
            unp.setVisible(false);
            JOptionPane.showMessageDialog(this, "Please Select a Student ");
        }
    }//GEN-LAST:event_btnviewstudentsActionPerformed

    private void btnupdatestdentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatestdentsActionPerformed
         PostergraduateStudentDetailsUpdate pos = new PostergraduateStudentDetailsUpdate();
        try {
            pos.setVisible(true);
            //this.dispose();
            pos.setLocationRelativeTo(null);
            pos.setFields(stList.get(tblpostergraduatestudentsdetails.getSelectedRow()));
        } catch (Exception e) {
            pos.setVisible(false);
            JOptionPane.showMessageDialog(this, "Please Select a Student ");
        }
    }//GEN-LAST:event_btnupdatestdentsActionPerformed

    private void btndeletestudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletestudentsActionPerformed
       PostergraduateStudentDetailsDelete pos = new PostergraduateStudentDetailsDelete();
        try {
            pos.setVisible(true);
            //this.dispose();
            pos.setLocationRelativeTo(null);
            pos.setFields(stList.get(tblpostergraduatestudentsdetails.getSelectedRow()));
        } catch (Exception e) {
            pos.setVisible(false);
            JOptionPane.showMessageDialog(this, "Please Select a Student ");
        }
    }//GEN-LAST:event_btndeletestudentsActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Postergraduate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Postergraduate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Postergraduate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Postergraduate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Postergraduate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddstudent;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btndeletestudents;
    private javax.swing.JButton btnupdatestdents;
    private javax.swing.JButton btnviewstudents;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblpostergraduatestudentsdetails;
    // End of variables declaration//GEN-END:variables
}
