package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import koneksi.DatabaseConnection;

/**
 * Form Laporan Penjualan Buku (Tanpa JasperReports)
 * @author Fadillah
 */
public class LaporanFrame extends javax.swing.JFrame {

    DefaultTableModel model;

    public LaporanFrame() {
        initComponents();
        setTitle("Laporan Penjualan Buku");
        setLocationRelativeTo(null);
        setSize(800, 600);

        // === Buat model tabel ===
        model = new DefaultTableModel();
        tbl.setModel(model);
        scrollpane.setBorder(BorderFactory.createTitledBorder("Data Laporan"));

        // === Tambah event ===
        btnTampilkan.addActionListener(e -> tampilkanLaporan());
        btnCetakPDF.addActionListener(e -> exportTabelKePDF());
        btnKeluar.addActionListener(e -> dispose());
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlAtas = new javax.swing.JPanel();
        lblJudul = new javax.swing.JLabel();
        lblPilih = new javax.swing.JLabel();
        cmbLaporan = new javax.swing.JComboBox<>();
        pnlTengah = new javax.swing.JPanel();
        lblTanggal1 = new javax.swing.JLabel();
        txtTanggalAwal = new javax.swing.JTextField();
        lblTanggal2 = new javax.swing.JLabel();
        txtTanggalAkhir = new javax.swing.JTextField();
        pnlBawah = new javax.swing.JPanel();
        btnTampilkan = new javax.swing.JButton();
        btnCetakPDF = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        scrollpane = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlAtas.setBackground(new java.awt.Color(230, 210, 250));
        pnlAtas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblJudul.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblJudul.setText("Laporan Penjualan Buku");
        pnlAtas.add(lblJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 5, -1, -1));

        lblPilih.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblPilih.setText("Pilih Jenis Laporan :");
        pnlAtas.add(lblPilih, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 45, 111, 29));

        cmbLaporan.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        cmbLaporan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buku", "Pelanggan", "Penjualan" }));
        pnlAtas.add(cmbLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 49, -1, -1));

        pnlTengah.setBackground(new java.awt.Color(230, 210, 250));

        lblTanggal1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblTanggal1.setText("Dari Tanggal :");

        txtTanggalAwal.setText("YYYY-MM-DD");

        lblTanggal2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblTanggal2.setText("Sampai :");

        txtTanggalAkhir.setText("YYYY-MM-DD");

        javax.swing.GroupLayout pnlTengahLayout = new javax.swing.GroupLayout(pnlTengah);
        pnlTengah.setLayout(pnlTengahLayout);
        pnlTengahLayout.setHorizontalGroup(
            pnlTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTengahLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTanggal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTanggalAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(lblTanggal2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTanggalAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTengahLayout.setVerticalGroup(
            pnlTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTengahLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(pnlTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTanggalAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTanggal1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTanggal2)
                    .addComponent(txtTanggalAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pnlBawah.setBackground(new java.awt.Color(230, 210, 250));

        btnTampilkan.setBackground(new java.awt.Color(0, 153, 51));
        btnTampilkan.setForeground(new java.awt.Color(200, 235, 230));
        btnTampilkan.setText("TAMPILKAN LAPORAN");

        btnCetakPDF.setBackground(new java.awt.Color(204, 0, 0));
        btnCetakPDF.setForeground(new java.awt.Color(200, 235, 230));
        btnCetakPDF.setText("CETAK PDF");

        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollpane.setViewportView(tbl);

        javax.swing.GroupLayout pnlBawahLayout = new javax.swing.GroupLayout(pnlBawah);
        pnlBawah.setLayout(pnlBawahLayout);
        pnlBawahLayout.setHorizontalGroup(
            pnlBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBawahLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBawahLayout.createSequentialGroup()
                        .addComponent(scrollpane)
                        .addContainerGap())
                    .addGroup(pnlBawahLayout.createSequentialGroup()
                        .addComponent(btnTampilkan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCetakPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))))
        );
        pnlBawahLayout.setVerticalGroup(
            pnlBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBawahLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(pnlBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTampilkan)
                    .addComponent(btnCetakPDF)
                    .addComponent(btnKeluar))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAtas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTengah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBawah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlAtas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTengah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBawah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        btnKeluar.addActionListener(e -> dispose());
    }//GEN-LAST:event_btnKeluarActionPerformed
                                   
    // === METHOD UNTUK MENAMPILKAN LAPORAN ===
    private void tampilkanLaporan() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String laporanDipilih = cmbLaporan.getSelectedItem().toString();
            String sql;

            switch (laporanDipilih) {
                case "Buku":
                    sql = "SELECT id_buku AS ID, judul AS Judul, pengarang AS Pengarang, harga AS Harga FROM buku";
                    break;
                case "Pelanggan":
                    sql = "SELECT id_pelanggan AS ID, nama AS Nama, alamat AS Alamat, telepon AS Telepon FROM pelanggan";
                    break;
                case "Penjualan":
                    sql = "SELECT p.id_penjualan AS ID, p.tanggal AS Tanggal, pe.nama AS Pelanggan, "
                         + "b.judul AS Buku, d.jumlah AS Jumlah, d.subtotal AS Subtotal "
                         + "FROM penjualan p "
                         + "JOIN pelanggan pe ON p.id_pelanggan = pe.id_pelanggan "
                         + "JOIN detail_penjualan d ON p.id_penjualan = d.id_penjualan "
                         + "JOIN buku b ON d.id_buku = b.id_buku "
                         + "WHERE p.tanggal BETWEEN ? AND ?";
                    break;
                default:
                    return;
            }

            PreparedStatement pst = conn.prepareStatement(sql);
            if ("Penjualan".equals(laporanDipilih)) {
                pst.setString(1, txtTanggalAwal.getText());
                pst.setString(2, txtTanggalAkhir.getText());
            }

            ResultSet rs = pst.executeQuery();
            model.setRowCount(0);

            // Kolom otomatis
            int kolom = rs.getMetaData().getColumnCount();
            model.setColumnCount(0);
            for (int i = 1; i <= kolom; i++) {
                model.addColumn(rs.getMetaData().getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] baris = new Object[kolom];
                for (int i = 0; i < kolom; i++) {
                    baris[i] = rs.getObject(i + 1);
                }
                model.addRow(baris);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal menampilkan laporan: " + e.getMessage());
        }
    }

    // === CETAK LAPORAN KE PDF (Print Dialog) ===
    private void exportTabelKePDF() {
        try {
            boolean printed = tbl.print();
            if (printed) {
                JOptionPane.showMessageDialog(this, "Laporan berhasil disimpan melalui dialog Print ke PDF!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal mencetak laporan: " + e.getMessage());
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new LaporanFrame().setVisible(true));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetakPDF;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnTampilkan;
    private javax.swing.JComboBox<String> cmbLaporan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblPilih;
    private javax.swing.JLabel lblTanggal1;
    private javax.swing.JLabel lblTanggal2;
    private javax.swing.JPanel pnlAtas;
    private javax.swing.JPanel pnlBawah;
    private javax.swing.JPanel pnlTengah;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtTanggalAkhir;
    private javax.swing.JTextField txtTanggalAwal;
    // End of variables declaration//GEN-END:variables
}
