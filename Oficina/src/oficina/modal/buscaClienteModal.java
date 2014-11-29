/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina.modal;
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import oficina.classes.ConexaoBd;

/**
 *
 * @author Administrator
 */
public class buscaClienteModal extends javax.swing.JDialog
{

    /**
     * Creates new form buscaClienteModal
     */
    public buscaClienteModal(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        
        this.setLocationRelativeTo(null);
        tfFisicaCpf.setForeground(Color.gray);
        tfJuridicaCnpj.setForeground(Color.gray);
        clienteCpfCnpj = null;
    }
    
    public String showDiag()
    {
        setVisible(true);
        return clienteCpfCnpj;
    }
    public int getCodCliente(){
        return this.codCliente;
    }

    private boolean verificaCpf(){
        if(tfFisicaCpf.getText().equals("   .   .   -  ") || tfFisicaCpf.getText().equals("000.000.000-00"))
            return false;
        
        return true;
    }
    
    private boolean verificaCnpj(){
        if(tfJuridicaCnpj.getText().equals("  .   .   /    -  ") || tfJuridicaCnpj.getText().equals("00.000.000/0000-00"))
            return false;
              
        return true;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelBuscaFisica = new javax.swing.JPanel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        panelCpf = new javax.swing.JPanel();
        lbCpf = new javax.swing.JLabel();
        tfFisicaCpf = new javax.swing.JFormattedTextField();
        panelAlertaFisica = new javax.swing.JPanel();
        lbAlertaFisica = new javax.swing.JLabel();
        panelBuscarCpf = new javax.swing.JPanel();
        btCpf = new javax.swing.JButton();
        panelBuscaJuridica = new javax.swing.JPanel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        panelCnpj = new javax.swing.JPanel();
        lbCnpj = new javax.swing.JLabel();
        tfJuridicaCnpj = new javax.swing.JFormattedTextField();
        panelAlertaJuridica = new javax.swing.JPanel();
        lbAlertaJuridica = new javax.swing.JLabel();
        panelBuscarCnpj = new javax.swing.JPanel();
        btBuscarCnpj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selecionar Cliente");
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecionar cliente:"));

        panelBuscaFisica.setLayout(new javax.swing.BoxLayout(panelBuscaFisica, javax.swing.BoxLayout.PAGE_AXIS));
        panelBuscaFisica.add(filler3);

        lbCpf.setText("CPF do Cliente: ");
        panelCpf.add(lbCpf);

        tfFisicaCpf.setColumns(14);
        try {
            tfFisicaCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfFisicaCpf.setText("000.000.000-00");
        tfFisicaCpf.setToolTipText("");
        tfFisicaCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfFisicaCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfFisicaCpfFocusLost(evt);
            }
        });
        panelCpf.add(tfFisicaCpf);

        panelBuscaFisica.add(panelCpf);

        lbAlertaFisica.setForeground(new java.awt.Color(255, 0, 0));
        lbAlertaFisica.setPreferredSize(new java.awt.Dimension(150, 14));
        panelAlertaFisica.add(lbAlertaFisica);

        panelBuscaFisica.add(panelAlertaFisica);

        btCpf.setText("OK");
        btCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCpfActionPerformed(evt);
            }
        });
        panelBuscarCpf.add(btCpf);

        panelBuscaFisica.add(panelBuscarCpf);

        jTabbedPane1.addTab("Pessoa Física", panelBuscaFisica);

        panelBuscaJuridica.setLayout(new javax.swing.BoxLayout(panelBuscaJuridica, javax.swing.BoxLayout.PAGE_AXIS));
        panelBuscaJuridica.add(filler5);

        lbCnpj.setText("CNPJ da Empresa: ");
        panelCnpj.add(lbCnpj);

        tfJuridicaCnpj.setColumns(20);
        try {
            tfJuridicaCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfJuridicaCnpj.setText("00.000.000/0000-00");
        tfJuridicaCnpj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfJuridicaCnpjFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfJuridicaCnpjFocusLost(evt);
            }
        });
        panelCnpj.add(tfJuridicaCnpj);

        panelBuscaJuridica.add(panelCnpj);

        lbAlertaJuridica.setForeground(new java.awt.Color(255, 0, 0));
        lbAlertaJuridica.setPreferredSize(new java.awt.Dimension(150, 14));
        panelAlertaJuridica.add(lbAlertaJuridica);

        panelBuscaJuridica.add(panelAlertaJuridica);

        btBuscarCnpj.setText("OK");
        btBuscarCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarCnpjActionPerformed(evt);
            }
        });
        panelBuscarCnpj.add(btBuscarCnpj);

        panelBuscaJuridica.add(panelBuscarCnpj);

        jTabbedPane1.addTab("Pessoa Jurídica", panelBuscaJuridica);

        getContentPane().add(jTabbedPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfFisicaCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfFisicaCpfFocusGained
        if("000.000.000-00".equals(tfFisicaCpf.getText()))
        {
            tfFisicaCpf.setText(null);
            tfFisicaCpf.setForeground(Color.black);
        }
    }//GEN-LAST:event_tfFisicaCpfFocusGained

    private void tfFisicaCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfFisicaCpfFocusLost
        if(!verificaCpf())
        {
            tfFisicaCpf.setText("000.000.000-00");
            tfFisicaCpf.setForeground(Color.gray);
        }
    }//GEN-LAST:event_tfFisicaCpfFocusLost

    private void btCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCpfActionPerformed
        if(verificaCpf())
        {
            ConexaoBd bd = new ConexaoBd();
            this.codCliente =  bd.buscaCodCliente(true, tfFisicaCpf.getText().toString());
            
            if(this.codCliente >= 0)
            {
                clienteCpfCnpj = tfFisicaCpf.getText().toString(); // mudar para VisualizaPessoaFisica(pfBusca) quando pfBusca conseguir ser retorno de busca no BD
                setVisible(false);
                this.dispose();
            }
            
            else
            {
                lbAlertaFisica.setText("Cliente não cadastrado.");
                clienteCpfCnpj = null;
            }
        }
        
        else
        {
            lbAlertaFisica.setText("Informe um CPF.");
            clienteCpfCnpj = null;
        }
    }//GEN-LAST:event_btCpfActionPerformed

    private void tfJuridicaCnpjFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfJuridicaCnpjFocusGained
        if("00.000.000/0000-00".equals(tfJuridicaCnpj.getText()))
        {
            tfJuridicaCnpj.setText(null);
            tfJuridicaCnpj.setForeground(Color.black);
        }
    }//GEN-LAST:event_tfJuridicaCnpjFocusGained

    private void tfJuridicaCnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfJuridicaCnpjFocusLost
        if(!verificaCnpj())
        {
            tfJuridicaCnpj.setText("00.000.000/0000-00");
            tfJuridicaCnpj.setForeground(Color.gray);
        }
    }//GEN-LAST:event_tfJuridicaCnpjFocusLost

    private void btBuscarCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarCnpjActionPerformed
        if(verificaCnpj())
        {
            ConexaoBd bd = new ConexaoBd();
            this.codCliente =  bd.buscaCodCliente(false, tfJuridicaCnpj.getText().toString());
            
            if(this.codCliente >= 0)
            {
                clienteCpfCnpj = tfJuridicaCnpj.getText().toString(); // mudar para VisualizaPessoaFisica(pfBusca) quando pfBusca conseguir ser retorno de busca no BD
                setVisible(false);
                this.dispose();
            }
            
            else
            {
                lbAlertaJuridica.setText("Cliente não cadastrado.");
                clienteCpfCnpj = null;
            }
        }
        
        else
        {
            lbAlertaJuridica.setText("Informe um CPF.");
            clienteCpfCnpj = null;
        }
    }//GEN-LAST:event_btBuscarCnpjActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(buscaClienteModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(buscaClienteModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(buscaClienteModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(buscaClienteModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                buscaClienteModal dialog = new buscaClienteModal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarCnpj;
    private javax.swing.JButton btCpf;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbAlertaFisica;
    private javax.swing.JLabel lbAlertaJuridica;
    private javax.swing.JLabel lbCnpj;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JPanel panelAlertaFisica;
    private javax.swing.JPanel panelAlertaJuridica;
    private javax.swing.JPanel panelBuscaFisica;
    private javax.swing.JPanel panelBuscaJuridica;
    private javax.swing.JPanel panelBuscarCnpj;
    private javax.swing.JPanel panelBuscarCpf;
    private javax.swing.JPanel panelCnpj;
    private javax.swing.JPanel panelCpf;
    private javax.swing.JFormattedTextField tfFisicaCpf;
    private javax.swing.JFormattedTextField tfJuridicaCnpj;
    // End of variables declaration//GEN-END:variables
    private String clienteCpfCnpj;
    private int codCliente;
}