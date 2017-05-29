/* TUGAS MODUL 7
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugasmodul7;

/**
 *
 * @author REZA
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class FormPendaftaranBisaDisimpan
extends javax.swing.JFrame {

    public FormPendaftaranBisaDisimpan() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" 
    //desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    lblNama = new javax.swing.JLabel();
    lblNIM = new javax.swing.JLabel();
    lblJenisKelamin = new javax.swing.JLabel();
    lblTempatLahir = new javax.swing.JLabel();
    lblTanggalLahir = new javax.swing.JLabel();
    lblBidang = new javax.swing.JLabel();
    lblKetuaBidang = new javax.swing.JLabel();
    txtNama = new javax.swing.JTextField();
    txtNIM = new javax.swing.JTextField();
    txtJenisKelamin = new javax.swing.JTextField();
    txtTempatLahir = new javax.swing.JTextField();
    txtTanggalLahir = new javax.swing.JTextField();
    txtBidang = new javax.swing.JTextField();
    txtKetuaBidang = new javax.swing.JTextField();
    btnDaftar = new javax.swing.JButton();

    setDefaultCloseOperation
    (javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Form Pendaftaran");

    lblNama.setText("Nama :");
    lblNIM.setText("NIM :");
    lblJenisKelamin.setText("Jenis Kelamin :");
    lblTempatLahir.setText("Tempat Lahir :");
    lblTanggalLahir.setText("Tanggal Lahir");
    lblBidang.setText("Bidang :");
    lblKetuaBidang.setText("Ketua Bidang :");
    txtNama.addActionListener
    (new java.awt.event.ActionListener() {
     public void actionPerformed
    (java.awt.event.ActionEvent evt) {
    txtNamaActionPerformed(evt);
            }
        });

    txtKetuaBidang.addActionListener
    (new java.awt.event.ActionListener() {
    public void actionPerformed
    (java.awt.event.ActionEvent evt) {
    txtKetuaBidangActionPerformed(evt);
            }
        });

    btnDaftar.setText("Simpan");
    btnDaftar.addActionListener
    (new java.awt.event.ActionListener() {
    public void actionPerformed
    (java.awt.event.ActionEvent evt) {
    btnDaftarActionPerformed(evt);
            }
        });

    javax.swing.GroupLayout layout = new 
    javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
    layout.createParallelGroup
    (javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
    layout.createSequentialGroup()
   .addGroup(layout.createParallelGroup(javax.swing.
    GroupLayout.Alignment.TRAILING)
   .addGroup(layout.createSequentialGroup()
   .addContainerGap
    (javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
   .addComponent(btnDaftar))
   .addGroup(layout.createSequentialGroup()
   .addGap(23, 23, 23)
   .addGroup(layout.createParallelGroup
   (javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(lblKetuaBidang)
   .addComponent(lblBidang)
   .addComponent(lblTanggalLahir)
   .addComponent(lblTempatLahir)
   .addComponent(lblNIM)
   .addComponent(lblJenisKelamin)
   .addComponent(lblNama))
   .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
   RELATED, 66, Short.MAX_VALUE)
   .addGroup(layout.createParallelGroup
   (javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(txtBidang, javax.swing.GroupLayout.
   PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
   .addComponent(txtKetuaBidang, javax.swing.GroupLayout.
   PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
   .addComponent(txtTanggalLahir, javax.swing.GroupLayout.
   PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
   .addComponent(txtTempatLahir, javax.swing.GroupLayout.
   PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
   .addComponent(txtJenisKelamin, javax.swing.GroupLayout.
   PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
   .addComponent(txtNIM, javax.swing.GroupLayout.
   PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
   .addComponent(txtNama, javax.swing.GroupLayout.
   PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
   .addGap(29, 29, 29))
        );

   layout.linkSize(javax.swing.SwingConstants.
   HORIZONTAL, new java.awt.Component[] 
   {txtBidang, txtJenisKelamin, txtKetuaBidang,
   txtNIM, txtNama, txtTanggalLahir, txtTempatLahir});

   layout.setVerticalGroup(
   layout.createParallelGroup
   (javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
   .addGap(27, 27, 27)
   .addGroup(layout.createParallelGroup
   (javax.swing.GroupLayout.Alignment.BASELINE)
   .addComponent(lblNama)
   .addComponent(txtNama, javax.swing.GroupLayout.
   PREFERRED_SIZE, javax.swing.GroupLayout.
   DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
   .addGap(9, 9, 9)
   .addGroup(layout.createParallelGroup
   (javax.swing.GroupLayout.Alignment.BASELINE)
   .addComponent(lblNIM)
   .addComponent(txtNIM, javax.swing.GroupLayout.
   PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
   javax.swing.GroupLayout.PREFERRED_SIZE))
   .addPreferredGap
   (javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
   .addGroup(layout.createParallelGroup
   (javax.swing.GroupLayout.Alignment.BASELINE)
   .addComponent(lblJenisKelamin)
   .addComponent(txtJenisKelamin, javax.swing.GroupLayout.
   PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
   javax.swing.GroupLayout.PREFERRED_SIZE))
   .addPreferredGap(javax.swing.LayoutStyle.
   ComponentPlacement.UNRELATED)
   .addGroup(layout.createParallelGroup
   (javax.swing.GroupLayout.Alignment.BASELINE)
   .addComponent(lblTempatLahir)
   .addComponent(txtTempatLahir, javax.swing.GroupLayout.
   PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 
   javax.swing.GroupLayout.PREFERRED_SIZE))
   .addPreferredGap(javax.swing.LayoutStyle.
   ComponentPlacement.UNRELATED)
   .addGroup(layout.createParallelGroup
   (javax.swing.GroupLayout.Alignment.BASELINE)
   .addComponent(lblTanggalLahir)
   .addComponent(txtTanggalLahir, javax.swing.GroupLayout.
   PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
   javax.swing.GroupLayout.PREFERRED_SIZE))
   .addPreferredGap
   (javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
   .addGroup(layout.createParallelGroup
   (javax.swing.GroupLayout.Alignment.BASELINE)
   .addComponent(lblBidang)
   .addComponent(txtBidang, javax.swing.GroupLayout.
    PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
    javax.swing.GroupLayout.PREFERRED_SIZE))
   .addPreferredGap
   (javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
   .addGroup(layout.createParallelGroup
   (javax.swing.GroupLayout.Alignment.BASELINE)
   .addComponent(lblKetuaBidang)
   .addComponent
   (txtKetuaBidang, javax.swing.GroupLayout.
   PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
   javax.swing.GroupLayout.PREFERRED_SIZE))
   .addGap(18, 18, 18)
   .addComponent(btnDaftar)
   .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDaftarActionPerformed
    (java.awt.event.ActionEvent evt) {
    //GEN-FIRST:event_btnDaftarActionPerformed
    try{
    String file = "Data.txt";
    FileWriter data = new FileWriter(file, true);
    try (PrintWriter out = new PrintWriter(data)) {
    out.println(txtNama.getText());
                
    out.println(txtNIM.getText());
    out.println(txtJenisKelamin.getText());
    out.println(txtTempatLahir.getText());
    out.println(txtTanggalLahir.getText());
    out.println(txtBidang.getText());
    out.println(txtKetuaBidang.getText());
    out.println("");
    out.close();
            }
            
    JOptionPane.showMessageDialog
    (null, "Data Telah Disimpan", "Pemberitahuan"
    , JOptionPane.INFORMATION_MESSAGE);
    }catch(IOException a){
            
        }        
    }//GEN-LAST:event_btnDaftarActionPerformed

    private void txtKetuaBidangActionPerformed
    (java.awt.event.ActionEvent evt) {
    //GEN-FIRST:event_txtKetuaBidangActionPerformed
    // TODO add your handling code here:
    }//GEN-LAST:event_txtKetuaBidangActionPerformed

    private void txtNamaActionPerformed
    (java.awt.event.ActionEvent evt) {
    //GEN-FIRST:event_txtNamaActionPerformed
    // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    public static void main(String args[]) {
    //<editor-fold defaultstate="collapsed" 
    //desc=" Look and feel setting code (optional) ">
    /*
   * If Nimbus (introduced in Java SE 6) is 
   * not available, stay with the
   * default look and feel. For details see
   * http://download.oracle.com/javase/tutorial/uiswing
   * /lookandfeel/plaf.html
   */
   try {
   for (javax.swing.UIManager.LookAndFeelInfo info :
   javax.swing.UIManager.getInstalledLookAndFeels()) {
   if ("Nimbus".equals(info.getName())) {
   javax.swing.UIManager.setLookAndFeel(info.getClassName());
   break;
                }
            }
   } catch (ClassNotFoundException | InstantiationException
   | IllegalAccessException 
   | javax.swing.UnsupportedLookAndFeelException ex) {
   java.util.logging.Logger.getLogger
   (FormPendaftaranBisaDisimpan.class.getName())
   .log(java.util.logging.Level.SEVERE, null, ex);
   }
   //</editor-fold>
   java.awt.EventQueue.invokeLater(new Runnable() {

   @Override
    public void run() {
    new FormPendaftaranBisaDisimpan().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaftar;
    private javax.swing.JLabel lblBidang;
    private javax.swing.JLabel lblJenisKelamin;
    private javax.swing.JLabel lblKetuaBidang;
    private javax.swing.JLabel lblNIM;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblTanggalLahir;
    private javax.swing.JLabel lblTempatLahir;
    private javax.swing.JTextField txtBidang;
    private javax.swing.JTextField txtJenisKelamin;
    private javax.swing.JTextField txtKetuaBidang;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTanggalLahir;
    private javax.swing.JTextField txtTempatLahir;
    // End of variables declaration//GEN-END:variables
}
