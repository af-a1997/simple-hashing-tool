package com.afa1997.sas_act4.frames;

import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;
import java.util.List;

public class OutputHashes extends javax.swing.JFrame {
    static List<String[]> rcv_ha_in = new ArrayList<>();
    static String rcv_og_text;

    public OutputHashes() {
        initComponents();
    }

    public OutputHashes(List<String[]> ha_in, String og_text) {
        rcv_ha_in = ha_in;
        rcv_og_text = og_text;
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jsp_hash_cont = new javax.swing.JScrollPane();
        jt_out = new javax.swing.JTable();
        jb_close = new javax.swing.JButton();
        jl_orig_text = new javax.swing.JLabel();
        jsp_ot_cont = new javax.swing.JScrollPane();
        jta_orig_text = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Result");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jt_out.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Hash function", "Output"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jsp_hash_cont.setViewportView(jt_out);

        jb_close.setText("Done");
        jb_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_closeActionPerformed(evt);
            }
        });

        jl_orig_text.setText("Original text:");

        jta_orig_text.setEditable(false);
        jta_orig_text.setColumns(20);
        jta_orig_text.setRows(5);
        jsp_ot_cont.setViewportView(jta_orig_text);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jsp_hash_cont, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jb_close))
                    .addComponent(jsp_ot_cont)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_orig_text)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_orig_text)
                .addGap(3, 3, 3)
                .addComponent(jsp_ot_cont, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsp_hash_cont, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_close)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_closeActionPerformed
        this.dispose();
    }//GEN-LAST:event_jb_closeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel dtm_hash_out = new DefaultTableModel();
        String[] tbl_headings = {"Hash function", "Output"};
        
        jt_out.setModel(dtm_hash_out);
        
        dtm_hash_out.setColumnIdentifiers(tbl_headings);
        dtm_hash_out.setRowCount(0);
        
        // Make the hash function list the smaller column.
        int col0_w = 140;
        jt_out.getColumnModel().getColumn(0).setMinWidth(col0_w);
        jt_out.getColumnModel().getColumn(0).setMaxWidth(col0_w);
        jt_out.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        
        for(String[] out_ha_done : rcv_ha_in){
            Object[] obj_ha_list = new Object[2];

            obj_ha_list[0] = out_ha_done[0];
            obj_ha_list[1] = out_ha_done[1];

            dtm_hash_out.addRow(obj_ha_list);
        }
        
        jta_orig_text.setText(rcv_og_text);
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(OutputHashes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutputHashes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutputHashes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutputHashes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OutputHashes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_close;
    private javax.swing.JLabel jl_orig_text;
    private javax.swing.JScrollPane jsp_hash_cont;
    private javax.swing.JScrollPane jsp_ot_cont;
    private javax.swing.JTable jt_out;
    private javax.swing.JTextArea jta_orig_text;
    // End of variables declaration//GEN-END:variables
}
