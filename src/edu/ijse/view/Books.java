/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.view;

import edu.ijse.Controller.BookController;
import edu.ijse.dto.BookDto;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Books extends javax.swing.JFrame {
  private BookController bookController;
    
    /**
     * Creates new form Member
     */
     public Books() throws Exception {
        initComponents();
         BookController bookcontroller = new BookController();
        loadTable();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbooks = new javax.swing.JLabel();
        lblbookid = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        lblname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblyear = new javax.swing.JLabel();
        txtyear = new javax.swing.JTextField();
        lblauthor = new javax.swing.JLabel();
        txtauthor = new javax.swing.JTextField();
        lbltotal = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        lblcategory = new javax.swing.JLabel();
        txtcategory = new javax.swing.JTextField();
        lblavailable = new javax.swing.JLabel();
        txtavailable = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbook = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblbooks.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        lblbooks.setText("BOOKS");

        lblbookid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblbookid.setText("Book ID");

        lblname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblname.setText("Book Name");

        lblyear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblyear.setText("Published year");

        lblauthor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblauthor.setText("Author");

        lbltotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltotal.setText("Total Copies");

        lblcategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcategory.setText("Category ID");

        lblavailable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblavailable.setText("Available copies");

        btnadd.setBackground(new java.awt.Color(153, 153, 153));
        btnadd.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnupdate.setBackground(new java.awt.Color(153, 153, 153));
        btnupdate.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(153, 153, 153));
        btndelete.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        tblbook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "name", "author", "year", "total", "available", "category"
            }
        ));
        jScrollPane1.setViewportView(tblbook);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblyear)
                                        .addGap(37, 37, 37)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtyear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(125, 125, 125))
                                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblcategory)
                                            .addGap(56, 56, 56))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblavailable)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtcategory)
                                        .addComponent(txtavailable, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(lblbooks, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblbookid, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btndelete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblbooks, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblbookid, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtauthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblyear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblavailable, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtavailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btnupdate)
                    .addComponent(btndelete))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
      addbook();  // TODO add your handling code here:
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
      updatebook();  // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
      deletebook();  // TODO add your handling code here:
    }//GEN-LAST:event_btndeleteActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblauthor;
    private javax.swing.JLabel lblavailable;
    private javax.swing.JLabel lblbookid;
    private javax.swing.JLabel lblbooks;
    private javax.swing.JLabel lblcategory;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JLabel lblyear;
    private javax.swing.JTable tblbook;
    private javax.swing.JTextField txtauthor;
    private javax.swing.JTextField txtavailable;
    private javax.swing.JTextField txtcategory;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables

    
    private void addbook(){
        try {
            BookDto dto = new BookDto(txtid.getText(),  txtname.getText(),txtauthor.getText(), txtyear.getText(), txttotal.getText(), txtavailable.getText(),txtcategory.getText());
            String resp = bookController.add(dto);
            JOptionPane.showMessageDialog(this, resp);
            clearForm();
            loadTable();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error at save data");
        }

    }

    
    private void loadTable() {
         try {
            String columns[] = {" Id",  "Name","Author", "Year", "Total","Available", "Category"};
            DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            tblbook.setModel(dtm);

            ArrayList<BookDto> bookDtos = bookController.getAll();
            for (BookDto dto : bookDtos) {
                Object[] rowData = {dto.getId(),  dto.getName(),dto.getAuthor(), dto.getYear(), dto.getTotal(), dto.getAvailable(), dto.getCategory()  };
                dtm.addRow(rowData);
            }
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
    
    private void clearForm() {
        txtid.setText("");
        txtname.setText("");
        txtauthor.setText("");
        txtyear.setText("");
        txttotal.setText("");
        txtavailable.setText("");
        txtcategory.setText("");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Books().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    private void searchbook() {
        try {
            String BookId = tblbook.getValueAt(tblbook.getSelectedRow(), 0).toString();
            BookDto dto = bookController.get(BookId);

            if (dto != null) {
                txtid.setText(dto.getId());
                txtname.setText(dto.getName());
                txtauthor.setText(dto.getAuthor());
                txttotal.setText(dto.getTotal());
                txtavailable.setText(dto.getAvailable());
                txtcategory.setText(dto.getCategory());
            } else {
                JOptionPane.showMessageDialog(this, "book Not Found");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error at loading book");
        }
    }
    
    private void deletebook(){
        try {
            String Id = txtid.getText();
            String resp = bookController.delete(Id);
            JOptionPane.showMessageDialog(this, resp);
            clearForm();
            loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error at Delete book");
        }
    }

    private void updatebook() {
        try {
            BookDto bookDto = new BookDto(txtid.getText() , txtname.getText(),txtauthor.getText(), txtyear.getText() ,txttotal.getText(), txtavailable.getText(),txtcategory.getText());
            String resp = bookController.update(bookDto);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearForm();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error at update book");
        }
    }
}
