
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class DataBarangView extends javax.swing.JFrame {
    
    private String selectedId; // Menyimpan ID barang yang dipilih

    /**
     * Creates new form DataBarangView
     */
    public DataBarangView() {
        initComponents();
        
        setSize(800, 800); // Menetapkan ukuran form
        setLocationRelativeTo(null); // Menempatkan form di tengah layar
        
        
        
        // Membuat model tabel dengan kolom berikut: ID, Nama, Bahan, Cara Membuat, dan URL
        DefaultTableModel table = new DefaultTableModel(
                new String[]{"id_barang", "nama_barang", "kode_barang", "kategori_barang", "harga_barang", "stok_barang"},
                0 // Jumlah baris awal (kosong)
        );

        // Menghubungkan model tabel ke komponen tabel di GUI
        jTableDataBarang.setModel(table);
        
        tampilkanData();
        
        
             
}
   
    
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ASUS
 */ 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void tampilkanData() {
    // SQL untuk mengambil data barang
    String sql = "SELECT * FROM tb_databarang";
    try (Connection conn = koneksi.getKoneksi();
         PreparedStatement pst = conn.prepareStatement(sql);
         ResultSet rs = pst.executeQuery()) {
        
        // Set model untuk JTable
        DefaultTableModel model = (DefaultTableModel) jTableDataBarang.getModel();
        model.setRowCount(0);  // Menghapus data lama
        
        // Menambahkan data ke JTable
        while (rs.next()) {
            model.addRow(new Object[] {
                rs.getString("id_barang"),
                rs.getString("nama_barang"),
                rs.getString("kode_barang"),
                rs.getString("kategori_barang"),
                rs.getString("harga_barang"),
                rs.getInt("stok_barang")
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
    }
}

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNamaBarang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldKodeBarang = new javax.swing.JTextField();
        jTextFieldHargaBarang = new javax.swing.JTextField();
        jComboBoxKategoriBarang = new javax.swing.JComboBox<>();
        jSpinnerStok = new javax.swing.JSpinner();
        jButtonTambah = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonSimpan = new javax.swing.JButton();
        jButtonBatal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDataBarang = new javax.swing.JTable();
        jButtonLogout = new javax.swing.JButton();
        jButtonKeluar = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuDataBarang = new javax.swing.JMenu();
        jMenu = new javax.swing.JMenu();
        jMenuItemLaporanStok = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel1.setFont(new java.awt.Font("Anton", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("FORM DATA BARANG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel1)
                .addContainerGap(308, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Barang");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kategori");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Harga");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stok");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Kode Barang");

        jComboBoxKategoriBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Alat Tulis", "Buku", "Elektronik", "Pakaian", "Perrabotan Rumah Tangga", "Game", "Olahraga & Rekreasi", "Kesehatan & Kecantikan" }));

        jButtonTambah.setText("Tambah");
        jButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahActionPerformed(evt);
            }
        });

        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonHapus.setText("Hapus");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jButtonSimpan.setText("Simpan");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        jButtonBatal.setText("Batal");
        jButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBatalActionPerformed(evt);
            }
        });

        jTableDataBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableDataBarang);

        jButtonLogout.setText("Logout");
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        jButtonKeluar.setText("Keluar");
        jButtonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonKeluar)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonLogout))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldNamaBarang))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldKodeBarang)
                                .addComponent(jComboBoxKategoriBarang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldHargaBarang)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonTambah)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonEdit)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButtonHapus)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButtonSimpan)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButtonBatal))
                                .addComponent(jSpinnerStok, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxKategoriBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinnerStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTambah)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonHapus)
                    .addComponent(jButtonSimpan)
                    .addComponent(jButtonBatal))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonKeluar)
                    .addComponent(jButtonLogout))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        jMenuDataBarang.setText("Data Barang");
        jMenuBar2.add(jMenuDataBarang);

        jMenu.setText("Laporan");
        jMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuActionPerformed(evt);
            }
        });

        jMenuItemLaporanStok.setText("Laporan Stok");
        jMenuItemLaporanStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLaporanStokActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemLaporanStok);

        jMenuBar2.add(jMenu);

        jMenu7.setText("Home");
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Menu Utama");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem3);

        jMenuBar2.add(jMenu7);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(820, 898));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahActionPerformed
        // TODO add your handling code here:
            // Ambil data dari input field
    String kodeBarang = jTextFieldKodeBarang.getText();
    String namaBarang = jTextFieldNamaBarang.getText();
    String kategori = (String) jComboBoxKategoriBarang.getSelectedItem();
    String harga = jTextFieldHargaBarang.getText();
    int stok = (Integer) jSpinnerStok.getValue();
    
    // SQL untuk menyimpan data barang ke database
    String sql = "INSERT INTO tb_databarang VALUES (null, ?, ?, ?, ?, ?)";
    
    try (Connection conn = koneksi.getKoneksi();
         PreparedStatement pst = conn.prepareStatement(sql)) {
        
        // Set parameter SQL
        pst.setString(1, namaBarang);
        pst.setString(2, kodeBarang);
        pst.setString(3, kategori);
        pst.setString(4, harga);
        pst.setInt(5, stok);
        
        // Eksekusi query
        pst.executeUpdate();
        
       
        
        // Reset form input
        jTextFieldKodeBarang.setText("");
        jTextFieldNamaBarang.setText("");
        jTextFieldHargaBarang.setText("");
        jSpinnerStok.setValue(0);
        
        tampilkanData();
        
        JOptionPane.showMessageDialog(null, "Data barang berhasil ditambahkan");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
    }
    
    
    }//GEN-LAST:event_jButtonTambahActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        // TODO add your handling code here:
            String kodeBarang = jTextFieldKodeBarang.getText();
    String namaBarang = jTextFieldNamaBarang.getText();
    String kategori = (String) jComboBoxKategoriBarang.getSelectedItem();
    String harga = jTextFieldHargaBarang.getText();
    int stok = (Integer) jSpinnerStok.getValue();

    String sql;
    if (selectedId != null) {
        // Update data barang
        sql = "UPDATE tb_databarang SET kode_barang=?, nama_barang=?, kategori_barang=?, harga_barang=?, stok_barang=? WHERE id_barang=?";
    } else {
        // Insert data barang
        sql = "INSERT INTO tb_databarang (kode_barang, nama_barang, kategori_barang, harga_barang, stok_barang) VALUES (?, ?, ?, ?, ?)";
    }

    try (Connection conn = koneksi.getKoneksi();
         PreparedStatement pst = conn.prepareStatement(sql)) {

        // Mengisi parameter PreparedStatement
        pst.setString(1, kodeBarang);
        pst.setString(2, namaBarang);
        pst.setString(3, kategori);
        pst.setString(4, harga);
        pst.setInt(5, stok);
        if (selectedId != null) {
            pst.setString(6, selectedId); // Set ID untuk update
        }

        // Menjalankan query
        pst.executeUpdate();

        // Menampilkan pesan sukses
        JOptionPane.showMessageDialog(this, "Data Barang berhasil disimpan!");

        // Mengosongkan form setelah simpan
        jTextFieldKodeBarang.setText("");
        jTextFieldNamaBarang.setText("");
        jComboBoxKategoriBarang.setSelectedIndex(0);
        jTextFieldHargaBarang.setText("");
        jSpinnerStok.setValue(0); // Mengatur nilai spinner ke 0
        selectedId = null; // Reset selectedId setelah simpan

        tampilkanData(); // Refresh data di tabel
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
    }
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTableDataBarang.getSelectedRow();
    if (selectedRow != -1) {
        // Ambil data dari tabel dan tampilkan di input form
        selectedId = (String) jTableDataBarang.getValueAt(selectedRow, 0); // Ambil ID barang
        jTextFieldKodeBarang.setText((String) jTableDataBarang.getValueAt(selectedRow, 2));
        jTextFieldNamaBarang.setText((String) jTableDataBarang.getValueAt(selectedRow, 1));
        jComboBoxKategoriBarang.setSelectedItem(jTableDataBarang.getValueAt(selectedRow, 3));
        jTextFieldHargaBarang.setText((String) jTableDataBarang.getValueAt(selectedRow, 4));
        jSpinnerStok.setValue(jTableDataBarang.getValueAt(selectedRow, 5));
    } else {
        JOptionPane.showMessageDialog(null, "Pilih baris yang ingin diedit.");
    }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        // TODO add your handling code here:
             int selectedRow = jTableDataBarang.getSelectedRow();
    if (selectedRow != -1) {
        String kodeBarang = (String) jTableDataBarang.getValueAt(selectedRow, 2); // Pastikan indeks kolom benar
        
        // SQL untuk menghapus data dari database
        String sql = "DELETE FROM tb_databarang WHERE kode_barang = ?";
        try (Connection conn = koneksi.getKoneksi();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, kodeBarang);
            int affectedRows = pst.executeUpdate();
            
            if (affectedRows > 0) {
                // Menghapus data dari tabel di UI
                DefaultTableModel model = (DefaultTableModel) jTableDataBarang.getModel();
                model.removeRow(selectedRow);
                JOptionPane.showMessageDialog(this, "Data barang berhasil dihapus");
            } else {
                JOptionPane.showMessageDialog(this, "Data barang tidak ditemukan");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus.");
    }
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBatalActionPerformed
        // TODO add your handling code here:
        jTextFieldNamaBarang.setText("");
    jTextFieldKodeBarang.setText("");
    jTextFieldHargaBarang.setText("");
    jSpinnerStok.setValue(0);
    jComboBoxKategoriBarang.setSelectedIndex(0);
    }//GEN-LAST:event_jButtonBatalActionPerformed

    private void jMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jMenuActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        // TODO add your handling code here:
        dispose();
       
    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        // Menutup form DataBarangView
    this.dispose(); // Menutup form saat ini

    // Membuka form menu utama
    FromUtamaView menuUtama = new FromUtamaView();
    menuUtama.setVisible(true); // Menampilkan form menu utama
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItemLaporanStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLaporanStokActionPerformed
        // TODO add your handling code here:
        // Menutup form DataBarangView
    this.dispose(); // Menutup form saat ini

    // Membuka form LaporanView
    LaporanView laporanView = new LaporanView();
    laporanView.setVisible(true); // Menampilkan form LaporanView
    }//GEN-LAST:event_jMenuItemLaporanStokActionPerformed

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        // TODO add your handling code here:
        this.dispose(); // Menutup form utama
        // Menutup form utama dan membuka form login
        new LoginView().setVisible(true); // Membuka form login

    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jButtonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKeluarActionPerformed
        // TODO add your handling code here:

        // Menampilkan dialog konfirmasi
        int response = JOptionPane.showConfirmDialog(null,
            "Apakah Anda yakin ingin keluar?",
            "Konfirmasi Keluar",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);

        // Memeriksa pilihan pengguna
        if (response == JOptionPane.YES_OPTION) {
            System.exit(0); // Keluar dari aplikasi
        }
        // Jika pengguna memilih NO, tidak ada tindakan yang diambil
    }//GEN-LAST:event_jButtonKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(DataBarangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBarangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBarangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBarangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
         
    
  

    // Menampilkan form atau menjalankan aplikasi
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new DataBarangView().setVisible(true);
        }
    });

       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBatal;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonKeluar;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JComboBox<String> jComboBoxKategoriBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMenuDataBarang;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemLaporanStok;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerStok;
    private javax.swing.JTable jTableDataBarang;
    private javax.swing.JTextField jTextFieldHargaBarang;
    private javax.swing.JTextField jTextFieldKodeBarang;
    private javax.swing.JTextField jTextFieldNamaBarang;
    // End of variables declaration//GEN-END:variables
}
