package Screens;

import Operations.DatabaseIslemleri;
import Entities.Uye;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

public class UyeEkrani extends javax.swing.JDialog {

    //Db bağlantısı kurma..
    DatabaseIslemleri dbIslemleri = new DatabaseIslemleri();
    DefaultTableModel model;

    public UyeEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) uyeTablosu.getModel();
        uyeGoruntule();
    }

    public void uyeGoruntule() {

        //Her açılışta tabloyu sıfırla...
        model.setRowCount(0);

        //Uye islemlerinden gerekli operasyonu cagır o da UyeListesi dönsün...Uye referans tipini tutan listeyi yakala..
        ArrayList<Uye> uyeList = dbIslemleri.uyeleriGetir();
        //uye list boş değilse yani liste varsa..
        if (uyeList != null) {

            for (Uye uye : uyeList) {
                //arayüz için object[] olması lazım for eachle tüm listeyi gez ve tüm propertyleri al.

                Object[] eklenecekler = {uye.getId(), uye.getAd(), uye.getSoyad(), uye.getBrans(), uye.getTelNo()};

                //arayüze ekle
                model.addRow(eklenecekler);
            }

        }

    }

    public void filtrelemeYap(String kelime) {
        TableRowSorter<DefaultTableModel> myTableRow = new TableRowSorter<DefaultTableModel>(model);
        uyeTablosu.setRowSorter(myTableRow);
        myTableRow.setRowFilter(RowFilter.regexFilter(kelime));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        uyeTablosu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        arama_input = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        uyeAdAlani = new javax.swing.JTextField();
        uyeSoyadAlani = new javax.swing.JTextField();
        uyeBransAlani = new javax.swing.JTextField();
        uyeTelefonAlani = new javax.swing.JTextField();
        uyeEkleButton = new javax.swing.JButton();
        uyeGuncellerBtn = new javax.swing.JButton();
        uyeSilBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        uyeTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Ad", "Soyad", "Brans", "TelefonNO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        uyeTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uyeTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(uyeTablosu);
        if (uyeTablosu.getColumnModel().getColumnCount() > 0) {
            uyeTablosu.getColumnModel().getColumn(0).setResizable(false);
            uyeTablosu.getColumnModel().getColumn(1).setResizable(false);
            uyeTablosu.getColumnModel().getColumn(2).setResizable(false);
            uyeTablosu.getColumnModel().getColumn(3).setResizable(false);
            uyeTablosu.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setText("LİSTEDE ARA:");

        arama_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_inputKeyReleased(evt);
            }
        });

        jLabel2.setText("Üye Adı:");

        jLabel3.setText("Üye Soyadı:");

        jLabel4.setText("Üye Branş:");

        jLabel5.setText("Üye Telefon:");

        uyeSoyadAlani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeSoyadAlaniActionPerformed(evt);
            }
        });

        uyeTelefonAlani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeTelefonAlaniActionPerformed(evt);
            }
        });

        uyeEkleButton.setText("ÜYE EKLE");
        uyeEkleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeEkleButtonActionPerformed(evt);
            }
        });

        uyeGuncellerBtn.setText("ÜYE GÜNCELLE");
        uyeGuncellerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeGuncellerBtnActionPerformed(evt);
            }
        });

        uyeSilBtn.setText("ÜYE SİL");
        uyeSilBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeSilBtnActionPerformed(evt);
            }
        });

        backBtn.setText("GERİ");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arama_input))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uyeAdAlani)
                            .addComponent(uyeSoyadAlani)
                            .addComponent(uyeBransAlani)
                            .addComponent(uyeTelefonAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uyeSilBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(uyeGuncellerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(uyeEkleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arama_input, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(uyeAdAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(uyeSoyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uyeBransAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(uyeTelefonAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(uyeEkleButton)
                        .addGap(18, 18, 18)
                        .addComponent(uyeGuncellerBtn)
                        .addGap(18, 18, 18)
                        .addComponent(uyeSilBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arama_inputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_inputKeyReleased
        String aranan = arama_input.getText();

        filtrelemeYap(aranan);


    }//GEN-LAST:event_arama_inputKeyReleased

    private void uyeSoyadAlaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeSoyadAlaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uyeSoyadAlaniActionPerformed

    private void uyeEkleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeEkleButtonActionPerformed
        if (uyeAdAlani.getText().isEmpty() || uyeSoyadAlani.getText().isEmpty() || uyeBransAlani.getText().isEmpty() || uyeTelefonAlani.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen Tüm Alanları Doldurun", "İşlem Başarısız", JOptionPane.PLAIN_MESSAGE);

        } else {
            String ad = uyeAdAlani.getText();
            String soyad = uyeSoyadAlani.getText();
            String brans = uyeBransAlani.getText();
            String telefon = uyeTelefonAlani.getText();

            dbIslemleri.uyeEkle(ad, soyad, brans, telefon);

            this.uyeGoruntule();

            JOptionPane.showMessageDialog(this, "Yeni Üye Eklendi", "İşlem Başarılı", JOptionPane.PLAIN_MESSAGE);
        }


    }//GEN-LAST:event_uyeEkleButtonActionPerformed

    private void uyeTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uyeTablosuMouseClicked

        int secilenSatir = uyeTablosu.getSelectedRow();

        uyeAdAlani.setText((String) uyeTablosu.getValueAt(secilenSatir, 1));
        uyeSoyadAlani.setText((String) uyeTablosu.getValueAt(secilenSatir, 2));
        uyeBransAlani.setText((String) uyeTablosu.getValueAt(secilenSatir, 3));
        uyeTelefonAlani.setText((String) uyeTablosu.getValueAt(secilenSatir, 4));


    }//GEN-LAST:event_uyeTablosuMouseClicked

    private void uyeTelefonAlaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeTelefonAlaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uyeTelefonAlaniActionPerformed

    private void uyeGuncellerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeGuncellerBtnActionPerformed

        String ad = uyeAdAlani.getText();
        String soyad = uyeSoyadAlani.getText();
        String brans = uyeBransAlani.getText();
        String telefon = uyeTelefonAlani.getText();

        int secilmisSatır = uyeTablosu.getSelectedRow();

        //Eğer satır seçilmemişse
        if (secilmisSatır == -1) {

            if (model.getRowCount() == 0) {
                //Tablo boştur
                JOptionPane.showMessageDialog(this, "Tablo Boş", "İşlem Başarısız", JOptionPane.PLAIN_MESSAGE);

            } else {
                // Değer seçilmemiştir...
                JOptionPane.showMessageDialog(this, "Lütfen Tablodan Değer Seçiniz", "İşlem Başarısız", JOptionPane.PLAIN_MESSAGE);

            }

        } else {
            //seçilmiş olduğu durum...

            //id'ye göre almak
            int id = (int) uyeTablosu.getValueAt(secilmisSatır, 0);

            dbIslemleri.uyeGuncelle(id, ad, soyad, brans, telefon);

            this.uyeGoruntule();

            JOptionPane.showMessageDialog(this, "Üye Güncellendi.", "İşlem Başarılı", JOptionPane.PLAIN_MESSAGE);

        }


    }//GEN-LAST:event_uyeGuncellerBtnActionPerformed

    private void uyeSilBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeSilBtnActionPerformed

        int selectedRow = uyeTablosu.getSelectedRow();

        if (selectedRow == -1) {

            if (model.getRowCount() == 0) {
                //Tablo boştur
                JOptionPane.showMessageDialog(this, "Tablo Boş", "İşlem Başarısız", JOptionPane.PLAIN_MESSAGE);

            } else {
                // Değer seçilmemiştir...
                JOptionPane.showMessageDialog(this, "Lütfen Tablodan Değer Seçiniz", "İşlem Başarısız", JOptionPane.PLAIN_MESSAGE);

            }

        } else {
            //seçilmiş olduğu durum...

            //id'ye göre almak
            int id = (int) uyeTablosu.getValueAt(selectedRow, 0);

            dbIslemleri.uyeSil(id);

            this.uyeGoruntule();

            JOptionPane.showMessageDialog(this, "Üye Silindi.", "İşlem Başarılı", JOptionPane.PLAIN_MESSAGE);

        }


    }//GEN-LAST:event_uyeSilBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        AnaMenu anaMenu = new AnaMenu();
        anaMenu.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UyeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UyeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UyeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UyeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UyeEkrani dialog = new UyeEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arama_input;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField uyeAdAlani;
    private javax.swing.JTextField uyeBransAlani;
    private javax.swing.JButton uyeEkleButton;
    private javax.swing.JButton uyeGuncellerBtn;
    private javax.swing.JButton uyeSilBtn;
    private javax.swing.JTextField uyeSoyadAlani;
    private javax.swing.JTable uyeTablosu;
    private javax.swing.JTextField uyeTelefonAlani;
    // End of variables declaration//GEN-END:variables
}
