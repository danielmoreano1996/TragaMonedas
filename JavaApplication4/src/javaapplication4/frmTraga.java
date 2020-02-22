package javaapplication4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class frmTraga extends javax.swing.JFrame 
{
    int apuesta;
    int saldoini;
    int saldofinal;
    static int aleatorio1;
    static int aleatorio2;
    static int aleatorio3;
    int contador = 0;
    int cond1;
    int cond2;
    int cond3;
    static int numfin1;
    static int numfin2;
    static int numfin3;

    Timer tiem = new Timer(1,new ActionListener()
    {

        public void actionPerformed(ActionEvent e)
        {
            aleatorio1 = (int)(Math.random()*10+1);
            aleatorio2 = (int)(Math.random()*10+1);
            aleatorio3 = (int)(Math.random()*10+1);

            contador++;

            cond1 = contador % 250;
            cond2 = contador % 150;
            cond3 = contador % 50;
            
            if (contador <= 4000)
            {
                if(cond1 == 0)
                {
                    switch(aleatorio1)
                    {
                        case 1: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("a.PNG")));
                        break;
                        case 2: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("b.PNG")));
                        break;
                        case 3: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("c.PNG")));
                        break;
                        case 4: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("d.PNG")));
                        break;
                        case 5: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("e.PNG")));
                        break;
                        case 6: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("f.PNG")));
                        break;
                        case 7: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("g.PNG")));
                        break;
                        case 8: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("h.PNG")));
                        break;
                        case 9: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("i.PNG")));
                        break;
                        case 10: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("j.PNG")));
                        break;
                    }
                }
            }

            if(contador <= 2000)
            {
                if(cond2 == 0)
                {
                    switch(aleatorio2)
                    {
                        case 1: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("a.PNG")));
                        break;
                        case 2: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("b.PNG")));
                        break;
                        case 3: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("c.PNG")));
                        break;
                        case 4: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("d.PNG")));
                        break;
                        case 5: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("e.PNG")));
                        break;
                        case 6: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("f.PNG")));
                        break;
                        case 7: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("g.PNG")));
                        break;
                        case 8: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("h.PNG")));
                        break;
                        case 9: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("i.PNG")));
                        break;
                        case 10: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("j.PNG")));
                        break;
                    }
                }
            }
            
            if(contador <= 1000)
            {
                if(cond3 == 0)
                {
                    switch(aleatorio3)
                    {
                        case 1: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("a.PNG")));
                        break;
                        case 2: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("b.PNG")));
                        break;
                        case 3: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("c.PNG")));
                        break;
                        case 4: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("d.PNG")));
                        break;
                        case 5: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("e.PNG")));
                        break;
                        case 6: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("f.PNG")));
                        break;
                        case 7: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("g.PNG")));
                        break;
                        case 8: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("h.PNG")));
                        break;
                        case 9: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("i.PNG")));
                        break;
                        case 10: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("j.PNG")));
                        break;
                    }
                }
            }
            
            if(contador == 4000)
            {
                numfin1 = aleatorio1;                    
            }             
            if (contador == 1950)
            {
                numfin2 = aleatorio2;
            }
            
            if (contador == 1000)
            {
                numfin3 = aleatorio3;                    
            }
           
            if (contador == 4001)
            {
                System.out.print(numfin1);
                System.out.print(numfin2);
                System.out.print(numfin3);
                
                if((numfin1 == 1) && (numfin2 == 1) && (numfin3 == 1))
                {
                    apuesta = Integer.parseInt((String) cbxApuesta.getSelectedItem());
                    saldoini = Integer.valueOf(txtSaldo.getText());
                    saldofinal = saldoini + (apuesta*4);
                    txtSaldo.setText(String.valueOf(saldofinal)); 
                    JOptionPane.showMessageDialog(null, "Gana el triple de lo apostado");
                    tiem.stop();  
                    contador = 0;    
                }                 
                else if((numfin1 == numfin2) && (numfin2 == numfin3))
                {
                    apuesta = Integer.parseInt((String) cbxApuesta.getSelectedItem());
                    saldoini = Integer.valueOf(txtSaldo.getText());
                    saldofinal = saldoini + (apuesta*3);
                    txtSaldo.setText(String.valueOf(saldofinal)); 
                    JOptionPane.showMessageDialog(null, "Gana el doble de lo apostado");
                    tiem.stop();
                    contador = 0;
                    
                } 
                else if(((numfin1 == 2)&&(numfin2 == numfin3)) || ((numfin2 == 2)&&(numfin1 == numfin3)) || ((numfin3 == 2)&&(numfin1 == numfin2)))
                {
                    apuesta = Integer.parseInt((String) cbxApuesta.getSelectedItem());
                    saldoini = Integer.valueOf(txtSaldo.getText());
                    saldofinal = saldoini + (apuesta*2);
                    txtSaldo.setText(String.valueOf(saldofinal)); 
                    JOptionPane.showMessageDialog(null, "Gana lo apostado");
                    tiem.stop();
                    contador = 0;
                }
                else
                {
                    apuesta = Integer.parseInt((String) cbxApuesta.getSelectedItem());
                    saldoini = Integer.valueOf(txtSaldo.getText());
                    saldofinal = saldoini - apuesta;
                    txtSaldo.setText(String.valueOf(saldofinal));                    
                    JOptionPane.showMessageDialog(null , "Perdiste");
                    tiem.stop();
                    contador = 0;    
                }    
            }
        }
    });
    
    
    public frmTraga() 
    {
        initComponents();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxApuesta = new javax.swing.JComboBox<>();
        txtSaldo = new javax.swing.JTextField();
        lblImagen1 = new javax.swing.JLabel();
        lblImagen2 = new javax.swing.JLabel();
        lblImagen3 = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbxApuesta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "20", "50", "100", " " }));
        cbxApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxApuestaActionPerformed(evt);
            }
        });

        txtSaldo.setText("100");
        txtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActionPerformed(evt);
            }
        });

        lblImagen1.setText("jLabel1");

        lblImagen2.setText("jLabel2");

        lblImagen3.setText("jLabel3");

        btnJugar.setText("Jugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        jLabel1.setText("Apuesta");

        jLabel2.setText("Saldo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lblImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnJugar)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnJugar)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        tiem.start();      
    }//GEN-LAST:event_btnJugarActionPerformed

    private void cbxApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxApuestaActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_cbxApuestaActionPerformed

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
            java.util.logging.Logger.getLogger(frmTraga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTraga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTraga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTraga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTraga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JComboBox<String> cbxApuesta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblImagen3;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
