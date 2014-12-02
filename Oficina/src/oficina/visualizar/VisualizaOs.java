/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina.visualizar;

import oficina.classes.OrdemDeServico;
import oficina.classes.Servico;
import javax.swing.DefaultListModel;
import oficina.modal.formServicoModal;

/**
 *
 * @author Administrator
 */
public class VisualizaOs extends javax.swing.JFrame
{
    /**
     * Creates new form VisualizaOs
     */
    public VisualizaOs(OrdemDeServico os)
    {
        this.osTemp = os;
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.atualizaVisualizacao();
        valor = 0;
    }
    
    private void calcularTotal()
    {
        DefaultListModel d = (DefaultListModel) lServicos.getModel();
        valor = 0;
        
        for(int i = 0; i < d.getSize(); i++)
        {
            valor += Double.parseDouble(((Servico) d.elementAt(i)).getPreco());
        }
    }

    public void atualizaVisualizacao(){
        lbCodigoOsText.setText(Integer.toString(osTemp.getCodigoOs()));
        lbPlacaText.setText(osTemp.getPlacaCarro());
        lbCodClienteText.setText(osTemp.getCpfCliente());
        lblKmEntradaText.setText(osTemp.getKmEntrada());
        lbKmSaidaText.setText(osTemp.getKmSaida());
        lbDataInicioText.setText(osTemp.getDataInicio());
        lbDataFimText.setText(osTemp.getDataFim());
        lbHoraInicioText.setText(osTemp.getHoraInicio());
        lbHoraFimText.setText(osTemp.getHoraFim());
        lbTipoText.setText(osTemp.getEstado());
        lbEstadoText.setText(osTemp.getEstado());
        
        DefaultListModel d = (DefaultListModel) lServicos.getModel();

        while(!osTemp.servicos.isEmpty())
        {
            d.addElement(osTemp.servicos.remove(0));
        };
        
        calcularTotal();
        lbValorText.setText("R$ " + Integer.toString(valor) + ",00");
    }
    
