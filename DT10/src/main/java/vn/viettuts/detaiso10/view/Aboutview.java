
package vn.viettuts.detaiso10.view;

import java.util.ArrayList;
import javax.swing.JLabel;
import org.w3c.dom.Document;
import vn.viettuts.detaiso10.controller.Nhan_vien_controller;
import vn.viettuts.detaiso10.entity.Nhanvien;

public class Aboutview extends javax.swing.JPanel {
    Document doc;
    ArrayList<Nhanvien> list;
    Nhan_vien_controller controller;
    public Aboutview() {
        initComponents();
        list = new ArrayList<>();
        controller = new Nhan_vien_controller(doc, tentextfield, diachitextfield, sdttextfield, chucvutextfield, luongtextfield, sextextfield, TOOL_TIP_TEXT_KEY, anh_nhan_vien, nhanvientable, list);
        controller.hienthi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        anh_nhan_vien = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nhanvientable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        tenlabel = new javax.swing.JLabel();
        tentextfield = new javax.swing.JTextField();
        diachilabel = new javax.swing.JLabel();
        diachitextfield = new javax.swing.JTextField();
        sdtlabel = new javax.swing.JLabel();
        sdttextfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        thembutton = new Buttonborder.MyButton();
        suabutton = new Buttonborder.MyButton();
        xoabutton = new Buttonborder.MyButton();
        themanhbutton = new Buttonborder.MyButton();
        tongbutton = new Buttonborder.MyButton();
        jPanel2 = new javax.swing.JPanel();
        chucvulabel = new javax.swing.JLabel();
        chucvutextfield = new javax.swing.JTextField();
        clearbutton = new Buttonborder.MyButton();
        luonglabel = new javax.swing.JLabel();
        luongtextfield = new javax.swing.JTextField();
        sexlabel = new javax.swing.JLabel();
        sextextfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(135, 206, 250));
        setToolTipText("Total Staff");
        setPreferredSize(new java.awt.Dimension(900, 620));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nhanvien.png"))); // NOI18N
        jLabel2.setText("Nhân viên");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logohvan.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/images_preview_rev_1.png"))); // NOI18N

