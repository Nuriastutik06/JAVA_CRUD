/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Nuri Astutik
 */
public final class FormSiswa extends javax.swing.JFrame {
public Statement st;
public ResultSet rs;
public DefaultTableModel tabModel;
Connection cn = koneksi.Koneksi.Koneksi();


public void reset() {
    inputNis.setText("");
    inputNama.setText("");
    inputAlamat.setText("");
    inputJurusan.setSelectedItem("");
    inputJK.setSelectedItem("");
    
            inputNis.setEnabled(true);
            buttonsimpan.setEnabled(true);
            buttonupdate.setEnabled(false);
            buttonhapus.setEnabled(false);
}

    /**
     * Creates new form FormSiswa
     */
    public FormSiswa() {
        initComponents();
        judul();
        tampilData("");
        
        buttonhapus.setEnabled(false);
        buttonupdate.setEnabled(false);
     
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nis = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        jurusan = new javax.swing.JLabel();
        jk = new javax.swing.JLabel();
        alamat = new javax.swing.JLabel();
        inputNis = new javax.swing.JTextField();
        inputNama = new javax.swing.JTextField();
        inputJurusan = new javax.swing.JComboBox<>();
        inputJK = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputAlamat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSiswa = new javax.swing.JTable();
        buttonsimpan = new javax.swing.JButton();
        buttonhapus = new javax.swing.JButton();
        buttonupdate = new javax.swing.JButton();
        buttonreset = new javax.swing.JButton();
        judul = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Siswa");
        setBackground(new java.awt.Color(0, 204, 255));
        setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        nis.setText("NIS");

        nama.setText("NAMA");

        jurusan.setText("JURUSAN");

        jk.setText("JK");

        alamat.setText("ALAMAT");

        inputNis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNisActionPerformed(evt);
            }
        });

        inputNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaActionPerformed(evt);
            }
        });

        inputJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rekayasa Perangkat Lunak", "Teknik Komputer dan Jaringan", "Multimedia", "Mekatronika", "Teknik Pengelasan", "Teknik Pemesinan", "Teknik Kendaraan Ringan Otomotif", "Bodi Otomotif", "Agribisnis Pengolahan Hasil Pertanian", "Agribisnis Tanaman Pangan dan Holtikultura" }));

        inputJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan", " " }));

        inputAlamat.setColumns(20);
        inputAlamat.setRows(5);
        jScrollPane1.setViewportView(inputAlamat);

        tableSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIS", "Nama", "Jurusan", "JK", "Alamat"
            }
        ));
        tableSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableSiswa);

        buttonsimpan.setBackground(new java.awt.Color(0, 204, 51));
        buttonsimpan.setText("Simpan");
        buttonsimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonsimpanMouseClicked(evt);
            }
        });
        buttonsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsimpanActionPerformed(evt);
            }
        });

        buttonhapus.setBackground(new java.awt.Color(255, 0, 0));
        buttonhapus.setText("Hapus");
        buttonhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonhapusActionPerformed(evt);
            }
        });

        buttonupdate.setBackground(new java.awt.Color(51, 102, 255));
        buttonupdate.setText("Update");
        buttonupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonupdateMouseClicked(evt);
            }
        });
        buttonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonupdateActionPerformed(evt);
            }
        });

        buttonreset.setBackground(new java.awt.Color(204, 0, 0));
        buttonreset.setText("Reset");
        buttonreset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonresetMouseClicked(evt);
            }
        });
        buttonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonresetActionPerformed(evt);
            }
        });

        judul.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        judul.setText("Form Siswa");
        judul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                judulMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jurusan, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                        .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(buttonsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                            .addComponent(buttonreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(67, 67, 67)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(buttonupdate, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                            .addComponent(buttonhapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(46, 46, 46))
                                    .addComponent(inputJurusan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inputNama)
                                    .addComponent(jScrollPane1)
                                    .addComponent(inputNis)
                                    .addComponent(inputJK, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nis, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonsimpan)
                    .addComponent(buttonhapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonreset)
                    .addComponent(buttonupdate))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaActionPerformed

    private void tableSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSiswaMouseClicked
        inputNis.setText(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 0).toString());
        inputNama.setText(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 1).toString());
        inputAlamat.setText(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 4).toString());
        inputJurusan.setSelectedItem(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 2).toString());
        inputJK.setSelectedItem(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 3).toString());
        
        
        inputNis.setEnabled(false);
        buttonsimpan.setEnabled(false);
        buttonupdate.setEnabled(true);
        buttonhapus.setEnabled(true);
        
    }//GEN-LAST:event_tableSiswaMouseClicked

    private void judulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_judulMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_judulMouseClicked

    private void buttonsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsimpanActionPerformed
        try {
            st = cn.createStatement();
            st.executeUpdate("INSERT INTO students VALUES('" + inputNis.getText() + "','"
                 + inputNama.getText() + "','"
                 + inputJurusan.getSelectedItem() + "','"
                 + inputJK.getSelectedItem() + "','"
                 + inputAlamat.getText() + "')");
            tampilData("");
            JOptionPane.showMessageDialog(null, "Simpan Berhasil");
            inputNis.setText("");
            inputNama.setText("");
            inputAlamat.setText("");
            inputJurusan.setSelectedItem("");
            inputJK.setSelectedItem("");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_buttonsimpanActionPerformed

    private void inputNisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNisActionPerformed

    private void buttonsimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonsimpanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonsimpanMouseClicked

    private void buttonresetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonresetMouseClicked
        
    }//GEN-LAST:event_buttonresetMouseClicked

    private void buttonupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonupdateMouseClicked
        
    }//GEN-LAST:event_buttonupdateMouseClicked

    private void buttonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonresetActionPerformed
        reset();
    }//GEN-LAST:event_buttonresetActionPerformed

    private void buttonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonupdateActionPerformed
        try {
            st = cn.createStatement();
            st.executeUpdate("UPDATE students set "
                 +"nis='"           + inputNis.getText() + "',"
                 +"nama='"          + inputNama.getText() + "',"
                 +"jurusan='"       + inputJurusan.getSelectedItem() + "',"
                 +"jk='"            + inputJK.getSelectedItem() + "',"
                 +"alamat='"        + inputAlamat.getText() + "' WHERE nis='"
                 + tabModel.getValueAt(tableSiswa.getSelectedRow(), 0)+"'");
            tampilData("");
            JOptionPane.showMessageDialog(null, "Update Berhasil");
            reset();
            inputNis.setEnabled(true);
            buttonsimpan.setEnabled(true);
            buttonupdate.setEnabled(false);
            buttonhapus.setEnabled(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_buttonupdateActionPerformed

    private void buttonhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonhapusActionPerformed
        try{
            int jawab;
            
            if((jawab = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Untuk Menghapus Data?", "konfirmasi", JOptionPane.YES_NO_OPTION))==0){
                st = cn.createStatement();
                st.executeUpdate("DELETE FROM students WHERE nis='"
                + tabModel.getValueAt(tableSiswa.getSelectedRow(), 0)+"'");
                tampilData("");
                reset();
            inputNis.setEnabled(true);
            buttonsimpan.setEnabled(true);
            buttonupdate.setEnabled(false);
            buttonhapus.setEnabled(false);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_buttonhapusActionPerformed

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
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormSiswa().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamat;
    private javax.swing.JButton buttonhapus;
    private javax.swing.JButton buttonreset;
    private javax.swing.JButton buttonsimpan;
    private javax.swing.JButton buttonupdate;
    private javax.swing.JTextArea inputAlamat;
    private javax.swing.JComboBox<String> inputJK;
    private javax.swing.JComboBox<String> inputJurusan;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputNis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jk;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel jurusan;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel nis;
    private javax.swing.JTable tableSiswa;
    // End of variables declaration//GEN-END:variables

    public void judul() {
        Object[] Judul = {
            "NIS", "Nama", "Jurusan", "Jk", "Alamat"
        };
        tabModel = new DefaultTableModel (null, Judul);
        tableSiswa.setModel (tabModel);
    }

    public void tampilData(String where) {
        try {
            st = cn.createStatement();
            tabModel.getDataVector().removeAllElements();
            tabModel.fireTableDataChanged();
            rs = st.executeQuery("SELECT * FROM students" + where);
            
            while (rs.next()) {
                Object[] data = {
                    rs.getString("nis"),
                    rs.getString("nama"),
                    rs.getString("jurusan"),
                    rs.getString("jk"),
                    rs.getString("alamat"),
                };
                
                tabModel.addRow(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
