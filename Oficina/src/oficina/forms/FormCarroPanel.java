/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina.forms;

import oficina.classes.StringPlacaException;
import oficina.classes.Carro;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import oficina.classes.ConexaoBd;
import oficina.classes.Funcionario;
import oficina.visualizar.VisualizaCarro;
import oficina.modal.buscaClienteModal;

/**
 *
 * @author RF
 */
public class FormCarroPanel extends javax.swing.JPanel {

    /**
     * Creates new form FormCarroPanel
     */
    public FormCarroPanel(Funcionario func) {
        this.funcionario = func;
        initComponents();
        ConexaoBd bd = new ConexaoBd();
        bd.preencheCbMarca(this.cboxMarca);
        bd.preencheCbModelo(this.cboxModelo, this.cboxMarca.getSelectedItem().toString());
        //this.setLocationRelativeTo(null);
    }

    private void verificaStringPlaca(String placa) throws StringPlacaException {
         
            if(placa.length() < 8)
                throw new StringPlacaException("Campo placa tem menos que 8 caracteres!");
            
            if(placa.codePointAt(0) < 'A' || placa.codePointAt(0) > 'Z' ){
                throw new StringPlacaException("O primeiro dígito da placa não é válido");  
            }
            
            if(placa.codePointAt(1) < 'A' || placa.codePointAt(1) > 'Z'){
                throw new StringPlacaException("O segundo dígito da placa não é válido");  
            }
            
            if(placa.codePointAt(2) < 'A' || placa.codePointAt(2) > 'Z'){
                throw new StringPlacaException("O terceiro dígito da placa não é válido");  
            }
            
            if(placa.codePointAt(3) != '-'){//o hifen nao esta no lugar correto
                throw new StringPlacaException("O quarto dígito da placa não é válido");  
            }
            
            if(placa.codePointAt(4) < '0' || placa.codePointAt(4) > '9'){
                throw new StringPlacaException("O quinto dígito da placa não é válido");  
            }
            
            if(placa.codePointAt(5) < '0' || placa.codePointAt(5) > '9'){
                throw new StringPlacaException("O sexto dígito da placa não é válido");  
            }
            
            if(placa.codePointAt(6) < '0' || placa.codePointAt(6) > '9'){
                throw new StringPlacaException("O sétimo dígito da placa não é válido");  
            }
            
            if(placa.codePointAt(7) < '0' || placa.codePointAt(7) > '9'){
                throw new StringPlacaException("O oitavo dígito da placa não é válido");
            }
           
    }
    
