package br.com.view;

import br.com.controller.CidadeController;
import br.com.model.negosio.Cidade;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author clayson_medeiros
 */
public class CidadeGUI extends javax.swing.JFrame {

    private CidadeTableModel model;

    public CidadeGUI() {
        initComponents();
        List<Cidade> lista = new ArrayList<Cidade>();
        CidadeController a = new CidadeController();
        lista = a.listarCidade();

        //cria o automovel de Produto      
        model = new CidadeTableModel(lista);

        //atribui o automovel à tabela
        tabelaCidades.setModel(model);


    }//

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        labelCidades = new javax.swing.JLabel();
        txPesquisa = new javax.swing.JTextField();
        botaoPesquisa = new javax.swing.JButton();
        scrollTabela = new javax.swing.JScrollPane();
        tabelaCidades = new javax.swing.JTable();
        btInserir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelFundo.setBackground(new java.awt.Color(255, 255, 255));

        labelCidades.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelCidades.setText("Cidades");

        txPesquisa.setToolTipText("Ano de Fabricação");
        txPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txPesquisaKeyPressed(evt);
            }
        });

        botaoPesquisa.setText("Pesquisar");
        botaoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisaActionPerformed(evt);
            }
        });

        tabelaCidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "UF"
            }
        ));
        scrollTabela.setViewportView(tabelaCidades);

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout painelFundoLayout = new org.jdesktop.layout.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .add(painelFundoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(painelFundoLayout.createSequentialGroup()
                        .add(btInserir)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btEditar)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btRemover))
                    .add(scrollTabela, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 326, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(painelFundoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(painelFundoLayout.createSequentialGroup()
                            .add(txPesquisa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 241, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(botaoPesquisa))
                        .add(labelCidades)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .add(labelCidades)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(painelFundoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txPesquisa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(botaoPesquisa))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(scrollTabela, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 142, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(painelFundoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btRemover)
                    .add(btEditar)
                    .add(btInserir))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painelFundo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painelFundo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        InserirCidadeGUI im = new InserirCidadeGUI(model);
        im.setVisible(true);
    }//GEN-LAST:event_btInserirActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int selecionado = -1;
        selecionado = tabelaCidades.getSelectedRow();

        if (selecionado >= 0) {
            Integer i = (Integer) model.getValueAt(selecionado, 0);
            CidadeController mc = new CidadeController();
            if (mc.excluir(i)){
            model.removeCidade(selecionado);
            }

        } else {
            JOptionPane.showMessageDialog(null, "É necesário selecionar uma linha");
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int selecionado = -1;
        selecionado = tabelaCidades.getSelectedRow();

        if (selecionado >= 0) {
            Integer cdAutomovel = (Integer) model.getValueAt(selecionado, 0);
            AtualizarCidadeGUI am = new AtualizarCidadeGUI(selecionado, cdAutomovel, model);
            am.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar uma linha");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void botaoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisaActionPerformed
        efetuaPesquisa();

    }//GEN-LAST:event_botaoPesquisaActionPerformed

    private void txPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txPesquisaKeyPressed
    
        efetuaPesquisa();
       
    }//GEN-LAST:event_txPesquisaKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPesquisa;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btRemover;
    private javax.swing.JLabel labelCidades;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JScrollPane scrollTabela;
    private javax.swing.JTable tabelaCidades;
    private javax.swing.JTextField txPesquisa;
    // End of variables declaration//GEN-END:variables

    private void efetuaPesquisa() {
        String nome = txPesquisa.getText();
        List<Cidade> lista = new ArrayList<Cidade>();
        CidadeController a = new CidadeController();
        lista = a.listarCidadeByNome(nome);
        model.limpar();       
         
        model = new CidadeTableModel(lista);

        tabelaCidades.setModel(model);
    }
}
