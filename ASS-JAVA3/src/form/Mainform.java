 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import ass.java3.sharedata;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author truon 
 */
public class Mainform extends javax.swing.JFrame {
    private Studentmanager mnStudentpanel;
    private GPmanager mnGPpanel;  
    /**
     * Creates new form Mainform
     */
    public Mainform() {
        setLocationRelativeTo(null);
        initComponents();
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);//cái này là gì dạ
        
    }// thui tớ chịu
    private void processloginsuccessful(){
        lbname.setText(sharedata.nguoidangnhap.getUsername());
        lbrole.setText(sharedata.nguoidangnhap.getRole());
        if(sharedata.nguoidangnhap.getRole().equals("GiangVien")){
            mnQLSV.setEnabled(false);
            mnQLD.setEnabled(true);
            btnQLD.setEnabled(true);
            btnQLSV.setEnabled(false);
        }else if(sharedata.nguoidangnhap.getRole().equals("DaoTao")){
            mnQLSV.setEnabled(false);
            mnQLD.setEnabled(true);
            btnQLD.setEnabled(false);
            btnQLSV.setEnabled(true);
        }
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator6 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        tlblogout = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnQLSV = new javax.swing.JButton();
        btnQLD = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        tplmain = new javax.swing.JTabbedPane();
        jLabel2 = new javax.swing.JLabel();
        lbname = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbrole = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnS_exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnQLSV = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnQLD = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setRollover(true);

        tlblogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Log out.png"))); // NOI18N
        tlblogout.setText("Đăng xuất");
        tlblogout.setFocusable(false);
        tlblogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tlblogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlblogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlblogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(tlblogout);
        jToolBar1.add(jSeparator8);

        btnQLSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Unknown person.png"))); // NOI18N
        btnQLSV.setText("Quản lý sinh viên");
        btnQLSV.setFocusable(false);
        btnQLSV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLSV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSVActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLSV);

        btnQLD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Numbered list.png"))); // NOI18N
        btnQLD.setText("Quản lý điểm");
        btnQLD.setFocusable(false);
        btnQLD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLD.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLD);
        jToolBar1.add(jSeparator7);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Help.png"))); // NOI18N
        jButton4.setText("Trợ giúp");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jLabel2.setText("XIN CHÀO : ");

        lbname.setText("            ");

        jLabel3.setText("CHỨC VỤ: ");

        lbrole.setText("           ");

        jMenu1.setText("HỆ THỐNG");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Log out.png"))); // NOI18N
        jMenuItem1.setText("Đăng xuất");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        mnS_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Exit.png"))); // NOI18N
        mnS_exit.setText("Thoát");
        mnS_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnS_exitActionPerformed(evt);
            }
        });
        jMenu1.add(mnS_exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("QUẢN LÝ");

        mnQLSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Unknown person.png"))); // NOI18N
        mnQLSV.setText("Quản lý sinh viên");
        mnQLSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnQLSVActionPerformed(evt);
            }
        });
        jMenu2.add(mnQLSV);
        jMenu2.add(jSeparator2);

        mnQLD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Numbered list.png"))); // NOI18N
        mnQLD.setText("Quản lý điểm");
        mnQLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnQLDActionPerformed(evt);
            }
        });
        jMenu2.add(mnQLD);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("TRỢ GIÚP");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/List.png"))); // NOI18N
        jMenuItem5.setText("Nội dung");
        jMenu3.add(jMenuItem5);
        jMenu3.add(jSeparator3);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Mail.png"))); // NOI18N
        jMenuItem6.setText("Giới thiệu");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tplmain, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lbrole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lbname, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lbrole)))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tplmain, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnS_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnS_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnS_exitActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        AboutUs aboudiablog= new AboutUs(this,true);
        aboudiablog.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Login loginDialog=new Login(this, true);
        loginDialog.setVisible(true);
        processloginsuccessful();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnQLSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnQLSVActionPerformed
    if(mnStudentpanel == null){
        mnStudentpanel = new Studentmanager();
        ImageIcon icon = new ImageIcon(getClass().getResource("/image/user.png"));
        tplmain.addTab("Quản Lý Sinh Viên", icon, mnStudentpanel, "Quản Lý Sinh Viên");
        }
        tplmain.setSelectedComponent(mnStudentpanel);
    }//GEN-LAST:event_mnQLSVActionPerformed

    private void mnQLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnQLDActionPerformed
    if(mnGPpanel == null){
        mnGPpanel = new GPmanager();
        ImageIcon icon = new ImageIcon(getClass().getResource("/image/Notes.png"));
        tplmain.addTab("Quản Lý Điểm", icon, mnGPpanel, "Quản Lý Sinh Viên");
        }
        tplmain.setSelectedComponent(mnGPpanel);
    }//GEN-LAST:event_mnQLDActionPerformed

    private void tlblogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlblogoutActionPerformed

        Login loginDialog=new Login(this, true);
        loginDialog.setVisible(true);
        processloginsuccessful();
    }//GEN-LAST:event_tlblogoutActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Login dialog = new Login(this, true);
        dialog.setVisible(true);
        processloginsuccessful();
    }//GEN-LAST:event_formWindowOpened

    private void btnQLSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSVActionPerformed
        mnQLSVActionPerformed(evt);
    }//GEN-LAST:event_btnQLSVActionPerformed

    private void btnQLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDActionPerformed
        mnQLDActionPerformed(evt);
    }//GEN-LAST:event_btnQLDActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AboutUs aboudiablog= new AboutUs(this,true);
        aboudiablog.setVisible(true);
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
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQLD;
    private javax.swing.JButton btnQLSV;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbrole;
    private javax.swing.JMenuItem mnQLD;
    private javax.swing.JMenuItem mnQLSV;
    private javax.swing.JMenuItem mnS_exit;
    private javax.swing.JButton tlblogout;
    private javax.swing.JTabbedPane tplmain;
    // End of variables declaration//GEN-END:variables
}