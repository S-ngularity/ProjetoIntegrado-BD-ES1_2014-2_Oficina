/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina.forms;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oficina.classes.Carro;
import oficina.classes.ConexaoBd;
import oficina.classes.OrdemDeServico;
import oficina.classes.PessoaFisica;
import oficina.classes.PessoaJuridica;
import oficina.visualizar.VisualizaCarro;
import oficina.visualizar.VisualizaOs;
import oficina.visualizar.VisualizaPessoaFisica;
import oficina.visualizar.VisualizaPessoaJuridica;

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
    private void initComponents()
    {

        buttonGroupFisica = new javax.swing.ButtonGroup();
        buttonGroupJuridica = new javax.swing.ButtonGroup();
        panelTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        panelTabbedHolder = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelBuscaOs = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        panelNumOs = new javax.swing.JPanel();
        lbNumOs = new javax.swing.JLabel();
        tfNumOs = new javax.swing.JTextField();
        panelBuscarOs = new javax.swing.JPanel();
        btBuscarOs = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaOS = new javax.swing.JTable();
        panelBuscaCarro = new javax.swing.JPanel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        panelPlaca = new javax.swing.JPanel();
        lbPlaca = new javax.swing.JLabel();
        tfPlaca = new javax.swing.JTextField();
        panelBuscarPlaca = new javax.swing.JPanel();
        btBuscarPlaca = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaCarro = new javax.swing.JTable();
        panelBuscaFisica = new javax.swing.JPanel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        panelCpf = new javax.swing.JPanel();
        radioFisicaCPF = new javax.swing.JRadioButton();
        tfFisicaCpf = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        radioFisicaNome = new javax.swing.JRadioButton();
        tfFisicaNome = new javax.swing.JTextField();
        panelBuscarCpf = new javax.swing.JPanel();
        btCpf = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFisica = new javax.swing.JTable();
        panelBuscaJuridica = new javax.swing.JPanel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        panelCnpj = new javax.swing.JPanel();
        radioJuridicaCNPJ = new javax.swing.JRadioButton();
        tfJuridicaCnpj = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        radioJuridicaNome = new javax.swing.JRadioButton();
        tfJuridicaNome = new javax.swing.JTextField();
        panelBuscarCnpj = new javax.swing.JPanel();
        btBuscarCnpj = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaJuridica = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(550, 550));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbTitulo.setText("Busca");
        panelTitulo.add(lbTitulo);

        add(panelTitulo);

        panelTabbedHolder.setPreferredSize(new java.awt.Dimension(550, 505));

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(540, 497));

        panelBuscaOs.setLayout(new javax.swing.BoxLayout(panelBuscaOs, javax.swing.BoxLayout.PAGE_AXIS));
        panelBuscaOs.add(filler2);

        lbNumOs.setText("Número da O.S.: ");
        panelNumOs.add(lbNumOs);

        tfNumOs.setColumns(15);
        panelNumOs.add(tfNumOs);

        panelBuscaOs.add(panelNumOs);

        btBuscarOs.setText("Procurar");
        btBuscarOs.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btBuscarOsActionPerformed(evt);
            }
        });
        panelBuscarOs.add(btBuscarOs);
        panelBuscarOs.add(jSeparator1);

        panelBuscaOs.add(panelBuscarOs);

        tabelaOS.setAutoCreateRowSorter(true);
        tabelaOS.setBackground(new java.awt.Color(204, 204, 204));
        tabelaOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Numero da OS", "Carro", "Estado"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tabelaOS.setShowHorizontalLines(false);
        tabelaOS.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tabelaOSMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelaOS);

        panelBuscaOs.add(jScrollPane4);

        jTabbedPane1.addTab("Ordem de Serviço", panelBuscaOs);

        panelBuscaCarro.setLayout(new javax.swing.BoxLayout(panelBuscaCarro, javax.swing.BoxLayout.PAGE_AXIS));
        panelBuscaCarro.add(filler4);

        lbPlaca.setText("Placa do Carro: ");
        panelPlaca.add(lbPlaca);

        tfPlaca.setColumns(10);
        tfPlaca.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfPlacaKeyTyped(evt);
            }
        });
        panelPlaca.add(tfPlaca);

        panelBuscaCarro.add(panelPlaca);

        btBuscarPlaca.setText("Procurar");
        btBuscarPlaca.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btBuscarPlacaActionPerformed(evt);
            }
        });
        panelBuscarPlaca.add(btBuscarPlaca);

        panelBuscaCarro.add(panelBuscarPlaca);

        tabelaCarro.setAutoCreateRowSorter(true);
        tabelaCarro.setBackground(new java.awt.Color(204, 204, 204));
        tabelaCarro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Placa", "Modelo", "Cliente"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tabelaCarro.setShowHorizontalLines(false);
        tabelaCarro.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tabelaCarroMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaCarro);

        panelBuscaCarro.add(jScrollPane3);

        jTabbedPane1.addTab("Carro", panelBuscaCarro);

        panelBuscaFisica.setLayout(new javax.swing.BoxLayout(panelBuscaFisica, javax.swing.BoxLayout.PAGE_AXIS));
        panelBuscaFisica.add(filler3);

        buttonGroupFisica.add(radioFisicaCPF);
        radioFisicaCPF.setSelected(true);
        radioFisicaCPF.setText("CPF do Cliente: ");
        radioFisicaCPF.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                radioFisicaCPFActionPerformed(evt);
            }
        });
        panelCpf.add(radioFisicaCPF);

        tfFisicaCpf.setColumns(14);
        try
        {
            tfFisicaCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }
        tfFisicaCpf.setText("000.000.000-00");
        tfFisicaCpf.setToolTipText("");
        tfFisicaCpf.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                tfFisicaCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                tfFisicaCpfFocusLost(evt);
            }
        });
        panelCpf.add(tfFisicaCpf);

        panelBuscaFisica.add(panelCpf);

        buttonGroupFisica.add(radioFisicaNome);
        radioFisicaNome.setText("Nome do Cliente: ");
        radioFisicaNome.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                radioFisicaNomeActionPerformed(evt);
            }
        });
        jPanel1.add(radioFisicaNome);

        tfFisicaNome.setColumns(15);
        tfFisicaNome.setEnabled(false);
        jPanel1.add(tfFisicaNome);

        panelBuscaFisica.add(jPanel1);

        btCpf.setText("Procurar");
        btCpf.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btCpfActionPerformed(evt);
            }
        });
        panelBuscarCpf.add(btCpf);

        panelBuscaFisica.add(panelBuscarCpf);

        tabelaFisica.setAutoCreateRowSorter(true);
        tabelaFisica.setBackground(new java.awt.Color(204, 204, 204));
        tabelaFisica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID", "Cliente", "CPF/CNPJ"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tabelaFisica.setShowHorizontalLines(false);
        tabelaFisica.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tabelaFisicaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFisica);

        panelBuscaFisica.add(jScrollPane1);

        jTabbedPane1.addTab("Pessoa Física", panelBuscaFisica);

        panelBuscaJuridica.setLayout(new javax.swing.BoxLayout(panelBuscaJuridica, javax.swing.BoxLayout.PAGE_AXIS));
        panelBuscaJuridica.add(filler5);

        buttonGroupJuridica.add(radioJuridicaCNPJ);
        radioJuridicaCNPJ.setSelected(true);
        radioJuridicaCNPJ.setText("CNPJ da Empresa: ");
        radioJuridicaCNPJ.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                radioJuridicaCNPJActionPerformed(evt);
            }
        });
        panelCnpj.add(radioJuridicaCNPJ);

        tfJuridicaCnpj.setColumns(20);
        try
        {
            tfJuridicaCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }
        tfJuridicaCnpj.setText("00.000.000/0000-00");
        tfJuridicaCnpj.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                tfJuridicaCnpjFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                tfJuridicaCnpjFocusLost(evt);
            }
        });
        panelCnpj.add(tfJuridicaCnpj);

        panelBuscaJuridica.add(panelCnpj);

        buttonGroupJuridica.add(radioJuridicaNome);
        radioJuridicaNome.setText("Nome Comercial: ");
        radioJuridicaNome.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                radioJuridicaNomeActionPerformed(evt);
            }
        });
        jPanel2.add(radioJuridicaNome);

        tfJuridicaNome.setColumns(19);
        tfJuridicaNome.setEnabled(false);
        jPanel2.add(tfJuridicaNome);

        panelBuscaJuridica.add(jPanel2);

        btBuscarCnpj.setText("Procurar");
        btBuscarCnpj.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btBuscarCnpjActionPerformed(evt);
            }
        });
        panelBuscarCnpj.add(btBuscarCnpj);

        panelBuscaJuridica.add(panelBuscarCnpj);

        tabelaJuridica.setAutoCreateRowSorter(true);
        tabelaJuridica.setBackground(new java.awt.Color(204, 204, 204));
        tabelaJuridica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID", "Empresa", "CNPJ"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tabelaJuridica.setShowHorizontalLines(false);
        tabelaJuridica.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tabelaJuridicaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaJuridica);

        panelBuscaJuridica.add(jScrollPane2);

        jTabbedPane1.addTab("Pessoa Jurídica", panelBuscaJuridica);

        panelTabbedHolder.add(jTabbedPane1);

        add(panelTabbedHolder);
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarOsActionPerformed
        OrdemDeServico os;
        try {this.osLista.clear();}catch(RuntimeException e){this.osLista = new ArrayList<OrdemDeServico>();}
        ConexaoBd bd = new ConexaoBd();
        os = bd.buscaOSCod(Integer.parseInt(tfNumOs.getText()));
        DefaultTableModel model = (DefaultTableModel)tabelaOS.getModel();
        model.setNumRows(0);
        
        if(os != null)
        {   model.addRow(new Object[]{os.getCodigoOs(), os.getPlacaCarro(),os.getEstado()});
            this.osLista.add(os);
        }
        
        else
            JOptionPane.showMessageDialog(null, "Número da Ordem de Serviço não é válido.");
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
        Carro carro;
        try {this.carrosLista.clear();}catch(RuntimeException e){this.carrosLista = new ArrayList<Carro>();}
        ConexaoBd bd = new ConexaoBd();
        carro = bd.buscaCarroPlaca(tfPlaca.getText());
        DefaultTableModel model = (DefaultTableModel)tabelaCarro.getModel(); 
        model.setNumRows(0);
        if(carro != null)
        {    model.addRow(new Object[]{carro.getPlaca(), carro.getNomeModelo(), bd.buscaNomeDono(carro.getCodDono())});
            this.carrosLista.add(carro);
        }
        
        else
            JOptionPane.showMessageDialog(null, "Placa não é válida ou não está cadastrada.");
    }//GEN-LAST:event_btBuscarPlacaActionPerformed

    private void tfFisicaCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfFisicaCpfFocusGained
        tfFisicaCpf.setText(null);
        tfFisicaCpf.setForeground(Color.black);
    }//GEN-LAST:event_tfFisicaCpfFocusGained

    private void tfFisicaCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfFisicaCpfFocusLost
        if("000.000.000-00".equals(tfFisicaCpf.getText()) || "   .   .   -  ".equals(tfFisicaCpf.getText()))
        {
            tfFisicaCpf.setText("000.000.000-00");
            tfFisicaCpf.setForeground(Color.gray);
        }
    }//GEN-LAST:event_tfFisicaCpfFocusLost

    private void btCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCpfActionPerformed
        if(radioFisicaCPF.isSelected())
        {
            PessoaFisica cliente;
            try {this.clientesFisicos.clear();}catch(RuntimeException e){this.clientesFisicos = new ArrayList<PessoaFisica>();}
            ConexaoBd bd = new ConexaoBd();
            cliente = bd.buscaPessoaFisicaCPF(tfFisicaCpf.getText());
            DefaultTableModel model = (DefaultTableModel)tabelaFisica.getModel(); 
            model.setNumRows(0);
            if(cliente != null)
            {    model.addRow(new Object[]{cliente.getCodCliente(), cliente.getNome(), cliente.getCPF()});
                 this.clientesFisicos.add(cliente);
            }

            else
                JOptionPane.showMessageDialog(null, "CPF não é válido ou não está cadastrado.");
        }
        if(radioFisicaNome.isSelected())
        {
            
            PessoaFisica cliente;
            ConexaoBd bd = new ConexaoBd();
            try {this.clientesFisicos.clear();}catch(RuntimeException e){}
            this.clientesFisicos = bd.buscaPessoaFisicaNome(tfFisicaNome.getText());
            Iterator<PessoaFisica> it = this.clientesFisicos.iterator();
            DefaultTableModel model = (DefaultTableModel)tabelaFisica.getModel(); 
            model.setNumRows(0);
            
            while(it.hasNext())
            {   cliente = it.next();
                model.addRow(new Object[]{cliente.getCodCliente(), cliente.getNome(), cliente.getCPF()});
            }
            
        }
    }//GEN-LAST:event_btCpfActionPerformed

    private void tfJuridicaCnpjFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfJuridicaCnpjFocusGained
        tfJuridicaCnpj.setText(null);
        tfJuridicaCnpj.setForeground(Color.black);
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
        
         if(radioJuridicaCNPJ.isSelected())
        {
            PessoaJuridica cliente;
            try {this.clientesJuridicos.clear();}catch(RuntimeException e){this.clientesJuridicos = new ArrayList<PessoaJuridica>();}
            ConexaoBd bd = new ConexaoBd();
            cliente = bd.buscaPessoaJuridicaCNPJ(tfJuridicaCnpj.getText());
            DefaultTableModel model = (DefaultTableModel)tabelaJuridica.getModel(); 
            model.setNumRows(0);
            if(cliente != null)
            {
                model.addRow(new Object[]{cliente.getCodCliente(), cliente.getNomeFantasia(), cliente.getCNPJ()});
                this.clientesJuridicos.add(cliente);
            }
            
            else
                JOptionPane.showMessageDialog(null, "CNPJ não é válido ou não está cadastrado.");
        }
        if(radioJuridicaNome.isSelected())
        {
            
            PessoaJuridica cliente;
            ConexaoBd bd = new ConexaoBd();
            try {this.clientesJuridicos.clear();}catch(RuntimeException e){}
            this.clientesJuridicos = bd.buscaPessoaJuridicaNome(tfJuridicaNome.getText());
            Iterator<PessoaJuridica> it = this.clientesJuridicos.iterator();
            DefaultTableModel model = (DefaultTableModel)tabelaJuridica.getModel(); 
            model.setNumRows(0);
            
            while(it.hasNext())
            {   cliente = it.next();
                model.addRow(new Object[]{cliente.getCodCliente(), cliente.getNomeFantasia(), cliente.getCNPJ()});
            }
            
        }
    }//GEN-LAST:event_btBuscarCnpjActionPerformed

    private void radioFisicaCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFisicaCPFActionPerformed
        tfFisicaCpf.setEnabled(true);
        tfFisicaNome.setEnabled(false);
        
        
    }//GEN-LAST:event_radioFisicaCPFActionPerformed

    private void radioFisicaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFisicaNomeActionPerformed
        tfFisicaCpf.setEnabled(false);
        tfFisicaNome.setEnabled(true);
    }//GEN-LAST:event_radioFisicaNomeActionPerformed

    private void tabelaFisicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFisicaMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2)
        {
            PessoaFisica cliente = this.clientesFisicos.get(tabelaFisica.getSelectedRow());
           new VisualizaPessoaFisica(cliente).setVisible(true);
           
        }
    }//GEN-LAST:event_tabelaFisicaMouseClicked

    private void radioJuridicaCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioJuridicaCNPJActionPerformed
        tfJuridicaCnpj.setEnabled(true);
        tfJuridicaNome.setEnabled(false);
    }//GEN-LAST:event_radioJuridicaCNPJActionPerformed

    private void radioJuridicaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioJuridicaNomeActionPerformed
        tfJuridicaCnpj.setEnabled(false);
        tfJuridicaNome.setEnabled(true);
    }//GEN-LAST:event_radioJuridicaNomeActionPerformed

    private void tabelaJuridicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaJuridicaMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2)
        {
            PessoaJuridica cliente = this.clientesJuridicos.get(tabelaJuridica.getSelectedRow());
           new VisualizaPessoaJuridica(cliente).setVisible(true);
           
        }
    }//GEN-LAST:event_tabelaJuridicaMouseClicked

    private void tabelaCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCarroMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2)
        {
            Carro carro = this.carrosLista.get(tabelaCarro.getSelectedRow());
           new VisualizaCarro(carro).setVisible(true);
           
        }
    }//GEN-LAST:event_tabelaCarroMouseClicked

    private void tabelaOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaOSMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2)
        {
            OrdemDeServico os = this.osLista.get(tabelaOS.getSelectedRow());
           new VisualizaOs(os).setVisible(true);
           
        }
    }//GEN-LAST:event_tabelaOSMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarCnpj;
    private javax.swing.JButton btBuscarOs;
    private javax.swing.JButton btBuscarPlaca;
    private javax.swing.JButton btCpf;
    private javax.swing.ButtonGroup buttonGroupFisica;
    private javax.swing.ButtonGroup buttonGroupJuridica;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
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
    private javax.swing.JPanel panelTabbedHolder;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JRadioButton radioFisicaCPF;
    private javax.swing.JRadioButton radioFisicaNome;
    private javax.swing.JRadioButton radioJuridicaCNPJ;
    private javax.swing.JRadioButton radioJuridicaNome;
    private javax.swing.JTable tabelaCarro;
    private javax.swing.JTable tabelaFisica;
    private javax.swing.JTable tabelaJuridica;
    private javax.swing.JTable tabelaOS;
    private javax.swing.JFormattedTextField tfFisicaCpf;
    private javax.swing.JTextField tfFisicaNome;
    private javax.swing.JFormattedTextField tfJuridicaCnpj;
    private javax.swing.JTextField tfJuridicaNome;
    private javax.swing.JTextField tfNumOs;
    private javax.swing.JTextField tfPlaca;
    // End of variables declaration//GEN-END:variables
    private List<PessoaFisica> clientesFisicos;
    private List<PessoaJuridica> clientesJuridicos;
    private List<Carro> carrosLista;
    private List<OrdemDeServico> osLista;
}
