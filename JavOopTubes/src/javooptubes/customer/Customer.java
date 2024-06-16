/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javooptubes.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javooptubes.signup.SignIn;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author benon
 */
public class Customer extends javax.swing.JFrame {

    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    
      
    public void selectProduct(){
        try{
            con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/tubespbodb", "root", "");
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM products");
            prodTbl.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    int prID, newQty;
    public void update(){
        try{
                con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/tubespbodb", "root", "");
                String query = "UPDATE products SET prodQtty=" + newQty +""+ " WHERE prodID=" + prID;
                Statement add = con.createStatement();
                add.executeUpdate(query);
//                JOptionPane.showMessageDialog(this, "Berhasil diupdate");
                selectProduct();
            }catch(SQLException e){
                e.printStackTrace();
            }
    }
    
    
    public Customer() {
        initComponents();
        selectProduct();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        prodCat = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        prodID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        prodName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        prodQty = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodTbl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        addBtn1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        keranjang = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        totalBelanja = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        addBtn3 = new javax.swing.JButton();
        kategoriBtn1 = new javax.swing.JButton();
        logoutBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Filter");

        prodCat.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        prodCat.setForeground(new java.awt.Color(51, 51, 51));
        prodCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverage", "Vegetable", "Meat" }));
        prodCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodCatActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Pembelian Produk");

        prodID.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prodID.setForeground(new java.awt.Color(51, 51, 51));
        prodID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodIDActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Produk ID");

        prodName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prodName.setForeground(new java.awt.Color(51, 51, 51));
        prodName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodNameActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Nama");

        prodQty.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prodQty.setForeground(new java.awt.Color(51, 51, 51));
        prodQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodQtyActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Kuantitas");

        addBtn.setBackground(new java.awt.Color(0, 153, 255));
        addBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("+ Keranjang");
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        clearBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(0, 153, 255));
        clearBtn.setText("Bersihkan");
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBtnMouseClicked(evt);
            }
        });
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        prodTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Kuantitas", "Harga", "Kategori"
            }
        ));
        prodTbl.setShowGrid(true);
        prodTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prodTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(prodTbl);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Keranjang Saya");

        addBtn1.setBackground(new java.awt.Color(0, 153, 255));
        addBtn1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addBtn1.setForeground(new java.awt.Color(255, 255, 255));
        addBtn1.setText("Refresh");
        addBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtn1MouseClicked(evt);
            }
        });
        addBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn1ActionPerformed(evt);
            }
        });

        keranjang.setColumns(20);
        keranjang.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        keranjang.setRows(5);
        keranjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keranjangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(keranjang);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Pilih Produk");

        totalBelanja.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        totalBelanja.setForeground(new java.awt.Color(255, 102, 0));
        totalBelanja.setText("0");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\benon\\OneDrive\\Documents\\Aku Cinta Coding\\TUBES PBO\\JavOopTubes\\img\\QRPayment.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(prodID)
                                    .addComponent(prodName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(prodQty, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(clearBtn)
                                .addGap(18, 18, 18)
                                .addComponent(addBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(prodCat, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(addBtn1)))
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(206, 206, 206))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(168, 168, 168)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(107, 107, 107))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalBelanja)
                .addGap(158, 158, 158))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(prodID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(prodName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(prodQty, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(addBtn)
                                    .addComponent(clearBtn)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(prodCat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(addBtn1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalBelanja)
                .addGap(20, 20, 20))
        );

        close.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setText("×");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pilih Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        addBtn3.setBackground(new java.awt.Color(0, 153, 255));
        addBtn3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addBtn3.setForeground(new java.awt.Color(255, 255, 255));
        addBtn3.setText("Produk");
        addBtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtn3MouseClicked(evt);
            }
        });
        addBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn3ActionPerformed(evt);
            }
        });

        kategoriBtn1.setBackground(new java.awt.Color(204, 204, 204));
        kategoriBtn1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        kategoriBtn1.setForeground(new java.awt.Color(102, 102, 102));
        kategoriBtn1.setText("Kategori");
        kategoriBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kategoriBtn1MouseClicked(evt);
            }
        });
        kategoriBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategoriBtn1ActionPerformed(evt);
            }
        });

        logoutBtn1.setBackground(new java.awt.Color(255, 51, 51));
        logoutBtn1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        logoutBtn1.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn1.setText("Keluar");
        logoutBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtn1MouseClicked(evt);
            }
        });
        logoutBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kategoriBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(logoutBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(addBtn3)
                .addGap(18, 18, 18)
                .addComponent(kategoriBtn1)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoutBtn1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void prodCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodCatActionPerformed

    private void prodNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodNameActionPerformed

    private void prodQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodQtyActionPerformed

    int i = 0;
    
    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        if (prodQty.getText().isEmpty() || prodName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informasi harus lengkap");
        } else {
            int quantity = Integer.valueOf(prodQty.getText());
            if (quantity > availQty) {
                JOptionPane.showMessageDialog(this, "Stok produk yang dipilih tidak cukup");
            } else {
                i++;
                prodTotal = UPrice * quantity;
                grdTotal = grdTotal + prodTotal;
                newQty = availQty - quantity;

                if (i == 1) {
                    keranjang.setText("NUM\tPRODUK\tHARGA\tKUANTITAS\tTOTAL\n" + i + "\t" + prodName.getText() + "\t" + UPrice + "\t" + quantity + "\t" + prodTotal + "\n");
                } else {
                    keranjang.setText(keranjang.getText() + i + "\t" + prodName.getText() + "\t" + UPrice + "\t" + quantity + "\t" + prodTotal + "\n");
                }

                totalBelanja.setText("Rp." + grdTotal);
                update(); // Update the product quantity after adding to the cart
            }
        }
    }//GEN-LAST:event_addBtnMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtnActionPerformed

    private void clearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseClicked
        prodID.setText("");
        prodName.setText("");
        prodQty.setText("");
