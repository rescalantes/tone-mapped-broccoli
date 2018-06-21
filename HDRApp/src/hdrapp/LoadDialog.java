/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdrapp;

/**
 *
 * @author Raquel Escalante
 * @author Rafael Vasquez
 */
public class LoadDialog extends javax.swing.JDialog {
    private int numSec;

    /**
     * Creates new form LoadDialog
     */
    public LoadDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        numSec = 3;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AceptarButton = new javax.swing.JButton();
        SecuenciaScrollPane = new javax.swing.JScrollPane();
        ImgChooser1 = new javax.swing.JPanel();
        imgLabel1 = new javax.swing.JTextField();
        OpenImg1 = new javax.swing.JButton();
        ImgChooser2 = new javax.swing.JPanel();
        imgLabel2 = new javax.swing.JTextField();
        OpenImg2 = new javax.swing.JButton();
        ImgChooser3 = new javax.swing.JPanel();
        imgLabel3 = new javax.swing.JTextField();
        OpenImg3 = new javax.swing.JButton();
        ImgChooser4 = new javax.swing.JPanel();
        imgLabel4 = new javax.swing.JTextField();
        OpenImg4 = new javax.swing.JButton();
        ImgChooser5 = new javax.swing.JPanel();
        imgLabel5 = new javax.swing.JTextField();
        OpenImg5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cargar imágenes de secuencia");

        jLabel2.setText("Instrucciones: Por favor seleccione las imágenes en orden de menor a mayor tiempo de exposición");

        jLabel4.setText("Secuencia:");

        AceptarButton.setText("Aceptar");
        AceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarButtonActionPerformed(evt);
            }
        });

        imgLabel1.setText("C:\\Users\\UCV\\Semestre 2017-2\\imagen1.png");

        OpenImg1.setText("Abrir Imagen 1");
        OpenImg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenImg1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ImgChooser1Layout = new javax.swing.GroupLayout(ImgChooser1);
        ImgChooser1.setLayout(ImgChooser1Layout);
        ImgChooser1Layout.setHorizontalGroup(
            ImgChooser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImgChooser1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OpenImg1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ImgChooser1Layout.setVerticalGroup(
            ImgChooser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImgChooser1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ImgChooser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imgLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpenImg1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imgLabel2.setText("C:\\Users\\UCV\\Semestre 2017-2\\imagen2.png");

        OpenImg2.setText("Abrir Imagen 2");
        OpenImg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenImg2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ImgChooser2Layout = new javax.swing.GroupLayout(ImgChooser2);
        ImgChooser2.setLayout(ImgChooser2Layout);
        ImgChooser2Layout.setHorizontalGroup(
            ImgChooser2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImgChooser2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OpenImg2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ImgChooser2Layout.setVerticalGroup(
            ImgChooser2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImgChooser2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ImgChooser2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imgLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpenImg2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imgLabel3.setText("C:\\Users\\UCV\\Semestre 2017-2\\imagen3.png");

        OpenImg3.setText("Abrir Imagen 3");

        javax.swing.GroupLayout ImgChooser3Layout = new javax.swing.GroupLayout(ImgChooser3);
        ImgChooser3.setLayout(ImgChooser3Layout);
        ImgChooser3Layout.setHorizontalGroup(
            ImgChooser3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImgChooser3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OpenImg3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ImgChooser3Layout.setVerticalGroup(
            ImgChooser3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImgChooser3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ImgChooser3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imgLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpenImg3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imgLabel4.setText("C:\\Users\\UCV\\Semestre 2017-2\\imagen4.png");

        OpenImg4.setText("Abrir Imagen 4");

        javax.swing.GroupLayout ImgChooser4Layout = new javax.swing.GroupLayout(ImgChooser4);
        ImgChooser4.setLayout(ImgChooser4Layout);
        ImgChooser4Layout.setHorizontalGroup(
            ImgChooser4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImgChooser4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OpenImg4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ImgChooser4Layout.setVerticalGroup(
            ImgChooser4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImgChooser4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ImgChooser4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imgLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpenImg4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imgLabel5.setText("C:\\Users\\UCV\\Semestre 2017-2\\imagen5.png");

        OpenImg5.setText("Abrir Imagen 5");

        javax.swing.GroupLayout ImgChooser5Layout = new javax.swing.GroupLayout(ImgChooser5);
        ImgChooser5.setLayout(ImgChooser5Layout);
        ImgChooser5Layout.setHorizontalGroup(
            ImgChooser5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImgChooser5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OpenImg5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ImgChooser5Layout.setVerticalGroup(
            ImgChooser5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImgChooser5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ImgChooser5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imgLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpenImg5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AceptarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(ImgChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImgChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImgChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImgChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImgChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(234, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SecuenciaScrollPane)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImgChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImgChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImgChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImgChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImgChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(SecuenciaScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AceptarButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setChoosers(int n){
        switch (n) {
            case 3:
                ImgChooser4.setVisible(false);
                ImgChooser5.setVisible(false);
                break;
            case 4:
                ImgChooser5.setVisible(false);
                break;
            default:
                break;
        }
    }
    
    private void AceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_AceptarButtonActionPerformed

    private void OpenImg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenImg2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpenImg2ActionPerformed

    private void OpenImg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenImg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpenImg1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            LoadDialog dialog = new LoadDialog(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarButton;
    private javax.swing.JPanel ImgChooser1;
    private javax.swing.JPanel ImgChooser2;
    private javax.swing.JPanel ImgChooser3;
    private javax.swing.JPanel ImgChooser4;
    private javax.swing.JPanel ImgChooser5;
    private javax.swing.JButton OpenImg1;
    private javax.swing.JButton OpenImg2;
    private javax.swing.JButton OpenImg3;
    private javax.swing.JButton OpenImg4;
    private javax.swing.JButton OpenImg5;
    private javax.swing.JScrollPane SecuenciaScrollPane;
    private javax.swing.JTextField imgLabel1;
    private javax.swing.JTextField imgLabel2;
    private javax.swing.JTextField imgLabel3;
    private javax.swing.JTextField imgLabel4;
    private javax.swing.JTextField imgLabel5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
