/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina.forms;
import oficina.unused.FormOs;
import oficina.unused.FormPessoa;
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import oficina.classes.Carro;
import oficina.classes.ConexaoBd;
import oficina.visualizar.VisualizaCarro;

/**
 *
 * @author RF
 */
public class FormBuscaPanel extends javax.swing.JPanel {

    /**
     * Creates new form FormBuscaPanel
     */
    public FormBuscaPanel() {
        initComponents();
        tfFisicaCpf.setForeground(Color.gray);
        tfJuridicaCnpj.setForeground(Color.gray);
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
        panelTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelBuscaOs = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        panelNumOs = new javax.swing.JPanel();
        lbNumOs = new javax.swing.JLabel();
        tfNumOs = new javax.swing.JTextField();
        panelBuscarOs = new javax.swing.JPanel();
        btBuscarOs = new javax.swing.JButton();
        panelBuscaCarro = new javax.swing.JPanel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        panelPlaca = new javax.swing.JPanel();
        lbPlaca = new javax.swing.JLabel();
        tfPlaca = new javax.swing.JTextField();
        panelBuscarPlaca = new javax.swing.JPanel();
        btBuscarPlaca = new javax.swing.JButton();
        panelBuscaFisica = new javax.swing.JPanel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        panelCpf = new javax.swing.JPanel();
        lbCpf = new javax.swing.JLabel();
        tfFisicaCpf = new javax.swing.JFormattedTextField();
        panelBuscarCpf = new javax.swing.JPanel();
        btCpf = new javax.swing.JButton();
        panelBuscaJuridica = new javax.swing.JPanel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        panelCnpj = new javax.swing.JPanel();
        lbCnpj = new javax.swing.JLabel();
        tfJuridicaCnpj = new javax.swing.JFormattedTextField();
        panelBuscarCnpj = new javax.swing.JPanel();
        btBuscarCnpj = new javax.swing.JButton();

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbTitulo.setText("Busca");
        panelTitulo.add(lbTitulo);

        jPanel1.add(panelTitulo);

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(400, 150));

        panelBuscaOs.setLayout(new javax.swing.BoxLayout(panelBuscaOs, javax.swing.BoxLayout.PAGE_AXIS));
        panelBuscaOs.add(filler2);

        lbNumOs.setText("Número da O.S.: ");
        panelNumOs.add(lbNumOs);

        tfNumOs.setColumns(15);
        panelNumOs.add(tfNumOs);

        panelBuscaOs.add(panelNumOs);

