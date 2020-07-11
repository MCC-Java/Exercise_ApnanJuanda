/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.CountryController;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import models.Country;

/**
 *
 * @author ASUS
 */
public class FormCountry extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormCountry
     */
    CountryController ctCountry;
    
    public FormCountry() {
        initComponents();
        ctCountry = new CountryController(this);
        loadData(ctCountry.binding());
//        stayDataid(ctCountry.staying());
        txtdataid.setEnabled(false);
        lbldataid.setEnabled(false);
        
        
        btnupdate.setEnabled(false);
        btndelete.setEnabled(false);
        btncancel.setEnabled(false);
        //ctCountry.isiTabel();
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
        lbldataid = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtregion = new javax.swing.JTextField();
        txtdataid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcountry = new javax.swing.JTable();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        txtcari = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();

        setTitle("Form Country");

        lbldataid.setText("Data Id");

        jLabel2.setText("ID");

        jLabel3.setText("Name");

        jLabel4.setText("Region");

        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidKeyTyped(evt);
            }
        });

        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnameKeyTyped(evt);
            }
        });

        txtregion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtregionKeyTyped(evt);
            }
        });

        tblcountry.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblcountry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcountryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcountry);

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
        });

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsearch))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbldataid)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtdataid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtregion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnsave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnupdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btncancel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbldataid)
                            .addComponent(txtdataid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addComponent(jLabel3))
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtregion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsave)
                            .addComponent(btnupdate)
                            .addComponent(btndelete)
                            .addComponent(btncancel)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
       int dataid = Integer.parseInt(txtdataid.getText());
       ctCountry.deleting(dataid);
       loadData(ctCountry.binding());
       ctCountry.reset();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
       if(txtid.getText().trim().isEmpty() || txtname.getText().trim().isEmpty() || txtregion.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(null, "Ada data yang masih kosong", "Peringatan", JOptionPane.WARNING_MESSAGE);
       }
       else{
       String id = txtid.getText();
       String name = txtname.getText();
       String region = txtregion.getText();
       String message = ctCountry.inserting(id, name, region);
       JOptionPane.showMessageDialog(this, message, "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
       loadData(ctCountry.binding());
       ctCountry.reset();}
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed

          loadData(ctCountry.searching(txtcari.getText()));
    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed

    }//GEN-LAST:event_txtcariActionPerformed

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed

    }//GEN-LAST:event_txtcariKeyPressed

    private void tblcountryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcountryMouseClicked
       int row = tblcountry.getSelectedRow();
       String id = tblcountry.getValueAt(row, 0).toString();
       String name = tblcountry.getValueAt(row, 1).toString();
       String region = tblcountry.getValueAt(row, 2).toString();
       String dataid = tblcountry.getValueAt(row, 3).toString();
       txtid.setText(id);
       txtname.setText(name);
       txtregion.setText(region);
       txtdataid.setText(dataid);
       btnsave.setEnabled(false);
       btndelete.setEnabled(true);
       btnupdate.setEnabled(true);
       btncancel.setEnabled(true);
       gettxtdataid().setEnabled(false);
    }//GEN-LAST:event_tblcountryMouseClicked

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        ctCountry.reset();
        btnsave.setEnabled(true);
        btndelete.setEnabled(false);
        btnupdate.setEnabled(false);
        btncancel.setEnabled(false);
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
       if(txtid.getText().trim().isEmpty() || txtname.getText().trim().isEmpty() || txtregion.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(null, "Ada data yang masih kosong", "Peringatan", JOptionPane.WARNING_MESSAGE);
       }
       else{
       String id = txtid.getText();
       String name = txtname.getText();
       String region = txtregion.getText();
       String dataid = txtdataid.getText();
       String message = ctCountry.updating(id, name, region, dataid);
       JOptionPane.showMessageDialog(this, message, "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
       loadData(ctCountry.binding());
       ctCountry.reset();}
    }//GEN-LAST:event_btnupdateActionPerformed

    private void txtidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyTyped
       filterNumber(evt);
    }//GEN-LAST:event_txtidKeyTyped

    private void txtnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyTyped
        filterNumber(evt);
    }//GEN-LAST:event_txtnameKeyTyped

    private void txtregionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtregionKeyTyped
        filterAlphabet(evt);
    }//GEN-LAST:event_txtregionKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldataid;
    private javax.swing.JTable tblcountry;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtdataid;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtregion;
    // End of variables declaration//GEN-END:variables
    
     
    private void loadData(List<Country> countries){
        String header[] = {"Id","Name","Region","Data Id"};
        String [][] data = new String[countries.size()][4];
        for(int i=0; i<data.length; i++){
            data[i][0] = countries.get(i).getId();
            data[i][1] = countries.get(i).getName();
            data[i][2] = countries.get(i).getRegion() + "";
            data[i][3] = countries.get(i).getData_id()+ "";
        }
        DefaultTableModel defaultTableModel = new DefaultTableModel(data, header);
        tblcountry.setModel(defaultTableModel); 
    }
    
    private void stayDataid(List<Country> countries){
        String header[] = {"Data Id"};
        String [][] angka = new String[countries.size()][1];
        for(int i=0; i<angka.length; i++){
            angka[i][0] = countries.get(i).getData_id()+ "";
        }
        angka[(angka.length)-1][0]=countries.get((angka.length)-1).getData_id() + "";
        String stayData = angka[(angka.length)-1][0];
        txtdataid.setText(stayData);
    }
    
    private void filterAlphabet(KeyEvent a){
        if(Character.isAlphabetic(a.getKeyChar())){
            a.consume();
            JOptionPane.showMessageDialog(null,"Hanya Bisa Memasukan Karakter Angka");
        }
    }
    
    private void filterNumber(KeyEvent b){
        if(Character.isDigit(b.getKeyChar())){
            b.consume();
            JOptionPane.showMessageDialog(null,"Hanya Bisa Memasukan Karakter Huruf");
        }
    }
    
    
    public JTextField gettxtid(){
        return txtid;
    }
     
    public JTextField gettxtname(){
        return txtname;
    }
    
    public JTextField gettxtregion(){
        return txtregion;
    }
    
    public JTextField gettxtdataid(){
        return txtdataid;
    }


}
