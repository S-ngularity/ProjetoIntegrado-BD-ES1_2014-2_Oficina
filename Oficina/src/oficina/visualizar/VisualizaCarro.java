/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina.visualizar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import oficina.classes.Carro;
import oficina.classes.ConexaoBd;
import oficina.classes.OrdemDeServico;

/**
 *
 * @author carolinapascalecampos
 */
public class VisualizaCarro extends javax.swing.JFrame 
{
    /**
     * Creates new form VisualizaCarro
     */
    private Carro carro;
    
    public VisualizaCarro(Carro c) {
        this.carro = c;
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.atualizaVisualizacao();
    }

    public void atualizaVisualizacao(){
        lbPlacaText.setText(carro.getPlaca());
        lbMarcaText.setText(carro.getNomeMarca());
        lbModeloText.setText(carro.getNomeModelo());
        lbCorText.setText(carro.getCor());
        lbAnoText.setText(carro.getAno()); //converte inteiro para string
        taObsText.setText(carro.getObservacoes());
        lbDonoText.setText(carro.getCPFDono());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        panelTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        panelDono = new javax.swing.JPanel();
        lbDono = new javax.swing.JLabel();
        lbDonoText = new javax.swing.JLabel();
        panelPlaca = new javax.swing.JPanel();
        lbPlaca = new javax.swing.JLabel();
        lbPlacaText = new javax.swing.JLabel();
        panelMarca = new javax.swing.JPanel();
        lbMarca = new javax.swing.JLabel();
        lbMarcaText = new javax.swing.JLabel();
        panelModelo = new javax.swing.JPanel();
        lbModelo = new javax.swing.JLabel();
        lbModeloText = new javax.swing.JLabel();
        panelCor = new javax.swing.JPanel();
        lbCor = new javax.swing.JLabel();
        lbCorText = new javax.swing.JLabel();
        panelAno = new javax.swing.JPanel();
        lbAno = new javax.swing.JLabel();
        lbAnoText = new javax.swing.JLabel();
        panelObsRow1 = new javax.swing.JPanel();
        lbObs = new javax.swing.JLabel();
        panelObsRow2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taObsText = new javax.swing.JTextArea();
        panelBotoes = new javax.swing.JPanel();
        btOS = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualizar Carro");
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        lbTitulo.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lbTitulo.setText("Visualizar Carro");
        panelTitulo.add(lbTitulo);

        getContentPane().add(panelTitulo);

        panelDono.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbDono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDono.setText("Proprietário:");
        panelDono.add(lbDono);

        lbDonoText.setPreferredSize(new java.awt.Dimension(150, 14));
        panelDono.add(lbDonoText);

        getContentPane().add(panelDono);

        panelPlaca.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbPlaca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPlaca.setText("Placa:");
        panelPlaca.add(lbPlaca);

        lbPlacaText.setPreferredSize(null);
        panelPlaca.add(lbPlacaText);

        getContentPane().add(panelPlaca);

        panelMarca.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbMarca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbMarca.setText("Marca:");
        panelMarca.add(lbMarca);
        panelMarca.add(lbMarcaText);

        getContentPane().add(panelMarca);

        panelModelo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbModelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbModelo.setText("Modelo:");
        panelModelo.add(lbModelo);
        panelModelo.add(lbModeloText);

        getContentPane().add(panelModelo);

        panelCor.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbCor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCor.setText("Cor:");
        panelCor.add(lbCor);

        lbCorText.setPreferredSize(null);
        panelCor.add(lbCorText);

        getContentPane().add(panelCor);

        panelAno.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbAno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbAno.setText("Ano:");
        panelAno.add(lbAno);

        lbAnoText.setPreferredSize(null);
        panelAno.add(lbAnoText);

        getContentPane().add(panelAno);

        panelObsRow1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbObs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbObs.setText("Observações:");
        panelObsRow1.add(lbObs);

        getContentPane().add(panelObsRow1);

        taObsText.setEditable(false);
        taObsText.setColumns(20);
        taObsText.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        taObsText.setLineWrap(true);
        taObsText.setRows(5);
        taObsText.setWrapStyleWord(true);
        jScrollPane1.setViewportView(taObsText);

        panelObsRow2.add(jScrollPane1);

        getContentPane().add(panelObsRow2);

        btOS.setText("Ver OS");
        btOS.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btOSActionPerformed(evt);
            }
        });
        panelBotoes.add(btOS);

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btSairActionPerformed(evt);
            }
        });
        panelBotoes.add(btSair);

        getContentPane().add(panelBotoes);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(250, 100));

        tabela.setBackground(new java.awt.Color(204, 204, 204));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {},
                {},
                {},
                {}
            },
            new String []
            {

            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabela);

        getContentPane().add(jScrollPane2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOSActionPerformed
        // TODO add your handling code here:
         
            OrdemDeServico os;
            ConexaoBd bd = new ConexaoBd();
            try {this.osLista.clear();}catch(RuntimeException e){this.osLista = new ArrayList<OrdemDeServico>();}
            this.osLista = bd.buscaOSPlaca(this.carro.getPlaca());
            Iterator<OrdemDeServico> it = this.osLista.iterator();
            DefaultTableModel model = (DefaultTableModel)tabela.getModel(); 
            model.setNumRows(0);
            model.setColumnCount(3);
            model.setColumnIdentifiers(new Object[]{"Numero da OS", "Carro", "Estado"});
            Class<?> col_class = tabela.getColumnClass(0);
            tabela.setDefaultEditor(col_class, null);
            col_class = tabela.getColumnClass(1);
            tabela.setDefaultEditor(col_class, null);
            col_class = tabela.getColumnClass(2);
            tabela.setDefaultEditor(col_class, null);
            while(it.hasNext())
            {   os = it.next();
                model.addRow(new Object[]{os.getCodigoOs(), os.getPlacaCarro(), os.getEstado()});
            }
    }//GEN-LAST:event_btOSActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:
         if(evt.getClickCount() == 2)
        {
            OrdemDeServico os = this.osLista.get(tabela.getSelectedRow());
              new VisualizaOs(os, false).setVisible(true);
            
        }
    }//GEN-LAST:event_tabelaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOS;
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbAno;
    private javax.swing.JLabel lbAnoText;
    private javax.swing.JLabel lbCor;
    private javax.swing.JLabel lbCorText;
    private javax.swing.JLabel lbDono;
    private javax.swing.JLabel lbDonoText;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbMarcaText;
    private javax.swing.JLabel lbModelo;
    private javax.swing.JLabel lbModeloText;
    private javax.swing.JLabel lbObs;
    private javax.swing.JLabel lbPlaca;
    private javax.swing.JLabel lbPlacaText;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel panelAno;
    private javax.swing.JPanel panelBotoes;
    private javax.swing.JPanel panelCor;
    private javax.swing.JPanel panelDono;
    private javax.swing.JPanel panelMarca;
    private javax.swing.JPanel panelModelo;
    private javax.swing.JPanel panelObsRow1;
    private javax.swing.JPanel panelObsRow2;
    private javax.swing.JPanel panelPlaca;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextArea taObsText;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
    private List<OrdemDeServico> osLista;
}