//        prodPrice.setText("");
    }//GEN-LAST:event_clearBtnMouseClicked

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBtnActionPerformed
    
    Double UPrice, prodTotal=0.0, grdTotal=0.0;
    int availQty;
    private void prodTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodTblMouseClicked
        DefaultTableModel model = (DefaultTableModel) prodTbl.getModel();
        int myIndex = prodTbl.getSelectedRow();
        prID = Integer.valueOf(model.getValueAt(myIndex, 0).toString());
        UPrice = Double.valueOf(model.getValueAt(myIndex, 3).toString());
        prodName.setText(model.getValueAt(myIndex, 1).toString());
        availQty = Integer.valueOf(model.getValueAt(myIndex, 2).toString());
        
        
        
        
//        prodQty.setText(model.getValueAt(myIndex, 2).toString());
//        prodPrice.setText(model.getValueAt(myIndex, 3).toString());
    }//GEN-LAST:event_prodTblMouseClicked

    
    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void addBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtn1MouseClicked

    private void addBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtn1ActionPerformed

    private void keranjangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keranjangMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_keranjangMouseClicked

    private void prodIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodIDActionPerformed

    private void addBtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtn3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtn3MouseClicked

    private void addBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtn3ActionPerformed

    private void kategoriBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kategoriBtn1MouseClicked
//        Categories catgFrame = new Categories();
//        catgFrame.setVisible(true);
//        catgFrame.pack();
//        catgFrame.setLocationRelativeTo(null);
//        this.dispose();
    }//GEN-LAST:event_kategoriBtn1MouseClicked

    private void kategoriBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategoriBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kategoriBtn1ActionPerformed

    private void logoutBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtn1MouseClicked
        SignIn signInFrame = new SignIn();
        signInFrame.setVisible(true);
        signInFrame.pack();
        signInFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logoutBtn1MouseClicked

    private void logoutBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton addBtn1;
    private javax.swing.JButton addBtn3;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kategoriBtn1;
    private javax.swing.JTextArea keranjang;
    private javax.swing.JButton logoutBtn1;
    private javax.swing.JComboBox<String> prodCat;
    private javax.swing.JTextField prodID;
    private javax.swing.JTextField prodName;
    private javax.swing.JTextField prodQty;
    private javax.swing.JTable prodTbl;
    private javax.swing.JLabel totalBelanja;
    // End of variables declaration//GEN-END:variables
}