        anh_nhan_vien.setBackground(new java.awt.Color(0, 0, 0));
        anh_nhan_vien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nhanvien.png"))); // NOI18N
        anh_nhan_vien.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nhanvientable.setBackground(new java.awt.Color(127, 255, 212));
        nhanvientable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tên", "Địa chỉ", "Số điện thoại", "Chức vụ", "Lương", "Giới tính"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        nhanvientable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nhanvientable.setPreferredSize(new java.awt.Dimension(900, 620));
        nhanvientable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nhanvientableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(nhanvientable);
        if (nhanvientable.getColumnModel().getColumnCount() > 0) {
            nhanvientable.getColumnModel().getColumn(0).setResizable(false);
            nhanvientable.getColumnModel().getColumn(0).setPreferredWidth(120);
            nhanvientable.getColumnModel().getColumn(1).setResizable(false);
            nhanvientable.getColumnModel().getColumn(1).setPreferredWidth(120);
            nhanvientable.getColumnModel().getColumn(2).setResizable(false);
            nhanvientable.getColumnModel().getColumn(2).setPreferredWidth(100);
            nhanvientable.getColumnModel().getColumn(3).setResizable(false);
            nhanvientable.getColumnModel().getColumn(3).setPreferredWidth(90);
            nhanvientable.getColumnModel().getColumn(4).setResizable(false);
            nhanvientable.getColumnModel().getColumn(4).setPreferredWidth(50);
            nhanvientable.getColumnModel().getColumn(5).setResizable(false);
            nhanvientable.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        jPanel1.setBackground(new java.awt.Color(173, 216, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tenlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tenlabel.setText("Thêm/sửa họ và tên ");
        jPanel1.add(tenlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));
        jPanel1.add(tentextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 280, 20));

        diachilabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        diachilabel.setText("Thêm/sửa  địa chỉ ");
        jPanel1.add(diachilabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 20));
        jPanel1.add(diachitextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 280, -1));

        sdtlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sdtlabel.setText("Thêm/sửa số điện thoại");
        jPanel1.add(sdtlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));
        jPanel1.add(sdttextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 280, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/poiuy.gif"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 120));

        thembutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/baseline_add_black_24dp.png"))); // NOI18N
        thembutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thembuttonActionPerformed(evt);
            }
        });

        suabutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/baseline_edit_black_24dp.png"))); // NOI18N
        suabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suabuttonActionPerformed(evt);
            }
        });

        xoabutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/baseline_delete_black_24dp.png"))); // NOI18N
        xoabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoabuttonActionPerformed(evt);
            }
        });

        themanhbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themanh.png"))); // NOI18N
        themanhbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themanhbuttonActionPerformed(evt);
            }
        });

        tongbutton.setText("Total Staff");
        tongbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tongbuttonActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chucvulabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chucvulabel.setText("Thêm/sửa chức vụ");
        jPanel2.add(chucvulabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        chucvutextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chucvutextfieldActionPerformed(evt);
            }
        });
        jPanel2.add(chucvutextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 210, -1));

        clearbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/baseline_refresh_black_24dp.png"))); // NOI18N
        clearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(clearbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 71, 100));

        luonglabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        luonglabel.setText("Thêm/sửa lương");
        jPanel2.add(luonglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));
        jPanel2.add(luongtextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 210, -1));

        sexlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sexlabel.setText("Thêm/sửa giới tính");
        jPanel2.add(sexlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));
        jPanel2.add(sextextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 210, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flow.gif"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(239, 239, 239)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(anh_nhan_vien, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(themanhbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(27, 27, 27)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(suabutton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(thembutton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(tongbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(20, 20, 20)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(xoabutton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jTextField1)
                                                    .addGap(2, 2, 2))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(thembutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xoabutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(suabutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(themanhbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tongbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anh_nhan_vien, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chucvutextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chucvutextfieldActionPerformed
        
    }//GEN-LAST:event_chucvutextfieldActionPerformed

    private void nhanvientableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nhanvientableMouseClicked
        // TODO add your handling code here:
         int hangChon = nhanvientable.getSelectedRow();

         String tennv, diachinv, sdtnv, chucvunv, luongnv, gioitinhnv, anhnv;
         tennv  = (String) nhanvientable.getValueAt(hangChon , 0);
         diachinv  = (String) nhanvientable.getValueAt(hangChon , 1);
         sdtnv  = (String) nhanvientable.getValueAt(hangChon , 2);
         chucvunv  = (String) nhanvientable.getValueAt(hangChon , 3);
         luongnv  = (String) nhanvientable.getValueAt(hangChon , 4);
         gioitinhnv  = (String) nhanvientable.getValueAt(hangChon , 5);

         tentextfield.setText(tennv);
         diachitextfield.setText(diachinv);
         sdttextfield.setText(sdtnv);
         chucvutextfield.setText(chucvunv);
         luongtextfield.setText(luongnv);
         sextextfield.setText(gioitinhnv);
         
          anhnv = controller.lay_anh(tennv, diachinv, sdtnv, chucvunv, luongnv);
         controller.hien_anh(anhnv, anh_nhan_vien);
         
         
    }//GEN-LAST:event_nhanvientableMouseClicked

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
        // TODO add your handling code here:
        tentextfield.setText("");
        diachitextfield.setText("");
        sdttextfield.setText("");
        chucvutextfield.setText("");
        luongtextfield.setText("");
        sextextfield.setText("");
    }//GEN-LAST:event_clearbuttonActionPerformed

    private void thembuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thembuttonActionPerformed
        // TODO add your handling code here:
        controller.them_nhan_vien();
    }//GEN-LAST:event_thembuttonActionPerformed

    private void suabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suabuttonActionPerformed
        // TODO add your handling code here:
        controller.Sua_Nhan_Vien();
    }//GEN-LAST:event_suabuttonActionPerformed

    private void themanhbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themanhbuttonActionPerformed
        // TODO add your handling code here:
        controller.them_anh();
    }//GEN-LAST:event_themanhbuttonActionPerformed

    private void tongbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tongbuttonActionPerformed
        // TODO add your handling code here:
        int tongSoNhanVien = nhanvientable.getRowCount();
        jTextField1.setText(String.valueOf(tongSoNhanVien));
    }//GEN-LAST:event_tongbuttonActionPerformed

    private void xoabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoabuttonActionPerformed
        // TODO add your handling code here:
        controller.xoa_nhan_vien();
    }//GEN-LAST:event_xoabuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anh_nhan_vien;
    private javax.swing.JLabel chucvulabel;
    private javax.swing.JTextField chucvutextfield;
    private Buttonborder.MyButton clearbutton;
    private javax.swing.JLabel diachilabel;
    private javax.swing.JTextField diachitextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel luonglabel;
    private javax.swing.JTextField luongtextfield;
    private javax.swing.JTable nhanvientable;
    private javax.swing.JLabel sdtlabel;
    private javax.swing.JTextField sdttextfield;
    private javax.swing.JLabel sexlabel;
    private javax.swing.JTextField sextextfield;
    private Buttonborder.MyButton suabutton;
    private javax.swing.JLabel tenlabel;
    private javax.swing.JTextField tentextfield;
    private Buttonborder.MyButton themanhbutton;
    private Buttonborder.MyButton thembutton;
    private Buttonborder.MyButton tongbutton;
    private Buttonborder.MyButton xoabutton;
    // End of variables declaration//GEN-END:variables
}
