/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sa;

import java.util.ArrayList;

/**
 *
 * @author Aluno_Manha
 */
public class PgAdmin extends javax.swing.JFrame {

    CarroController ccarro = Menu.ccarro;
    ArrayList<Carro> estCarro = ccarro.getList();

    Eventos event = new Eventos();
    public PgAdmin() {
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

        Voltar = new javax.swing.JButton();
        modelo = new javax.swing.JTextField();
        nome_label = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        marca_label = new javax.swing.JLabel();
        ano_label = new javax.swing.JLabel();
        ano = new javax.swing.JTextField();
        precocompra_label = new javax.swing.JLabel();
        precoCompra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        precoAluguel = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        eedit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        aviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloActionPerformed(evt);
            }
        });

        nome_label.setText("Modelo:");

        titulo.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        titulo.setText("Admin");
        titulo.setToolTipText("");

        marca_label.setText("Marca:");

        ano_label.setText("Ano:");

        precocompra_label.setText("Preço da Compra:");

        jLabel1.setText("Preço do Aluguel:");

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        eedit.setText("Edit");
        eedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eeditActionPerformed(evt);
            }
        });

        jLabel2.setText("ID (exceto para Adição):");

        aviso.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Voltar)
                .addGap(314, 314, 314)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(342, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add)
                        .addGap(18, 18, 18)
                        .addComponent(eedit)
                        .addGap(18, 18, 18)
                        .addComponent(remove))
                    .addComponent(id)
                    .addComponent(jLabel1)
                    .addComponent(precocompra_label)
                    .addComponent(marca_label)
                    .addComponent(modelo)
                    .addComponent(nome_label)
                    .addComponent(marca)
                    .addComponent(ano_label)
                    .addComponent(ano)
                    .addComponent(precoCompra)
                    .addComponent(precoAluguel)
                    .addComponent(aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(296, 296, 296))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Voltar)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marca_label)
                .addGap(3, 3, 3)
                .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ano_label)
                .addGap(3, 3, 3)
                .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precocompra_label)
                .addGap(3, 3, 3)
                .addComponent(precoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(precoAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eedit)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(add)
                        .addComponent(remove)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // TODO add your handling code here:
        Eventos event = new Eventos();
        event.nextWindow(new Menu(), this);
    }//GEN-LAST:event_VoltarActionPerformed

    private void modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        try {
            String inputModelo = modelo.getText();
            String inputMarca = marca.getText();
            int inputAno = Integer.parseInt(ano.getText());
            double inputPrecoCompra = Double.parseDouble(precoCompra.getText());
            double inputPrecoAluguel = Double.parseDouble(precoAluguel.getText());
            //int inputId = Integer.parseInt(ano.getText());

            estCarro.add(new Carro(inputModelo, inputMarca, inputAno, inputPrecoCompra, inputPrecoAluguel));
            aviso.setForeground(new java.awt.Color(1, 89, 7));
            aviso.setText("Carro adicionado com sucesso!!");
        } catch (NumberFormatException erro) {
            aviso.setForeground(new java.awt.Color(160, 1, 1));
            aviso.setText("Digite dados corretos!!");
        }
    }//GEN-LAST:event_addActionPerformed

    private void eeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eeditActionPerformed

        try {
            String inputModelo = modelo.getText();
            String inputMarca = marca.getText();
            int inputAno = Integer.parseInt(ano.getText());
            double inputPrecoCompra = Double.parseDouble(precoCompra.getText());
            double inputPrecoAluguel = Double.parseDouble(precoAluguel.getText());
            int inputId = Integer.parseInt(id.getText());

            System.out.println(inputId);
            System.out.println(estCarro.size());
            
            if (inputId >= estCarro.size() || inputId < 0) {
                aviso.setText("Digite um ID válido");
                return; 
            }

            estCarro.set(inputId, new Carro(inputModelo, inputMarca, inputAno, inputPrecoCompra, inputPrecoAluguel));
            aviso.setForeground(new java.awt.Color(1, 89, 7));
            aviso.setText("Carro editado com sucesso!!");
        } catch (NumberFormatException erro) {
            aviso.setForeground(new java.awt.Color(160, 1, 1));
            aviso.setText("Digite dados corretamente!!");
        }
    }//GEN-LAST:event_eeditActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        //REMOVER

        try {

            int inputId = Integer.parseInt(id.getText());

            estCarro.remove(inputId);

            aviso.setForeground(new java.awt.Color(1, 89, 7));
            aviso.setText("Carro Removido com sucesso!!");
        } catch (NumberFormatException erro) {
            aviso.setForeground(new java.awt.Color(160, 1, 1));
            aviso.setText("Digite dados corretamente!!");
        }
    }//GEN-LAST:event_removeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        event.centerJFrame(this);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(PgAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PgAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PgAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PgAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PgAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Voltar;
    private javax.swing.JButton add;
    private javax.swing.JTextField ano;
    private javax.swing.JLabel ano_label;
    private javax.swing.JLabel aviso;
    private javax.swing.JButton eedit;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField marca;
    private javax.swing.JLabel marca_label;
    private javax.swing.JTextField modelo;
    private javax.swing.JLabel nome_label;
    private javax.swing.JTextField precoAluguel;
    private javax.swing.JTextField precoCompra;
    private javax.swing.JLabel precocompra_label;
    private javax.swing.JButton remove;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
