package com.afa1997.sas_act4.frames;

import com.afa1997.sas_act4.hashing_action.HashingAction;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class InputString extends javax.swing.JFrame {

    public InputString() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_descriptor = new javax.swing.JLabel();
        jsp_ta_cont = new javax.swing.JScrollPane();
        jta_in_text = new javax.swing.JTextArea();
        btn_hash = new javax.swing.JButton();
        jp_cont_hash_functions = new javax.swing.JPanel();
        jcb_md5 = new javax.swing.JCheckBox();
        jcb_sha256 = new javax.swing.JCheckBox();
        jcb_crc32 = new javax.swing.JCheckBox();
        jcb_adler32 = new javax.swing.JCheckBox();
        jcb_mm3_32 = new javax.swing.JCheckBox();
        jcb_sipash = new javax.swing.JCheckBox();
        jcb_sha1 = new javax.swing.JCheckBox();
        btn_exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_help = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hashing tool");
        setResizable(false);

        jl_descriptor.setText("<html> Write a string below then choose <u>at least</u> <b style=\"color: red;\">3</b> methods to hash it:");

        jta_in_text.setColumns(20);
        jta_in_text.setRows(5);
        jsp_ta_cont.setViewportView(jta_in_text);

        btn_hash.setBackground(new java.awt.Color(51, 0, 51));
        btn_hash.setForeground(new java.awt.Color(255, 255, 255));
        btn_hash.setText("Hash it");
        btn_hash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hashActionPerformed(evt);
            }
        });

        jcb_md5.setText("MD5");

        jcb_sha256.setText("SHA-256");

        jcb_crc32.setText("CRC-32");

        jcb_adler32.setText("Adler-32");

        jcb_mm3_32.setText("MurmurHash3 (32-bit)");

        jcb_sipash.setText("SipHash");

        jcb_sha1.setText("SHA-1");

        javax.swing.GroupLayout jp_cont_hash_functionsLayout = new javax.swing.GroupLayout(jp_cont_hash_functions);
        jp_cont_hash_functions.setLayout(jp_cont_hash_functionsLayout);
        jp_cont_hash_functionsLayout.setHorizontalGroup(
            jp_cont_hash_functionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_cont_hash_functionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_cont_hash_functionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcb_sipash)
                    .addComponent(jcb_md5)
                    .addComponent(jcb_sha256)
                    .addComponent(jcb_crc32)
                    .addComponent(jcb_adler32)
                    .addComponent(jcb_mm3_32)
                    .addComponent(jcb_sha1))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jp_cont_hash_functionsLayout.setVerticalGroup(
            jp_cont_hash_functionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_cont_hash_functionsLayout.createSequentialGroup()
                .addComponent(jcb_adler32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcb_crc32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcb_md5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcb_mm3_32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcb_sha1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcb_sha256)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcb_sipash)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        jLabel1.setText("Simple hashing tool by Aldo Franquez that uses Google Guava's libraries for hashing");

        btn_help.setText("Help");
        btn_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_helpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsp_ta_cont)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(btn_help)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_exit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_descriptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jp_cont_hash_functions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_hash)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_descriptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsp_ta_cont, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_hash)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jp_cont_hash_functions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_exit)
                    .addComponent(jLabel1)
                    .addComponent(btn_help))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_hashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hashActionPerformed
        List<String> selected_hashing_functions = new ArrayList<>();
        int selected_count = 0;
        
        if(jcb_adler32.isSelected()){
            selected_hashing_functions.add("Adler-32");
            selected_count++;
        }
        
        if(jcb_crc32.isSelected()){
            selected_hashing_functions.add("CRC-32");
            selected_count++;
        }
        
        if(jcb_md5.isSelected()){
            selected_hashing_functions.add("MD5");
            selected_count++;
        }
        
        if(jcb_mm3_32.isSelected()){
            selected_hashing_functions.add("MurmurHash3 (32-bit)");
            selected_count++;
        }
        
        if(jcb_sha1.isSelected()){
            selected_hashing_functions.add("SHA-1");
            selected_count++;
        }
        
        if(jcb_sha256.isSelected()){
            selected_hashing_functions.add("SHA-256");
            selected_count++;
        }
        
        if(jcb_sipash.isSelected()){
            selected_hashing_functions.add("SipHash");
            selected_count++;
        }
        
        // Part of the exercise required us to pick 3 or more hashing methods (and so you can see how different each hash is depending on the function). Also check that the textarea isn't empty because the string is required.
        if(selected_count >= 3 && !jta_in_text.getText().trim().equals("")){
            String ot = jta_in_text.getText();
            
            HashingAction ha_begin = new HashingAction(selected_hashing_functions, ot);
            List<String[]> ha_begin_outl = ha_begin.HA_GetHashedString();
            
            OutputHashes oh_show = new OutputHashes(ha_begin_outl, ot);
            
            oh_show.setVisible(true);
        }
        else if(selected_count < 3 && !jta_in_text.getText().trim().equals("")){
            // For some reason I was getting an error on the declaration??? So I had to refer to JFrame like NB normally does when generating frames' code.
            javax.swing.JFrame jpa_select_more = new javax.swing.JFrame();
            jpa_select_more.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
            
            JOptionPane.showMessageDialog(jpa_select_more, "Select " + (3 - selected_count) + " more option(s).", "Select at least 3 options", JOptionPane.WARNING_MESSAGE);
        }
        else if(jta_in_text.getText().trim().equals("")){
            javax.swing.JFrame jpa_no_text = new javax.swing.JFrame();
            jpa_no_text.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
            
            JOptionPane.showMessageDialog(jpa_no_text, "You need to write some text", "Empty text field", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_hashActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_helpActionPerformed
        HashTutorial ht_open = new HashTutorial();
        
        ht_open.setVisible(true);
    }//GEN-LAST:event_btn_helpActionPerformed

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
            java.util.logging.Logger.getLogger(InputString.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputString.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputString.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputString.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputString().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_hash;
    private javax.swing.JButton btn_help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox jcb_adler32;
    private javax.swing.JCheckBox jcb_crc32;
    private javax.swing.JCheckBox jcb_md5;
    private javax.swing.JCheckBox jcb_mm3_32;
    private javax.swing.JCheckBox jcb_sha1;
    private javax.swing.JCheckBox jcb_sha256;
    private javax.swing.JCheckBox jcb_sipash;
    private javax.swing.JLabel jl_descriptor;
    private javax.swing.JPanel jp_cont_hash_functions;
    private javax.swing.JScrollPane jsp_ta_cont;
    private javax.swing.JTextArea jta_in_text;
    // End of variables declaration//GEN-END:variables
}
