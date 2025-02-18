/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package projeto.pk29s;

/**
 *
 * @author luiss
 */
public class Edicao extends javax.swing.JInternalFrame {

    /**
     * Creates new form Edicao
     */
    public Edicao() {
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

        btnCancelar = new javax.swing.JButton();
        lblData = new javax.swing.JLabel();
        lblLocal = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        lblOcorrencia = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOcorrencia = new javax.swing.JTextArea();
        btnCadastrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Editar Ocorrência");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblData.setText("Data");

        lblLocal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLocal.setText("Local");

        lblTipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTipo.setText("Tipo");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ameaça", "Estelionato", "Roubo", "Furto", "Acidente de trânsito", "Desaparecimento", "Encontro de pessoas", "Injúria, calúnia ou difamação" }));

        lblOcorrencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOcorrencia.setText("Ocorrencia");

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        txtOcorrencia.setColumns(20);
        txtOcorrencia.setRows(5);
        jScrollPane1.setViewportView(txtOcorrencia);

        btnCadastrar.setText("Editar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblOcorrencia)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocal)
                    .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblOcorrencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnCancelar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        setBounds(0, 0, 348, 360);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblLocal;
    private javax.swing.JLabel lblOcorrencia;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextArea txtOcorrencia;
    // End of variables declaration//GEN-END:variables
}
