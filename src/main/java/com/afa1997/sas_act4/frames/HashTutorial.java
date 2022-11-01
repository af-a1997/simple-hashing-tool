package com.afa1997.sas_act4.frames;

public class HashTutorial extends javax.swing.JFrame {

    public HashTutorial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_tuto_cont = new javax.swing.JPanel();
        jtp_intro = new javax.swing.JTabbedPane();
        jp_intro_cont = new javax.swing.JPanel();
        jsp_intro_text_cont = new javax.swing.JScrollPane();
        jta_intro_text = new javax.swing.JTextArea();
        jp_src_cont = new javax.swing.JPanel();
        jsp_src_text_cont = new javax.swing.JScrollPane();
        jta_src_text = new javax.swing.JTextArea();
        jp_buttons_area = new javax.swing.JPanel();
        jb_close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hash functions tutorial");
        setResizable(false);

        jta_intro_text.setEditable(false);
        jta_intro_text.setColumns(20);
        jta_intro_text.setLineWrap(true);
        jta_intro_text.setRows(5);
        jta_intro_text.setText("Hash functions are used in cryptography for encrypting different kinds of information such as text, by \"converting\" such info through different kinds of mathematical algorithms in an undecipherable string comprised of numbers and letters (known as \"digest\"). Some functions like MD5 are used to generate checksums and use them for sharing files and verifying their integrity.\nHash functions must be fast (return the result from the operation in an extremely short amount of time), deterministic (encrpyting the same string results in the same \"output code\") and pre-image resistant (this means that a bigger input should still generate the same length for the output, exactly like how a smaller input would), for example hashing a word and a large picture should result in an output of the same length.\n\nThere are different hashing functions, each of them will return an alphanumeric string of text that's the encrypted input and is of fixed length (varies with the function), we'll cover the ones that I chose from Google Guava's library below:\n\n* Adler-32: named after its author (Mark Adler) since its original inception back in 1995, he created this function with validation speed in mind. It calculates two 16-bit checksums and then combining them into a 32-bit one. The first of the checksums is obtained by the sum of all bytes in the stream + 1, and the second by totalling each of the indivudual values in each step from obtaining the first checksum.\n* CRC-32: the Cyclic Redundancy Check consists of an error-detecting code commonly used to detect accidental changes in data. Each block of data entering any kind of storage system will have a short value attached to it, which is based on the remainder of a polynomial division of their contents. When retrieved, calculations are done multiple times, and if the check values do NOT match, the block of date has likely incurred even a slight amount of damage.\n* MD5: the Message-Digest Algorithm is a widely used hash function for file integrity verification, it was created in 1995 by Ronald Rivest as a successor to his previous hash functions: MD2 (1989) and MD4 (1990). MD5 used to be applied on cryptography, but because one can potentially create a different file that returns the same checksum, it's considered a significantly enough vulnerability to justify not using it for cryptography anymore.\n* SHA-256: Secure Hash Algorithm (256) is a more secure version of the original implementation (SHA-1), because it gives a digest output of 256-bits compared to SHA-1's 160-bits. SHA was originally proposed by the U.S.'s National Security Agency (NSA) in 1995.\n* SipHash: it's another hash function that performs best on short inputs, it takes a secret key filled with random numbers and either an input buffer or several input integers.");
        jta_intro_text.setWrapStyleWord(true);
        jsp_intro_text_cont.setViewportView(jta_intro_text);

        javax.swing.GroupLayout jp_intro_contLayout = new javax.swing.GroupLayout(jp_intro_cont);
        jp_intro_cont.setLayout(jp_intro_contLayout);
        jp_intro_contLayout.setHorizontalGroup(
            jp_intro_contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jsp_intro_text_cont, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        jp_intro_contLayout.setVerticalGroup(
            jp_intro_contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_intro_contLayout.createSequentialGroup()
                .addComponent(jsp_intro_text_cont, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtp_intro.addTab("Introduction", jp_intro_cont);

        jta_src_text.setEditable(false);
        jta_src_text.setColumns(20);
        jta_src_text.setLineWrap(true);
        jta_src_text.setRows(5);
        jta_src_text.setText("The following materials have been used to compile a single quick reference about hashes, along with a link to the homepage for Google Guava with more info about it:\n\n* https://guava.dev\n* https://komodoplatform.com/en/academy/cryptographic-hash-function/\n* https://www.lifewire.com/what-does-checksum-mean-2625825\n* http://ijcsse.org/published/volume5/issue7/p4-V5I7.pdf\n* https://www.lifewire.com/what-is-md5-2625937\n* https://www.geeksforgeeks.org/difference-between-sha1-and-sha256/\n* https://docs.kernel.org/security/siphash.html\n* Various articles in Wikipedia English");
        jta_src_text.setWrapStyleWord(true);
        jsp_src_text_cont.setViewportView(jta_src_text);

        javax.swing.GroupLayout jp_src_contLayout = new javax.swing.GroupLayout(jp_src_cont);
        jp_src_cont.setLayout(jp_src_contLayout);
        jp_src_contLayout.setHorizontalGroup(
            jp_src_contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jsp_src_text_cont, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        jp_src_contLayout.setVerticalGroup(
            jp_src_contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_src_contLayout.createSequentialGroup()
                .addComponent(jsp_src_text_cont, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtp_intro.addTab("Sources", jp_src_cont);

        javax.swing.GroupLayout jp_tuto_contLayout = new javax.swing.GroupLayout(jp_tuto_cont);
        jp_tuto_cont.setLayout(jp_tuto_contLayout);
        jp_tuto_contLayout.setHorizontalGroup(
            jp_tuto_contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtp_intro)
        );
        jp_tuto_contLayout.setVerticalGroup(
            jp_tuto_contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtp_intro)
        );

        jb_close.setText("Close");
        jb_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_buttons_areaLayout = new javax.swing.GroupLayout(jp_buttons_area);
        jp_buttons_area.setLayout(jp_buttons_areaLayout);
        jp_buttons_areaLayout.setHorizontalGroup(
            jp_buttons_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_buttons_areaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_close)
                .addContainerGap())
        );
        jp_buttons_areaLayout.setVerticalGroup(
            jp_buttons_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_buttons_areaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_close)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_tuto_cont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_buttons_area, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_tuto_cont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_buttons_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_closeActionPerformed
        this.dispose();
    }//GEN-LAST:event_jb_closeActionPerformed

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
            java.util.logging.Logger.getLogger(HashTutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HashTutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HashTutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HashTutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HashTutorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_close;
    private javax.swing.JPanel jp_buttons_area;
    private javax.swing.JPanel jp_intro_cont;
    private javax.swing.JPanel jp_src_cont;
    private javax.swing.JPanel jp_tuto_cont;
    private javax.swing.JScrollPane jsp_intro_text_cont;
    private javax.swing.JScrollPane jsp_src_text_cont;
    private javax.swing.JTextArea jta_intro_text;
    private javax.swing.JTextArea jta_src_text;
    private javax.swing.JTabbedPane jtp_intro;
    // End of variables declaration//GEN-END:variables
}