    void closeOp()
    {
        osTemp.setCodigoOs(Integer.parseInt(lbCodigoOsText.getText()));
        osTemp.setPlacaCarro(lbPlacaText.getText());
        osTemp.setCpfCliente(lbCodClienteText.getText());
        osTemp.setKmEntrada(lblKmEntradaText.getText());
        osTemp.setKmSaida(lbKmSaidaText.getText());
        osTemp.setDataInicio(lbDataInicioText.getText());
        osTemp.setDataFim(lbDataFimText.getText());
        osTemp.setHoraInicio(lbHoraInicioText.getText());
        osTemp.setHoraFim(lbHoraFimText.getText());
        osTemp.setEstado(lbTipoText.getText());
        osTemp.setEstado(lbEstadoText.getText());

        DefaultListModel d = (DefaultListModel) lServicos.getModel();

        while(!d.isEmpty())
        {
            osTemp.servicos.add((Servico) d.remove(0));
        };
        
        setVisible(false);
        this.dispose();
        
        //FormOs novo = new FormOs(osTemp); // GAMBETA PRA ALTERAÇÃO NA OS POR AQUI VOLTAR PRA FORMOS
        //novo.setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelInfos = new javax.swing.JPanel();
        panelCodigoOs = new javax.swing.JPanel();
        lbCodigoOs = new javax.swing.JLabel();
        lbCodigoOsText = new javax.swing.JLabel();
        panelPlaca = new javax.swing.JPanel();
        lbPlaca = new javax.swing.JLabel();
        lbPlacaText = new javax.swing.JLabel();
        panelCliente = new javax.swing.JPanel();
        lbCodCliente = new javax.swing.JLabel();
        lbCodClienteText = new javax.swing.JLabel();
        panelTipo = new javax.swing.JPanel();
        lbTipo = new javax.swing.JLabel();
        lbTipoText = new javax.swing.JLabel();
        panelEstado = new javax.swing.JPanel();
        lbEstado = new javax.swing.JLabel();
        lbEstadoText = new javax.swing.JLabel();
        panelKmEntrada = new javax.swing.JPanel();
        lblKmEntrada = new javax.swing.JLabel();
        lblKmEntradaText = new javax.swing.JLabel();
        panelKmSaida = new javax.swing.JPanel();
        lbKmSaida = new javax.swing.JLabel();
        lbKmSaidaText = new javax.swing.JLabel();
        panelDataInicio = new javax.swing.JPanel();
        lbDataInicio = new javax.swing.JLabel();
        lbDataInicioText = new javax.swing.JLabel();
        panelHoraInicio = new javax.swing.JPanel();
        lbHoraInicio = new javax.swing.JLabel();
        lbHoraInicioText = new javax.swing.JLabel();
        panelDataFim = new javax.swing.JPanel();
        lbDataFim = new javax.swing.JLabel();
        lbDataFimText = new javax.swing.JLabel();
        panelHoraFim = new javax.swing.JPanel();
        lbHoraFim = new javax.swing.JLabel();
        lbHoraFimText = new javax.swing.JLabel();
        panelHolderServicos = new javax.swing.JPanel();
        panelServicos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lServicos = new javax.swing.JList();
        panelBotoesLista = new javax.swing.JPanel();
        btAdd = new javax.swing.JButton();
        btDel = new javax.swing.JButton();
        panelValor = new javax.swing.JPanel();
        lbValor = new javax.swing.JLabel();
        lbValorText = new javax.swing.JLabel();
        panelBotoes1 = new javax.swing.JPanel();
        btSair1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualização de Ordem de Serviço");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        lbTitulo.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lbTitulo.setText("Visualizar Ordem de Serviço");
        panelTitulo.add(lbTitulo);

        getContentPane().add(panelTitulo);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        panelInfos.setLayout(new javax.swing.BoxLayout(panelInfos, javax.swing.BoxLayout.PAGE_AXIS));

        panelCodigoOs.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbCodigoOs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCodigoOs.setText("Código:");
        panelCodigoOs.add(lbCodigoOs);

        lbCodigoOsText.setPreferredSize(new java.awt.Dimension(180, 14));
        panelCodigoOs.add(lbCodigoOsText);

        panelInfos.add(panelCodigoOs);

        panelPlaca.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbPlaca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPlaca.setText("Placa:");
        panelPlaca.add(lbPlaca);

        lbPlacaText.setPreferredSize(new java.awt.Dimension(180, 14));
        panelPlaca.add(lbPlacaText);

        panelInfos.add(panelPlaca);

        panelCliente.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbCodCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCodCliente.setText("CPF/CNPJ:");
        panelCliente.add(lbCodCliente);

        lbCodClienteText.setPreferredSize(new java.awt.Dimension(180, 14));
        panelCliente.add(lbCodClienteText);

        panelInfos.add(panelCliente);

        panelTipo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbTipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTipo.setText("Tipo:");
        panelTipo.add(lbTipo);

        lbTipoText.setPreferredSize(new java.awt.Dimension(180, 14));
        panelTipo.add(lbTipoText);

        panelInfos.add(panelTipo);

        panelEstado.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEstado.setText("Estado:");
        panelEstado.add(lbEstado);

        lbEstadoText.setPreferredSize(new java.awt.Dimension(180, 14));
        panelEstado.add(lbEstadoText);

        panelInfos.add(panelEstado);

        panelKmEntrada.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblKmEntrada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblKmEntrada.setText("Quilometragem de Entrada:");
        panelKmEntrada.add(lblKmEntrada);

        lblKmEntradaText.setPreferredSize(new java.awt.Dimension(109, 15));
        panelKmEntrada.add(lblKmEntradaText);

        panelInfos.add(panelKmEntrada);

        panelKmSaida.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbKmSaida.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbKmSaida.setText("Quilometragem de Saída:");
        panelKmSaida.add(lbKmSaida);

        lbKmSaidaText.setPreferredSize(new java.awt.Dimension(109, 15));
        panelKmSaida.add(lbKmSaidaText);

        panelInfos.add(panelKmSaida);

        panelDataInicio.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbDataInicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDataInicio.setText("Data de Início:");
        panelDataInicio.add(lbDataInicio);

        lbDataInicioText.setPreferredSize(new java.awt.Dimension(109, 15));
        panelDataInicio.add(lbDataInicioText);

        panelInfos.add(panelDataInicio);

        panelHoraInicio.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbHoraInicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbHoraInicio.setText("Horário de Início: ");
        panelHoraInicio.add(lbHoraInicio);

        lbHoraInicioText.setPreferredSize(new java.awt.Dimension(109, 15));
        panelHoraInicio.add(lbHoraInicioText);

        panelInfos.add(panelHoraInicio);

        panelDataFim.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbDataFim.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDataFim.setText("Data de Fim:");
        panelDataFim.add(lbDataFim);

        lbDataFimText.setPreferredSize(new java.awt.Dimension(109, 15));
        panelDataFim.add(lbDataFimText);

        panelInfos.add(panelDataFim);

        panelHoraFim.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbHoraFim.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbHoraFim.setText("Horário de Fim:    ");
        panelHoraFim.add(lbHoraFim);

        lbHoraFimText.setPreferredSize(new java.awt.Dimension(109, 15));
        panelHoraFim.add(lbHoraFimText);

        panelInfos.add(panelHoraFim);

        jPanel1.add(panelInfos);

        panelServicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Serviços:"));
        panelServicos.setLayout(new javax.swing.BoxLayout(panelServicos, javax.swing.BoxLayout.PAGE_AXIS));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(160, 260));

