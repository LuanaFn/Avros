/*
 * Copyright (C) 2015 Allsoft
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package br.com.allsoft.avros.interfaces;

import br.com.allsoft.avros.dao.ClienteDAO;
import br.com.allsoft.avros.dao.OrcamentoDAO;
import br.com.allsoft.avros.exceptions.ValorInvalidoMoedaException;
import br.com.allsoft.avros.formulas.Moeda;
import br.com.allsoft.avros.formulas.VerificaCpf;
import java.awt.Container;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Luana
 */
public class IfrmEditOrcamento extends javax.swing.JInternalFrame {
    //Variáveis
    OrcamentoDAO orcamento;
    ClienteDAO cliente;
    
    /**
     * Creates new form ifrmPesqOrcamento
     * @param orca orçamento
     * @param cli cliente
     */
    public IfrmEditOrcamento(OrcamentoDAO orca, ClienteDAO cli) {
        orcamento = orca;
        cliente = cli;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblValSessao = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ftxtValor = new javax.swing.JFormattedTextField();
        rdoCartao = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rdoDinheiro = new javax.swing.JRadioButton();
        spnSessoes = new javax.swing.JSpinner();
        lblCpf = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEditarPag = new javax.swing.JLabel();
        lblEditarValor = new javax.swing.JLabel();
        lblEditarSessoes = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(ClsEstilo.tituloFonte);
        jLabel1.setForeground(ClsEstilo.tituloCor);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar orçamento");

        jLabel7.setFont(ClsEstilo.labelFonte);
        jLabel7.setForeground(ClsEstilo.labelCor);
        jLabel7.setText("Valor por sessão:");

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/allsoft/avros/img/logopequeno.png"))); // NOI18N

        btnSalvar.setFont(ClsEstilo.botaoFonte);
        btnSalvar.setForeground(ClsEstilo.botaoCor);
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblValSessao.setFont(ClsEstilo.labelFonte);
        lblValSessao.setForeground(ClsEstilo.labelDinheiroCor);
        lblValSessao.setText("R$ 0,00");

        btnImprimir.setFont(ClsEstilo.botaoFonte);
        btnImprimir.setForeground(ClsEstilo.botaoCor);
        btnImprimir.setText("Imprimir");

        jLabel2.setFont(ClsEstilo.labelFonte);
        jLabel2.setForeground(ClsEstilo.labelCor);
        jLabel2.setText("Nome");

        jLabel3.setFont(ClsEstilo.labelFonte);
        jLabel3.setForeground(ClsEstilo.labelCor);
        jLabel3.setText("CPF");

        jLabel4.setFont(ClsEstilo.labelFonte);
        jLabel4.setForeground(ClsEstilo.labelCor);
        jLabel4.setText("Tipo de pagamento:");

        jLabel5.setFont(ClsEstilo.labelFonte);
        jLabel5.setForeground(ClsEstilo.labelCor);
        jLabel5.setText("Valor total");

        MaskFormatter dateMask = new MaskFormatter();
        dateMask.setPlaceholderCharacter('0') ;
        dateMask.install(ftxtValor);
        ftxtValor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ftxtValor.setForeground(ClsEstilo.textoInputCor);
        ftxtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        ftxtValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ftxtValor.setEnabled(false);
        ftxtValor.setFont(ClsEstilo.textoInputFonte);

        rdoCartao.setFont(ClsEstilo.labelFonte);
        rdoCartao.setForeground(ClsEstilo.labelCor);
        rdoCartao.setText("Cartão");
        rdoCartao.setEnabled(false);

        jLabel6.setFont(ClsEstilo.labelFonte);
        jLabel6.setForeground(ClsEstilo.labelCor);
        jLabel6.setText("Sessões");

        jLabel8.setFont(ClsEstilo.textoInputFonte);
        jLabel8.setForeground(ClsEstilo.textoInputCor);
        jLabel8.setText("R$");

        rdoDinheiro.setFont(ClsEstilo.labelFonte);
        rdoDinheiro.setForeground(ClsEstilo.labelCor);
        rdoDinheiro.setText("Dinheiro");
        rdoDinheiro.setEnabled(false);

        spnSessoes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));
        spnSessoes.setEnabled(false);
        spnSessoes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnSessoesStateChanged(evt);
            }
        });
        spnSessoes.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                spnSessoesCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        lblCpf.setFont(ClsEstilo.labelFonte);
        lblCpf.setForeground(ClsEstilo.textoInputCor);
        lblCpf.setText("000.000.000-00");

        lblNome.setFont(ClsEstilo.labelFonte);
        lblNome.setForeground(ClsEstilo.textoInputCor);
        lblNome.setText("Fulano da Silva");

        lblEditarPag.setBackground(ClsEstilo.formbg);
        lblEditarPag.setFont(ClsEstilo.linkFonte);
        lblEditarPag.setForeground(ClsEstilo.linkCor);
        lblEditarPag.setText("Editar");
        lblEditarPag.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEditarPag.setOpaque(true);
        lblEditarPag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditarPagMouseClicked(evt);
            }
        });

        lblEditarValor.setBackground(ClsEstilo.formbg);
        lblEditarValor.setFont(ClsEstilo.linkFonte);
        lblEditarValor.setForeground(ClsEstilo.linkCor);
        lblEditarValor.setText("Editar");
        lblEditarValor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEditarValor.setOpaque(true);
        lblEditarValor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditarValorMouseClicked(evt);
            }
        });

        lblEditarSessoes.setBackground(ClsEstilo.formbg);
        lblEditarSessoes.setFont(ClsEstilo.linkFonte);
        lblEditarSessoes.setForeground(ClsEstilo.linkCor);
        lblEditarSessoes.setText("Editar");
        lblEditarSessoes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEditarSessoes.setOpaque(true);
        lblEditarSessoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditarSessoesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ftxtValor))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spnSessoes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEditarValor)
                                    .addComponent(lblEditarSessoes)))
                            .addComponent(lblCpf)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoCartao)
                                .addGap(22, 22, 22)
                                .addComponent(rdoDinheiro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblEditarPag))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValSessao)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(btnImprimir))
                            .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(lblNome)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCpf)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoCartao)
                            .addComponent(rdoDinheiro)
                            .addComponent(lblEditarPag))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ftxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(lblEditarValor))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(spnSessoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEditarSessoes))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblValSessao)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar)
                            .addComponent(btnImprimir))))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Container a = this.getContentPane();
        a.setBackground(ClsEstilo.formbg);
        
        Dimension dim = this.getParent().getSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2 + 50);

        lblCpf.setText(VerificaCpf.imprimeCpf(cliente.getCpf()));
        lblNome.setText(cliente.getNome());
        ftxtValor.setText(Moeda.padraoBr(orcamento.getValor()));
        spnSessoes.setValue(orcamento.getSessoes());
        lblValSessao.setText(Moeda.calculaSessao(orcamento.getValor(), orcamento.getSessoes()));
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameActivated

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void spnSessoesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnSessoesStateChanged
        try {
            int sessoes = (Integer) spnSessoes.getValue();
            lblValSessao.setText(Moeda.calculaSessao(ftxtValor.getText(), sessoes));
        } catch (ValorInvalidoMoedaException ex) {
            Logger.getLogger(IfrmCadOrcamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_spnSessoesStateChanged

    private void spnSessoesCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_spnSessoesCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_spnSessoesCaretPositionChanged

    private void lblEditarPagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarPagMouseClicked
        rdoCartao.setEnabled(true);
        rdoDinheiro.setEnabled(true);
    }//GEN-LAST:event_lblEditarPagMouseClicked

    private void lblEditarValorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarValorMouseClicked
        ftxtValor.setEnabled(true);
    }//GEN-LAST:event_lblEditarValorMouseClicked

    private void lblEditarSessoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarSessoesMouseClicked
        spnSessoes.setEnabled(true);
    }//GEN-LAST:event_lblEditarSessoesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField ftxtValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEditarPag;
    private javax.swing.JLabel lblEditarSessoes;
    private javax.swing.JLabel lblEditarValor;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblValSessao;
    private javax.swing.JRadioButton rdoCartao;
    private javax.swing.JRadioButton rdoDinheiro;
    private javax.swing.JSpinner spnSessoes;
    // End of variables declaration//GEN-END:variables
}