        btBuscarOs.setText("Buscar");
        btBuscarOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarOsActionPerformed(evt);
            }
        });
        panelBuscarOs.add(btBuscarOs);

        panelBuscaOs.add(panelBuscarOs);

        jTabbedPane1.addTab("Ordem de Serviço", panelBuscaOs);

        panelBuscaCarro.setLayout(new javax.swing.BoxLayout(panelBuscaCarro, javax.swing.BoxLayout.PAGE_AXIS));
        panelBuscaCarro.add(filler4);

        lbPlaca.setText("Placa do Carro: ");
        panelPlaca.add(lbPlaca);

        tfPlaca.setColumns(10);
        tfPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPlacaKeyTyped(evt);
            }
        });
        panelPlaca.add(tfPlaca);

        panelBuscaCarro.add(panelPlaca);

        btBuscarPlaca.setText("Buscar");
        btBuscarPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarPlacaActionPerformed(evt);
            }
        });
        panelBuscarPlaca.add(btBuscarPlaca);

        panelBuscaCarro.add(panelBuscarPlaca);

        jTabbedPane1.addTab("Carro", panelBuscaCarro);

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

        btCpf.setText("Buscar");
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

        btBuscarCnpj.setText("Buscar");
        btBuscarCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarCnpjActionPerformed(evt);
            }
        });
        panelBuscarCnpj.add(btBuscarCnpj);

        panelBuscaJuridica.add(panelBuscarCnpj);

        jTabbedPane1.addTab("Pessoa Jurídica", panelBuscaJuridica);

        jPanel1.add(jTabbedPane1);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarOsActionPerformed
        Random generator = new Random();
        if(generator.nextBoolean() == true)
        {
            new FormOs().setVisible(true); // mudar para VisualizaOs(osBusca) quando osBusca conseguir ser retorno de busca no BD
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Busca não encontrou resultados.");
        }
    }//GEN-LAST:event_btBuscarOsActionPerformed

    private void tfPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPlacaKeyTyped
        char caractere = evt.getKeyChar();

        if(tfPlaca.getText().length() > 7)
        evt.consume();

        else
        {
            if(Character.isAlphabetic(caractere))
                evt.setKeyChar(Character.toUpperCase(caractere));

            if(tfPlaca.getText().length() < 3
                    && !Character.isAlphabetic(caractere))
                evt.consume();

            else if(tfPlaca.getText().length() == 3
                        && Character.isDigit(caractere))
                tfPlaca.setText(tfPlaca.getText() + '-');

            else if(tfPlaca.getText().length() == 3
                        && !Character.isDigit(caractere)
                && caractere != '-')
                evt.consume();

            else if(tfPlaca.getText().length() > 3
                        && !Character.isDigit(caractere))
                evt.consume();
        }
    }//GEN-LAST:event_tfPlacaKeyTyped

    private void btBuscarPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarPlacaActionPerformed
        ConexaoBd bd = new ConexaoBd();
        
        Carro carro = bd.buscaCarro(tfPlaca.getText());
        if(carro != null)
        {
            new VisualizaCarro(carro).setVisible(true);
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "Busca não encontrou resultados.");
        }
    }//GEN-LAST:event_btBuscarPlacaActionPerformed

    private void tfFisicaCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfFisicaCpfFocusGained
        if("000.000.000-00".equals(tfFisicaCpf.getText()))
        {
            tfFisicaCpf.setText(null);
            tfFisicaCpf.setForeground(Color.black);
        }
    }//GEN-LAST:event_tfFisicaCpfFocusGained

    private void tfFisicaCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfFisicaCpfFocusLost
        if("000.000.000-00".equals(tfFisicaCpf.getText()) || "   .   .   -  ".equals(tfFisicaCpf.getText()))
        {
            tfFisicaCpf.setText("000.000.000-00");
            tfFisicaCpf.setForeground(Color.gray);
        }
    }//GEN-LAST:event_tfFisicaCpfFocusLost

    private void btCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCpfActionPerformed
        Random generator = new Random();
        if(generator.nextBoolean() == true)
        {
            new FormPessoa().setVisible(true); // mudar para VisualizaPessoaFisica(pfBusca) quando pfBusca conseguir ser retorno de busca no BD
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Busca não encontrou resultados.");
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
        if("00.000.000/0000-00".equals(tfJuridicaCnpj.getText()) 
                || "  .   .   /    -  ".equals(tfJuridicaCnpj.getText()))
        {
            tfJuridicaCnpj.setText("00.000.000/0000-00");
            tfJuridicaCnpj.setForeground(Color.gray);
        }
    }//GEN-LAST:event_tfJuridicaCnpjFocusLost

    private void btBuscarCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarCnpjActionPerformed
        Random generator = new Random();
        if(generator.nextBoolean() == true)
        {
            new FormPessoa().setVisible(true); // mudar para VisualizaPessoaJuridica(pjBusca) quando pjBusca conseguir ser retorno de busca no BD
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Busca não encontrou resultados.");
        }
    }//GEN-LAST:event_btBuscarCnpjActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarCnpj;
    private javax.swing.JButton btBuscarOs;
    private javax.swing.JButton btBuscarPlaca;
    private javax.swing.JButton btCpf;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbCnpj;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbNumOs;
    private javax.swing.JLabel lbPlaca;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel panelBuscaCarro;
    private javax.swing.JPanel panelBuscaFisica;
    private javax.swing.JPanel panelBuscaJuridica;
    private javax.swing.JPanel panelBuscaOs;
    private javax.swing.JPanel panelBuscarCnpj;
    private javax.swing.JPanel panelBuscarCpf;
    private javax.swing.JPanel panelBuscarOs;
    private javax.swing.JPanel panelBuscarPlaca;
    private javax.swing.JPanel panelCnpj;
    private javax.swing.JPanel panelCpf;
    private javax.swing.JPanel panelNumOs;
    private javax.swing.JPanel panelPlaca;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JFormattedTextField tfFisicaCpf;
    private javax.swing.JFormattedTextField tfJuridicaCnpj;
    private javax.swing.JTextField tfNumOs;
    private javax.swing.JTextField tfPlaca;
    // End of variables declaration//GEN-END:variables
}