        lServicos.setModel(new DefaultListModel<Servico>()
        );
        lServicos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lServicos.setVisibleRowCount(10);
        lServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lServicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lServicos);

        panelServicos.add(jScrollPane1);

        panelBotoesLista.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        btAdd.setText("Adicionar");
        btAdd.setEnabled(false);
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        panelBotoesLista.add(btAdd);

        btDel.setText("Remover");
        btDel.setEnabled(false);
        btDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelActionPerformed(evt);
            }
        });
        panelBotoesLista.add(btDel);

        panelServicos.add(panelBotoesLista);

        panelValor.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbValor.setText("Valor total:");
        panelValor.add(lbValor);

        lbValorText.setText("R$ 0,00");
        lbValorText.setPreferredSize(new java.awt.Dimension(60, 14));
        panelValor.add(lbValorText);

        panelServicos.add(panelValor);

        panelHolderServicos.add(panelServicos);

        jPanel1.add(panelHolderServicos);

        getContentPane().add(jPanel1);

        btSair1.setText("Sair");
        btSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSair1ActionPerformed(evt);
            }
        });
        panelBotoes1.add(btSair1);

        getContentPane().add(panelBotoes1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btDelActionPerformed
    {//GEN-HEADEREND:event_btDelActionPerformed
        int selectedIndex = lServicos.getSelectedIndex();
        DefaultListModel d = (DefaultListModel) lServicos.getModel();

        if(selectedIndex != -1)
            d.remove(selectedIndex);
    }//GEN-LAST:event_btDelActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btAddActionPerformed
    {//GEN-HEADEREND:event_btAddActionPerformed
        formServicoModal dlg = new formServicoModal(this, true);
        Servico servicoTemp = dlg.showDiag();

        if(servicoTemp != null)
        {
            DefaultListModel d = (DefaultListModel) lServicos.getModel();
            d.addElement(servicoTemp);
        }
    }//GEN-LAST:event_btAddActionPerformed

    private void lServicosMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lServicosMouseClicked
    {//GEN-HEADEREND:event_lServicosMouseClicked
        if(evt.getClickCount() == 2)
        {
            int index = lServicos.locationToIndex(evt.getPoint());
            
            if(index >= 0)
            {
                Servico servicoTempAntes = (Servico) lServicos.getModel().getElementAt(index);
                
                formServicoModal dlg = new formServicoModal(this, true, servicoTempAntes);
                Servico servicoTempDepois = dlg.showDiag();

                if(servicoTempDepois != null)
                {
                    DefaultListModel d = (DefaultListModel) lServicos.getModel();
                    d.set(d.indexOf(servicoTempAntes), servicoTempDepois);
                }
            }
        }
    }//GEN-LAST:event_lServicosMouseClicked

    private void btSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSair1ActionPerformed
        closeOp();
    }//GEN-LAST:event_btSair1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        closeOp();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDel;
    private javax.swing.JButton btSair1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lServicos;
    private javax.swing.JLabel lbCodCliente;
    private javax.swing.JLabel lbCodClienteText;
    private javax.swing.JLabel lbCodigoOs;
    private javax.swing.JLabel lbCodigoOsText;
    private javax.swing.JLabel lbDataFim;
    private javax.swing.JLabel lbDataFimText;
    private javax.swing.JLabel lbDataInicio;
    private javax.swing.JLabel lbDataInicioText;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbEstadoText;
    private javax.swing.JLabel lbHoraFim;
    private javax.swing.JLabel lbHoraFimText;
    private javax.swing.JLabel lbHoraInicio;
    private javax.swing.JLabel lbHoraInicioText;
    private javax.swing.JLabel lbKmSaida;
    private javax.swing.JLabel lbKmSaidaText;
    private javax.swing.JLabel lbPlaca;
    private javax.swing.JLabel lbPlacaText;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbTipoText;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbValor;
    private javax.swing.JLabel lbValorText;
    private javax.swing.JLabel lblKmEntrada;
    private javax.swing.JLabel lblKmEntradaText;
    private javax.swing.JPanel panelBotoes1;
    private javax.swing.JPanel panelBotoesLista;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelCodigoOs;
    private javax.swing.JPanel panelDataFim;
    private javax.swing.JPanel panelDataInicio;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JPanel panelHolderServicos;
    private javax.swing.JPanel panelHoraFim;
    private javax.swing.JPanel panelHoraInicio;
    private javax.swing.JPanel panelInfos;
    private javax.swing.JPanel panelKmEntrada;
    private javax.swing.JPanel panelKmSaida;
    private javax.swing.JPanel panelPlaca;
    private javax.swing.JPanel panelServicos;
    private javax.swing.JPanel panelTipo;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelValor;
    // End of variables declaration//GEN-END:variables
    private OrdemDeServico osTemp;
    private int valor;
}
