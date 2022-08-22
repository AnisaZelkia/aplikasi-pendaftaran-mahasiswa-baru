

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;



public class Home3 extends javax.swing.JFrame {
    
	private void Refresh(){
        nomor.setText(null);
        nl.setText(null);
        nik.setText(null);
        t4lhr.setText(null);
        tgl.setText(null);
        jk.setSelectedIndex(0);
        kwn.setSelectedIndex(0);
        agama.setSelectedIndex(0);
        nmibu.setText(null);
        email.setText(null);
        hp.setText(null);
        alamat.setText(null);
        kodepos.setText(null);
        provinsi.setText(null);
        kabupaten.setText(null);
        kecamatan.setText(null);
        pendidikan.setSelectedIndex(0);
        asalsekolah.setText(null);
        nilai.setText(null);
        prodi1.setSelectedIndex(0);
        prodi2.setSelectedIndex(0);
          
    }


    public void tampil(){
    

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("NIK");
        model.addColumn("Nama Lengkap");
        model.addColumn("Tempat Lahir");
        model.addColumn("Tanggal Lahir");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Kewarganegaraan");
        model.addColumn("Agama");
        model.addColumn("Nama Ibu Kandung");
        model.addColumn("Email");
        model.addColumn("No. Telepon");
        model.addColumn("Alamat");
        model.addColumn("Kode Pos");
        model.addColumn("Provinsi");
        model.addColumn("Kota/Kabupaten");
        model.addColumn("Kecamatan");
        model.addColumn("Pendidikan Terakhir");
        model.addColumn("Nama Sekolah");
        model.addColumn("Nilai Akhir");
        model.addColumn("Prodi 1");
        model.addColumn("Prodi 2");
     
        
        //AturJTable(jTable1, new int []{90,100,300,300,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90});
        
        try{
            String sql = "Select * From tbl_mahasiswa";
            java.sql.Connection conn = (Connection)koneksi2.Koneksi();
           
            java.sql.Statement st = conn.createStatement();
            java.sql.ResultSet result = st.executeQuery(sql);
            
            jTable1.setModel(model);
            jTable1.getTableHeader().setOpaque(false);
            jTable1.getTableHeader().setBackground(new Color(32,136,203));
            jTable1.getTableHeader().setForeground(new Color(0,0,0));
            jTable1.setBackground(new Color(255,255,255));
            jTable1.setRowHeight(25);
            while (result.next()){
                model.addRow(new Object[]{
				result.getString(1),
				result.getString(2),
				result.getString(3),
				result.getString(4),
                result.getString(5),
				result.getString(6),
				result.getString(7),
				result.getString(8),
                result.getString(9),
				result.getString(10),
				result.getString(11),
				result.getString(12),
                result.getString(13),
				result.getString(14),
				result.getString(15),
				result.getString(16),
                result.getString(17),
				result.getString(18),
				result.getString(19),
				result.getString(20),
                result.getString(21)});
            }
        }
        catch(Exception e){
            
        }
    }
	public void lebarKolom(){ 
        TableColumn column;
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = jTable1.getColumnModel().getColumn(0); 
        column.setPreferredWidth(30);
        column = jTable1.getColumnModel().getColumn(1); 
        column.setPreferredWidth(60); 
        column = jTable1.getColumnModel().getColumn(2); 
        column.setPreferredWidth(150); 
        column = jTable1.getColumnModel().getColumn(3); 
        column.setPreferredWidth(150);
        column = jTable1.getColumnModel().getColumn(4); 
        column.setPreferredWidth(150);
        column = jTable1.getColumnModel().getColumn(5); 
        column.setPreferredWidth(150); 
        column = jTable1.getColumnModel().getColumn(6); 
        column.setPreferredWidth(130); 
        column = jTable1.getColumnModel().getColumn(7); 
        column.setPreferredWidth(90); 
        column = jTable1.getColumnModel().getColumn(8); 
        column.setPreferredWidth(150); 
        column = jTable1.getColumnModel().getColumn(9); 
        column.setPreferredWidth(150); 
        column = jTable1.getColumnModel().getColumn(10); 
        column.setPreferredWidth(100); 
        column = jTable1.getColumnModel().getColumn(11); 
        column.setPreferredWidth(150);
        column = jTable1.getColumnModel().getColumn(12); 
        column.setPreferredWidth(150); 
        column = jTable1.getColumnModel().getColumn(13); 
        column.setPreferredWidth(150); 
        column = jTable1.getColumnModel().getColumn(14); 
        column.setPreferredWidth(150); 
        column = jTable1.getColumnModel().getColumn(15); 
        column.setPreferredWidth(100); 
        column = jTable1.getColumnModel().getColumn(16); 
        column.setPreferredWidth(150); 
        column = jTable1.getColumnModel().getColumn(17); 
        column.setPreferredWidth(100);
        column = jTable1.getColumnModel().getColumn(18); 
        column.setPreferredWidth(150);
        column = jTable1.getColumnModel().getColumn(19); 
        column.setPreferredWidth(105); 
        column = jTable1.getColumnModel().getColumn(20); 
        column.setPreferredWidth(150); 

    }
	public Home3() {
		initComponents();
		tampil();
                lebarKolom();
                  
        
     
        jTable1.getTableHeader().setOpaque(false);
       
        jTable1.getTableHeader().setBackground(new Color(32, 136, 203));
        jTable1.getTableHeader().setForeground(new Color(0,0,0));
        Refresh();
        pilih(); 
       
     
        
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelHeader1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nomor = new javax.swing.JTextField();
        nl = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nik = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        agama = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        nmibu = new javax.swing.JTextField();
        tgl = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        kwn = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t4lhr = new javax.swing.JTextField();
        jk = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        hp = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelHeader2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        prodi1 = new javax.swing.JComboBox<>();
        jLabelHeader3 = new javax.swing.JLabel();
        prodi2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        kodepos = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        provinsi = new javax.swing.JTextField();
        kabupaten = new javax.swing.JTextField();
        kecamatan = new javax.swing.JTextField();
        jLabelHeader4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pendidikan = new javax.swing.JComboBox<>();
        asalsekolah = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        nilai = new javax.swing.JTextField();
        btnhapus = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btndaftar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        cr = new javax.swing.JTextField();
        btnedit1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelHeader1.setBackground(new java.awt.Color(255, 188, 180));
        jLabelHeader1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabelHeader1.setForeground(new java.awt.Color(48, 14, 51));
        jLabelHeader1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelHeader1.setText("   Data Diri");
        jLabelHeader1.setOpaque(true);

        jLabel6.setText("Nomor");

        jLabel2.setText("Nama Lengkap");

        jLabel3.setText("Nomor Identitas (NIK)");

        jLabel8.setText("Kewarganegaraan");

        agama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Islam", "Kristen", "Katholik", "Hindu", "Buddha" }));

        jLabel9.setText("Agama");

        jLabel7.setText("Jenis Kelamin");

        kwn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "WNI", "WNA" }));

        jLabel10.setText("Nama Ibu Kandung");

        jLabel4.setText("Tempat Lahir");

        jk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Laki-Laki", "Perempuan" }));
        jk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkActionPerformed(evt);
            }
        });

        jLabel5.setText("Tanggal Lahir");

        jLabel20.setText("Nilai Akhir");

        jLabel12.setText("No. Telp");

        jLabelHeader2.setBackground(new java.awt.Color(255, 188, 180));
        jLabelHeader2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabelHeader2.setForeground(new java.awt.Color(48, 14, 51));
        jLabelHeader2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelHeader2.setText("   Pilihan Program Studi (Prodi)");
        jLabelHeader2.setOpaque(true);

        jLabel21.setText("Prodi 1:");

        jLabel11.setText("Email");

        prodi1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "S1 Teknik Informatika", "S1 Sistem Informasi", "S1 Rekayasa Perangkat Lunak", "D3 Manajemen Informatika" }));

        jLabelHeader3.setBackground(new java.awt.Color(255, 188, 180));
        jLabelHeader3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabelHeader3.setForeground(new java.awt.Color(48, 14, 51));
        jLabelHeader3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelHeader3.setText("   Data Alamat Asal");
        jLabelHeader3.setOpaque(true);

        prodi2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "S1 Teknik Informatika", "S1 Sistem Informasi", "S1 Rekayasa Perangkat Lunak", "D3 Manajemen Informatika" }));

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        jLabel22.setText("Prodi 2:");

        jLabel13.setText("Alamat");

        jLabel15.setText("Provinsi");

        jLabel16.setText("Kota / Kabupaten");

        jLabel17.setText("Kecamatan");

        jLabel14.setText("Kode Pos");

        jLabelHeader4.setBackground(new java.awt.Color(255, 188, 180));
        jLabelHeader4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabelHeader4.setForeground(new java.awt.Color(48, 14, 51));
        jLabelHeader4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelHeader4.setText("   Data Pendidikan");
        jLabelHeader4.setOpaque(true);

        jLabel18.setText("Pendidikan Terakhir");

        pendidikan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "SMA - IPA", "SMA - IPS", "SMK" }));

        jLabel19.setText("Nama Sekolah");

        btnhapus.setBackground(new java.awt.Color(195, 35, 97));
        btnhapus.setForeground(new java.awt.Color(255, 255, 255));
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnkeluar.setBackground(new java.awt.Color(195, 35, 97));
        btnkeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        btnrefresh.setBackground(new java.awt.Color(195, 35, 97));
        btnrefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnrefresh.setText("Reset");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        btnedit.setBackground(new java.awt.Color(195, 35, 97));
        btnedit.setForeground(new java.awt.Color(255, 255, 255));
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btndaftar.setBackground(new java.awt.Color(195, 35, 97));
        btndaftar.setForeground(new java.awt.Color(255, 255, 255));
        btndaftar.setText("Daftar");
        btndaftar.setToolTipText("");
        btndaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndaftarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(195, 35, 97));

        jLabel1.setBackground(new java.awt.Color(71, 120, 197));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM PENDAFTARAN MAHASISWA BARU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(506, 506, 506)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(734, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(255, 153, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(35);
        jTable1.setSelectionBackground(new java.awt.Color(48, 14, 51));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowHorizontalLines(false);
        jScrollPane2.setViewportView(jTable1);
        jTable1.setFocusable(false);

        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));

        jTable1.setShowVerticalLines(false);

        jTable1.getTableHeader().setReorderingAllowed(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(48, 14, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(485, 10));

        cr.setBackground(new java.awt.Color(234, 76, 137));
        cr.setToolTipText("");
        cr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crActionPerformed(evt);
            }
        });
        cr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                crKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cr, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(cr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnedit1.setBackground(new java.awt.Color(195, 35, 97));
        btnedit1.setForeground(new java.awt.Color(255, 255, 255));
        btnedit1.setText("Cari");
        btnedit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnedit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(t4lhr, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomor, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nl, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(nik, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(kwn, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(agama, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(nmibu)))))
                    .addComponent(jLabelHeader3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(pendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(asalsekolah, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel20))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(kodepos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(hp, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(180, 180, 180))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(provinsi, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel16)
                                    .addComponent(kabupaten, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(kecamatan)))))
                    .addComponent(jLabelHeader4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelHeader2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel21)
                                .addGap(212, 212, 212))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(prodi1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(prodi2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btndaftar)
                        .addGap(42, 42, 42)
                        .addComponent(btnrefresh))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(457, 457, 457)
                        .addComponent(nilai, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnhapus)
                        .addGap(34, 34, 34)
                        .addComponent(btnkeluar)
                        .addGap(256, 256, 256))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnedit1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(t4lhr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(kwn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(agama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nmibu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnedit1)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelHeader3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(kodepos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(provinsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(kabupaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelHeader4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(asalsekolah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(prodi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prodi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(221, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btndaftar)
                                    .addComponent(btnrefresh)
                                    .addComponent(btnedit)
                                    .addComponent(btnhapus)
                                    .addComponent(btnkeluar))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1516, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndaftarActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "insert into tbl_mahasiswa values"
            + "('"+nomor.getText()
            +"','"+nik.getText()
            +"','"+nl.getText()
            +"','"+t4lhr.getText()
            +"','"+tgl.getText()
            +"','"+jk.getSelectedItem()
            +"','"+kwn.getSelectedItem()
            +"','"+agama.getSelectedItem()
            +"','"+nmibu.getText()
            +"','"+email.getText()
            +"','"+hp.getText()
            +"','"+alamat.getText()
            +"','"+kodepos.getText()
            +"','"+provinsi.getText()
            +"','"+kabupaten.getText()
            +"','"+kecamatan.getText()
            +"','"+pendidikan.getSelectedItem()
            +"','"+asalsekolah.getText()
            +"','"+nilai.getText()
            +"','"+prodi1.getSelectedItem()
            +"','"+prodi2.getSelectedItem()
            +"')";
                java.sql.Connection conn = (Connection)koneksi2.Koneksi();
            java.sql.PreparedStatement prepared = conn.prepareStatement(sql);
            prepared.execute();
            JOptionPane.showMessageDialog(null, "Pendaftaran telah berhasil");
			tampil();
            Refresh();
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
         lebarKolom();
         tampil();
    }//GEN-LAST:event_btndaftarActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        try{
            String sql = ("update tbl_mahasiswa set nikmhs='"+nik.getText()
				+"',namamhs='"+nl.getText()
				+"', tempatlahir='"+t4lhr.getText()
				+"',tanggallahir='"+tgl.getText()
				+"',jk='"+jk.getSelectedItem()
				+"',kewarganegaraan='"+kwn.getSelectedItem()
				+"',agama='"+agama.getSelectedItem()
				+"', nmibu='"+nmibu.getText()
				+"',email='"+email.getText()
				+"',nohp='"+hp.getText()
				+"',alamat='"+alamat.getText()
				+"',kodepos='"+kodepos.getText()
				+"',provinsi='"+provinsi.getText()
				+"',kabupaten='"+kabupaten.getText()
				+"',kecamatan='"+kecamatan.getText()
				+"',pendtrakhir='"+pendidikan.getSelectedItem()
				+"',nmsekolah='"+asalsekolah.getText()
				+"',nilai='"+nilai.getText()
				+"',prodi='"+prodi1.getSelectedItem()
				+"',prodii='"+prodi2.getSelectedItem()
				+"'where nodaftar='"+nomor.getText()+"'");
            java.sql.Connection conn = (Connection)koneksi2.Koneksi();
            java.sql.PreparedStatement prepared = conn.prepareStatement(sql);
            prepared.execute();
            JOptionPane.showMessageDialog(null, "Data telah berhasil diubah");
			tampil();
            Refresh();
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
          
        }
        lebarKolom();
          tampil();
    }//GEN-LAST:event_btneditActionPerformed

 

       
        
    
class MyList implements ListSelectionListener{

 public void valueChanged(ListSelectionEvent e) {
 if (e.getValueIsAdjusting()) return;
 ListSelectionModel lsm = (ListSelectionModel) e.getSource();
 int selectedRow = lsm.getMinSelectionIndex();

 TableModel tm = jTable1.getModel() ;
 nomor.setText(tm.getValueAt(selectedRow,0).toString()) ;
nik.setText(tm.getValueAt(selectedRow,1).toString()) ;
 nl.setText(tm.getValueAt(selectedRow,2).toString()) ;
t4lhr.setText(tm.getValueAt(selectedRow,3).toString()) ;
tgl.setText(tm.getValueAt(selectedRow,4).toString()) ;
 if (tm.getValueAt(selectedRow,5).toString().equals("Perempuan"))
jk.setSelectedIndex(2);
 else
jk.setSelectedIndex(1);
 
  if (tm.getValueAt(selectedRow,6).toString().equals("WNA"))
kwn.setSelectedIndex(2);
 else
kwn.setSelectedIndex(1);
   
  if (tm.getValueAt(selectedRow,7).toString().equals("Islam"))
agama.setSelectedIndex(1);
  else   if (tm.getValueAt(selectedRow,7).toString().equals("Kristen"))
agama.setSelectedIndex(2);
   else   if (tm.getValueAt(selectedRow,7).toString().equals("Katholik"))
agama.setSelectedIndex(3);
   else   if (tm.getValueAt(selectedRow,7).toString().equals("Hindu"))
agama.setSelectedIndex(4);
   else   
agama.setSelectedIndex(5);
 

  nmibu.setText(tm.getValueAt(selectedRow,8).toString()) ;
   email.setText(tm.getValueAt(selectedRow,9).toString())  ;
          hp.setText(tm.getValueAt(selectedRow,10).toString()) ;
          alamat.setText(tm.getValueAt(selectedRow,11).toString()) ;
   kodepos.setText(tm.getValueAt(selectedRow,12).toString());

   provinsi.setText(tm.getValueAt(selectedRow,13).toString());
   kabupaten.setText(tm.getValueAt(selectedRow,14).toString());
   kecamatan.setText(tm.getValueAt(selectedRow,15).toString());
   
if (tm.getValueAt(selectedRow,16).toString().equals( "SMA - IPA"))
pendidikan.setSelectedIndex(1);
  else   if (tm.getValueAt(selectedRow,16).toString().equals("SMA - IPS"))
pendidikan.setSelectedIndex(2);
   else   
   pendidikan.setSelectedIndex(3);
  asalsekolah.setText(tm.getValueAt(selectedRow,17).toString()) ;
  nilai.setText(tm.getValueAt(selectedRow,18).toString()) ;
  
  
    if (tm.getValueAt(selectedRow,19).toString().equals( "S1 Teknik Informatika"))
prodi1.setSelectedIndex(1);
  else   if (tm.getValueAt(selectedRow,19).toString().equals("S1 Sistem Informasi"))
prodi1.setSelectedIndex(2);
   else   if (tm.getValueAt(selectedRow,19).toString().equals("S1 Rekayasa Perangkat Lunak"))
prodi1.setSelectedIndex(3);
   else
prodi1.setSelectedIndex(4);
  

    if (tm.getValueAt(selectedRow,20).toString().equals( "S1 Teknik Informatika"))
prodi2.setSelectedIndex(1);
  else   if (tm.getValueAt(selectedRow,20).toString().equals("S1 Sistem Informasi"))
prodi2.setSelectedIndex(2);
   else   if (tm.getValueAt(selectedRow,20).toString().equals("S1 Rekayasa Perangkat Lunak"))
prodi2.setSelectedIndex(3);
   else 
prodi2.setSelectedIndex(4);
 
nomor.setText(tm.getValueAt(selectedRow,21).toString()) ;
 } 
}


void pilih (){
 jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
 ListSelectionModel rowSM = jTable1.getSelectionModel();
 rowSM.addListSelectionListener(new MyList());
 }
    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "delete from tbl_mahasiswa where nodaftar='"+nomor.getText()+"'";
               java.sql.Connection conn = (Connection)koneksi2.Koneksi();
            java.sql.PreparedStatement prepared = conn.prepareStatement(sql);
            prepared.execute();
                 
      
            JOptionPane.showMessageDialog(null, "Data telah berhasil dihapus");
        Refresh();
        tampil();
                lebarKolom();
   
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
      	tampil();
                lebarKolom();
               
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        // TODO add your handling code here:
		Refresh();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
		System.exit(0);
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void jkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jkActionPerformed

    
    private void crKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_crKeyReleased


 
    }//GEN-LAST:event_crKeyReleased

    private void crActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crActionPerformed
       
    }//GEN-LAST:event_crActionPerformed

    private void btnedit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnedit1ActionPerformed
 DefaultTableModel model = new DefaultTableModel();
      model.addColumn("No");
        model.addColumn("NIK");
        model.addColumn("Nama Lengkap");
        model.addColumn("Tempat Lahir");
        model.addColumn("Tanggal Lahir");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Kewarganegaraan");
        model.addColumn("Agama");
        model.addColumn("Nama Ibu Kandung");
        model.addColumn("Email");
        model.addColumn("No. Telepon");
        model.addColumn("Alamat");
        model.addColumn("Kode Pos");
        model.addColumn("Provinsi");
        model.addColumn("Kota/Kabupaten");
        model.addColumn("Kecamatan");
        model.addColumn("Pendidikan Terakhir");
        model.addColumn("Nama Sekolah");
        model.addColumn("Nilai Akhir");
        model.addColumn("Prodi 1");
        model.addColumn("Prodi 2");
        

  
       try{
            tampil();
                    java.sql.Connection conn = (Connection)koneksi2.Koneksi();        

            String sql = "select * from tbl_mahasiswa	 where  namamhs like '%"+cr.getText()+"%'"+"or nikmhs like '%"+cr.getText()+"%'";
                   
     
    
            java.sql.Statement st = conn.createStatement();
            java.sql.ResultSet result = st.executeQuery(sql);
                  
  
            while (result.next()){
                             
                    model.addRow(new Object[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8),result.getString(9),result.getString(10),result.getString(11),result.getString(12),result.getString(13),result.getString(14),result.getString(15),result.getString(16),result.getString(17),result.getString(18),result.getString(19),result.getString(20),result.getString(21),result.getString(22)});

            }    
           
           jTable1.setModel (model); 
           lebarKolom();

        }
          catch(Exception e){
                
               
        }  
          lebarKolom();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnedit1ActionPerformed

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
			java.util.logging.Logger.getLogger(Home3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Home3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Home3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Home3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Home3().setVisible(true);
                                 
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agama;
    private javax.swing.JTextArea alamat;
    private javax.swing.JTextField asalsekolah;
    private javax.swing.JButton btndaftar;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnedit1;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JTextField cr;
    private javax.swing.JTextField email;
    private javax.swing.JTextField hp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelHeader1;
    private javax.swing.JLabel jLabelHeader2;
    private javax.swing.JLabel jLabelHeader3;
    private javax.swing.JLabel jLabelHeader4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jk;
    private javax.swing.JTextField kabupaten;
    private javax.swing.JTextField kecamatan;
    private javax.swing.JTextField kodepos;
    private javax.swing.JComboBox<String> kwn;
    private javax.swing.JTextField nik;
    private javax.swing.JTextField nilai;
    private javax.swing.JTextField nl;
    private javax.swing.JTextField nmibu;
    private javax.swing.JTextField nomor;
    private javax.swing.JComboBox<String> pendidikan;
    private javax.swing.JComboBox<String> prodi1;
    private javax.swing.JComboBox<String> prodi2;
    private javax.swing.JTextField provinsi;
    private javax.swing.JTextField t4lhr;
    private javax.swing.JTextField tgl;
    // End of variables declaration//GEN-END:variables
}