    public void verificaAno(int ano) throws RuntimeException{
        if(ano < 1950 || ano > 2016){ //se o ano nao estiver dentro do intervalo valido
                throw new RuntimeException("O ano informado não é válido"); 
            }
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

        jPanel1 = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        lbIcone = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        panelCliente = new javax.swing.JPanel();
        btSelecionarCliente = new javax.swing.JButton();
        lbClienteText = new javax.swing.JLabel();
        panelPlacaRow1 = new javax.swing.JPanel();
        lbPlaca = new javax.swing.JLabel();
        tfPlaca = new javax.swing.JTextField();
        lbPlacaEx = new javax.swing.JLabel();
        panelPlacaAlertaHolder = new javax.swing.JPanel();
        lbPlacaAlerta = new javax.swing.JLabel();
        panelMarca = new javax.swing.JPanel();
        lbMarca = new javax.swing.JLabel();
        cboxMarca = new javax.swing.JComboBox();
        panelModelo = new javax.swing.JPanel();
        lbModelo = new javax.swing.JLabel();
        cboxModelo = new javax.swing.JComboBox();
        panelCor = new javax.swing.JPanel();
        lbCor = new javax.swing.JLabel();
        cboxCor = new javax.swing.JComboBox();
        panelAnoRow1 = new javax.swing.JPanel();
        lbAno = new javax.swing.JLabel();
        tfAno = new javax.swing.JTextField();
        lbAnoEx = new javax.swing.JLabel();
        panelAnoAlertaHolder = new javax.swing.JPanel();
        lbAnoAlerta = new javax.swing.JLabel();
        panelObs = new javax.swing.JPanel();
        lbObs = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taObs = new javax.swing.JTextArea();
        panelAlertaHolder = new javax.swing.JPanel();
        lbAlerta = new javax.swing.JLabel();
        panelBotoes = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));

        lbIcone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oficina/resources/icon-veiculos.png"))); // NOI18N
        panelTitulo.add(lbIcone);

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitulo.setText("Cadastro de Carro");
        panelTitulo.add(lbTitulo);

        jPanel1.add(panelTitulo);

        panelCliente.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        btSelecionarCliente.setText("* Cliente: ");
        btSelecionarCliente.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btSelecionarClienteActionPerformed(evt);
            }
        });
        panelCliente.add(btSelecionarCliente);

        lbClienteText.setText("NÃO INFORMADO");
        lbClienteText.setPreferredSize(new java.awt.Dimension(150, 14));
        panelCliente.add(lbClienteText);

        jPanel1.add(panelCliente);

        panelPlacaRow1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbPlaca.setText("* Placa:");
        lbPlaca.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panelPlacaRow1.add(lbPlaca);

        tfPlaca.setColumns(10);
        tfPlaca.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfPlaca.setToolTipText("Preencha a placa do carro, exemplo: AKG-1529");
        tfPlaca.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfPlacaKeyTyped(evt);
            }
        });
        panelPlacaRow1.add(tfPlaca);

        lbPlacaEx.setForeground(new java.awt.Color(102, 102, 102));
        lbPlacaEx.setText("ex: AAA-1234");
        lbPlacaEx.setOpaque(true);
        panelPlacaRow1.add(lbPlacaEx);

        jPanel1.add(panelPlacaRow1);

        panelPlacaAlertaHolder.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbPlacaAlerta.setForeground(new java.awt.Color(255, 0, 0));
        lbPlacaAlerta.setToolTipText("");
        lbPlacaAlerta.setPreferredSize(new java.awt.Dimension(240, 14));
        panelPlacaAlertaHolder.add(lbPlacaAlerta);

        jPanel1.add(panelPlacaAlertaHolder);

        panelMarca.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbMarca.setText("* Marca: ");
        panelMarca.add(lbMarca);

        cboxMarca.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                cboxMarcaItemStateChanged(evt);
            }
        });
        panelMarca.add(cboxMarca);

        jPanel1.add(panelMarca);

        panelModelo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbModelo.setText("* Modelo: ");
        panelModelo.add(lbModelo);
        panelModelo.add(cboxModelo);

        jPanel1.add(panelModelo);

        panelCor.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbCor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCor.setText("* Cor:");
        lbCor.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panelCor.add(lbCor);

        cboxCor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Preto", "Branco", "Cinza", "Vermelho", "Azul", "Verde" }));
        panelCor.add(cboxCor);

        jPanel1.add(panelCor);

        panelAnoRow1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbAno.setText("* Ano: ");
        panelAnoRow1.add(lbAno);

        tfAno.setColumns(5);
        tfAno.setToolTipText("Preencha com o ano de fabricação do carro");
        tfAno.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfAnoKeyTyped(evt);
            }
        });
        panelAnoRow1.add(tfAno);

        lbAnoEx.setForeground(new java.awt.Color(102, 102, 102));
        lbAnoEx.setText("ex: 1984");
        lbAnoEx.setOpaque(true);
        panelAnoRow1.add(lbAnoEx);

        jPanel1.add(panelAnoRow1);

        panelAnoAlertaHolder.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbAnoAlerta.setForeground(new java.awt.Color(255, 0, 0));
        lbAnoAlerta.setPreferredSize(new java.awt.Dimension(240, 14));
        panelAnoAlertaHolder.add(lbAnoAlerta);

        jPanel1.add(panelAnoAlertaHolder);

        panelObs.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbObs.setText("Observações:");
        panelObs.add(lbObs);

        taObs.setColumns(20);
        taObs.setLineWrap(true);
        taObs.setRows(5);
        taObs.setWrapStyleWord(true);
        jScrollPane1.setViewportView(taObs);

        panelObs.add(jScrollPane1);

        jPanel1.add(panelObs);

        panelAlertaHolder.setPreferredSize(new java.awt.Dimension(169, 24));
        panelAlertaHolder.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbAlerta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbAlerta.setText("(*) Campos obrigatórios.");
        panelAlertaHolder.add(lbAlerta);

        jPanel1.add(panelAlertaHolder);

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btCadastrarActionPerformed(evt);
            }
        });
        panelBotoes.add(btCadastrar);

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btLimparActionPerformed(evt);
            }
        });
        panelBotoes.add(btLimpar);

        jPanel1.add(panelBotoes);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void btSelecionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarClienteActionPerformed
        buscaClienteModal dlg = new buscaClienteModal((JFrame)SwingUtilities.getWindowAncestor(this), true);
        clienteCpfCnpj = dlg.showDiag();
        this.codCliente = dlg.getCodCliente();

        if(clienteCpfCnpj != null)
        {
            String cod;
            String nome;
            cod = ""+this.codCliente;
            ConexaoBd bd = new ConexaoBd();
            nome = bd.buscaNomeCliente(true, cod);
           
           
            lbClienteText.setText(nome);
            lbClienteText.setForeground(Color.black);
        }

        else
            lbClienteText.setForeground(Color.red);
    }//GEN-LAST:event_btSelecionarClienteActionPerformed

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

    private void tfAnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAnoKeyTyped
        char caractere = evt.getKeyChar();

        if(!(Character.isDigit(caractere)
                || caractere == KeyEvent.VK_BACK_SPACE
                || caractere == KeyEvent.VK_DELETE)
                || tfAno.getText().length() > 3)
            evt.consume();
    }//GEN-LAST:event_tfAnoKeyTyped

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        carroTemp = new Carro();
        int flagCampos = 1; //caso todos os campos estejam corretos a flag sera igual a 1

        //Se cliente é null, não cadastra. Se não é null, está certo pela função
        if(clienteCpfCnpj == null)
        {
            lbClienteText.setForeground(Color.red);
            flagCampos = 0;
        }

        //Se a placa nao foi informada e preciso pedir ao usuario que a preencha
        if(tfPlaca.getText().trim().isEmpty())
        {
            lbPlaca.setForeground(Color.red);
            lbAlerta.setForeground(Color.red);
            flagCampos = 0;
        }

        else
        {
            //Apaga label de alerta
            lbPlaca.setForeground(Color.black);

            try{ verificaStringPlaca(tfPlaca.getText());}

            catch(StringPlacaException e){
                lbPlacaAlerta.setText(e.getMsgErro());
                flagCampos = 0;
            }
        }

        //Se o ano nao foi informado e preciso pedir ao usuario que o preencha
        if(tfAno.getText().trim().isEmpty())
        {
            lbAno.setForeground(Color.red);
            lbAlerta.setForeground(Color.red);
            flagCampos = 0;
        }

        else //o ano foi informado pelo usuario
        {
            lbAno.setForeground(Color.black);

            try{ verificaAno(Integer.parseInt(tfAno.getText()));} //guarda no objeto o ano informado pelo usuario
            catch(RuntimeException e){
                lbAnoAlerta.setText(e.getMessage());
                flagCampos = 0;
            }
        }

        //caso todos os campos tenham sido preenchidos corretamente
        if(flagCampos == 1){
            carroTemp.setCodDono(this.codCliente);
            carroTemp.setCPFDono(this.clienteCpfCnpj);
            carroTemp.setPlaca(tfPlaca.getText());
            carroTemp.setNomeMarca(cboxMarca.getSelectedItem().toString());
            carroTemp.setCodMarca(cboxMarca.getSelectedIndex() + 1);            
            carroTemp.setNomeModelo(cboxModelo.getSelectedItem().toString());
            carroTemp.setCor(cboxCor.getSelectedItem().toString());
            carroTemp.setAno(tfAno.getText());
            carroTemp.setObservacoes(taObs.getText());
            
            ConexaoBd bd = new ConexaoBd();
            // busca codModelo noBD através do nome do modelo e o insere no carroTemp
            bd.buscaCodModelo(cboxModelo.getSelectedItem().toString(), carroTemp); 
            
            if(bd.buscaCarroPlaca(carroTemp.getPlaca()) != null)
            {
                 JOptionPane.showMessageDialog(null, "Já existe um carro com a mesma placa cadastrado no sistema.");
            }
            
            else
            {
                bd.cadastraCarro(carroTemp, this.funcionario);

                lbClienteText.setText("NÃO INFORMADO");
                lbClienteText.setForeground(Color.black);
                clienteCpfCnpj = null;
                tfPlaca.setText(null);
                tfAno.setText(null);
                lbPlacaAlerta.setText("");
                lbAnoAlerta.setText("");
                taObs.setText("");
                cboxMarca.setSelectedIndex(0);
                cboxModelo.setSelectedIndex(0);
                cboxCor.setSelectedIndex(0);
                lbAlerta.setForeground(Color.black);

                JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!");
            }
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        //Limpa todos os campos
        lbClienteText.setText("NÃO INFORMADO");
        lbClienteText.setForeground(Color.black);
        lbPlaca.setForeground(Color.black);
        lbAno.setForeground(Color.black);
        clienteCpfCnpj = null;
        tfPlaca.setText(null);
        tfAno.setText(null);
        lbPlacaAlerta.setText("");
        lbAnoAlerta.setText("");
        taObs.setText("");
        cboxMarca.setSelectedIndex(0);
        cboxModelo.setSelectedIndex(0);
        cboxCor.setSelectedIndex(0);
        lbAlerta.setForeground(Color.black);
    }//GEN-LAST:event_btLimparActionPerformed

    private void cboxMarcaItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cboxMarcaItemStateChanged
    {//GEN-HEADEREND:event_cboxMarcaItemStateChanged
        ConexaoBd bd = new ConexaoBd();
        bd.preencheCbModelo(this.cboxModelo, this.cboxMarca.getSelectedItem().toString());
    }//GEN-LAST:event_cboxMarcaItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSelecionarCliente;
    private javax.swing.JComboBox cboxCor;
    private javax.swing.JComboBox cboxMarca;
    private javax.swing.JComboBox cboxModelo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAlerta;
    private javax.swing.JLabel lbAno;
    private javax.swing.JLabel lbAnoAlerta;
    private javax.swing.JLabel lbAnoEx;
    private javax.swing.JLabel lbClienteText;
    private javax.swing.JLabel lbCor;
    private javax.swing.JLabel lbIcone;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbModelo;
    private javax.swing.JLabel lbObs;
    private javax.swing.JLabel lbPlaca;
    private javax.swing.JLabel lbPlacaAlerta;
    private javax.swing.JLabel lbPlacaEx;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel panelAlertaHolder;
    private javax.swing.JPanel panelAnoAlertaHolder;
    private javax.swing.JPanel panelAnoRow1;
    private javax.swing.JPanel panelBotoes;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelCor;
    private javax.swing.JPanel panelMarca;
    private javax.swing.JPanel panelModelo;
    private javax.swing.JPanel panelObs;
    private javax.swing.JPanel panelPlacaAlertaHolder;
    private javax.swing.JPanel panelPlacaRow1;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextArea taObs;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfPlaca;
    // End of variables declaration//GEN-END:variables
    private Carro carroTemp;
    private String clienteCpfCnpj;
    private int codCliente;
    private Funcionario funcionario;
}
